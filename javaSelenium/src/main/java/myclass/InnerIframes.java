package myclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerIframes {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://demo.automationtesting.in/Frames.html");
	    
	    driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
	 
	   WebElement outerIFrmae = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
	   driver.switchTo().frame(outerIFrmae);
	   WebElement InnerIFrmae = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	   
			  
			  driver.switchTo().frame(InnerIFrmae);
	   
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("WebDriver");


	}

}
