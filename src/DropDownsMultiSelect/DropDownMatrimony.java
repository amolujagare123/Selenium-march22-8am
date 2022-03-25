package DropDownsMultiSelect;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownMatrimony {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.lifepartner.in/");

        WebElement community = driver.findElement(By.name("cm"));

        Select selCommunity = new Select(community);

        Thread.sleep(4000);
       // selCommunity.selectByVisibleText("No religion");
       // selCommunity.selectByValue("Parsi");
        selCommunity.selectByIndex(10);


    }
}
