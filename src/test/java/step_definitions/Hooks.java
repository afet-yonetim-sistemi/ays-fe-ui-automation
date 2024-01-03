package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.DriverClass;

public class Hooks {

    @Before
    public void beforeScenario(){
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
