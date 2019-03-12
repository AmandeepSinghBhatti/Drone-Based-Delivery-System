package com.qa.walmart.myrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\ABHATTI\\eclipse-workspace\\DroneCarriedDeliverySystem\\src\\main\\java\\com\\qa\\walmart\\features"
 ,glue={"com.qa.walmart.stepdef"}
 //,dryRun = true
 )

public class TestRunner {

	
}
