package stepdefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.utilities.ConfigReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {

	public WebDriver driver;
	public Properties configProp;

	
	public void init_driver(String browser) throws IOException {

		System.out.println("browser value is: " + browser);

		configProp = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/Configuration/config.properties");
		configProp.load(ip);
		
		String s = configProp.getProperty("browser");
		
		if(s.equalsIgnoreCase("chrome")) {
			
			 driver = new ChromeDriver();
		}else if(s.equalsIgnoreCase("firefox")) {
			
			 driver = new FirefoxDriver();
		}else {
			System.out.println("Enter driver is Invalid");
		}
		
	

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
}
