package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.pages.LoginPOM;
import org.ays.utilities.ConfigurationReader;
import org.ays.utilities.DriverClass;
import org.testng.Assert;

public class Login {
    LoginPOM loginPOM = new LoginPOM();

    @Given("Access the AYOS system")
    public void access_the_AYOS_system() {
        DriverClass.getDriver().get(ConfigurationReader.getProperty("api.url"));
        DriverClass.getDriver().manage().window().maximize();
    }

    @When("Enter the username and password")
    public void enter_the_username_and_password() {
        loginPOM.sendKeysMethod(loginPOM.getLoginUsername(), ConfigurationReader.getProperty("admin-user.one.username"));
        loginPOM.sendKeysMethod(loginPOM.getLoginPassword(), ConfigurationReader.getProperty("admin-user.one.password"));
    }

    @And("Click the Login button")
    public void click_the_Login_button() {
        loginPOM.clickMethod(loginPOM.getLoginButton());
    }

    @Then("The user should be able to successfully log in")
    public void the_user_should_be_able_to_successfully_log_in() {
        loginPOM.waitUntilVisible(loginPOM.getAdminsHeader());
        Assert.assertTrue(loginPOM.getAdminsHeader().isDisplayed());
    }
}
