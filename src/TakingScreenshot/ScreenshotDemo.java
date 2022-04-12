package TakingScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo {

    @Test
    public void  loginTest1() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://linkedin.com/");

        // 1. create the object reference of TakesScreenshot interface
        // assign the current driver to it, typecast it to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. using the object reference ts call the method getScreenshotAs()
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName= "IMG"+timeStamp+".png";


        //3. copy this file object into a real file
        FileUtils.copyFile(scrFile,new File("D:\\screenshots\\"+fileName));

    }
}
