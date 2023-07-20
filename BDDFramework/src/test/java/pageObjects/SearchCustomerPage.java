package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import utilities.WaitHelper;

public class SearchCustomerPage {
	
	public  WebDriver ldriver;
	
	WaitHelper waithelper;
	public SearchCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
		waithelper = new WaitHelper(ldriver);
	}
	
	

	//Search Customer by Email
	
	By SearchcustomerEmail  = By.id("SearchEmail");
	By SearchcustomerFistName  = By.id("SearchFirstName");
	By SearchcustomerLastName  = By.id("SearchLastName");
	By SearchButton = By.id("search-customers");
	
	
	@FindBy(xpath = "//div[@class='dataTables_scroll']//tbody//td")
	List<WebElement> txtEmailrow;
	
	@FindBy(xpath = "//div[@class='dataTables_scroll']//tbody//tr")
	List<WebElement> txtEmailcolumn;

	public void EnterCustomerEmailInSearchBox(String searchboxemail) {
		ldriver.findElement(SearchcustomerEmail).clear();
		//waithelper.WaitForElement((WebElement) SearchcustomerEmail,Duration.ofSeconds(30));
		ldriver.findElement(SearchcustomerEmail).sendKeys(searchboxemail);
	}

	public void EnterFistName(String firstname) {
		
		ldriver.findElement(SearchcustomerFistName).clear();
		//waithelper.WaitForElement((WebElement) SearchcustomerFistName,Duration.ofSeconds(30));
		ldriver.findElement(SearchcustomerFistName).sendKeys(firstname);
	}

	public void EnterLastName(String lastname) {
		ldriver.findElement(SearchcustomerLastName).clear();
		//waithelper.WaitForElement((WebElement) SearchcustomerLastName,Duration.ofSeconds(30));
		ldriver.findElement(SearchcustomerLastName).sendKeys(lastname);
	}

	public void EmailSearchpageSearchButton() throws InterruptedException {
		ldriver.findElement(SearchButton).click();
		Thread.sleep(3000);
	}

	public void SearchPageEmailTable() {
	
		String abc = ldriver.findElement(By.xpath("//div[@class='dataTables_scroll']//tbody//td[2]")).getText();
	
		for(int i=1;i<txtEmailrow.size()-1;i++) {
			for(int j=i;j<txtEmailcolumn.size()-1;j++) {
		
			String s1 = "//div[@class='dataTables_scroll']//tbody//tr["+i+"]"+"//td["+j+"]";
			String EmailResult = ldriver.findElement(By.xpath(s1)).getText();
			System.out.println("The Search result Email is "+EmailResult);
			
			if(EmailResult.equalsIgnoreCase("kiyjcycyhjc676008@gmail.com")) {
			Assert.assertEquals(EmailResult, "kiyjcycyhjc676008@gmail.com");

				break;
			
		}
		
			}
	}
	}	
}
