package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.UsersPOM;

public class UsersEdit {

    private final UsersPOM usersPOM = new UsersPOM();
    private final AysPageActions pageActions = new AysPageActions();

    @And("Click on the pencil icon")
    public void clickOnThePencilIcon() {
        pageActions.waitUntilVisible(usersPOM.getUsersEditIcon());
        pageActions.moveToElement(usersPOM.getUsersEditIcon());
        pageActions.clickElementWithJavaScript(usersPOM.getUsersEditIcon());
    }

    @When("Edit the status section in the user form")
    public void editTheStatusSectionInTheUserForm() {
        pageActions.moveToElement(usersPOM.getStatusDropdown());
        pageActions.clickMethod(usersPOM.getStatusDropdown());

        if (usersPOM.getStatusDropdown().getText().equals("Active")) {
            pageActions.waitUntilClickable(usersPOM.getPassiveOption());
            pageActions.clickMethod(usersPOM.getPassiveOption());
        }
        if (usersPOM.getStatusDropdown().getText().equals("Passive")) {
            pageActions.waitUntilClickable(usersPOM.getActiveOption());
            pageActions.clickMethod(usersPOM.getActiveOption());
        }
    }

    @Then("Click on the save edit button")
    public void Click_on_the_save_edit_button() {
        pageActions.waitUntilVisible(usersPOM.getEditSaveButton());
        pageActions.moveToElement(usersPOM.getEditSaveButton());
        pageActions.clickElementWithJavaScript(usersPOM.getEditSaveButton());
    }

}
