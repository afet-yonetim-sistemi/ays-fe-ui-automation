package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LogoutPOM;
import utilities.MyMethods;

public class Logout extends MyMethods {
    LogoutPOM logout=new LogoutPOM();

    @Given("Click on the admins button")
    public void click_on_the_admins_button() {
        logout.clickMethod(logout.getAdminsButton());
    }

    @When("Click on the profile button")
    public void click_on_the_profile_button() {
        logout.hoverOver(logout.getProfileButton());
    }


    @When("Click on the logout button")
    public void click_on_the_logout_button() {
        logout.waitUntilVisible(logout.getLogoutButton());
        logout.clickMethod(logout.getLogoutButton());

    }

    @Then("the admin user should land on the Login page after logging out.")
    public void theAdminUserShouldLandOnTheLoginPageAfterLoggingOut() {
        Assert.assertTrue(logout.isPresent(logout.getLoginButton()));
    }
}
