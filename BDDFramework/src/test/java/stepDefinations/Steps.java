package stepDefinations;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;



public class Steps {

	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage cust;
	
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

	
	  @When("Click on Login") public void click_on_login() {
	  
	  lp.clickLogin();
	  
	  driver.manage().window().maximize(); }
	 

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

	@Then("Close browser")
	public void close_browser() {
driver.quit();
	}

	
	//Customer
	
	@Then("user can view dashboard")
	public void user_can_view_dashboard() {
		cust = new AddCustomerPage(driver);
		cust.CustomerDahboard();
	}

	@When("user click on customer menu")
	public void user_click_on_customer_menu() {
		
		cust.clickonCustomerMenu();
	}

	@When("Click on customer Menu Item")
	public void click_on_customer_menu_item() {
		cust.clickonCustomerItem();
	}

	@When("Click Add new button")
	public void click_add_new_button() {
	    cust.AddNewCustomer();
	}

	@Then("User can view add new customer page")
	public void user_can_view_add_new_customer_page() {
	 cust.CustomerinfoDahboard();   
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
	  cust.CustomeraddDahboard();
	  cust.EnterCustomerEmail("abc@yourstore.com");
	  cust.EnterCustomerPassword("abcdef");
	  cust.EnterCustomerFirstname("dinesh");
	  cust.EnterCustomerLastname("Dalai");
	  cust.selectCustomergender();
	  cust.selectcustomerdateofbrth("04/23/1990");
	  cust.EnterCustomerCompanyname("Abcd");
	
	  //cust.EnterCustomerNewsletter();
	 // cust.EnterCustomerRole();
	 
	  cust.EnterCustomerVendor();
	  
	}

	
	  @When("click on save button") public void click_on_save_button() {
	  cust.ClickSave(); }
	 

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	    cust.Customersucessmsg();
	}

	
}
