package org.ays.browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

@Slf4j
public class AysScenarioHooks {

    @Before
    public void setUp(Scenario scenario) {
        log.info("Scenario started! name: {}, uri: {}", scenario.getName(), scenario.getUri());
        AysBrowser.create(AysBrowserType.getDefaultBrowser());
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            log.info("Scenario failed! name: {}", scenario.getName());

            log.debug("Taking screenshot...");
            final byte[] byteImage = ((TakesScreenshot) AysBrowser.getWebDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());
            log.debug("Screenshot has been taken!");

            AysBrowser.close();
            return;
        }

        log.info("Scenario passed: {}", scenario.getName());
        AysBrowser.close();
    }

}
