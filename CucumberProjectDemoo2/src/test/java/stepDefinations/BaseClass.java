package stepDefinations;


import org.apache.log4j.Logger;

import PageObjects.AddCustomer;
import PageObjects.EditCustomer;
import PageObjects.LoginPage;
import PageObjects.Productpage;
import PageObjects.SearchCustomerpage;
import utilities.Helper;

public class BaseClass {

	public LoginPage loginPage;
	public AddCustomer addcustomer;
	public SearchCustomerpage searchcustomer;
	public EditCustomer editcustomer;
	public Productpage productpage;
	public Helper helper;
	public static Logger logger;
	
}
