package stepDefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;



public class Steps extends BaseClass{

	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage cust;
	public SearchCustomerPage Searchcustomer;
	
	@Before
	public void setup() throws IOException {
		
		configProp = new Properties();
		FileInputStream ip = new FileInputStream("config.properties");
		configProp.load(ip);
		
		String s = configProp.getProperty("browser");
		
		if(s.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}else if(s.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}else {
			System.out.println("Enter driver is Invalid");
		}
		
		logger = Logger.getLogger("CucumberFramework");
		PropertyConfigurator.configure("Log4j.properties");
		
		//ChromeDriver updated so i m using WebDrivermanager concept
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		
			logger.info("Lunching Browser");
	}
	
	@Given("User lunch chrome browser")
	public void user_lunch_chrome_browser() {
	   
		
		  lp = new LoginPage(driver);
		
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		
		logger.info("Lunching Url");
	   driver.get(url);
	}

	@When("User enters mail as {string} and password as {string}")
	public void user_enters_mail_as_and_password_as(String email, String password) {
	logger.info("Providing Login Details");
		lp.setUserName(email);
		lp.setPassword(password);
	}

	
	  @When("Click on Login")
	  public void click_on_login() {
	  
		  logger.info("Click on login button");
	  lp.clickLogin();
	  
	  driver.manage().window().maximize(); }
	 

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		logger.info("get the Title of the page");
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		}else {
		
	    Assert.assertEquals(title, driver.getTitle());
	}
	}
	
	@When("User click on Logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		logger.info("logout sucessfully");
		lp.clickLoggout();
		Thread.sleep(5000);
	}

	@Then("Close browser")
	public void close_browser() {
		logger.info("close the browser");
driver.quit();
	}

	
	//Customer
	
	@Then("user can view dashboard")
	public void user_can_view_dashboard() {
		logger.info("Dashboard lunched");
		cust = new AddCustomerPage(driver);
		cust.CustomerDahboard();
	}

	@When("user click on customer menu")
	public void user_click_on_customer_menu() {
		logger.info("User click on Customer menu button");
		cust.clickonCustomerMenu();
	}

	@When("Click on customer Menu Item")
	public void click_on_customer_menu_item() {
		logger.info("User click on Customer Item menu button");
		cust.clickonCustomerItem();
	}

	@When("Click Add new button")
	public void click_add_new_button() {
		logger.info("Customer click Add new Button");
	    cust.AddNewCustomer();
	}

	@Then("User can view add new customer page")
	public void user_can_view_add_new_customer_page() {
		logger.info("User lunch view customer page");
	 cust.CustomerinfoDahboard();   
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
		logger.info("Userlunch customer info page");
	  cust.CustomeraddDahboard();
	  cust.EnterCustomerEmail("abcde@yourstore.com");
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

	
	  @When("click on save button") 
	  public void click_on_save_button() {
		  logger.info("User click on the save button");
	  cust.ClickSave(); }
	 

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		logger.info("Data save sucessfully");
	    cust.Customersucessmsg();
	}

	@And("Enter customer Email")
	public void EnterEmailOnSearchBox() {
		logger.info("customer enter Email in Search box");
		Searchcustomer = new SearchCustomerPage(driver);
		Searchcustomer.EnterCustomerEmailInSearchBox("kiyjcycyhjc676008@gmail.com");
	}
	
	@When("Click on search button")
	public void ClickSearchButtonONEmailSearchPage() throws InterruptedException {
		logger.info("user click on Search button");
		Searchcustomer.EmailSearchpageSearchButton();
	}
	
	@Then("User should found Email in the search table")
	public void EmailSearchTable() {
		logger.info("Email display in Customer table");
		Searchcustomer.SearchPageEmailTable();
	}
	
}
