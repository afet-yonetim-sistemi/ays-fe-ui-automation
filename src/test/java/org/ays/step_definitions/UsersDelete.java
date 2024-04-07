package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.pages.UsersPOM;
import org.ays.browser.AysPageActions;
import org.ays.utilities.AysRandomUtil;
import org.testng.Assert;

public class UsersDelete {

    private final UsersPOM usersPOM = new UsersPOM();
    private final AysPageActions pageActions = new AysPageActions();

    @And("Fill out the users form using {string} firstName")
    public void fillOutTheUsersFormUsingFirstName(String firstName) {
        pageActions.waitUntilVisible(usersPOM.getFirstName());
        pageActions.sendKeysMethod(usersPOM.getFirstName(), firstName + AysRandomUtil.generateFirstName());
        pageActions.waitUntilVisible(usersPOM.getLastName());
        pageActions.sendKeysMethod(usersPOM.getLastName(), AysRandomUtil.generateLastName());
        pageActions.clickMethod(usersPOM.getCountryCode());
        pageActions.clickMethod(usersPOM.getTurkeyCountryCode());
        pageActions.waitUntilVisible(usersPOM.getPhoneNumber());
        pageActions.sendKeysMethod(usersPOM.getPhoneNumber(), AysRandomUtil.generatePhoneNumber());

    }

    @And("Click on the pop up close button")
    public void clickOnThePopUpCloseButton() {
        pageActions.waitFor(3);
        pageActions.waitUntilClickable(usersPOM.getPopupCloseButton());
        pageActions.clickMethod(usersPOM.getPopupCloseButton());
    }

    @And("Click on the pop up close Ok button")
    public void clickOnThePopUpCloseOkButton() {
        pageActions.waitUntilClickable(usersPOM.getPopupCloseOkButton());
        pageActions.clickMethod(usersPOM.getPopupCloseOkButton());

    }

    @When("Sort Created At column in descending order")
    public void sort_created_at_column_in_descending_order() {
        pageActions.waitFor(3);
        pageActions.waitUntilVisible(usersPOM.getCreatedAtColumn());
        pageActions.waitUntilClickable(usersPOM.getCreatedAtColumn());
        pageActions.doubleClick(usersPOM.getCreatedAtColumn());
    }

    @When("Click on the trash bin icon for the top users")
    public void click_on_the_trash_bin_icon_for_the_top_users() {
        pageActions.waitFor(3);
        pageActions.waitUntilVisible(usersPOM.getFirstRowData());

        String firstName = usersPOM.getFirstRowData().get(0).getText();
        if (firstName.startsWith("Test")) {
            pageActions.moveToElement(usersPOM.getDeleteUsersIcon());
            pageActions.clickElementWithJavaScript(usersPOM.getDeleteUsersIcon());
        }
        pageActions.waitFor(3);
    }

    @And("Click on the delete button for the top users")
    public void clickOnTheDeleteButtonForTheTopUsers() {
        pageActions.moveToElement(usersPOM.getSureDeleteButton());
        pageActions.waitUntilClickable(usersPOM.getSureDeleteButton());
        pageActions.clickElementWithJavaScript(usersPOM.getSureDeleteButton());
    }

    @Then("Validate the success message")
    public void Validate_the_success_message() {
        pageActions.waitUntilVisible(usersPOM.getSuccessMessageDelete());
        Assert.assertTrue(usersPOM.getSuccessMessageDelete().isDisplayed());
    }

}
