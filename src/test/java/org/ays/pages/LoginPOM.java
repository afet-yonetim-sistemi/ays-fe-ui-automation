package org.ays.pages;

import lombok.Getter;
import org.ays.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LoginPOM {

    public LoginPOM() {
        PageFactory.initElements(DriverUtil.generateDriver(), this);
    }

    @FindBy(xpath = "//input[@id='username']")
    private WebElement loginUsername;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[.='Admins']")
    private WebElement adminsHeader;

}
