package com.StepDefination;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.commonMethods.CommonMethods;
import com.crm.PageObjects.LoginPageLocators;
import com.crm.config.ConfigFile;
import com.crm.drivers.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination  {

	

	public WebDriver driver;
	public CommonMethods commonmethods;
	public ConfigFile configfile;
	public LoginPageLocators loginpage;
	public static Logger logger;

	
	  
	  @Given("User Lunch chrome browser")
	 public void user_lunch_chrome_browser(){
		  DriverFactory driverfactory = new DriverFactory(driver);
		  LoginPageLocators loginpage = new LoginPageLocators(driver); 
		  System.out.println("pass");
	  driver.get("https://classic.freecrm.com/index.html"); 
	  }
	  
	  @And("User Enter url {string}")
	  public void user_enter_url(String url) {
		  driver.get(url);
	  }
	@Then("User Validate All the elements visibility")
	public void user_validate_all_the_elements_visibility() throws InterruptedException {

		loginpage.LoginPageElementsVisibility();

	}

	@When("User Click on the SignUp link")
	public void user_click_on_the_sign_up_link() {
		loginpage.ClickSignUpPage();
	}

	@And("User able to see the signup page")
	public void user_able_to_see_the_signup_page() {
		loginpage.VerifySignUpPage();
	}

	@When("User enter valid user name as {string} and valid password as {string}")
	public void user_enter_valid_user_name_and_valid_password(String un,String psw) {
		loginpage.LoginApplication();
	}

	@And("User click login button")
	public void user_click_login_button() {
		loginpage.ClickLoginButton();
	}

}
