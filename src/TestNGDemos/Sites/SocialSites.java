package TestNGDemos.Sites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {
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

    @Test
    public void facebook()
    {
        driver.get("http://facebook.com");
    }

    @Test (enabled = false)
    public void linkedIn()
    {
        driver.get("http://linkedIn.com");
    }

    @Test
    public void Instagram()
    {
        driver.get("http://Instagram.com");
    }

}
