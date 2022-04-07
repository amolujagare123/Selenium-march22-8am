package TestNGDemos.Sites;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites {
    WebDriver driver;
    @BeforeClass
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }

    @Test (priority = 1)
    public void naukri()
    {
        driver.get("http://naukri.com");
    }

    @Test (priority = 2)
    public void monster()
    {
        driver.get("http://monster.com");
    }

    @Test (priority = 4)
    public void shine()
    {
        driver.get("http://shine.com");
    }

    @Test (priority = 3)
    public void timesjobs()
    {
        driver.get("https://www.timesjobs.com/");
    }


}
