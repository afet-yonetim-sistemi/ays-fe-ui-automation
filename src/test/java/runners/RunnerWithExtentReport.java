package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"step_definitions"},
        plugin = {"com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports/cucumber.json"}
)
public class RunnerWithExtentReport extends AbstractTestNGCucumberTests {
}
