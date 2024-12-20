package org.ays.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"},
        tags = "@Smoke", publish = true
)
public class RunnerForSmokeTest extends AysAbstractTestNGCucumberTests {
}
