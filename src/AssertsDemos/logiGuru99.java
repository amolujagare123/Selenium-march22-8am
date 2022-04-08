package AssertsDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logiGuru99 {

    @Test
    public void blankLogin()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/v4/index.php");


        WebElement btnLogin = driver.findElement(By.name("btnLogin"));
        btnLogin.click();

        String expected = "User or Password is not valid";
        String actual="";
        try {
            Alert alert = driver.switchTo().alert();
             actual = alert.getText();
             alert.dismiss();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"wrong or no error message");

    }
}
