package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepDef {

	
	private WebDriver driver;
	private LoginPage loginpage;
	
	@Before
	public void  setup() {
		driver = new ChromeDriver();
	}
	
	
	@After
	public void tearDown() {
		
		if(driver!=null) {
			driver.quit();
		}
	}
	
	@Given("I am on the OpenCart loginPage")
	public void I_am_on_the_OpenCart_loginPage() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		loginpage = new LoginPage(driver);
		
	}
	
	@Given("I have entered  a valid username and password")
	public void I_have_entered_a_valid_username_and_password() {
		loginpage.enterEmail("qatestertest@gmail.com");
		loginpage.enterPassword("Test@123");
	}
	
	@When("I click on the login button")
	public void I_click_on_the_login_button() {
		loginpage.clickloginButton();
	}
	
	@Then("I should be loged in sucessfully")
	public void I_should_be_loged_in_sucessfully() {
		Assert.assertEquals(loginpage.checkLogoutLink(), true);
	}
	
	@Given("I have entered invalid {string} and {string}")
	public void I_have_entered_invalid_and(String username,String password){
		loginpage.enterEmail(username);
		loginpage.enterPassword(password);
	}
	
	@Then("I should see an error message indicating {string}")
	public void I_should_see_an_error_message_indicating(String errorMessage) {
		Assert.assertEquals(driver.findElement(By.cssSelector(".alert-danger")).isDisplayed(), true);
	}
	
	@When("I click on the \"Forgotten Password\" link")
	public void I_click_on_the_Forgotten_Password_link(){
		loginpage.clickForgottenPasswordLink();
	}
	
	@Then("I should redirect to the password reset page")
	public void I_should_redirect_to_the_password_reset_page() {
		Assert.assertTrue(loginpage.getForgotPwdPageUrl().contains("account/forgotten"));
	}
}
