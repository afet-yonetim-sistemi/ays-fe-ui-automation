package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Login_POM extends MyMethods {
    public Login_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='username']")
    private WebElement loginUsername;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    //@FindBy(xpath = "//div[@class='ant-page-header-heading-left ']")
    @FindBy(xpath = "//h1[@class='ant-typography css-14iqjx2']")
    private WebElement adminsHeader;

    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getAdminsHeader() {
        return adminsHeader;
    }


}
