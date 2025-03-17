package org.ays.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"},
        tags = "@Regression and not @Disabled",
        publish = true
)
public class RunnerForRegressionTest extends AysAbstractTestNGCucumberTests {
}
