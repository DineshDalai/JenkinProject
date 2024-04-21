package stepdefinations;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.ApplicationHooks.Hooks;
import com.CommonMethods.GenericMethods;
import com.pages.LoginPage;
import com.qa.utilities.ConfigReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps  {

	public WebDriver driver; 
	public LoginPage loginpage;
	//public static Logger logger;
	//public GenericMethods genericmethods;

	
	  @Given("User on browser page and Enter url {string}")
	 public void user_lunch_chrome_browser(String url){
		
		  driver.get(url);
		 
	  }
	  
	  @And("User enters mail as {string} and password as {string}")
	  public void user_enters_mail_as_and_password_as(String string, String string2) throws IOException {
		  loginpage = new LoginPage(driver);
	       loginpage.LoginApplication();
	  }

	  @And("Click on Login")
	  public void click_on_login() {
		  loginpage.ClickLoginButton();
		  
	  }

	  @Then("Page Title is {string}")
	  public void page_title_is(String title) {
	    String loginpageTitle =  driver.getTitle();
	    Assert.assertEquals(title, loginpageTitle);
	  }

	  @Then("User click logout button")
	  public void user_click_logout_button() {
		  loginpage.ClickLogOutButton();
	  }

	  @Then("After logout Page Title should be {string}")
	  public void After_logout_page_title_should_be(String logoutTitle) {
	   
		  String logoutpageTitle =  driver.getTitle();
		    Assert.assertEquals(logoutTitle, logoutpageTitle);
	  }


}
