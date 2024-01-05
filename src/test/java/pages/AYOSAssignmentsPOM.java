package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class AYOSAssignmentsPOM extends MyMethods {

    public AYOSAssignmentsPOM() {
        PageFactory.initElements(DriverClass.getDriver(), this); }

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

    @FindBy(xpath = "(//a[@title='Zoom in'])[1]")
    private WebElement locationZoomIn;

    @FindBy(xpath = "(//a[@title='Zoom out'])[1]")
    private WebElement locationZoomOut;
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

    @FindBy(xpath = "//span[@aria-label='edit']")
    private WebElement edit;

    @FindBy(xpath = "(//button[contains(@class,'refine-show-button')])[1]")
    private WebElement show;

    @FindBy(xpath = "//h4[normalize-space()='Show Assignment']")
    private WebElement validateShow;

    @FindBy(xpath = "(//button[contains(@class, 'ant-btn css-14ryt30')])[4]")
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

    public WebElement getAssignments() {
        return assignments;
    }

    public WebElement getCreateButton() {
        return createButton;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getSurname() {
        return surname;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getAreaCode() {
        return areaCode;
    }

    public WebElement getTurkiyeAreaCode() {
        return turkiyeAreaCode;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getLocation() {
        return location;
    }

    public WebElement getSaveAssignment() {
        return saveAssignment;
    }

    public WebElement getCreateName() {
        return createName;
    }

    public WebElement getCreateSurname() {
        return createSurname;
    }

    public WebElement getCreateDescription() {
        return createDescription;
    }

    public WebElement getCreateAreaCode() {
        return createAreaCode;
    }

    public WebElement getCreateTurkiyeAreaCode() {
        return createTurkiyeAreaCode;
    }

    public WebElement getCreatePhoneNumber() {
        return createPhoneNumber;
    }

    public WebElement getCreateLocation() {
        return createLocation;
    }
    public WebElement getCreateMapSelect() {
        return createMapSelect;
    }
    public WebElement getCreateLocationMarkerIcon() {
        return createLocationMarkerIcon;
    }
    public WebElement getOkButton() {
        return okButton;
    }

    public WebElement getDeleteAssignment() {
        return deleteAssignment;
    }

    public WebElement getSureDeleteAssignment() {
        return sureDeleteAssignment;
    }

    public WebElement getSuccessMessageDelete() {
        return successMessageDelete;
    }

    public WebElement getShowLocation() {
        return showLocation;
    }

    public WebElement getValidateLocation() {
        return validateLocation;
    }

    public WebElement getOpenGoogleMaps() {
        return openGoogleMaps;
    }

    public WebElement getCopyLocationInfo() {
        return copyLocationInfo;
    }

    public WebElement getOpenOnMyPhone() {
        return openOnMyPhone;
    }

    public WebElement getEdit() {
        return edit;
    }

    public WebElement getShow() {
        return show;
    }

    public WebElement getValidateShow() {
        return validateShow;
    }

    public WebElement getFilter() {
        return filter;
    }

    public WebElement getFilterBasedOnStatus() {
        return filterBasedOnStatus;
    }
    public WebElement getAvailableOption() {
        return availableOption;
    }

    public WebElement getFilterBasedOnPhoneNumber() {
        return filterBasedOnPhoneNumber;
    }

    public WebElement getFilterBasedOnAreaCode() {
        return filterBasedOnAreaCode;
    }

    public WebElement getFilterButton() {
        return filterButton;
    }

    public WebElement getEditSaveButton() {
        return editSaveButton;
    }




}

