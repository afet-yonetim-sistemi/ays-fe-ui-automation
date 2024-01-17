package utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class MyMethods {

    public WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(60));
    Actions actions = new Actions(DriverClass.getDriver());
    private static final Faker faker = new Faker();

    public void sendKeysMethod(WebElement element, String keys) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(keys);
    }


    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverClass.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickMethod(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }

    public void verifyContainsText(WebElement element, String value) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(value));
    }

    public boolean isPresent(WebElement element) {
        waitUntilClickable(element);
        return element.isDisplayed();
    }

    public boolean isSelected(WebElement element) {
        waitUntilClickable(element);
        return element.isSelected();
    }

    public boolean verifyIsDisplayedMethod(WebElement element) {
        waitUntilClickable(element);
        return element.isDisplayed();
    }

    public void moveToElement(WebElement element) {
        waitUntilVisible(element);
        actions.moveToElement(element).build().perform();
    }

    public boolean isSelectedMethod(WebElement element) {
        waitUntilClickable(element);
        return element.isSelected();
    }

    public void hoverOver(WebElement element) {
        Actions actions = new Actions(DriverClass.getDriver());
        Action hoverOverElement = actions.moveToElement(element).build();
        hoverOverElement.perform();
    }


    public void scroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverClass.getDriver();
        js.executeScript("arguments[0].scrollLeft += 500", element);
    }

    public void clear(WebElement element) {
        element.clear();
    }


    public HashMap<String, String> createHashMap(List<WebElement> list) {
        HashMap<String, String> resultMap = new HashMap<>();

        for (WebElement element : list) {
            String key = element.getText();
            element.click();
            String value = element.getAttribute("href");
            resultMap.put(key, value);
            DriverClass.getDriver().navigate().back();
        }

        return resultMap;
    }

    public String generateRandomEmail() {
        String email = "";
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "example.com"};
        String domain = domains[random.nextInt(domains.length)];
        email = sb.toString() + "@" + domain;

        return email;
    }

    public void clickElementWithJavaScript(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) DriverClass.getDriver();
        executor.executeScript("arguments[0].click();", element);
    }


    public static String generateRandomName() {
        return faker.name().firstName();
    }

    public static String generateRandomSurname() {
        return faker.name().lastName();
    }

    public static String generateRandomPhoneNumber() {
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("505");
        for (int i = 0; i < 7; i++) {
            phoneNumber.append(faker.number().digit());
        }

        return phoneNumber.toString();
    }


}
