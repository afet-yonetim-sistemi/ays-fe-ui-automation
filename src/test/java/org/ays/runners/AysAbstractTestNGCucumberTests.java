package org.ays.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.ays.browser.AysBrowser;
import org.ays.browser.AysBrowserType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@Slf4j
@CucumberOptions(
        features = {
                "src/test/java/org/ays/feature"
        },
        glue = {
                "org/ays/step_definitions",
                "org/ays/browser"
        },
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber-reports.html"
        }
)
public class AysAbstractTestNGCucumberTests extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters({"browser"})
    public static void beforeClass(String browser) {

        System.setProperty("headless", "true");

        if (browser != null) {
            AysBrowserType browserType = AysBrowserType.valueOf(browser.toUpperCase());
            log.debug("'browser' parameter is activated. browserType: " + browserType);
            AysBrowser.create(browserType);
        }

    }

}
