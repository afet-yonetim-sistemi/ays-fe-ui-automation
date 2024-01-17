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
}
