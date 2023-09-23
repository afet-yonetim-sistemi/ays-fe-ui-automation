package step_definitions;

import io.cucumber.java.en.Given;
import utilities.DriverClass;

public class Atamalar1 {

    @Given("sisteme giriş yap")
    public void sistemeGirişYap() {
        DriverClass.getDriver().get("https://main.d2aa4zjw6bvfk3.amplifyapp.com/login");
       // lg.sendKeysMethod(lg.getLoginUsername(), "ays-admin-1");
       // lg.sendKeysMethod(lg.getLoginPassword(), "A123y456S.");

       // .clickMethod(.getLoginButton());

    }
}
