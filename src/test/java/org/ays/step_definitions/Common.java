package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.BasePage;
import org.ays.pages.LoginPage;
import org.ays.utilities.AysLocaleStorageUtil;
import org.ays.utilities.AysLocalizationUtil;

import static org.ays.enums.AysLanguage.EN;
import static org.ays.enums.AysLanguage.TR;
import static org.testng.Assert.assertTrue;

public class Common {
    private final LoginPage loginPage;
    private final BasePage basePage;
    private final AysPageActions pageActions;

    public Common() {

        this.loginPage = new LoginPage();
        this.basePage = new BasePage();
        this.pageActions = new AysPageActions();

    }

    @When("Click on the theme icon")
    public void clickOnTheThemeIcon() {
        pageActions.moveToElement(loginPage.getThemeIcon());
        pageActions.clickElementWithJavaScript(loginPage.getThemeIcon());
    }

    @Then("User should be able to see dark theme")
    public void userShouldBeAbleToSeeDarkTheme() {
        pageActions.waitUntilVisible(loginPage.getDarkTheme());
        assertTrue(pageActions.isPresent(loginPage.getDarkTheme()));
    }

    @Then("User should be able to see light theme")
    public void userShouldBeAbleToSeeLightTheme() {
        pageActions.waitUntilVisible(loginPage.getLightTheme());
        assertTrue(pageActions.isPresent(loginPage.getLightTheme()));
    }

    @When("Click on the language button")
    public void clickOnTheLanguageButton() {
        pageActions.moveToElement(loginPage.getLanguageButton());
        pageActions.clickMethod(loginPage.getLanguageButton());
    }

    @And("Select the {string} option")
    public void selectTheOption(String language) {
        pageActions.waitFor(1);
        basePage.selectLanguage(language);
        pageActions.getWebDriver().navigate().refresh();
    }

    @Then("The user should be able to see all texts compatible with the Turkish language")
    public void theUserShouldBeAbleToSeeAllTextsCompatibleWithTheTurkishLanguage() {
        if (AysLocaleStorageUtil.getLanguageFromLocalStorage().equals("tr")) {
            AysLocalizationUtil.setLanguage(TR);

            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.header.welcome")));
            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.sub_title")));
            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.input.email")));
            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.input.password")));
            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.button.login")));
            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.button.forgot_password")));
        }
    }

    @Then("The user should be able to see all texts compatible with the English language")
    public void theUserShouldBeAbleToSeeAllTextsCompatibleWithTheEnglishLanguage() {
        if (AysLocaleStorageUtil.getLanguageFromLocalStorage().equals("en")) {
            AysLocalizationUtil.setLanguage(EN);

            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.header.welcome")));
            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.sub_title")));
            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.input.email")));
            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.input.password")));
            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.button.login")));
            assertTrue(loginPage.getAllLoginText().getText()
                    .contains(AysLocalizationUtil.getText("login.button.forgot_password")));
        }
    }
}
