package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActionMultipleKey {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver;

		
ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver(option);
		
		driver.get("https://text-compare.com/");
		
		driver.manage().window().maximize();
		
		WebElement firstext = driver.findElement(By.id("inputText1"));
		WebElement secound = driver.findElement(By.id("inputText2"));
		
		firstext.sendKeys("Welcome to selenium");
		
		Actions act =new Actions(driver);
		
		//Ctrl + A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//Ctrl + c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		//Ctrl + v
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		if(firstext.getAttribute("value").equals(secound.getAttribute("value"))) {
			System.out.println("Text copyied sucessfully");
		}
			else {
				System.out.println("Text Not copied");
			}
		}
		
	}