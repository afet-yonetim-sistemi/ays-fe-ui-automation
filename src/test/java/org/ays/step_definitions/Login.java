package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.pages.LoginPOM;
import org.ays.utilities.AysConfigurationProperty;
import org.ays.utilities.DriverUtil;
import org.ays.utilities.PageActions;
import org.testng.Assert;

public class Login extends PageActions {

    LoginPOM loginPOM = new LoginPOM();

    @Given("Access the AYOS system")
    public void access_the_AYOS_system() {
        DriverUtil.generateDriver().get(AysConfigurationProperty.Api.URL);
        DriverUtil.generateDriver().manage().window().maximize();
    }

    @When("Enter the username and password")
    public void enter_the_username_and_password() {
        this.sendKeysMethod(loginPOM.getLoginUsername(), AysConfigurationProperty.InstitutionOne.AdminUserOne.USERNAME);
        this.sendKeysMethod(loginPOM.getLoginPassword(), AysConfigurationProperty.InstitutionOne.AdminUserOne.PASSWORD);
    }

    @And("Click the Login button")
    public void click_the_Login_button() {
        this.clickMethod(loginPOM.getLoginButton());
    }

    @Then("The user should be able to successfully log in")
    public void the_user_should_be_able_to_successfully_log_in() {
        this.waitUntilVisible(loginPOM.getAdminsHeader());
        Assert.assertTrue(loginPOM.getAdminsHeader().isDisplayed());
    }

}
