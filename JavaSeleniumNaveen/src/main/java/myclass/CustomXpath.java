package myclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CustomXpath {

	public static void main(String[] args) {
		
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
		//driver.findElement(By.xpath("//input[@class,'gh-tb ui-autocomplete-input ui-autocomplete-loading'")).sendKeys("java");
		//driver.findElement(By.xpath("//input[starts-with(@class,'gh-tb ui-autocomplete')]")).sendKeys("java");
		

	}

}
