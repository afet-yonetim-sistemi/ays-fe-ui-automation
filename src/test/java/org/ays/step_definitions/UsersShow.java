package org.ays.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.pages.UsersPOM;
import org.ays.utilities.PageActions;
import org.testng.Assert;

public class UsersShow extends PageActions {

    UsersPOM usersPOM = new UsersPOM();

    @When("Click on the eye icon")
    public void clickOnTheEyeIcon() {
        this.moveToElement(usersPOM.getShowIcon());
        this.clickElementWithJavaScript(usersPOM.getShowIcon());
    }

    @Then("Validate that the {string} has appeared in the users information")
    public void validateThatTheHasAppearedInTheUsersInformation(String username) {
        waitUntilVisible(usersPOM.getShowUsername());
        Assert.assertEquals(usersPOM.getShowUsername().getText(), username);
    }

}
