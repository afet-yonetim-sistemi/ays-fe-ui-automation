package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.pages.UsersPOM;
import org.ays.browser.AysPageActions;
import org.testng.Assert;

public class UsersDelete {

    private final UsersPOM usersPOM = new UsersPOM();
    private final AysPageActions pageActions = new AysPageActions();

    @When("Sort Created At column in descending order")
    public void sort_created_at_column_in_descending_order() {
        pageActions.doubleClick(usersPOM.getCreatedAtColumn());
    }

    @When("Click on the trash bin icon for the top users")
    public void click_on_the_trash_bin_icon_for_the_top_users() {
        pageActions.waitUntilClickable(usersPOM.getDeleteUsersIcon());
        pageActions.moveToElement(usersPOM.getDeleteUsersIcon());
        pageActions.clickElementWithJavaScript(usersPOM.getDeleteUsersIcon());
    }

    @And("Click on the delete button for the top users")
    public void clickOnTheDeleteButtonForTheTopUsers() {
        pageActions.waitUntilClickable(usersPOM.getSureDeleteButton());
        pageActions.clickMethod(usersPOM.getSureDeleteButton());
    }

    @Then("Validate the success message")
    public void Validate_the_success_message() {
        pageActions.waitUntilVisible(usersPOM.getSuccessMessageDelete());
        Assert.assertTrue(usersPOM.getSuccessMessageDelete().isDisplayed());
    }

}
