package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class AddCustomerPage {
////a[@href='#']//p[contains(text(),'Customers')]
	//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]
	//a[@href='/Admin/Customer/Create']-- Addd new
	//input[@id='Email']
	//input[@id='Password']
	//input[@id='FirstName']
	//input[@id='LastName']
	//input[@id='Gender_Male']
	//input[@id='DateOfBirth']
	//input[@id='Company']
	//ul[@id='SelectedNewsletterSubscriptionStoreIds_taglist']//..
	//ul[@id='SelectedCustomerRoleIds_taglist']//..
	//select[@id='VendorId']
	//button[@name='save']
	
		public  WebDriver ldriver;
		
		public AddCustomerPage(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver,this);
			
		}
		
		By DashBoard = By.xpath("//a[text()='John Smith']//..");
		By Customerdropdwn = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
		By Customerlink = By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
		By CustomerinfoDashboard = By.xpath("//div[text()='Customer info']");
		By AddnewCustomerDetails = By.xpath("//h1[contains(text(),'Add a new customer')]");
		By Addnew = By.xpath("//a[@href='/Admin/Customer/Create']");
		By Customeremail = By.xpath("//input[@id='Email']");
		By Customerpsw = By.xpath("//input[@id='Password']");
		By CustomerFirstnmae = By.xpath("//input[@id='FirstName']");
		By CustomerLastname = By.xpath("//input[@id='LastName']");
		By Customergender = By.xpath("//input[@id='Gender_Male']");
		By Customerdateofbrth = By.xpath("//input[@id='DateOfBirth']");
		By Customercompanyname = By.xpath("//input[@id='Company']");
		
		By CustomerNewsletter = By.xpath("//ul[@id='SelectedNewsletterSubscriptionStoreIds_taglist']//..");
		
		By Customervendor = By.xpath("//select[@id='VendorId']");
		By Customersavebtn = By.xpath("//button[@name='save']");
		By Customersuccessmsg = By.xpath("//div[@class='alert alert-success alert-dismissable']");
		
		
		//Search Customer by Email
		
		By SearchcustomerEmail  = By.id("SearchEmail");
		By SearchcustomerFistName  = By.id("SearchFirstName");
		By SearchcustomerLastName  = By.id("SearchLastName");
		By SearchButton = By.id("search-customers");
		By SearchEmailTable = By.xpath("//tbody//tr/td[contains(text(),'.com')]");
		
		
		
		public void AddNewCustomer() {
			ldriver.findElement(Addnew).click();
		}
		
		public void Customersucessmsg() {
			ldriver.findElement(Customersuccessmsg).isDisplayed();
		}
		
		public void ClickSave() {
			ldriver.findElement(Customersavebtn).click();
		}
		
		public void CustomerDahboard() {
		String s =	ldriver.findElement(DashBoard).getText();
		Assert.assertEquals(s, "John Smith");
		}
		
		public void CustomerinfoDahboard() {
			String s1 =	ldriver.findElement(CustomerinfoDashboard).getText();
			Assert.assertEquals(s1, "Customer info");
			}
		
		public void CustomeraddDahboard() {
			String s2 =	ldriver.findElement(AddnewCustomerDetails).getText();
			
			if(s2.contains("Add a new customer")) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			}
		
public void clickonCustomerMenu() {
			ldriver.findElement(Customerdropdwn).click();
		}
public void clickonCustomerItem() {
			ldriver.findElement(Customerlink).click();
		}
		
public void EnterCustomerEmail(String email) {
			ldriver.findElement(Customeremail).sendKeys(email);
		}

public void EnterCustomerPassword(String psw) {
	ldriver.findElement(Customerpsw).sendKeys(psw);
}

public void EnterCustomerFirstname(String firstname) {
	ldriver.findElement(CustomerFirstnmae).sendKeys(firstname);
}

public void EnterCustomerLastname(String lastname) {
	ldriver.findElement(CustomerLastname).sendKeys(lastname);
}

public void selectCustomergender() {
	ldriver.findElement(Customergender).click();
}

public void selectcustomerdateofbrth(String dob) {
	ldriver.findElement(Customerdateofbrth).sendKeys(dob);
}

public void EnterCustomerCompanyname(String companyname) {
	ldriver.findElement(Customercompanyname).sendKeys(companyname);
}

public void EnterCustomerNewsletter() {
	Select sel = new Select(ldriver.findElement(CustomerNewsletter));
	sel.selectByVisibleText("Test store 2");
	ldriver.findElement(CustomerNewsletter).sendKeys("Test store 2");
	ldriver.findElement(CustomerNewsletter).sendKeys(Keys.ENTER);
}


public void EnterCustomerVendor() {
	Select sel = new Select(ldriver.findElement(Customervendor));
	sel.selectByIndex(1);
	
}

}
