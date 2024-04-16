package org.ays.pages;

import lombok.Getter;
import org.ays.browser.AysBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

@Getter
public class SuperAdminPOM {
    public SuperAdminPOM() {
        PageFactory.initElements(AysBrowser.getWebDriver(), this);
    }

    @FindBy(xpath = "//a[normalize-space()='Registration Applications']")
    private WebElement registrationApplication;

    @FindBy(xpath = "(//button)[5]")
    private WebElement filterIcon;

    @FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
    private WebElement statusBar;

    @FindBy(xpath = "//div[@id='statuses_list_0']")
    private WebElement waiting;

    @FindBy(xpath = "//button[@id='filter-button']")
    private WebElement filtersButton;

    @FindBy(xpath = "//td/span[contains(@class,'ant-tag')]")
    private List<WebElement> statusColumn;

    @FindBy(css = "div[class='ant-select-item-option-content']")
    private List<WebElement> statusOptionsFromFilterDropdownMenu;

}

