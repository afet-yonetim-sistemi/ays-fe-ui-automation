package org.ays.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageActions {

    private static final WebDriverWait WEB_DRIVER_WAIT = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(60));
    private static final Actions ACTIONS = new Actions(DriverClass.getDriver());

    protected void sendKeysMethod(WebElement element, String keys) {
        this.waitUntilVisible(element);
        this.scrollToElement(element);
        element.clear();
        element.sendKeys(keys);
    }

    protected void waitUntilVisible(WebElement element) {
        WEB_DRIVER_WAIT.until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitUntilClickable(WebElement element) {
        WEB_DRIVER_WAIT.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverClass.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    protected void clickMethod(WebElement element) {
        this.waitUntilClickable(element);
        this.scrollToElement(element);
        element.click();
    }

    protected boolean isPresent(WebElement element) {
        this.waitUntilClickable(element);
        return element.isDisplayed();
    }

    protected void moveToElement(WebElement element) {
        this.waitUntilVisible(element);
        ACTIONS.moveToElement(element).build().perform();
    }

    protected void hoverOver(WebElement element) {
        Actions actions = new Actions(DriverClass.getDriver());
        Action hoverOverElement = actions.moveToElement(element).build();
        hoverOverElement.perform();
    }

    protected void clickElementWithJavaScript(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) DriverClass.getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

}
