package DropDownsMultiSelect;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownDemo1 {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("file:///D:/amol.html");

        // 1 . find the web element
        WebElement drpList = driver.findElement(By.id("seltext"));

        // 2. create the object of select class ,
        // pass web element to its constructor

        Select selList = new Select(drpList);

        Thread.sleep(4000);

        // 3 . select the element using the select class object
        //selList.selectByVisibleText("text 2");
        //selList.selectByValue("val1");
        selList.selectByIndex(4);

    }
}
