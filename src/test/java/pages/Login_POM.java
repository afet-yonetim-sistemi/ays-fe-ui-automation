package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Login_POM extends MyMethods {
    public Login_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
