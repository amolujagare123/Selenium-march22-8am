package XpathDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewCustomer {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@type='text']"));
        txtUser.sendKeys("admin");

        WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
        txtPass.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
        btnLogin.click();

        driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
        driver.findElement(By.xpath("//a[text()='View Customers']")).click();

        driver.findElement(By.xpath("//tr[td[text()='Sneha']]//input")).click();

    }
}
