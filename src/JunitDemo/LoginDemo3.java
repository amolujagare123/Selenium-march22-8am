package JunitDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo3 {

    public static void main(String[] args) {

        // ------------- valid input ---------------------

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        System.out.println(driver.findElement(By.cssSelector("[for=login-username]")).getText());

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username1"));
        txtUser.sendKeys("admin");

        WebElement txtPass = driver.findElement(By.cssSelector("#login-password"));
        txtPass.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.cssSelector(".ic-right-arrow"));
        // or use  input.button
        btnLogin.click();

        // ------------- invalid input ---------------------

        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://stock.scriptinglogic.net/");

        System.out.println(driver1.findElement(By.cssSelector("[for=login-username]")).getText());

        WebElement txtUser1 = driver1.findElement(By.cssSelector("#login-username"));
        txtUser1.sendKeys("ssf");

        WebElement txtPass1 = driver1.findElement(By.cssSelector("#login-password"));
        txtPass1.sendKeys("fs");

        WebElement btnLogin1 = driver1.findElement(By.cssSelector(".ic-right-arrow"));
        // or use  input.button
        btnLogin1.click();

        // ------------- blank input ---------------------

        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://stock.scriptinglogic.net/");

        System.out.println(driver2.findElement(By.cssSelector("[for=login-username]")).getText());

        WebElement txtUser2 = driver2.findElement(By.cssSelector("#login-username"));
        txtUser2.sendKeys("");

        WebElement txtPass2 = driver2.findElement(By.cssSelector("#login-password"));
        txtPass2.sendKeys("");

        WebElement btnLogin2 = driver2.findElement(By.cssSelector(".ic-right-arrow"));
        // or use  input.button
        btnLogin2.click();
    }
}
