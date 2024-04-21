package com.testRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		
				features  = {"src/test/resources/AppFeatures"},
				
				
		glue = {"stepdefinations","com.ApplicationHooks"},
		dryRun = false,
				tags = ("@tag1"),
		monochrome = true,
				
		plugin = {"pretty","html:test-output"}
		
		)


public class Runner {

	
}
