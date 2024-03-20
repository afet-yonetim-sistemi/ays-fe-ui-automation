package org.ays.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Regression",publish = true)
public class RunnerForRegressionTest extends AysAbstractTestNGCucumberTests {
}
