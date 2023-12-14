package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DriverClass {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

    private static ThreadLocal<String> threadDriverName = new ThreadLocal<>();

    private static ThreadLocal<WebDriverWait> threadDriverWait = new ThreadLocal<>();
    public static WebDriver getDriver() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);

        if (threadDriver.get()==null) {

            if (threadDriverName.get()==null){

               // threadDriverName.set("chrome");
                threadDriverName.set(ConfigReader.getPropertyValue("browser"));
            }

            switch (threadDriverName.get()) {
                case "firefox":
                    FirefoxDriver Driver = new FirefoxDriver();
                    threadDriver.set(Driver);
                    threadDriverWait.set(new WebDriverWait(Driver, Duration.of(10, ChronoUnit.SECONDS)));
                    threadDriver.get().manage().window().maximize();
                    break;
                case "safari":
                    SafariDriver Driver2 = new SafariDriver();
                    threadDriver.set(Driver2);
                    threadDriverWait.set(new WebDriverWait(Driver2, Duration.of(10, ChronoUnit.SECONDS)));
                    threadDriver.get().manage().window().maximize();
                    break;
                case "edge":
                    EdgeDriver Driver3 = new EdgeDriver();
                    threadDriver.set(Driver3);
                    threadDriverWait.set(new WebDriverWait(Driver3, Duration.of(10, ChronoUnit.SECONDS)));
                    threadDriver.get().manage().window().maximize();
                    break;
                default:
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--disable-extensions");
                    options.addArguments("--disable-gpu");
                    options.addArguments("--disable-infobars");
                    options.addArguments("--disable-notifications");
                    options.addArguments("--disable-scroll-bounce");

                    options.addArguments("--remote-allow-origins=*"); // To solve the error with Chrome v111
                    ChromeDriver Driver4 = new ChromeDriver(options);
                    threadDriver.set(Driver4);
                    threadDriverWait.set(new WebDriverWait(Driver4, Duration.of(10, ChronoUnit.SECONDS)));
                    threadDriver.get().manage().window().maximize();
            }
        }
        return threadDriver.get();
    }

    public static WebDriverWait getDriverWait(){
        return threadDriverWait.get();
    }
    public static void quitDriver(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (threadDriver.get()!=null) {
            threadDriver.get().quit();
            WebDriver driver = null;
            threadDriver.set(driver);
        }
    }

    public static void setThreadDriverName(String browserName){
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
