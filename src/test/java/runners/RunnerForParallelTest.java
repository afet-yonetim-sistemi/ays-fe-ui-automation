package runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

public class RunnerForParallelTest  extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone",System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name","Team7");
        ExtentService.getInstance().setSystemInfo("Application Name","AYOS");
        ExtentService.getInstance().setSystemInfo("Operating System Info",System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department","QA");


    }
}
