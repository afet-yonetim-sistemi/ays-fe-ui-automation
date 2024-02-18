package org.ays.pages;

import org.ays.utilities.DriverClass;
import org.ays.utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPOM extends MyMethods {

    public UsersPOM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Users']")
    private WebElement usersTab;

    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(xpath = "(//div[contains(@class, 'ant-select-show-arrow')])[2]")
    private WebElement countryCode;

    @FindBy(xpath = "(//div[.='+90 Türkiye'])[2]")
    private WebElement turkeyCountryCode;
    @FindBy(xpath = "//input[@id= 'phoneNumber_lineNumber']")
    private WebElement phoneNumber;
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
    @FindBy(xpath = "(//span[contains(@class, 'anticon-edit')])[1]")
    private WebElement usersEditIcon;
    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
    private WebElement statusDropdown;
    @FindBy(xpath = "//div[.='Active']")
    private WebElement activeOption;
    @FindBy(xpath = "//span[.='Active']")
    private WebElement activeStatus;
    @FindBy(xpath = "//div[.='Passive']")
    private WebElement passiveOption;
    @FindBy(xpath = "//button[contains(@class,'refine-delete-button')]")
    private WebElement deleteUsersIcon;
    @FindBy(xpath = "//span[text()='Delete']")
    private WebElement sureDeleteButton;

    public WebElement getUsersTab() {
        return usersTab;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getCountryCode() {
        return countryCode;
    }

    public WebElement getTurkeyCountryCode() {
        return turkeyCountryCode;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getSuccessfulMessage() {
        return successfulMessage;
    }

    public WebElement getErrorMassage() {
        return errorMassage;
    }

    public WebElement getInvalidPhoneNumberMessage() {
        return invalidPhoneNumberMessage;
    }

    public WebElement getShowIcon() {
        return showIcon;
    }

    public WebElement getShowUsername() {
        return showUsername;
    }

    public WebElement getUsersEditIcon() {
        return usersEditIcon;
    }

    public WebElement getStatusDropdown() {
        return statusDropdown;
    }

    public WebElement getActiveOption() {
        return activeOption;
    }

    public WebElement getActiveStatus() {
        return activeStatus;
    }

    public WebElement getPassiveOption() {
        return passiveOption;
    }

    public WebElement getDeleteUsersIcon() {
        return deleteUsersIcon;
    }

    public WebElement getSureDeleteButton() {
        return sureDeleteButton;
    }
}
