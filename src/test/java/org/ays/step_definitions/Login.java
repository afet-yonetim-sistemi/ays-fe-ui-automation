package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.LoginPage;
import org.ays.configuration.AysConfigurationProperty;
import org.ays.utilities.AysLocalizationUtil;
import org.ays.utilities.AysLocaleStorageUtil;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Login {

    private final LoginPage loginPage;
    private final AysPageActions pageActions;
    private final AysLocaleStorageUtil localeStorageUtil;
    private final AysLocalizationUtil localizationUtil;


    public Login() {

        this.loginPage = new LoginPage();
        this.pageActions = new AysPageActions();
        this.localeStorageUtil = new AysLocaleStorageUtil();
        this.localizationUtil = new AysLocalizationUtil();

    }

    @Given("Open the institution login page")
    public void openTheInstitutionLoginPage() {
        pageActions.getWebDriver().get(AysConfigurationProperty.Ui.URL);
    }

    @When("Enter the email address and password")
    public void enterTheEmailAddressAndPassword() {
        pageActions.sendKeysMethod(loginPage.getLoginEmailAddress(), AysConfigurationProperty
                .TestVolunteerFoundation.Admin.EMAIL_ADDRESS);
        pageActions.sendKeysMethod(loginPage.getLoginPassword(), AysConfigurationProperty
                .TestVolunteerFoundation.Admin.PASSWORD);
    }

    @And("Click on the Login button")
    public void clickOnTheLoginButton() {
        pageActions.clickMethod(loginPage.getLoginButton());
    }

    @Then("The username should be displayed on the homepage after successful login")
    public void theUsernameShouldBeDisplayedOnTheHomepageAfterSuccessfulLogin() {
        pageActions.waitUntilVisible(loginPage.getUsername());
        assertTrue(pageActions.isPresent(loginPage.getUsername()));
    }

    @And("accessToken and refreshToken should be stored in localStorage")
    public void accessTokenAndRefreshTokenShouldBeStoredInLocalStorage() {
        pageActions.waitFor(2);
        localeStorageUtil.assertTokensStoredInLocalStorage();
    }

    @When("Enter invalid {string} and {string}")
    public void enterInvalidAnd(String emailAddress, String password) {
        pageActions.sendKeysMethod(loginPage.getLoginEmailAddress(), emailAddress);
        pageActions.sendKeysMethod(loginPage.getLoginPassword(), password);
    }

    @When("Sets the email address to {string} and enters {string}")
    public void setsTheEmailAddressToAndEnters(String emailAddress, String password) {
        pageActions.sendKeysMethod(loginPage.getLoginEmailAddress(), emailAddress);
        pageActions.sendKeysMethod(loginPage.getLoginPassword(), password);
    }

    @Then("User should be able to see invalid email error message")
    public void userShouldBeAbleToSeeInvalidEmailErrorMessage() {
        localizationUtil.validateElementMessage("login.validation_error.email_address",
                loginPage.getEmailAddressErrorMessage().getText(),
                true);
    }

    @Then("User should be able to see password errorMessage")
    public void userShouldBeAbleToSeePasswordErrorMessage() {
        localizationUtil.validateElementMessage("login.validation_error.password",
                loginPage.getPasswordErrorMessage().getText(),
                true);
    }

    @When("Enter unauthorized {string} and {string}")
    public void enterUnauthorizedAnd(String emailAddress, String password) {
        pageActions.sendKeysMethod(loginPage.getLoginEmailAddress(), emailAddress);
        pageActions.sendKeysMethod(loginPage.getLoginPassword(), password);
    }

    @Then("Error pop-up message should be displayed")
    public void errorPopUpMessageShouldBeDisplayed() {
        pageActions.waitUntilVisible(loginPage.getPopupErrorMessage());
        localizationUtil.validateElementMessage("login.popup_error_message",
                loginPage.getPopupErrorMessage().getText(),
                true);
    }

    @Then("User should be able to see errorMessage under email and password input box")
    public void userShouldBeAbleToSeeErrorMessageUnderEmailAndPasswordInputBox() {
        assertTrue(pageActions.isPresent(loginPage.getEmailAddressErrorMessage()));
        assertTrue(pageActions.isPresent(loginPage.getPasswordErrorMessage()));
    }

    @When("Enter hiding password")
    public void enterHidingPassword() {
        pageActions.sendKeysMethod(loginPage.getLoginPassword(), "passwordCheck");
    }

    @And("Click on the eye icon")
    public void clickOnTheEyeIcon() {
        pageActions.clickMethod(loginPage.getHiddenPasswordIcon());
    }

    @Then("The password should be displayed without being hidden")
    public void thePasswordShouldBeDisplayedWithoutBeingHidden() {
        assertEquals(loginPage.getLoginPassword().getAttribute("type"), "text");
    }

    @Then("The password should be displayed hidden")
    public void thePasswordShouldBeDisplayedHidden() {
        assertEquals(loginPage.getLoginPassword().getAttribute("type"), "password");
    }


    @When("Enter valid emailAddress and invalid password")
    public void enterValidEmailAddressAndInvalidPassword() {
        pageActions.sendKeysMethod(loginPage.getLoginEmailAddress(), AysConfigurationProperty
                .TestVolunteerFoundation.Admin.EMAIL_ADDRESS);
        pageActions.sendKeysMethod(loginPage.getLoginPassword(), "password");
    }

    @When("Enter invalid emailAddress and valid password")
    public void enterInvalidEmailAddressAndValidPassword() {
        pageActions.sendKeysMethod(loginPage.getLoginEmailAddress(), "invalid@email.us");
        pageActions.sendKeysMethod(loginPage.getLoginPassword(), AysConfigurationProperty
                .TestVolunteerFoundation.Admin.PASSWORD);
    }

    @And("The user navigates to the login URL in a new tab")
    public void theUserNavigatesToTheLoginURLInANewTab() {
        pageActions.openANewTab(AysConfigurationProperty.Ui.URL);
        pageActions.switchToWindow();

    }

    @Then("The user should be able to see dashboard page")
    public void theUserShouldBeAbleToSeeDashboardPage() {
        pageActions.waitUntilVisible(loginPage.getUsername());
        assertTrue(pageActions.getWebDriver().getCurrentUrl().contains("/dashboard"));

    }

    @When("The user navigates to the dashboard page")
    public void theUserNavigatesToTheDashboardPage() {
        pageActions.getWebDriver().navigate().to(AysConfigurationProperty.Ui.URL + "/dashboard");
    }

    @Then("The user should see the login page")
    public void theUserShouldSeeTheLoginPage() {
        pageActions.waitUntilVisible(loginPage.getWelcomeHeader());
        assertTrue(pageActions.getWebDriver().getCurrentUrl().contains("/login"));
    }

    @And("The {string} expires using mock expiration")
    public void theExpiresUsingMockExpiration(String token) {
        pageActions.waitFor(2);
        localeStorageUtil.mockTokenExpiration(token);
    }

    @Then("Refresh token generates a new access token and the user continues to login")
    public void refreshTokenGeneratesANewAccessTokenAndTheUserContinuesToLogin() {
        pageActions.waitUntilVisible(loginPage.getUsername());
        assertTrue(pageActions.getWebDriver().getCurrentUrl().contains("/dashboard"));
    }


    @When("Enter super admin email address and password")
    public void enterSuperAdminEmailAddressAndPassword() {
        pageActions.sendKeysMethod(
                loginPage.getLoginEmailAddress(),
                AysConfigurationProperty.TestVolunteerFoundation.SuperAdmin.EMAIL_ADDRESS)
        ;
        pageActions.sendKeysMethod(
                loginPage.getLoginPassword(),
                AysConfigurationProperty.TestVolunteerFoundation.SuperAdmin.PASSWORD
        );
    }

}
