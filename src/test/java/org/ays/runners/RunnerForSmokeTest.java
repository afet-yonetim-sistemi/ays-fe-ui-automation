package org.ays.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.ays.utilities.DriverClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@smoke",
        features = {"src/test/java/org.ays.feature"},
        glue = {"step_definitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber-reports.html"})
public class RunnerForSmokeTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters({"browser", "headless"})
    public static void beforeClass(String browserName, String headless) {
        DriverClass.setThreadDriverName(browserName);
        System.setProperty("headless", headless);
    }

}
