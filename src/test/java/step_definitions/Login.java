package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Login_POM;
import utilities.DriverClass;

public class Login {

    Login_POM lg =new Login_POM();

    @Given("Ayos sistemine eriş")
    public void ayosSistemineEriş() {
        DriverClass.getDriver().get("https://main.d2aa4zjw6bvfk3.amplifyapp.com/login");
        DriverClass.getDriver().manage().window().maximize();
    }

    @When("kullanıcı adı ve şifreyi gir")
    public void kullanıcıAdıVeŞifreyiGir() {
        lg.sendKeysMethod(lg.getLoginUsername(), "ays-admin-1");
        lg.sendKeysMethod(lg.getLoginPassword(), "A123y456S.");
    }

    @And("Giriş butonuna tıkla")
    public void girişButonunaTıkla() {
        lg.clickMethod(lg.getLoginButton());
    }

    @Then("Kullanıcı başarıyla giriş yapabilmelidir")
    public void kullanıcıBaşarıylaGirişYapabilmelidir() {
        lg.waitUntilVisible(lg.getAdminsHeader());
        Assert.assertTrue(lg.getAdminsHeader().isDisplayed());
    }
}
