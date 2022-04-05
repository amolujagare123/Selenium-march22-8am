package XpathDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewCustomerBilling {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://billing.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@name='email']"));
        txtUser.sendKeys("amolujagare@gmail.com");

        WebElement txtPass = driver.findElement(By.xpath("//input[@name='password']"));
        txtPass.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
        btnLogin.click();

        driver.findElement(By.xpath("//*[text()='Clients']")).click();
        driver.findElement(By.xpath("//*[text()='View Clients']")).click();

       driver.findElement(By.xpath("//tr[td/a[text()='Ajay Mathur']]//div")).click();
        driver.findElement(By.xpath("//tr[td/a[text()='Ajay Mathur']]//a[contains(@href,'form')]")).click();

    }
}
