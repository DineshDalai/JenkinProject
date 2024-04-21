package com.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.CommonMethods.GenericMethods;

public class LoginPage {

	public   WebDriver driver;
	//public GenericMethods genericmethods;
//	public static  Logger logger;
	public Properties configProp;
	
	
	//LoginPage Locators
	private By Name_Textbox = By.name("Email");
	private By Password_Textbox = By.name("Password");
	private By Login_button = By.xpath("//button[@type='submit']");
	private By LogOut_button = By.xpath("//a[text()='Logout']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	
	public void LoginApplication() throws IOException {
		configProp = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/Configuration/config.properties");
		configProp.load(ip);
		
		String un = configProp.getProperty("username");
		String psw = configProp.getProperty("password");
		
		/*
		 * genericmethods.SendKey_ByLocators(driver, Name_Textbox, un,
		 * "User Name Enter Sucessfully"); genericmethods.SendKey_ByLocators(driver,
		 * Password_Textbox, psw, "Password Enter Sucessfully");
		 */
		
		driver.findElement(Name_Textbox).clear();
		driver.findElement(Name_Textbox).sendKeys(un);
		//logger.info("User Name Enter Sucessfully");
		
		driver.findElement(Password_Textbox).clear();
		driver.findElement(Password_Textbox).sendKeys(psw);
		//logger.info("Password Enter Sucessfully");
	}
	
	public void ClickLoginButton() {
		//genericmethods.ClickOn_ByLocators(driver, Login_button, "LoginButton clicked sucessfully");
		driver.findElement(Login_button).click();
		//logger.info("Login button click sucessfully");
	}
	
	public void ClickLogOutButton() {
		//genericmethods.ClickOn_ByLocators(driver, Login_button, "LoginButton clicked sucessfully");
		driver.findElement(LogOut_button).click();
		//logger.info("Login button click sucessfully");
	}
}
