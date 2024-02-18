package org.ays.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.ays.pages.UsersPOM;
import org.ays.utilities.PageActions;

public class UsersDelete extends PageActions {

    UsersPOM usersPOM = new UsersPOM();

    @When("Click on the trash bin icon for the top users")
    public void click_on_the_trash_bin_icon_for_the_top_users() {
        this.waitUntilClickable(usersPOM.getDeleteUsersIcon());
        this.clickMethod(usersPOM.getDeleteUsersIcon());
    }

    @And("Click on the delete button for the top users")
    public void clickOnTheDeleteButtonForTheTopUsers() {
        this.waitUntilClickable(usersPOM.getSureDeleteButton());
        this.clickMethod(usersPOM.getSureDeleteButton());
    }

}
