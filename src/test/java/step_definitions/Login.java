package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPOM;
import utilities.ConfigurationReader;
import utilities.DriverClass;

public class Login {
    LoginPOM login =new LoginPOM();
    @Given("Access the AYOS system")
    public void access_the_AYOS_system() {
        DriverClass.getDriver().get(ConfigurationReader.getProperty("api.url"));
        DriverClass.getDriver().manage().window().maximize();
    }
    @When("Enter the username and password")
    public void enter_the_username_and_password() {
        login.sendKeysMethod(login.getLoginUsername(), ConfigurationReader.getProperty("admin-user.one.username"));
        login.sendKeysMethod(login.getLoginPassword(), ConfigurationReader.getProperty("admin-user.one.password"));
    }
    @And("Click the Login button")
    public void click_the_Login_button() {
        login.clickMethod(login.getLoginButton());
    }
    @Then("The user should be able to successfully log in")
    public void the_user_should_be_able_to_successfully_log_in() {
        login.waitUntilVisible(login.getAdminsHeader());
        Assert.assertTrue(login.getAdminsHeader().isDisplayed());
    }
}
