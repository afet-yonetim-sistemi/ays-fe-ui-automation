package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class LogoutPOM extends MyMethods {
    public LogoutPOM() {
        PageFactory.initElements(DriverClass.getDriver(), this);}

    @FindBy(xpath ="//span[@class='ant-menu-title-content'][1]") private WebElement adminsButton;
    @FindBy (xpath = "//span[@aria-label='user']") private WebElement profileButton;
    @FindBy (xpath = "//span[@class='ant-dropdown-menu-title-content']") private WebElement logoutButton;
    @FindBy (xpath = "//button[@type= 'submit']") private WebElement loginButton;

    public WebElement getAdminsButton() {
        return adminsButton;
    }

    public WebElement getProfileButton() {
        return profileButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
