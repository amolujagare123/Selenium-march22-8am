package AssertsDemos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomerT {

    @Test
    public void addCustomerTest()
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.id("login-username"));
        txtUser.sendKeys("admin");

        WebElement txtPass = driver.findElement(By.id("login-password"));
        txtPass.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();

        String name = "Amar2";


        WebElement txtName = driver.findElement(By.name("name"));
        txtName.sendKeys(name);

        WebElement txtAddress = driver.findElement(By.name("address"));
        txtAddress.sendKeys("xyz, pqr ,pune ,MH");

        WebElement txtContact1 = driver.findElement(By.name("contact1"));
        txtContact1.sendKeys("98989898");

        WebElement txtContact2 = driver.findElement(By.name("contact2"));
        txtContact2.sendKeys("19898989");

        WebElement btnAdd = driver.findElement(By.name("Submit"));
        btnAdd.click();
/*
        String expected = "Dublicat Entry. Please Verify";

        String actual ="";
        try{
            actual = driver.findElement(By.cssSelector(".error-box")).getText();
        }
        catch (Exception e)
        {

        }*/


        String expected="[ "+name+" ] Customer Details Added !";

        String actual ="";
        try{
            actual = driver.findElement(By.cssSelector(".confirmation-box")).getText();
        }
        catch (Exception e)
        {

        }


        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"worng or no error message");
    }
}
