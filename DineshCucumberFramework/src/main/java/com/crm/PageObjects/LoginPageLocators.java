package com.crm.PageObjects;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.commonMethods.CommonMethods;
import com.crm.drivers.DriverFactory;


public class LoginPageLocators {

	public   WebDriver driver;
	 public  CommonMethods  commonmethods;
	 public Properties pro;
	
	//LoginPage Locators
	private By Home_link = By.xpath("//a[text()='Home']");
	private By SignUp_link = By.xpath("//a[text()='Sign Up']");
	private By Pricing_link = By.xpath("//a[text()='Pricing']");
	private By Features_link = By.xpath("//a[text()='Features']");
	private By Customers_link = By.xpath("//a[text()='Customers']");
	private By Contact_link = By.xpath("//a[text()='Contact']");
	private By Name_Textbox = By.name("username");
	private By LoginPassword_Textbox = By.name("password");
	private By Login_button = By.xpath("//input[@type='submit']");
	
	
	//SignUp page Locators
	private By FirstName_Textbox = By.name("first_name");
	private By LastName_Textbox = By.name("surname");
	private By Email_Textbox = By.name("email");
	private By ConfirmEmail_Textbox = By.name("email_confirm");
	private By UserName_Textbox = By.name("username");
	private By Password_Textbox = By.name("password");
	private By ConfirmPassword_Textbox = By.name("passwordconfirm");
	
	
	public LoginPageLocators(WebDriver driver) {
		this.driver=driver;
	}
	  
	
	public void LoginPageElementsVisibility() throws InterruptedException {
		commonmethods = new CommonMethods(driver);
		commonmethods.validateElementVisibility_UsingBy_Locators(driver,Home_link, "Home Link Displayed");
		commonmethods.validateElementVisibility_UsingBy_Locators(driver,SignUp_link, "SignUp link Displayed");
		commonmethods.validateElementVisibility_UsingBy_Locators(driver,Pricing_link, "Pricing Link Displayed");
		commonmethods.validateElementVisibility_UsingBy_Locators(driver,Features_link, "Features link Displayed");
		commonmethods.validateElementVisibility_UsingBy_Locators(driver,Customers_link, "Customers Link Displayed");
		commonmethods.validateElementVisibility_UsingBy_Locators(driver,Contact_link, "Contact link Displayed");
		commonmethods.validateElementVisibility_UsingBy_Locators(driver,LoginPassword_Textbox, "Login Password button Displayed");
		commonmethods.validateElementVisibility_UsingBy_Locators(driver,Name_Textbox, "Name Textbox Displayed");
		commonmethods.validateElementVisibility_UsingBy_Locators(driver,Login_button, "LoginButton Displayed");
		
	}
	
	public void ClickSignUpPage() {
		commonmethods.ClickOn_ByLocators(driver, SignUp_link, "Sign up link clicked sucessfully");
	}
	
	public void VerifySignUpPage()  {
		commonmethods.EnterText(driver, FirstName_Textbox, "FirstName", "FirstName Displyed and Enter value in the text box");
		commonmethods.EnterText(driver, LastName_Textbox, "LastName", "LastName Displyed and Enter value in the text box");
		commonmethods.EnterText(driver, Email_Textbox, "Email@email.com", "Email text box Displyed and Enter value in the text box");
		commonmethods.EnterText(driver, ConfirmEmail_Textbox, "Email@email.com", "ConfirmEmail text box Displyed and Enter value in the text box");
		commonmethods.EnterText(driver, UserName_Textbox, "UserName", "UserName text box Displyed and Enter value in the text box");
		commonmethods.EnterText(driver, Password_Textbox, "Password", "Password text box Displyed and Enter value in the text box");
		commonmethods.EnterText(driver, ConfirmPassword_Textbox, "Password", "Confirm Password text box Displyed and Enter value in the text box");
	    commonmethods.NavigateBack(driver, "Browser Navigate Back");
	}
	
	public void LoginApplication() {
		Properties	pro = new Properties();
		String un = pro.getProperty("username");
		String psw = pro.getProperty("password");
		
		commonmethods.SendKey_ByLocators(driver, Name_Textbox, un, "User Name Enter Sucessfully");
		commonmethods.SendKey_ByLocators(driver, Password_Textbox, psw, "Password Enter Sucessfully");
	}
	
	public void ClickLoginButton() {
		commonmethods.ClickOn_ByLocators(driver, Login_button, "LoginButton clicked sucessfully");
	}
}
