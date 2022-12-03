package myclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTableWithPagination {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver;

		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable notifications--");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/index.php");
		
		
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		
		driver.findElement(By.xpath("//a[@href='#collapse-4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Returns']")).click();//a[normalize-space()='Returns']
		
	    String	pagetext = driver.findElement(By.xpath("//div[contains(text(),'Showing ')]")).getText();
	    System.out.println("The page text is "+pagetext);
	    
	   String TotalPage = pagetext.substring(pagetext.indexOf("(")+1, pagetext.indexOf("Pages")-1);
	   System.out.println(TotalPage);
	   int a = Integer.parseInt(TotalPage);
	  
	   Thread.sleep(3000);
	   for(int i=1;i<=a;i++) {
		
		   WebElement ActivePage =   driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
		   ActivePage.click();
		   
		   int TotalRow = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		   System.out.println("Total row present in 1st page is = "+TotalRow);
		   
		   String pageno = Integer.toString(i+1);
	 driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();
			
	   }
	}

}
