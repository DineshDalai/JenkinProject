package myclassPratice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver; File src = (File)
		 * ((TakesScreenshot)driver.getScreenshotAs(OutputType.FILE)); File trg = new
		 * File(".\\Screenshot\\homepage1.png"); FileUtils.copyFile(src, trg);
		 */
		

	
	TakesScreenshot ts = (TakesScreenshot) driver; File src =
			  ts.getScreenshotAs(OutputType.FILE); File trg = new
			  File("\\Downloads\\homepage1.png");
			  
			  FileUtils.copyFile(src, trg);
	}

}
