package org.ays.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.ays.utilities.DriverClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println("Scenario started");
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("Scenario finished");
        if (scenario.isFailed()) {
            final byte[] byteImage = ((TakesScreenshot) DriverClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());
        }
        DriverClass.quitDriver();
    }

}
