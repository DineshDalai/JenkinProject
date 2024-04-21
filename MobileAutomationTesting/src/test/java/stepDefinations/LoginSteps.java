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
	


@Given("User Launches dialerpad")
public void user_launches_dialerpad() {
    
	 loginPage = new LoginPage(Helper.getDriver());	
		loginPage.clickKeyboard();
		
}

@Then("User Enter the search number {string}")
public void user_enter_the_search_number(String contact) throws InterruptedException {
	loginPage.clickSearch();
	loginPage.SearchContact(contact);
	
}

@Then("User swipe on the search number")
public void user_swipe_on_the_search_number() throws InterruptedException {
	loginPage.SwipeContact();
}

@Then("User click on the call end button")
public void user_click_on_the_call_end_button() throws InterruptedException {
	loginPage.callEndButton();
}


	
	 

	
}
