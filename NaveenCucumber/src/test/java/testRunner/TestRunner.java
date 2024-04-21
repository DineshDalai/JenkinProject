package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features  = ".//Features/Login.feature",
				//features  = ".//Features/Customer.feature",
		glue = "stepdef",
		dryRun = true,
		monochrome = true,
				
	//	plugin = { "pretty","html:test-output"},
				plugin = { "pretty","html:target/cucumber-reports","json:target/cucumber.json"},
		publish = true)




public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel=true)
	
	public Object[][] scenarios(){
		return super.scenarios();
	}

}