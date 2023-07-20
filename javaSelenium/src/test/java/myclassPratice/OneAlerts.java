package myclassPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneAlerts {

	public static void main(String[] args) throws InterruptedException  {
	
		ChromeOptions option = new ChromeOptions();
		 option.addArguments("--remote-allow-origins=*"); 
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("abc");
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
