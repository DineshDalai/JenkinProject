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

public class ExplicityWaitExample {

	public static void main(String[] args) {
		
WebDriver driver;
		
		
	    WebDriverManager.chromedriver().setup();
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.google.com/");
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	    driver.findElement(By.name("q")).sendKeys("WebDriver");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	    
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='WebDriver - Selenium']")));
	    element.click();
	   // driver.findElement(By.xpath("//h3[text()='WebDriver - Selenium']")).click();
	}

}
