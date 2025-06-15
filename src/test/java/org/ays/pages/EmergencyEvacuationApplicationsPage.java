package org.ays.pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
@Setter
public class EmergencyEvacuationApplicationsPage extends BasePage {

    @FindBy(xpath = "//a[@href='/emergency-evacuation-applications']")
    private WebElement emergencyEvacuationApplicationsMenu;

    @FindBy(css = "h1.text-2xl.font-medium")
    private WebElement pageHeader;

    @FindBy(css = "label[for='seatingCount']")
    private WebElement requestedSeatCountField;

    @FindBy(css = "label[for='referenceNumber']")
    private WebElement referenceNumberField;

    @FindBy(css = "label[for='sourceCity']")
    private WebElement sourceCityField;

    @FindBy(css = "label[for='sourceDistrict']")
    private WebElement sourceDistrictField;

    @FindBy(css = "label[for='targetCity']")
    private WebElement targetCityField;

    @FindBy(css = "label[for='targetDistrict']")
    private WebElement targetDistrictField;

    @FindBy(css = "label[for='In Person']")
    private WebElement inPersonCheckboxLabel;

    @FindBy(xpath = "(//tr[contains(@class,'border-b')]/th)[1]")
    private WebElement referenceNumberColumn;

    @FindBy(xpath = "(//tr[contains(@class,'border-b')]/th)[2]")
    private WebElement applicantFirstNameColumn;

    @FindBy(xpath = "(//tr[contains(@class,'border-b')]/th)[3]")
    private WebElement applicantLastNameColumn;

    @FindBy(xpath = "(//tr[contains(@class,'border-b')]/th)[4]")
    private WebElement applicantPhoneNumberColumn;

    @FindBy(xpath = "(//tr[contains(@class,'border-b')]/th)[5]")
    private WebElement isInPersonColumn;

    @FindBy(xpath = "(//tr[contains(@class,'border-b')]/th)[6]")
    private WebElement requestedSeatCountColumn;

    @FindBy(xpath = "(//tr[contains(@class,'border-b')]/th)[7]")
    private WebElement applicationStatusColumn;

    @FindBy(xpath = "(//tr[contains(@class,'border-b')]/th)[8]")
    private WebElement creationDateColumn;

    @FindBy(css = "button.flex.w-fit.gap-2")
    private WebElement applicationStatusDropdownMenuButton;

    @FindBy(xpath = "(//div[@role='menuitemcheckbox'])[1]")
    private WebElement statusPending;

    @FindBy(xpath = "(//div[@role='menuitemcheckbox'])[2]")
    private WebElement statusInReview;

    @FindBy(xpath = "(//div[@role='menuitemcheckbox'])[3]")
    private WebElement statusFirstApprove;

    @FindBy(xpath = "(//div[@role='menuitemcheckbox'])[4]")
    private WebElement statusSecondApprove;

    @FindBy(xpath = "(//div[@role='menuitemcheckbox'])[5]")
    private WebElement statusThirdApprove;

    @FindBy(xpath = "(//div[@role='menuitemcheckbox'])[6]")
    private WebElement statusCompleted;

    @FindBy(xpath = "(//div[@role='menuitemcheckbox'])[7]")
    private WebElement statusCancelled;


}
