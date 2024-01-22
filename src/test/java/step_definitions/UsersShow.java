package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AYOSUsersPOM;
import utilities.MyMethods;

public class UsersShow extends MyMethods {
    AYOSUsersPOM usersPOM = new AYOSUsersPOM();
    @When("Click on the eye icon")
    public void clickOnTheEyeIcon() {
        usersPOM.moveToElement(usersPOM.getShowIcon());
        usersPOM.clickElementWithJavaScript(usersPOM.getShowIcon());
    }
    @Then("Validate that the {string} has appeared in the users information")
    public void validateThatTheHasAppearedInTheUsersInformation(String username) {
        waitUntilVisible(usersPOM.getShowUsername());
        Assert.assertEquals(usersPOM.getShowUsername().getText(),username);
    }
}
