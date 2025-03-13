package org.ays.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AdminRegistrationApplicationsPage extends BasePage {

    @FindBy(css = "a[href*=\"admin-registration-applications\"]")
    private WebElement adminRegistrationApplicationsMenu;

    @FindBy(xpath = "//button[contains(text(), 'Create Preliminary Application')]")
    private WebElement createPreApplicationButton;

}
