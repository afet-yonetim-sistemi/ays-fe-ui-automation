package org.ays.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LogoutPage extends BasePage {

    @FindBy(xpath = "//span[@class='ant-menu-title-content'][1]")
    private WebElement adminsButton;

    @FindBy(xpath = "//span[@aria-label='user']")
    private WebElement profileButton;

    @FindBy(xpath = "//span[@class='ant-dropdown-menu-title-content']")
    private WebElement logoutButton;

    @FindBy(xpath = "//button[@type= 'submit']")
    private WebElement loginButton;

}
