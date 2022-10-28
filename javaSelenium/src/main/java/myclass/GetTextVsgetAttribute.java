package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsgetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement searchfield= driver.findElement(By.id("small-searchterms")); 
		searchfield.sendKeys("Test");
		Thread.sleep(3000);
		WebElement searchfieldd= driver.findElement(By.xpath("//button[@class='button-1 search-box-button']"));
		System.out.println("search field text is "+searchfieldd.getText());
		searchfield.clear();
	String Attribute =	searchfield.getAttribute("placeholder");

	System.out.println("The value of the attribute is "+Attribute);
	}

}
