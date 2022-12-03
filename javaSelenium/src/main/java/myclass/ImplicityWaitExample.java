package myclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicityWaitExample {

	public static void main(String[] args) {
		
WebDriver driver;
		
		
	    WebDriverManager.chromedriver().setup();
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com/");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	    driver.findElement(By.name("q")).sendKeys("WebDriver");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	   
	    driver.findElement(By.xpath("//h3[text()='WebDriver - Selenium']")).click();
	}

}
