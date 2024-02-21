package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.LogoutPOM;
import org.testng.Assert;

public class Logout {

    private final LogoutPOM logoutPOM;
    private final AysPageActions pageActions;

    public Logout() {
        this.logoutPOM = new LogoutPOM();
        this.pageActions = new AysPageActions();
    }

    @Given("Click on the admins button")
    public void clickOnTheAdminsButton() {
        pageActions.clickMethod(logoutPOM.getAdminsButton());
    }

    @When("Click on the profile button")
    public void clickOnTheProfileButton() {
        pageActions.hoverOver(logoutPOM.getProfileButton());
    }

    @And("Click on the logout button")
    public void clickOnTheLogoutButton() {
        pageActions.waitUntilVisible(logoutPOM.getLogoutButton());
        pageActions.clickMethod(logoutPOM.getLogoutButton());
    }

    @Then("the admin user should land on the Login page after logging out.")
    public void theAdminUserShouldLandOnTheLoginPageAfterLoggingOut() {
        Assert.assertTrue(pageActions.isPresent(logoutPOM.getLoginButton()));
    }

}
