package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LogoutPOM;
import utilities.MyMethods;

public class Logout extends MyMethods {
    LogoutPOM logout = new LogoutPOM();
    @Given("Click on the admins button")
    public void clickOnTheAdminsButton() {
        logout.clickMethod(logout.getAdminsButton());
    }
    @When("Click on the profile button")
    public void clickOnTheProfileButton() {
        logout.hoverOver(logout.getProfileButton());
    }
    @And("Click on the logout button")
    public void clickOnTheLogoutButton() {
        logout.waitUntilVisible(logout.getLogoutButton());
        logout.clickMethod(logout.getLogoutButton());
    }
    @Then("the admin user should land on the Login page after logging out.")
    public void theAdminUserShouldLandOnTheLoginPageAfterLoggingOut() {
        Assert.assertTrue(logout.isPresent(logout.getLoginButton()));
    }
}
