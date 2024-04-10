package Test_Runner;

import org.junit.runner.RunWith;



import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.core.backend.Glue;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "src/test/java/Feature/Open_MRS.feature",
				 glue = {"Step_Definition"},
				 plugin = { "pretty","html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				 dryRun = false,
				 monochrome = true)

public class Runner extends AbstractTestNGCucumberTests {

}
