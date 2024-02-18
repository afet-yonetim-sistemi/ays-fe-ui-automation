package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.pages.LogoutPOM;
import org.ays.utilities.MyMethods;
import org.testng.Assert;

public class Logout extends MyMethods {
    LogoutPOM logoutPOM = new LogoutPOM();

    @Given("Click on the admins button")
    public void clickOnTheAdminsButton() {
        logoutPOM.clickMethod(logoutPOM.getAdminsButton());
    }

    @When("Click on the profile button")
    public void clickOnTheProfileButton() {
        logoutPOM.hoverOver(logoutPOM.getProfileButton());
    }

    @And("Click on the logout button")
    public void clickOnTheLogoutButton() {
        logoutPOM.waitUntilVisible(logoutPOM.getLogoutButton());
        logoutPOM.clickMethod(logoutPOM.getLogoutButton());
    }

    @Then("the admin user should land on the Login page after logging out.")
    public void theAdminUserShouldLandOnTheLoginPageAfterLoggingOut() {
        Assert.assertTrue(logoutPOM.isPresent(logoutPOM.getLoginButton()));
    }
}
