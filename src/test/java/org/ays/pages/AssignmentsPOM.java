package org.ays.pages;

import lombok.Getter;
import org.ays.browser.AysBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class AssignmentsPOM {

    public AssignmentsPOM() {
        PageFactory.initElements(AysBrowser.getWebDriver(), this);
    }

    @FindBy(css = "a[href='/assignments']")
    private WebElement assignments;

    @FindBy(xpath = "(//span[.='Create'])[2]")
    private WebElement createButton;

    @FindBy(xpath = "(//input[@id='firstName'])[2]")
    private WebElement name;

    @FindBy(xpath = "(//input[@id='lastName'])[2]")
    private WebElement surname;

    @FindBy(xpath = "(//input[@id='description'])[2]")
    private WebElement description;

    @FindBy(xpath = "(//div[contains(@class, 'ant-select-show-arrow')])[3]")
    private WebElement areaCode;

    @FindBy(xpath = "//div[text()='+90 Türkiye']")
    private WebElement turkiyeAreaCode;

    @FindBy(xpath = "(//input[@id='phoneNumber_lineNumber'])[2]")
    private WebElement phoneNumber;

    @FindBy(xpath = "(//span[contains(text(),'Select Location')])[2]")
    private WebElement location;

    @FindBy(xpath = "//span[contains(@class, 'anticon-save')]")
    private WebElement saveAssignment;

    @FindBy(xpath = "(//input[@id='firstName'])[1]")
    private WebElement createName;

    @FindBy(xpath = "(//input[@id='lastName'])[1]")
    private WebElement createSurname;

    @FindBy(xpath = "(//input[@id='description'])[1]")
    private WebElement createDescription;

    @FindBy(xpath = "(//span[@class='ant-select-selection-search'])[2]")
    private WebElement createAreaCode;

    @FindBy(xpath = "//div[text()='+90 Türkiye']")
    private WebElement createTurkiyeAreaCode;

    @FindBy(xpath = "(//input[@id= 'phoneNumber_lineNumber'])[1]")
    private WebElement createPhoneNumber;

    @FindBy(xpath = "(//span[contains(text(),'Select Location')])[1]")
    private WebElement createLocation;

    @FindBy(id = "map-container-select-create-assignment")
    private WebElement createMapSelect;

    @FindBy(xpath = "//img[contains(@class,'leaflet-marker-icon')]")
    private WebElement createLocationMarkerIcon;

    @FindBy(xpath = "//span[.='OK']")
    private WebElement okButton;

    @FindBy(xpath = "(//button[contains(@class,'refine-delete-button')])[1]")
    private WebElement deleteAssignment;

    @FindBy(xpath = "(//span[text()='Delete'])[2]")
    private WebElement sureDeleteAssignment;

    @FindBy(xpath = "//div[@class='ant-notification-notice-message']")
    private WebElement successMessageDelete;

    @FindBy(xpath = "(//button[@type='button'])[7]")
    private WebElement showLocation;

    @FindBy(xpath = "//div[@class='ant-modal-header']")
    private WebElement validateLocation;

    @FindBy(xpath = "//span[normalize-space()='Open With Google Maps']")
    private WebElement openGoogleMaps;

    @FindBy(xpath = "//span[normalize-space()='Copy The Location Details']")
    private WebElement copyLocationInfo;

    @FindBy(xpath = "//span[normalize-space()='Open On My Phone']")
    private WebElement openOnMyPhone;

    @FindBy(xpath = "(//span[@aria-label='edit'])[1]")
    private WebElement edit;

    @FindBy(xpath = "(//button[contains(@class,'refine-show-button')])[1]")
    private WebElement show;

    @FindBy(xpath = "//h4[normalize-space()='Show Assignment']")
    private WebElement validateShow;

    @FindBy(xpath = "(//button[contains(@class, 'ant-btn') and contains(@class, 'ant-btn-icon-only')])[1]")
    private WebElement filter;

    @FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
    private WebElement filterBasedOnStatus;

    @FindBy(xpath = "//div[.='Available']")
    private WebElement availableOption;

    @FindBy(xpath = "(//div[@class='ant-select-selector'])[5]")
    private WebElement filterBasedOnPhoneNumber;

    @FindBy(xpath = "//div[@id='phoneNumber_countryCode_list']")
    private WebElement filterBasedOnAreaCode;

    @FindBy(xpath = "//span[.='Filter']")
    private WebElement filterButton;

    @FindBy(xpath = "(//span[contains(@class, 'anticon-save')])[2]")
    private WebElement editSaveButton;

}
