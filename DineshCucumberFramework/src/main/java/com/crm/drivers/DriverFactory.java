package com.crm.drivers;

import java.util.Properties;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.commonMethods.CommonMethods;
import com.crm.PageObjects.LoginPageLocators;
import com.crm.config.ConfigFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory  {

	public  WebDriver driver;
	public CommonMethods commonmethods;
	public ConfigFile configfile;
	public LoginPageLocators loginpage;
	public static  Logger logger;
	public Properties pro;
	
	public DriverFactory(WebDriver driver){
		this.driver=driver;
	}
	public void Init_driver(String browser) {
			
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
			System.out.println("browser value is: " + browser);
		}else if(browser.equalsIgnoreCase("Firefox")) {
			FirefoxOptions ffoptions = new FirefoxOptions();
			ffoptions.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver(ffoptions);
			
			System.out.println("browser value is: " + browser);
			//logger.info(" Firefox Browser open Sucessfully");
		}
		else {
			System.out.println("Invalid Browser");
		}
		
		
		//logger = Logger.getLogger("CucumberFramework");
		//PropertyConfigurator.configure("log4j.properties");
		
		//logger.info("Lunching "+browser+" Browser");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
	}
	
	

}
