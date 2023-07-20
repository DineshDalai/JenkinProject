package myclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) {
		
WebDriver driver;

ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver(option);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("age"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element);
		
		String str = element.getAttribute("title");
		System.out.println(element.getAttribute("title"));
		
		if(str.equalsIgnoreCase("We ask for your age only for statistical purposes.")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		

	}

}
