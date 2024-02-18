package org.ays.pages;

import lombok.Getter;
import org.ays.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class UsersPOM {

    public UsersPOM() {
        PageFactory.initElements(DriverUtil.generateDriver(), this);
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

}
