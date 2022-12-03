package myclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//TakeScreen shot for whole page
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File src =
		 * ts.getScreenshotAs(OutputType.FILE); File trg = new
		 * File(".\\Screenshot\\homepage.png");
		 * 
		 * FileUtils.copyFile(src, trg);
		 */
		/*
		 * //TakeScreenshot for some portion of the page WebElement element =
		 * driver.findElement(By.
		 * xpath("//div[@class='product-grid home-page-product-grid']"));
		 * TakesScreenshot ts = (TakesScreenshot) driver; File scr =
		 * element.getScreenshotAs(OutputType.FILE); File trg = new
		 * File(".\\Screenshot\\featureproducts.png"); FileUtils.copyFile(scr, trg);
		 */
		
		
	    //TakeScreenshot for some portion of the page
			WebElement element = driver.findElement(By.xpath("//input[@name='q']"));
			TakesScreenshot ts = (TakesScreenshot) driver;
			File scr = element.getScreenshotAs(OutputType.FILE);
			File trg = new File(".\\Screenshot\\searchbox.png");
			FileUtils.copyFile(scr, trg);
	}

}
