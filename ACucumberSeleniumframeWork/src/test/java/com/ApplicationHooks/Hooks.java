package com.ApplicationHooks;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.CommonMethods.GenericMethods;
import com.qa.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import stepdefinations.BaseClass;


public class Hooks {

	public WebDriver driver;
	private  BaseClass baseclass;
	private ConfigReader confingfile;
	Properties pro;
	private GenericMethods  genericmethod;

	
	@Before(order=0)
	public void getProperty() throws IOException {
		confingfile = new ConfigReader();
		pro = confingfile.init_prop();
	}
	
	@Before(order=1)
	public void LunchBrowser() throws IOException {
		String browserName = pro.getProperty("browser");
		baseclass = new BaseClass();
		baseclass.init_driver(browserName);
		
	}
	
	
	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
	}
	}
}
