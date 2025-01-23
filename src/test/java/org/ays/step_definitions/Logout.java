package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.configuration.AysConfigurationProperty;
import org.ays.pages.LogoutPage;
import org.ays.utilities.AysLocaleStorageUtil;
import org.testng.Assert;

public class Logout {

    private final LogoutPage logoutPage;
    private final AysPageActions pageActions;
    private final AysLocaleStorageUtil localeStorageUtil;

    public Logout() {
        this.logoutPage = new LogoutPage();
        this.pageActions = new AysPageActions();
        this.localeStorageUtil = new AysLocaleStorageUtil();
    }

    @When("Click on the profile button")
    public void clickOnTheProfileButton() {
        pageActions.waitUntilVisible(logoutPage.getProfileButton());
        pageActions.clickMethod(logoutPage.getProfileButton());
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

    @And("The localStorage should not contain accessToken or refreshToken")
    public void theLocalStorageShouldNotContainAccessTokenOrRefreshToken() {
        pageActions.waitFor(2);
        localeStorageUtil.assertTokensNotInLocalStorage();
    }

    @When("The user navigates to a restricted URL directly")
    public void theUserNavigatesToARestrictedURLDirectly() {
        String restrictedUrl = AysConfigurationProperty.Ui.URL + "/dashboard";
        pageActions.getWebDriver().get(restrictedUrl);
    }

    @Then("The user should be redirected to the login page")
    public void theUserShouldBeRedirectedToTheLoginPage() {
        Assert.assertTrue(pageActions.isPresent(logoutPage.getLoginButton()));
    }

    @Given("The user is logged in on multiple browser tabs")
    public void theUserIsLoggedInOnMultipleBrowserTabs() {
        pageActions.openANewTab(AysConfigurationProperty.Ui.URL);
        pageActions.switchToTabByIndex(1);
        Assert.assertTrue(pageActions.isPresent(logoutPage.getProfileButton()),
                "User is not logged in on the second tab.");

    }

    @When("The user logs out from one tab")
    public void theUserLogsOutFromOneTab() {
        pageActions.switchToTabByIndex(0);
        pageActions.clickMethod(logoutPage.getProfileButton());
        pageActions.clickMethod(logoutPage.getLogoutButton());
        Assert.assertTrue(pageActions.isPresent(logoutPage.getLoginButton()), "Logout failed in first tab");
    }

    @Then("The user should be logged out on the second tab after refreshing")
    public void theUserShouldBeLoggedOutOnTheSecondTabAfterRefreshing() {
        pageActions.switchToTabByIndex(1);
        pageActions.getWebDriver().navigate().refresh();
        Assert.assertTrue(pageActions.isPresent(logoutPage.getLoginButton()), "User is not logged out on the second tab");
    }
}
