package org.ays.utilities;

import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@UtilityClass
public class DriverUtil {

    private static final ThreadLocal<WebDriver> THREAD_DRIVER = new ThreadLocal<>();

    private static final ThreadLocal<String> THREAD_DRIVER_NAME = new ThreadLocal<>();

    private static final ThreadLocal<WebDriverWait> THREAD_DRIVER_WAIT = new ThreadLocal<>();

    public static WebDriver generateDriver() {

        if (THREAD_DRIVER.get() == null || !THREAD_DRIVER.get().toString().contains(THREAD_DRIVER_NAME.get())) {

            if (THREAD_DRIVER_NAME.get() == null) {
                THREAD_DRIVER_NAME.set("chrome");
            }

            if (THREAD_DRIVER.get() != null) {
                quitDriver();
            }

            switch (THREAD_DRIVER_NAME.get()) {
                case "firefox" -> {
                    FirefoxOptions options = new FirefoxOptions();
                    if ("true".equals(System.getProperty("headless"))) {
                        options.addArguments("--headless");
                    }
                    FirefoxDriver driver = new FirefoxDriver(options);
                    THREAD_DRIVER.set(driver);
                }
                case "safari" -> {
                    SafariDriver safariDriver = new SafariDriver();
                    THREAD_DRIVER.set(safariDriver);
                }
                case "edge" -> {
                    EdgeOptions options = new EdgeOptions();
                    if ("true".equals(System.getProperty("headless"))) {
                        options.addArguments("--headless=new");
                    }
                    EdgeDriver driver = new EdgeDriver(options);
                    THREAD_DRIVER.set(driver);
                }
                default -> {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--disable-extensions");
                    if ("true".equals(System.getProperty("headless"))) {
                        options.addArguments("--headless=new", "--window-size=1920,1080");
                    }
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    ChromeDriver driver = new ChromeDriver(options);
                    THREAD_DRIVER.set(driver);
                }
            }

            THREAD_DRIVER_WAIT.set(new WebDriverWait(THREAD_DRIVER.get(), Duration.of(10, ChronoUnit.SECONDS)));
            THREAD_DRIVER.get().manage().window().maximize();
        }
        return THREAD_DRIVER.get();

    }

    public static void quitDriver() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (THREAD_DRIVER.get() != null) {
            THREAD_DRIVER.get().quit();
        }
    }

    public static void setThreadDriverName(String browserName) {
        THREAD_DRIVER_NAME.set(browserName);
    }

}
