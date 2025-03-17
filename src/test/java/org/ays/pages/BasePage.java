package org.ays.pages;

import org.ays.browser.AysBrowser;
import org.ays.browser.AysPageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    private final AysPageActions actions = new AysPageActions();

    public BasePage() {
        PageFactory.initElements(AysBrowser.getWebDriver(), this);
    }

    public void selectLanguage(String language) {
        String locator = language.equals("English") ? "(//span[text()='" + language + "'])[2]" : "//span[text()='" + language + "']";

        try {
            WebElement element = AysBrowser.getWebDriver().findElement(By.xpath(locator));
            actions.clickMethod(element);
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Language selection failed: " + language + " not found on the page.", e);
        }

    }

}
