package DataProvider;

import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login {

    @Test (dataProvider = "getData")
    public void loginTest(String username,String password)
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys(username);

        WebElement txtPass = driver.findElement(By.cssSelector("#login-password"));
        txtPass.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.cssSelector(".ic-right-arrow"));
        btnLogin.click();

    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = new Object[4][2];

        data[0][0] = "admin"; // username
        data[0][1] = "admin"; // password

        data[1][0] = "xyz";
        data[1][1] = "xyz1";

        data[2][0] = "abc";
        data[2][1] = "abc1";

        data[3][0] = "amol";
        data[3][1] = "amol12";

        return  data;
    }
}
