package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class AYOSUsersPOM extends MyMethods {

    public AYOSUsersPOM() {
        PageFactory.initElements(DriverClass.getDriver(),this);
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
    @FindBy(xpath = "//span[@title='Active']")
    private WebElement statusDropdown;
    @FindBy(xpath = "//div[.='Active']")
    private WebElement activeOption;
    @FindBy(xpath = "//div[.='Passive']")
    private WebElement passiveOption;
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

    public WebElement getPassiveOption() {
        return passiveOption;
    }
}
