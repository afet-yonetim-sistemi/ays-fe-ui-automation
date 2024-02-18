package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.pages.LogoutPOM;
import org.ays.utilities.PageActions;
import org.testng.Assert;

public class Logout extends PageActions {

    LogoutPOM logoutPOM = new LogoutPOM();

    @Given("Click on the admins button")
    public void clickOnTheAdminsButton() {
        this.clickMethod(logoutPOM.getAdminsButton());
    }

    @When("Click on the profile button")
    public void clickOnTheProfileButton() {
        this.hoverOver(logoutPOM.getProfileButton());
    }

    @And("Click on the logout button")
    public void clickOnTheLogoutButton() {
        this.waitUntilVisible(logoutPOM.getLogoutButton());
        this.clickMethod(logoutPOM.getLogoutButton());
    }

    @Then("the admin user should land on the Login page after logging out.")
    public void theAdminUserShouldLandOnTheLoginPageAfterLoggingOut() {
        Assert.assertTrue(this.isPresent(logoutPOM.getLoginButton()));
    }

}
