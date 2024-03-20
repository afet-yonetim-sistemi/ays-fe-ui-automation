package org.ays.step_definitions;

import io.cucumber.java.en.And;
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

    @When("Fill out the users form")
    public void fill_out_the_users_form() {
        pageActions.sendKeysMethod(usersPOM.getFirstName(), AysRandomUtil.generateFirstName());
        pageActions.sendKeysMethod(usersPOM.getLastName(), AysRandomUtil.generateLastName());
        pageActions.clickMethod(usersPOM.getCountryCode());
        pageActions.clickMethod(usersPOM.getTurkeyCountryCode());
        pageActions.sendKeysMethod(usersPOM.getPhoneNumber(), AysRandomUtil.generatePhoneNumber());
    }

    @And("{string} success message is displayed")
    public void successMessageIsDisplayed(String message) {
        pageActions.waitUntilVisible(usersPOM.getSuccessfulMessage());
        Assert.assertEquals(usersPOM.getSuccessfulMessage().getText(), message);
    }

    @And("Enter invalid characters in the name field while filling out the users form")
    public void enterInvalidCharactersInTheNameFieldWhileFillingOutTheUsersForm() {
        pageActions.sendKeysMethod(usersPOM.getFirstName(), "?--/-**-8965");
        pageActions.sendKeysMethod(usersPOM.getLastName(), AysRandomUtil.generateLastName());
        pageActions.clickMethod(usersPOM.getCountryCode());
        pageActions.clickMethod(usersPOM.getTurkeyCountryCode());
        pageActions.sendKeysMethod(usersPOM.getPhoneNumber(), AysRandomUtil.generatePhoneNumber());
    }

    @And("Enter invalid characters in the last name field while filling out the users form")
    public void enterInvalidCharactersInTheLastNameFieldWhileFillingOutTheUsersForm() {
        pageActions.sendKeysMethod(usersPOM.getFirstName(), AysRandomUtil.generateFirstName());
        pageActions.sendKeysMethod(usersPOM.getLastName(), "?--/-**-8965");
        pageActions.clickMethod(usersPOM.getCountryCode());
        pageActions.clickMethod(usersPOM.getTurkeyCountryCode());
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
        Assert.assertEquals(usersPOM.getInvalidPhoneNumberMessage().getText(), message);
    }

}
