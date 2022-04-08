package AssertsDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginDemo {

    @Test
    public void  loginTest()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        //System.out.println(driver.findElement(By.cssSelector("[for=login-username]")).getText());

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPass = driver.findElement(By.cssSelector("#login-password"));
        txtPass.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector(".ic-right-arrow"));
        btnLogin.click();

        /*String expected = "https://stock.scriptinglogic.net/dashboard.php";
        String actual = driver.getCurrentUrl();
*/
       /* String expected ="POSNIC - Dashboard";
        String actual = driver.getTitle();*/

        String expected ="Dashboard";
        String actual="";
        try {
             actual = driver.findElement(By.cssSelector(".active-tab")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"this is not a dashboard");
    }

    @Test
    public void  invalidLoginTest()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");


        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("hghgh");

        WebElement txtPass = driver.findElement(By.cssSelector("#login-password"));
        txtPass.sendKeys("ghghg");

        WebElement btnLogin = driver.findElement(By.cssSelector(".ic-right-arrow"));
        btnLogin.click();


        String expected ="Wrong Username or Password";
        String actual="";
        try {
            actual = driver.findElement(By.cssSelector(".error-box")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"this is not a dashboard");
    }
}
