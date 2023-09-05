package com.crm.Hooks;

import java.io.IOException;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.commonMethods.CommonMethods;
import com.crm.config.ConfigFile;
import com.crm.drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	public WebDriver driver;
	public  DriverFactory driverfactory;
	public ConfigFile confingfile;
	public CommonMethods  commonmethods;
	Properties pro;
	
	@Before(order=0)
	public void getProperty() throws IOException {
		confingfile = new ConfigFile();
		pro = confingfile.ReadPropertiesFile();
	}
	
	@Before(order=1)
	public void LunchBrowser() {
		String browserName = pro.getProperty("browser");
		driverfactory = new DriverFactory(driver);
		driverfactory.Init_driver(browserName);
		
	}
	
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario) throws IOException {
		CommonMethods	commonmethod = new CommonMethods(driver);
		if(scenario.isFailed()) {
			commonmethod.TakeScreenShotONPage(driver,"homepage", "Screenshot taken sucessfully");
		}
	}
}
