package myclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		

       WebDriver driver;
       
       ChromeOptions option = new ChromeOptions();
       option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		
		 driver =new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		/*
		 * //First Alert
		 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()
		 * ; Thread.sleep(3000); driver.switchTo().alert().accept();
		 */

		/*
		 * //Secound Alert
		 * driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click
		 * (); Thread.sleep(3000); driver.switchTo().alert().dismiss();
		 */
		
		
		//Third Alert
				driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
				Thread.sleep(3000);
				driver.switchTo().alert().sendKeys("abc");
				Thread.sleep(3000);
			driver.switchTo().alert().accept();
	}

}
