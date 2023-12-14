package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Login_POM;
import utilities.ConfigReader;
import utilities.DriverClass;
import utilities.MyMethods;

public class Login  {

    Login_POM lg =new Login_POM();

    @Given("Access the AYOS system")
    public void access_the_AYOS_system() {
        /*DriverClass.getDriver().get("https://test-kurum.afetyonetimsistemi.com/login");*/
        DriverClass.getDriver().get(ConfigReader.getPropertyValue("url"));
        DriverClass.getDriver().manage().window().maximize();
    }

    @When("Enter the username and password")
    public void enter_the_username_and_password() {
       /* lg.sendKeysMethod(lg.getLoginUsername(), "ays-admin-1");
        lg.sendKeysMethod(lg.getLoginPassword(), "A123y456S.");*/
        lg.sendKeysMethod(lg.getLoginUsername(), ConfigReader.getPropertyValue("username"));
        lg.sendKeysMethod(lg.getLoginPassword(), ConfigReader.getPropertyValue("password"));
    }

    @And("Click the Login button")
    public void click_the_Login_button() {
        lg.clickMethod(lg.getLoginButton());
    }

    @Then("The user should be able to successfully log in")
    public void the_user_should_be_able_to_successfully_log_in() {
        lg.waitUntilVisible(lg.getAdminsHeader());
        Assert.assertTrue(lg.getAdminsHeader().isDisplayed());
    }
}
