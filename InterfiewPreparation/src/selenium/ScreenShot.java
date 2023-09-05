package selenium;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://cogmento.com/");
		driver.manage().window().maximize();
		
	
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file,new File( "E://Selenium//screenshotss.png"));
	}

}
