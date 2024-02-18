package org.ays.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.ays.utilities.DriverClass;
import org.ays.utilities.MyMethods;

public class LoginPOM extends MyMethods {
    public LoginPOM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='username']")
    private WebElement loginUsername;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[.='Admins']")
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
