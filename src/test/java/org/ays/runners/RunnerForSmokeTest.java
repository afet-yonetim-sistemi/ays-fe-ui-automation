package org.ays.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"},
        tags = "@Smoke and not @Disabled",
        publish = true
)
public class RunnerForSmokeTest extends AysAbstractTestNGCucumberTests {
}
