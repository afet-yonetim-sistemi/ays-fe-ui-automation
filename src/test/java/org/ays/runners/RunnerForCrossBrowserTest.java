package org.ays.runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.ays.utilities.DriverUtil;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@Login",
        features = {"src/test/java/org.ays.feature"},
        glue = {"step_definitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports/cucumber.json"})
public class RunnerForCrossBrowserTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters({"browser", "headless"})
    public static void beforeClass(String browserName, String headless) {
        DriverUtil.setThreadDriverName(browserName);
        System.setProperty("headless", headless);
    }

    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("Windows User Name", System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name", "QA Team");
        ExtentService.getInstance().setSystemInfo("Application Name", "AYOS");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA");
    }
}
