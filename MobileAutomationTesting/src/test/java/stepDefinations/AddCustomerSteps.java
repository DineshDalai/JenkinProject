package stepDefinations;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;

import PageObjects.AddCustomer;
import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Helper;

public class AddCustomerSteps extends BaseClass {

	public   AddCustomer addcustomer;
	public LoginPage loginPage;
	
	 @Given("User can view DashBoard") 
	  public void user_can_view_dash_board()
	 { 
		  addcustomer = new AddCustomer(Helper.getDriver());
		  addcustomer.VerifyDashboard(); 
		  
		  }
	  
	  @Then("click customers under customers Tab") 
	  public void click_customers_under_customers_tab()  {
	  addcustomer.ClickCustomersTab(); 
	  logger.info("click customer sucessfully");
	  }
	  
	  @Then("click AddNew button")
	  public void click_add_new_button() { 
		  addcustomer.ClickAddNewButton();
		  logger.info("click add new button sucessfully");
		  }
	  
	  @Then("Fill All the fields")
	  public void fill_all_the_fields() {
	  
	  addcustomer.AddCustomer("ramesh@yourstore.com", "abcdef", "Ramesh", "Dutt",
	  "Gender_Female", "04/23/1990", "NewSpice", "Test store 2"); 
	  logger.info(" customer add details sucessfully");
	  }
	  
	  @Then("Click on Save Button")
	  public void click_on_save_button()  { 
		  addcustomer.ClicksaveButton(); 
		  logger.info("click save button");
		  }
	  
	  @Then("User can view Confirmation message {string}") 
	  public void user_can_view_confirmation_message(String string) { 
		  addcustomer.VerifySucessmsg(); 
		  logger.info(" customer verify message sucessfully");
		  }
	 

	
}
