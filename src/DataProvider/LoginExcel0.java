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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginExcel0 {

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
    public Object[][] getData() throws IOException {

        FileInputStream fis =new FileInputStream("Data/myData.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rowCount = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][2]; // rowCount =6

        for (int i=0;i<rowCount;i++) //
        {
            XSSFRow row = sheet.getRow(i);


            XSSFCell username = row.getCell(0);

            if (username==null)
                data[i][0] ="";
            else
               data[i][0] = username.toString().trim();


            XSSFCell password =  row.getCell(1);
            if (password==null)
                data[i][1] ="";
            else
                data[i][1] = row.getCell(1).toString().trim();
        }

        /*data[0][0] = "admin"; // username
        data[0][1] = "admin"; // password

        data[1][0] = "xyz";
        data[1][1] = "xyz1";

        data[2][0] = "abc";
        data[2][1] = "abc1";

        data[3][0] = "amol";
        data[3][1] = "amol12";*/

        return  data;
    }
}
