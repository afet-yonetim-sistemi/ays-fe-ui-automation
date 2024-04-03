package org.ays.pages;

import lombok.Getter;
import org.ays.browser.AysBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class RegistrationApplicationsPOM {
    public RegistrationApplicationsPOM() {
        PageFactory.initElements(AysBrowser.getWebDriver(), this);
    }

    @FindBy(css = "th.ant-table-cell")
    private List<WebElement> registrationApplicationsListColumnHeaders;

    @FindBy(css = "button.ant-btn.refine-show-button")
    private List<WebElement> showButtonUnderTheActions;

    @FindBy(xpath = "//div[@id='statuses_list_1']")
    private WebElement completed;

    @FindBy(css = "div[class='ant-select-item-option-content']")
    private List<WebElement> statusOptionsFromFilterDropdownMenu;

    @FindBy(css = "span.ant-tag.ant-tag-green")
    private List<WebElement> completedApplications;

    @FindBy(xpath = "//button[contains(@class,'refine-show-button')]")
    private List<WebElement> reviewButtons;

    @FindBy(xpath = "//div[@class='ant-card-body']//h5[contains(@class, 'ant-typography')]")
    private List<WebElement> adminInformationHeaders;

    @FindBy(xpath = "(//span[@class='ant-page-header-heading-title'])[2]")
    private WebElement informationOfAdminHeaderInReview;

    @FindBy(xpath = "//span[contains(@class,'ant-tag ant-tag-green')]")
    private List<WebElement> completedStatusesAfterFilter;


}
