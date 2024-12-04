package org.ays.browser;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class AysBrowser {

    @Getter
    private static WebDriver webDriver;

    private AysBrowser() {
    }

    public static void create(AysBrowserType browserType) {

        log.debug("Starting {} browser...", browserType);

        if (webDriver != null) {
            return;
        }

        List<String> commonBrowserArguments = new ArrayList<>();
        if (System.getProperty("headless") != null) {
            log.debug("Headless mode is enabled");
            commonBrowserArguments.add("--headless");
            commonBrowserArguments.add("--window-size=1920,1080");
        }

        switch (browserType) {
            case CHROME -> {
                ChromeOptions chromeOptions = new ChromeOptions();
                commonBrowserArguments.forEach(chromeOptions::addArguments);
                chromeOptions.addArguments("--disable-extensions", "--no-sandbox", "--disable-dev-shm-usage");
                webDriver = new ChromeDriver(chromeOptions);
            }
            case FIREFOX -> {
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                commonBrowserArguments.forEach(firefoxOptions::addArguments);
                webDriver = new FirefoxDriver(firefoxOptions);
            }
            case SAFARI -> {
                webDriver = new SafariDriver();
            }
            case EDGE -> {
                EdgeOptions edgeOptions = new EdgeOptions();
                commonBrowserArguments.forEach(edgeOptions::addArguments);
                webDriver = new EdgeDriver(edgeOptions);
            }
            default -> throw new IllegalArgumentException("Unimplemented browser type: " + browserType);
        }
        webDriver.manage().window().maximize();
        log.debug("Browser has been started.");
    }

    public static void close() {

        log.debug("Closing browser...");

        if (webDriver == null) {
            return;
        }

        webDriver.quit();
        webDriver = null;

        log.debug("Browser has been closed!");
    }

}
