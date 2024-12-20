package org.ays.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends BasePage {


    @FindBy(name = "emailAddress")
    private WebElement loginEmailAddress;

    @FindBy(name = "password")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(@class, 'ml-3')]")
    private WebElement username;

    @FindBy(id = ":r1:-form-item-message")
    private WebElement emailAddressErrorMessage;

    @FindBy(id = ":r2:-form-item-message")
    private WebElement passwordErrorMessage;

    @FindBy(xpath = "//div[contains(@class,'text-sm opacity-90')]")
    private WebElement popupErrorMessage;

    @FindBy(xpath = "//div[@class= 'relative']/button")
    private WebElement hiddenPasswordIcon;

    @FindBy(css = "button")
    private WebElement themeIcon;

    @FindBy(css = "html.light")
    private WebElement lightTheme;

    @FindBy(css = "html.dark")
    private WebElement darkTheme;

    @FindBy(css = "button[role='combobox']")
    private WebElement languageButton;

    @FindBy(xpath = "//h3")
    private WebElement welcomeHeader;

    @FindBy(xpath = "//div[@class='container']")
    private WebElement allLoginText;


}
