package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.UsersPOM;
import org.ays.utilities.AysRandomUtil;
import org.testng.Assert;

public class UsersCreate {

    private final UsersPOM usersPOM = new UsersPOM();
    private final AysPageActions pageActions = new AysPageActions();

    @When("Click on the users tab")
    public void click_on_the_users_tab() {
        pageActions.waitUntilClickable(usersPOM.getUsersTab());
        pageActions.clickMethod(usersPOM.getUsersTab());
    }

    @And("Click on the create button")
    public void Click_on_the_create_button() {
        pageActions.moveToElement(usersPOM.getCreateButton());
        pageActions.clickElementWithJavaScript(usersPOM.getCreateButton());
    }

    @When("Fill out the users form")
    public void fill_out_the_users_form() {
        pageActions.waitUntilVisible(usersPOM.getFirstName());
        pageActions.sendKeysMethod(usersPOM.getFirstName(), AysRandomUtil.generateFirstName());
        pageActions.waitUntilVisible(usersPOM.getLastName());
        pageActions.sendKeysMethod(usersPOM.getLastName(), AysRandomUtil.generateLastName());
        pageActions.clickMethod(usersPOM.getCountryCode());
        pageActions.clickMethod(usersPOM.getTurkeyCountryCode());
        pageActions.waitUntilVisible(usersPOM.getPhoneNumber());
        pageActions.sendKeysMethod(usersPOM.getPhoneNumber(), AysRandomUtil.generatePhoneNumber());
    }

    @Then("Click on the save button")
    public void Click_on_the_save_button() {
        pageActions.clickMethod(usersPOM.getSaveButton());
    }

    @And("{string} success message is displayed")
    public void successMessageIsDisplayed(String message) {
        pageActions.waitUntilVisible(usersPOM.getSuccessfulMessage());
        Assert.assertEquals(usersPOM.getSuccessfulMessage().getText(), message);
    }

    @And("Enter invalid characters in the name field while filling out the users form")
    public void enterInvalidCharactersInTheNameFieldWhileFillingOutTheUsersForm() {
        pageActions.waitUntilVisible(usersPOM.getFirstName());
        pageActions.sendKeysMethod(usersPOM.getFirstName(), "?--/-**-8965");
        pageActions.waitUntilVisible(usersPOM.getLastName());
        pageActions.sendKeysMethod(usersPOM.getLastName(), AysRandomUtil.generateLastName());
        pageActions.clickMethod(usersPOM.getCountryCode());
        pageActions.clickMethod(usersPOM.getTurkeyCountryCode());
        pageActions.waitUntilVisible(usersPOM.getPhoneNumber());
        pageActions.sendKeysMethod(usersPOM.getPhoneNumber(), AysRandomUtil.generatePhoneNumber());
    }

    @And("Enter invalid characters in the last name field while filling out the users form")
    public void enterInvalidCharactersInTheLastNameFieldWhileFillingOutTheUsersForm() {
        pageActions.waitUntilVisible(usersPOM.getFirstName());
        pageActions.sendKeysMethod(usersPOM.getFirstName(), AysRandomUtil.generateFirstName());
        pageActions.waitUntilVisible(usersPOM.getLastName());
        pageActions.sendKeysMethod(usersPOM.getLastName(), "?--/-**-8965");
        pageActions.clickMethod(usersPOM.getCountryCode());
        pageActions.clickMethod(usersPOM.getTurkeyCountryCode());
        pageActions.waitUntilVisible(usersPOM.getPhoneNumber());
        pageActions.sendKeysMethod(usersPOM.getPhoneNumber(), AysRandomUtil.generatePhoneNumber());
    }

    @And("{string} error massage is displayed")
    public void errorMassageIsDisplayed(String message) {
        pageActions.waitUntilVisible(usersPOM.getErrorMassage());
        Assert.assertEquals(usersPOM.getErrorMassage().getText(), message);
    }

    @And("Enter invalid characters in the phone number field while filling out the users form")
    public void enterInvalidCharactersInThePhoneNumberFieldWhileFillingOutTheUsersForm() {
        pageActions.waitUntilVisible(usersPOM.getFirstName());
        pageActions.sendKeysMethod(usersPOM.getFirstName(), AysRandomUtil.generateFirstName());
        pageActions.waitUntilVisible(usersPOM.getLastName());
        pageActions.sendKeysMethod(usersPOM.getLastName(), AysRandomUtil.generateLastName());
        pageActions.clickMethod(usersPOM.getCountryCode());
        pageActions.clickMethod(usersPOM.getTurkeyCountryCode());
        pageActions.waitUntilVisible(usersPOM.getPhoneNumber());
        pageActions.sendKeysMethod(usersPOM.getPhoneNumber(), "123");
    }

    @And("{string} massage is displayed")
    public void massageIsDisplayed(String message) {
        pageActions.waitUntilVisible(usersPOM.getInvalidPhoneNumberMessage());
        Assert.assertEquals(usersPOM.getInvalidPhoneNumberMessage().getText(), message);
    }

    @And("{string} title is displayed")
    public void titleIsDisplayed(String title) {
        pageActions.waitUntilVisible(usersPOM.getNewUserCreatedTitle());
        Assert.assertEquals(usersPOM.getNewUserCreatedTitle().getText(), title);

    }

    @And("Username and Password information is displayed")
    public void usernameAndPasswordInformationIsDisplayed() {
        pageActions.waitUntilVisible(usersPOM.getUsernameInfo());
        Assert.assertTrue(pageActions.isPresent(usersPOM.getUsernameInfo()));
        Assert.assertTrue(pageActions.isPresent(usersPOM.getPasswordInfo()));
    }

    @Then("Click on the Copy and Close button")
    public void clickOnTheCopyAndCloseButton() {
        pageActions.waitUntilClickable(usersPOM.getCopyAndCloseButton());
        pageActions.clickMethod(usersPOM.getCopyAndCloseButton());
    }

    @And("{string} message is displayed")
    public void messageIsDisplayed(String copiedMessage) {
        pageActions.waitUntilVisible(usersPOM.getCopiedMessage());
        Assert.assertEquals(usersPOM.getCopiedMessage().getText(), copiedMessage);
    }
}
