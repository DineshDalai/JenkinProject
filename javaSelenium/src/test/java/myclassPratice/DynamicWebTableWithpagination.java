package myclassPratice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTableWithpagination {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver(option);
		
		
		driver.get("https://demo.opencart.com/admin/index.php");

		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		
		driver.findElement(By.xpath("//a[@href='#collapse-4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Returns']")).click();
		
		for(int i=2;i<=9;i++) {
			Thread.sleep(5000);
			WebElement Active_Page = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
			
			Thread.sleep(5000);
			Active_Page.click();
			System.out.println("pass");
			
       
			Thread.sleep(3000);
			List<WebElement> links1 = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr"));  
			System.out.println(i+" Total number of rows are "+links1.size());
			
	WebElement e=driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+i+"']"));
	 System.out.println("pass1");
	e.click();
	 System.out.println("pass2");
		
			
		}
	}

}
