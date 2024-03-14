package org.ays.pages;

import lombok.Getter;
import org.ays.browser.AysBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SuperAdminPOM {
    public SuperAdminPOM() {
        PageFactory.initElements(AysBrowser.getWebDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Registration Applications']")
    private WebElement registrationApplication;

    @FindBy(xpath = "//button[@class='ant-btn css-2sv4ty ant-btn-default ant-btn-icon-only']")
    private WebElement filterIcon;

    @FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
    private WebElement statusBar;

    @FindBy(xpath = "//div[@id='statuses_list_0']")
    private WebElement waiting;

    @FindBy(xpath = "//button[@id='filter-button']")
    private WebElement filtersButton;





}

