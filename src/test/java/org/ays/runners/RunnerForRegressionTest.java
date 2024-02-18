package org.ays.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.ays.utilities.DriverUtil;

@CucumberOptions(
        tags = "@regression",
        features = {"src/test/java/org.ays.feature"},
        glue = {"step_definitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber-reports.html"})
public class RunnerForRegressionTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters({"browser", "headless"})
    public static void beforeClass(String browserName, String headless) {
        DriverUtil.setThreadDriverName(browserName);
        System.setProperty("headless", headless);
    }

}
