package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = !true,
		features = {"src/test/resources/features"},
		glue = "stepDefinitions",
		plugin = {"html:Reports/myreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		publish = true
		)

public class UrbanTestRunner extends AbstractTestNGCucumberTests {

}
