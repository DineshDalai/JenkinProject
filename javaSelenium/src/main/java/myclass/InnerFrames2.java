package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerFrames2 {

	public static void main(String[] args) {
		
WebDriver driver;
		
		
	    WebDriverManager.chromedriver().setup();
	    
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	    
	    WebElement outerFrmae = driver.findElement(By.id("iframeResult"));
	    
	    driver.switchTo().frame(outerFrmae);
	    WebElement innerFrmae = driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
	    driver.switchTo().frame(innerFrmae);
	    
	  WebElement text=  driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
	  System.out.println(text.getText());

		/*
		 * Method 1 //driver.switchTo().defaultContent();
		 * driver.switchTo().frame(outerFrmae);
		 */	  
	  driver.switchTo().parentFrame();
	  WebElement outertext=  driver.findElement(By.xpath("//p[contains(text(),'You can use')]"));
	  System.out.println(outertext.getText());

	}

}
