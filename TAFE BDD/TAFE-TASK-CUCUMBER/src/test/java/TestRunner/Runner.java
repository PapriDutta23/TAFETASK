package TestRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
 

@CucumberOptions(
		features = "src/test/java/Features",
		glue="StepDefinition",
		dryRun = !true,
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
		)

public class Runner extends AbstractTestNGCucumberTests {
/*This class will remain empty*/
	
}
