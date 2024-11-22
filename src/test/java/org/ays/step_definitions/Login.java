package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.LoginPOM;
import org.ays.configuration.AysConfigurationProperty;
import org.ays.utilities.AysLocalizationUtil;
import org.ays.utilities.AysLocaleStorageUtil;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Login {

    private final LoginPOM loginPOM;
    private final AysPageActions pageActions;
    private final AysLocaleStorageUtil localeStorageUtil;
    private final AysLocalizationUtil localizationUtil;


    public Login() {

        this.loginPOM = new LoginPOM();
        this.pageActions = new AysPageActions();
        this.localeStorageUtil = new AysLocaleStorageUtil();
        this.localizationUtil = new AysLocalizationUtil();

    }

    @Given("Open the institution login page")
    public void openTheInstitutionLoginPage() {
        pageActions.getWebDriver().get(AysConfigurationProperty.Ui.URL);
        pageActions.getWebDriver().manage().window().maximize();
    }

    @When("Enter the email address and password")
    public void enterTheEmailAddressAndPassword() {
        pageActions.sendKeysMethod(loginPOM.getLoginEmailAddress(), AysConfigurationProperty
                .TestVolunteerFoundation.Admin.EMAIL_ADDRESS);
        pageActions.sendKeysMethod(loginPOM.getLoginPassword(), AysConfigurationProperty
                .TestVolunteerFoundation.Admin.PASSWORD);
    }

    @And("Click on the Login button")
    public void clickOnTheLoginButton() {
        pageActions.clickMethod(loginPOM.getLoginButton());
    }

    @Then("The username should be displayed on the homepage after successful login")
    public void theUsernameShouldBeDisplayedOnTheHomepageAfterSuccessfulLogin() {
        pageActions.waitUntilVisible(loginPOM.getUsername());
        assertTrue(pageActions.isPresent(loginPOM.getUsername()));
    }

    @And("accessToken and refreshToken should be stored in localStorage")
    public void accessTokenAndRefreshTokenShouldBeStoredInLocalStorage() {
        pageActions.waitFor(2);
        localeStorageUtil.assertTokensStoredInLocalStorage();
    }

    @When("Sets the page language")
    public void setsThePageLanguage() {
        pageActions.waitFor(2);
        localeStorageUtil.toggleLanguageInLocalStorage("en");
    }

    @When("Enter invalid {string} and {string}")
    public void enterInvalidAnd(String emailAddress, String password) {
        pageActions.sendKeysMethod(loginPOM.getLoginEmailAddress(), emailAddress);
        pageActions.sendKeysMethod(loginPOM.getLoginPassword(), password);
    }

    @When("Sets the email address to {string} and enters {string}")
    public void setsTheEmailAddressToAndEnters(String emailAddress, String password) {
        pageActions.sendKeysMethod(loginPOM.getLoginEmailAddress(), emailAddress);
        pageActions.sendKeysMethod(loginPOM.getLoginPassword(), password);
    }

    @Then("User should be able to see invalid email error message")
    public void userShouldBeAbleToSeeInvalidEmailErrorMessage() {
        assertEquals(loginPOM.getEmailAddressErrorMessage().getText(),
                localizationUtil.validateElementMessage("login.validation_error.email_address"));
    }

    @Then("User should be able to see password errorMessage")
    public void userShouldBeAbleToSeePasswordErrorMessage() {
        assertEquals(loginPOM.getPasswordErrorMessage().getText(),
                localizationUtil.validateElementMessage("login.validation_error.password"));
    }

    @When("Enter unauthorized {string} and {string}")
    public void enterUnauthorizedAnd(String emailAddress, String password) {
        pageActions.sendKeysMethod(loginPOM.getLoginEmailAddress(), emailAddress);
        pageActions.sendKeysMethod(loginPOM.getLoginPassword(), password);
    }

    @Then("Error pop-up message should be displayed")
    public void errorPopUpMessageShouldBeDisplayed() {
        pageActions.waitUntilVisible(loginPOM.getPopupErrorMessage());
        assertTrue(pageActions.isPresent(loginPOM.getPopupErrorMessage()));
    }

    @When("Enter hiding password")
    public void enterHidingPassword() {
        pageActions.sendKeysMethod(loginPOM.getLoginPassword(), "passwordCheck");
    }

    @And("Click on the eye icon")
    public void clickOnTheEyeIcon() {
        pageActions.clickMethod(loginPOM.getHiddenPasswordIcon());
    }

    @Then("The password should be displayed without being hidden")
    public void thePasswordShouldBeDisplayedWithoutBeingHidden() {
        assertEquals(loginPOM.getLoginPassword().getAttribute("type"), "text");
    }

    @Then("The password should be displayed hidden")
    public void thePasswordShouldBeDisplayedHidden() {
        assertEquals(loginPOM.getLoginPassword().getAttribute("type"), "password");
    }

    @When("Click on the theme icon")
    public void clickOnTheThemeIcon() {
        pageActions.moveToElement(loginPOM.getThemeIcon());
        pageActions.clickElementWithJavaScript(loginPOM.getThemeIcon());
    }

    @Then("User should be able to see dark theme")
    public void userShouldBeAbleToSeeDarkTheme() {
        pageActions.waitUntilVisible(loginPOM.getDarkTheme());
        assertTrue(pageActions.isPresent(loginPOM.getDarkTheme()));
    }

    @Then("User should be able to see light theme")
    public void userShouldBeAbleToSeeLightTheme() {
        pageActions.waitUntilVisible(loginPOM.getLightTheme());
        assertTrue(pageActions.isPresent(loginPOM.getLightTheme()));
    }

    @When("Enter valid emailAddress and invalid password")
    public void enterValidEmailAddressAndInvalidPassword() {
        pageActions.sendKeysMethod(loginPOM.getLoginEmailAddress(), AysConfigurationProperty
                .TestVolunteerFoundation.Admin.EMAIL_ADDRESS);
        pageActions.sendKeysMethod(loginPOM.getLoginPassword(), "password");
    }

    @When("Enter invalid emailAddress and valid password")
    public void enterInvalidEmailAddressAndValidPassword() {
        pageActions.sendKeysMethod(loginPOM.getLoginEmailAddress(), "invalid@email.us");
        pageActions.sendKeysMethod(loginPOM.getLoginPassword(), AysConfigurationProperty
                .TestVolunteerFoundation.Admin.PASSWORD);
    }

    @When("Click on the language button")
    public void clickOnTheLanguageButton() {
        pageActions.moveToElement(loginPOM.getLanguageButton());
        pageActions.clickMethod(loginPOM.getLanguageButton());
    }

    @And("Select the Turkish option")
    public void selectTheTurkishOption() {
        pageActions.clickMethod(loginPOM.getTurkishOption());
    }

    @Then("User should be able to see the Turkish page")
    public void userShouldBeAbleToSeeTheTurkishPage() {
        assertEquals(loginPOM.getWelcomeHeader().getText(),
                localizationUtil.validateElementMessage("login.header.welcome"));
    }

    @And("Select the English option")
    public void selectTheEnglishOption() {
        pageActions.clickMethod(loginPOM.getEnglishOption());
    }

    @Then("User should be able to see the English page")
    public void userShouldBeAbleToSeeTheEnglishPage() {
        assertEquals(loginPOM.getWelcomeHeader().getText(),
                localizationUtil.validateElementMessage("login.header.welcome"));
    }

}
