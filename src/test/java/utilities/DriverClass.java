package utilities;

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

public class DriverClass {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

    private static ThreadLocal<String> threadDriverName = new ThreadLocal<>();

    private static ThreadLocal<WebDriverWait> threadDriverWait = new ThreadLocal<>();

    public static WebDriver getDriver() {

        if (threadDriver.get() == null || !threadDriver.get().toString().contains(threadDriverName.get())) {

            if (threadDriverName.get() == null) {
                threadDriverName.set("chrome");
            }

            if (threadDriver.get() != null) {
                quitDriver();
            }

            switch (threadDriverName.get()) {
                case "firefox" -> {
                    FirefoxOptions options = new FirefoxOptions();
                    if ("true".equals(System.getProperty("headless"))) {
                        options.addArguments("--headless");
                    }
                    FirefoxDriver driver = new FirefoxDriver(options);
                    threadDriver.set(driver);
                }
                case "safari" -> {
                    SafariDriver safariDriver = new SafariDriver();
                    threadDriver.set(safariDriver);
                }
                case "edge" -> {
                    EdgeOptions options = new EdgeOptions();
                    if ("true".equals(System.getProperty("headless"))) {
                        options.addArguments("--headless=new");
                    }
                    EdgeDriver driver = new EdgeDriver(options);
                    threadDriver.set(driver);
                }
                default -> {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--disable-extensions");
                    if ("true".equals(System.getProperty("headless"))) {
                        options.addArguments("--headless", "--window-size=1920,1080");
                    }
                    options.addArguments("--no-sandbox");
                    options.addArguments("--disable-dev-shm-usage");
                    ChromeDriver driver = new ChromeDriver(options);
                    threadDriver.set(driver);
                }
            }

            threadDriverWait.set(new WebDriverWait(threadDriver.get(), Duration.of(10, ChronoUnit.SECONDS)));
            threadDriver.get().manage().window().maximize();
        }
        return threadDriver.get();

    }

    public static WebDriverWait getDriverWait() {
        return threadDriverWait.get();
    }

    public static void quitDriver() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver driver = null;
            threadDriver.set(driver);
        }
    }

    public static void setThreadDriverName(String browserName) {
        threadDriverName.set(browserName);
    }

    public static void setWait(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
