package TestNGDemos;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginJunit2 {

    WebDriver driver;

    @BeforeMethod // method written below this annotation will run before every test method
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod // method written below this annotation will run after every test method
    public void closeBrowser() throws InterruptedException {
       Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void  loginTest1()
    {
        driver.get("https://stock.scriptinglogic.net/");

        System.out.println(driver.findElement(By.cssSelector("[for=login-username]")).getText());

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPass = driver.findElement(By.cssSelector("#login-password"));
        txtPass.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector(".ic-right-arrow"));
        // or use  input.button
      //  btnLogin.click();
    }


    @Test
    public void  loginTest2()
    {

        driver.get("https://stock.scriptinglogic.net/");

        System.out.println(driver.findElement(By.cssSelector("[for=login-username]")).getText());

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("ssfsf");

        WebElement txtPass = driver.findElement(By.cssSelector("#login-password"));
        txtPass.sendKeys("fsff");

        WebElement btnLogin = driver.findElement(By.cssSelector(".ic-right-arrow"));
        // or use  input.button
       // btnLogin.click();
    }

    @Test
    public void  loginTest3()
    {

        driver.get("https://stock.scriptinglogic.net/");

        System.out.println(driver.findElement(By.cssSelector("[for=login-username]")).getText());

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("");

        WebElement txtPass = driver.findElement(By.cssSelector("#login-password"));
        txtPass.sendKeys("");

        WebElement btnLogin = driver.findElement(By.cssSelector(".ic-right-arrow"));
        // or use  input.button
    //    btnLogin.click();
    }
}
