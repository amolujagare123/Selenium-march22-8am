package DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static DataProvider.util.DataProvider.getMyData;

public class AddCustomer2 {

    WebDriver driver;
    @BeforeClass
    public void doLogin() {

        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        WebElement txtUser = driver.findElement(By.xpath("//input[@type='text']"));
        txtUser.sendKeys("admin");

        WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
        txtPass.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
        btnLogin.click();
    }


        @Test (dataProvider = "getData")
        public void addCustomer(String name,String address,String contact1,String contact2){
        //driver.findElement(By.xpath("//a[@href='add_customer.php']")).click();

        driver.findElement(By.xpath("//a[text()='Add Customer']")).click();

        WebElement txtName = driver.findElement(By.xpath("//*[@name='name']"));
        txtName.sendKeys(name);

        WebElement txtAddress = driver.findElement(By.xpath("//textarea[@name='address']"));
        txtAddress.sendKeys(address);

        WebElement txtContact1 = driver.findElement(By.xpath("//input[@name='contact1']"));
        txtContact1.sendKeys(contact1);

        WebElement txtContact2 = driver.findElement(By.xpath("//input[@name='contact2']"));
        txtContact2.sendKeys(contact2);

        WebElement btnAdd = driver.findElement(By.xpath("//input[@value='Add']"));
        btnAdd.click();

    }


    @DataProvider
    public Object[][] getData() throws IOException {
        return  getMyData("Data/myData.xlsx","Add Customer");
    }
}
