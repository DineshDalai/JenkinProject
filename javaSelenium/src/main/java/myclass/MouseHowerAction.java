package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHowerAction {

	public static void main(String[] args) throws InterruptedException {


WebDriver driver;

		
ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver(option);
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		WebElement element1 =driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		act.moveToElement(element).moveToElement(element1).click().build().perform();
		
		

	}

}
