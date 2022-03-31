package XpathDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomer {

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

        driver.findElement(By.xpath("//a[@href='add_customer.php']")).click();

        WebElement txtName = driver.findElement(By.xpath("//*[@name='name']"));
        txtName.sendKeys("Ashwini123");

        WebElement txtAddress = driver.findElement(By.xpath("//textarea[@name='address']"));
        txtAddress.sendKeys("xyz, pqr ,pune ,MH");

        WebElement txtContact1 = driver.findElement(By.xpath("//input[@name='contact1']"));
        txtContact1.sendKeys("98989898");

        WebElement txtContact2 = driver.findElement(By.xpath("//input[@name='contact2']"));
        txtContact2.sendKeys("19898989");

        WebElement btnAdd = driver.findElement(By.xpath("//input[@value='Add']"));
        btnAdd.click();

    }
}
