package utilities;

import com.aventstack.extentreports.service.ExtentService;
import org.testng.annotations.Parameters;

public class ExtentReportUtil {


    @Parameters(value = "browser")
    public static void beforeClass(String browserName){
        DriverClass.setThreadDriverName(browserName);
    }

    public static void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone",System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name","QA Team");
        ExtentService.getInstance().setSystemInfo("Application Name","AYOS");
        ExtentService.getInstance().setSystemInfo("Operating System Info",System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department","QA");
    }
}
