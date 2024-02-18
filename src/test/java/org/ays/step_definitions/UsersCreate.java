package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.ays.pages.UsersPOM;
import org.ays.utilities.AysRandomUtil;
import org.ays.utilities.MyMethods;
import org.testng.Assert;

public class UsersCreate extends MyMethods {

    UsersPOM usersPOM = new UsersPOM();

    @When("Click on the users tab")
    public void click_on_the_users_tab() {
        waitUntilClickable(usersPOM.getUsersTab());
        usersPOM.clickMethod(usersPOM.getUsersTab());
    }

    @When("Fill out the users form")
    public void fill_out_the_users_form() {

        usersPOM.sendKeysMethod(usersPOM.getFirstName(), AysRandomUtil.generateFirstName());
        usersPOM.sendKeysMethod(usersPOM.getLastName(), AysRandomUtil.generateLastName());
        usersPOM.clickMethod(usersPOM.getCountryCode());
        usersPOM.clickMethod(usersPOM.getTurkeyCountryCode());
        usersPOM.sendKeysMethod(usersPOM.getPhoneNumber(), AysRandomUtil.generatePhoneNumber());
    }

    @And("{string} success message is displayed")
    public void successMessageIsDisplayed(String message) {
        waitUntilVisible(usersPOM.getSuccessfulMessage());
        Assert.assertEquals(usersPOM.getSuccessfulMessage().getText(), message);
    }

    @And("Enter invalid characters in the name field while filling out the users form")
    public void enterInvalidCharactersInTheNameFieldWhileFillingOutTheUsersForm() {

        usersPOM.sendKeysMethod(usersPOM.getFirstName(), "?--/-**-8965");
        usersPOM.sendKeysMethod(usersPOM.getLastName(), AysRandomUtil.generateLastName());
        usersPOM.clickMethod(usersPOM.getCountryCode());
        usersPOM.clickMethod(usersPOM.getTurkeyCountryCode());
        usersPOM.sendKeysMethod(usersPOM.getPhoneNumber(), AysRandomUtil.generatePhoneNumber());
    }

    @And("Enter invalid characters in the last name field while filling out the users form")
    public void enterInvalidCharactersInTheLastNameFieldWhileFillingOutTheUsersForm() {

        usersPOM.sendKeysMethod(usersPOM.getFirstName(), AysRandomUtil.generateFirstName());
        usersPOM.sendKeysMethod(usersPOM.getLastName(), "?--/-**-8965");
        usersPOM.clickMethod(usersPOM.getCountryCode());
        usersPOM.clickMethod(usersPOM.getTurkeyCountryCode());
        usersPOM.sendKeysMethod(usersPOM.getPhoneNumber(), AysRandomUtil.generatePhoneNumber());

    }

    @And("{string} error massage is displayed")
    public void errorMassageIsDisplayed(String message) {
        waitUntilVisible(usersPOM.getErrorMassage());
        Assert.assertEquals(usersPOM.getErrorMassage().getText(), message);
    }

    @And("Enter invalid characters in the phone number field while filling out the users form")
    public void enterInvalidCharactersInThePhoneNumberFieldWhileFillingOutTheUsersForm() {

        usersPOM.sendKeysMethod(usersPOM.getFirstName(), AysRandomUtil.generateFirstName());
        usersPOM.sendKeysMethod(usersPOM.getLastName(), AysRandomUtil.generateLastName());
        usersPOM.clickMethod(usersPOM.getCountryCode());
        usersPOM.clickMethod(usersPOM.getTurkeyCountryCode());
        usersPOM.sendKeysMethod(usersPOM.getPhoneNumber(), "abc");
    }

    @And("{string} massage is displayed")
    public void massageIsDisplayed(String message) {
        Assert.assertEquals(usersPOM.getInvalidPhoneNumberMessage().getText(), message);
    }

}
