package org.ays.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ays.browser.AysPageActions;
import org.ays.pages.UsersPOM;
import org.testng.Assert;

public class UsersShow {

    private final UsersPOM usersPOM = new UsersPOM();
    private final AysPageActions pageActions = new AysPageActions();

    @When("Click on the eye icon")
    public void clickOnTheEyeIcon() {
        pageActions.moveToElement(usersPOM.getShowIcon());
        pageActions.clickElementWithJavaScript(usersPOM.getShowIcon());
    }

    @Then("Validate that the {string} has appeared in the users information")
    public void validateThatTheHasAppearedInTheUsersInformation(String username) {
        pageActions.waitUntilVisible(usersPOM.getShowUsername());
        Assert.assertEquals(usersPOM.getShowUsername().getText(), username);
    }

}
