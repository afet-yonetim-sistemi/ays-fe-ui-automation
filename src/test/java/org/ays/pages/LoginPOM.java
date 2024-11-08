package org.ays.pages;

import lombok.Getter;
import org.ays.browser.AysBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LoginPOM {

    public LoginPOM() {
        PageFactory.initElements(AysBrowser.getWebDriver(), this);
    }

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

    @FindBy(xpath = "//div[contains(@class, 'gap-1')]")
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

    @FindBy(xpath = "//span[text()='Türkçe']")
    private WebElement turkishOption;

    @FindBy(xpath = "//span[text()='English']")
    private WebElement englishOption;

    @FindBy(xpath = "//h3")
    private WebElement welcomeTitle;


}
