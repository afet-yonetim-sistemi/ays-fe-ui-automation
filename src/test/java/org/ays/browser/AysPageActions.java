package org.ays.browser;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Slf4j
public class AysPageActions {

    @Getter
    private final WebDriver webDriver;
    private final Actions actions;
    private final WebDriverWait webDriverWait;

    public AysPageActions() {
        this.webDriver = AysBrowser.getWebDriver();
        this.actions = new Actions(this.webDriver);
        this.webDriverWait = new WebDriverWait(this.webDriver, Duration.ofSeconds(60));
    }

    public void sendKeysMethod(WebElement element, String keys) {
        this.waitUntilVisible(element);
        this.scrollToElement(element);
        element.clear();
        element.sendKeys(keys);
    }

    public void waitUntilVisible(WebElement element) {
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) this.webDriver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickMethod(WebElement element) {
        this.waitUntilClickable(element);
        this.scrollToElement(element);
        element.click();
    }

    public boolean isPresent(WebElement element) {
        this.waitUntilClickable(element);
        return element.isDisplayed();
    }

    public void moveToElement(WebElement element) {
        this.waitUntilVisible(element);
        actions.moveToElement(element).build().perform();
    }

    public void hoverOver(WebElement element) {
        Actions actions = new Actions(this.webDriver);
        Action hoverOverElement = actions.moveToElement(element).build();
        hoverOverElement.perform();
    }

    public void doubleClick(WebElement element) {
        this.actions.doubleClick(element).build().perform();
    }

    public void clickElementWithJavaScript(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) this.webDriver;
        executor.executeScript("arguments[0].click();", element);
    }

}
