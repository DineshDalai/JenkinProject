package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features"},
		//features  = "src/test/resources/features/AddCustomer.feature",
		glue ={"stepDefinations"}
                 ,monochrome=true,
                		 dryRun = false,
         				tags = ("@tag1"),
         						//plugin= {"pretty","html:target/cucumber.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
         								plugin= {"pretty",
         						         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
         						        })
public class TestRunner {

}
