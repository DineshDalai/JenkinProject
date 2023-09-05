package com.TestRunner;


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
		//tags = ("~@tag1"), It will skip the particular tag
		
		
				features  = {".//FeatureFile/Login.feature"},
				
				
		glue = {"com.StepDefination","com.crm.Hooks"},
		dryRun = false,
				tags = ("@tag1"),
		monochrome = true,
				
		plugin = {"pretty","html:test-output"}
		
		)


public class Runner {

	
}
