package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.LoginPOM;
import org.ays.configuration.AysConfigurationProperty;
import org.testng.Assert;

public class Login {

    private final LoginPOM loginPOM = new LoginPOM();
    private final AysPageActions pageActions = new AysPageActions();

    @Given("Open the institution login page")
    public void open_the_institution_login_page() {
        this.pageActions.getWebDriver().get(AysConfigurationProperty.Ui.URL);
        this.pageActions.getWebDriver().manage().window().maximize();
    }

    @When("Enter the username and password")
    public void enter_the_username_and_password() {
        this.pageActions.sendKeysMethod(loginPOM.getLoginUsername(), AysConfigurationProperty.VolunteerFoundationAdmin.EMAIL_ADDRESS);
        this.pageActions.sendKeysMethod(loginPOM.getLoginPassword(), AysConfigurationProperty.VolunteerFoundationAdmin.PASSWORD);
    }

    @And("Click the Login button")
    public void click_the_Login_button() {
        this.pageActions.clickMethod(loginPOM.getLoginButton());
    }

    @Then("The user should be able to successfully log in")
    public void the_user_should_be_able_to_successfully_log_in() {
        this.pageActions.waitUntilVisible(loginPOM.getAdminsHeader());
        Assert.assertTrue(loginPOM.getAdminsHeader().isDisplayed());
    }

}
