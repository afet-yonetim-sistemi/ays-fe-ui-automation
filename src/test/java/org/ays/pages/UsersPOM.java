package org.ays.pages;

import lombok.Getter;
import org.ays.browser.AysBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class UsersPOM {

    public UsersPOM() {
        PageFactory.initElements(AysBrowser.getWebDriver(), this);
    }

    @FindBy(xpath = "//a[.='Users']")
    private WebElement usersTab;

    @FindBy(xpath = "(//span[.='Create'])[2]")
    private WebElement createButton;

    @FindBy(id = "firstName")
    private WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(xpath = "//div/span[@class='ant-select-selection-search']")
    private WebElement countryCode;

    @FindBy(xpath = "(//div[.='+90 Türkiye'])[2]")
    private WebElement turkeyCountryCode;

    @FindBy(xpath = "//input[@id= 'phoneNumber_lineNumber']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//span[contains(@class, 'anticon-save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//div[.='Successful']")
    private WebElement successfulMessage;

    @FindBy(xpath = "//div[.= 'This field is required']")
    private WebElement errorMassage;

    @FindBy(xpath = "//div[.= 'Invalid phone number']")
    private WebElement invalidPhoneNumberMessage;

    @FindBy(xpath = "(//span[contains(@Class,'anticon-eye')])[2]")
    private WebElement showIcon;

    @FindBy(xpath = "//h5[.='Username']")
    private WebElement showUsername;

    @FindBy(xpath = "//span[contains(@class, 'anticon-edit')]")
    private WebElement usersEditIcon;

    @FindBy(xpath = "(//div[contains(@class, 'ant-select')])[3]")
    private WebElement statusDropdown;

    @FindBy(xpath = "//div[.='Active']")
    private WebElement activeOption;

    @FindBy(xpath = "(//div[.='Passive'])[2]")
    private WebElement passiveOption;

    @FindBy(xpath = "(//button[contains(@class,'refine-delete-button')])[1]")
    private WebElement deleteUsersIcon;

    @FindBy(xpath = "//span[text()='Delete']")
    private WebElement sureDeleteButton;

    @FindBy(xpath = "//div[@class='ant-notification-notice-message']")
    private WebElement successMessageDelete;

    @FindBy(xpath = "//div[@class='ant-table-column-sorters']/span[1]")
    private WebElement createdAtColumn;

    @FindBy(xpath = "(//span[contains(@class, 'anticon-save')])[2]")
    private WebElement editSaveButton;

}
