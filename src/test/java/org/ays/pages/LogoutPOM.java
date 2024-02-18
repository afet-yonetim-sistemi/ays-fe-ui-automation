package org.ays.pages;

import lombok.Getter;
import org.ays.utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LogoutPOM {

    public LogoutPOM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='ant-menu-title-content'][1]")
    private WebElement adminsButton;

    @FindBy(xpath = "//span[@aria-label='user']")
    private WebElement profileButton;

    @FindBy(xpath = "//span[@class='ant-dropdown-menu-title-content']")
    private WebElement logoutButton;

    @FindBy(xpath = "//button[@type= 'submit']")
    private WebElement loginButton;

}
