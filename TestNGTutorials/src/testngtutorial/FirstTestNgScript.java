package testngtutorial;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTestNgScript {

	//@Test(dependsOnMethods = "checkout",description = "This test case will verify login functionality")
	@BeforeSuite(description = "This test case will verify login functionality")
	public void loginApplication() {
		
		System.out.println("My first testng script");
		
	}
	
	@Test(priority= 1,description = "This method will verify select iteam functionality")
	public void selectIteam() {
		
		System.out.println("select the iteam");
	}
	
	@AfterClass(description = "This test case will verify check out functionality")
	public void checkout() {
		
		System.out.println("check out");
	}
}
