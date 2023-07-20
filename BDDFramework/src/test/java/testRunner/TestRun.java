package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		//If You want to run 2 feature file at time
		//features  = {".//Features/Customer.feature",".//Features/Login.feature"},
		
				//If You want to run All the feature file at time
				//features  = ".//Features/",
		
		
		//If You want to run 1 feature file 
				features  = ".//Features/Customer.feature",
				
				
		glue = "stepDefinations",
		dryRun = false,
		monochrome = true,
				
		plugin = { "pretty","html:test-output"}
		
		)
public class TestRun {

}
