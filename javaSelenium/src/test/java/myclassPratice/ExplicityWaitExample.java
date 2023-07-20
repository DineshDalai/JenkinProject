package myclassPratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicityWaitExample {

	public static void main(String[] args) {


		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver(option);
		
		
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		 driver.findElement(By.name("q")).sendKeys("WebDriver");
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 WebElement element = driver.findElement(By.xpath("//h3[text()='WebDriver - Selenium']"));
		    
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[text()='WebDriver - Selenium']"))));
		    element.click();
	}

}
