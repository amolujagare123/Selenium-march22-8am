package ExtentReportsDemos.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReports {

    public static String takingScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot interface
        // assign the current driver to it, typecast it to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. using the object reference ts call the method getScreenshotAs()
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName= "IMG"+timeStamp+".png";


        //3. copy this file object into a real file
        FileUtils.copyFile(scrFile,new File("Report\\screenshots\\"+fileName));

        return fileName;
    }



    public static ExtentReports initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management system");
        reporter.config().setReportName("Regression testing report");

        extent.setSystemInfo("Project name","Stock Management");
        extent.setSystemInfo("Developers name","Amar");
        extent.setSystemInfo("Testers name","Ashish");
        extent.setSystemInfo("Company","Infosys");
        extent.setSystemInfo("Project Deadline","12-12-2022");

        return extent;
    }


}
