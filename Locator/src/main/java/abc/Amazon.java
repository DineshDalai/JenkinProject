package abc;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//id & name Locators
		driver.findElement(By.name("field-keywords")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();

		//Link & partial link text
		//driver.findElement(By.linkText("Amazon miniTV")).click();
		driver.findElement(By.partialLinkText("miniTV")).click();
		
		//ClassName
		int elementsize = driver.findElements(By.className("AppNavbar_navItem___QI5L")).size();
		System.out.println("total Class name present "+elementsize);
		
		
		//Tagname
		int TotalLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Total Links present "+TotalLinks);
	}

}
