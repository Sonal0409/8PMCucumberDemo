package runner;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\vishal mittal\\workspace\\8PMSeptCucumberDemo\\src\\main\\java\\feature\\WikicreateCustomer.feature"
	,glue={"stepDefinition"}, dryRun=false, monochrome=true)
	
	
	public class TestRunner {
		
		// cucumber option
		// feature file -- Stepdefinition package name--mapped test method
// glue -- attache the step definition package to feature file
		//dryRun -- false and true
	}


