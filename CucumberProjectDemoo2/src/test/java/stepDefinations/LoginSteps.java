package stepDefinations;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

import PageObjects.AddCustomer;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Helper;

public class LoginSteps extends BaseClass{

	public   AddCustomer addcustomer;
	public LoginPage loginPage;
	
	@Given("User Launches Chrome Browser")
	public void user_launches_chrome_browser() throws IOException {
	
			  loginPage = new LoginPage(Helper.getDriver());	
			 // helper = new Helper();
			  logger = Logger.getLogger("CucumberProjectDemoo2");
				PropertyConfigurator.configure("Log4j.properties");
				logger.info("Lunching Browser");
	}
	

	@Then("User Enter url {string}")
	public void user_enter_url(String url) {
		logger.info("Lunching Url");
		Helper.openPage(url);
	}

	@And("User enters mail as {string} and password as {string}")
	public void user_enters_mail_as_and_password_as(String username, String Password) throws IOException {
		logger.info("Providing Login Details");
		loginPage.LoginApplication(username,Password);
	}

	@Given("Click on Login")
	public void click_on_login() throws InterruptedException {
		logger.info("Click on login button");
		loginPage.ClickLoginButton();
	}

	@Then("Page Title is {string}")
	public void page_title_is(String title) {
		
		if(Helper.getDriver().getPageSource().contains("Login was unsuccessful.")) {
			Helper.getDriver().close();
			
		}else {
		String loginpageTitle =  Helper.getDriver().getTitle();
	    Assert.assertEquals(title, loginpageTitle);
	    logger.info("get the Title of the page");
	}
	}
	@Then("User click logout button")
	public void user_click_logout_button() throws InterruptedException {
		
		logger.info("logout sucessfully");
		loginPage.ClickLogOutButton();
	}

	@Then("After logout Page Title should be {string}")
	public void after_logout_page_title_should_be(String logoutTitle) {
		 String logoutpageTitle =  Helper.getDriver().getTitle();
		    Assert.assertEquals(logoutTitle, logoutpageTitle);
	}


	
	 

	
}
