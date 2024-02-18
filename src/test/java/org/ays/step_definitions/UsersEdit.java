package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.ays.pages.UsersPOM;
import org.ays.utilities.PageActions;

public class UsersEdit extends PageActions {

    UsersPOM usersPOM = new UsersPOM();

    @And("Click on the pencil icon")
    public void clickOnThePencilIcon() {
        this.moveToElement(usersPOM.getUsersEditIcon());
        this.clickElementWithJavaScript(usersPOM.getUsersEditIcon());

    }

    @When("Edit the status section in the user form")
    public void editTheStatusSectionInTheUserForm() {
        this.waitUntilClickable(usersPOM.getStatusDropdown());
        this.clickMethod(usersPOM.getStatusDropdown());
        if (usersPOM.getStatusDropdown().getText().equalsIgnoreCase("active")) {
            this.waitUntilClickable(usersPOM.getPassiveOption());
            this.clickMethod(usersPOM.getPassiveOption());
        } else if (usersPOM.getStatusDropdown().getText().equalsIgnoreCase("passive")) {
            this.waitUntilClickable(usersPOM.getActiveOption());
            this.clickMethod(usersPOM.getActiveOption());
        }

    }

}
