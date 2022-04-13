package ExtentReportsDemos.utils;

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
}
