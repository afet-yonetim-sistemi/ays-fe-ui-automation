package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.AYOSUsersPOM;

public class UsersDelete {

    AYOSUsersPOM usersPOM = new AYOSUsersPOM();
    @When("Click on the trash bin icon for the top users")
    public void click_on_the_trash_bin_icon_for_the_top_users() {
        usersPOM.waitUntilClickable(usersPOM.getDeleteUsersIcon());
        usersPOM.clickMethod(usersPOM.getDeleteUsersIcon());
    }

    @And("Click on the delete button for the top users")
    public void clickOnTheDeleteButtonForTheTopUsers() {
        usersPOM.waitUntilClickable(usersPOM.getSureDeleteButton());
        usersPOM.clickMethod(usersPOM.getSureDeleteButton());
    }
}