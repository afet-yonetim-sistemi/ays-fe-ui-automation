package org.ays.pages;

import org.ays.browser.AysBrowser;
import org.ays.browser.AysPageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    private final AysPageActions actions = new AysPageActions();

    public BasePage() {
        PageFactory.initElements(AysBrowser.getWebDriver(), this);
    }

    public void language(String language) {
        String locator = "//span[text()='" + language + "']";
        WebElement element = AysBrowser.getWebDriver().findElement(By.xpath(locator));
        actions.clickMethod(element);

    }

}
