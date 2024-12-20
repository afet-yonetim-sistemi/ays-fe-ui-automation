package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.LogoutPage;
import org.testng.Assert;

public class Logout {

    private final LogoutPage logoutPage;
    private final AysPageActions pageActions;

    public Logout() {
        this.logoutPage = new LogoutPage();
        this.pageActions = new AysPageActions();
    }

    @When("Click on the profile button")
    public void clickOnTheProfileButton() {
        pageActions.waitUntilVisible(logoutPage.getProfileButton());
        pageActions.hoverOver(logoutPage.getProfileButton());
    }

    @And("Click on the logout button")
    public void clickOnTheLogoutButton() {
        pageActions.waitUntilVisible(logoutPage.getLogoutButton());
        pageActions.clickMethod(logoutPage.getLogoutButton());
    }

    @Then("the admin user should land on the Login page after logging out.")
    public void theAdminUserShouldLandOnTheLoginPageAfterLoggingOut() {
        Assert.assertTrue(pageActions.isPresent(logoutPage.getLoginButton()));
    }

}
