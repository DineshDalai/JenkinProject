package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.LoginPage;

public class Step {

	public WebDriver driver;
	public LoginPage lp;
	
	 @Given("User lunch chrome browser")
	 
	 public void user_lunch_chrome_browser() {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		  lp = new LoginPage(driver);
	 }
	 
	 @When("User opens URL {string}")
		public void user_opens_url(String url) {
			
		   driver.get(url);
		}
	 
	 @When("User enters mail as {string} and password as {string}")
		public void user_enters_mail_as_and_password_as(String email, String password) {
		
			lp.setUserName(email);
			lp.setPassword(password);
		}
	 
	 @When("Click on Login")
		public void click_on_login() {
		 
			lp.clickLogin();
			
			driver.manage().window().maximize();
		}
	 
	 @Then("Page Title should be {string}")
		public void page_title_should_be(String title) {
			if(driver.getPageSource().contains("Login was unsuccessful.")) {
				driver.close();
				Assert.assertTrue(false);
			}else {
			
		    Assert.assertEquals(title, driver.getTitle());
		}
	 }
			@When("User click on Logout link")
			public void user_click_on_logout_link() throws InterruptedException {
				lp.clickLoggout();
				Thread.sleep(5000);
			}
			
			@Then("Page Title should be {string}")
			public void Page_Title_should_be(String title) {
				Assert.assertEquals(title, driver.getTitle());
			}
			@Then("Close browser")
			public void close_browser() {
		driver.quit();
			}
		}
