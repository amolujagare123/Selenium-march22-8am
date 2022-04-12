package ExtentReportsDemos;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestNg {

    ExtentReports extent;

    @BeforeClass
    public void initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management system");
        reporter.config().setReportName("Regression testing report");

        extent.setSystemInfo("Project name","Stock Management");
        extent.setSystemInfo("Developers name","Amar");
        extent.setSystemInfo("Testers name","Ashish");
        extent.setSystemInfo("Company","Infosys");
        extent.setSystemInfo("Project Deadline","12-12-2022");
    }


    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }


    @Test
    public void  loginTest1()
    {
        ExtentTest test = extent.createTest("valid login Test");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        test.info("url is opened");

        System.out.println(driver.findElement(By.cssSelector("[for=login-username]")).getText());

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("admin");

        test.info("username is set");

        WebElement txtPass = driver.findElement(By.cssSelector("#login-password"));
        txtPass.sendKeys("admin");

        test.info("password is set");

        WebElement btnLogin = driver.findElement(By.cssSelector(".ic-right-arrow"));
        // or use  input.button
        btnLogin.click();

        test.info("login button is clicked");

        String expected ="https://stock.scriptinglogic.net/dashboard.php";
        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("I am on dashboard (test is passed)");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
        }
    }

    @Test
    public void  loginTest2()
    {
        ExtentTest test = extent.createTest("invalid login Test");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        test.info("url is opened");

        System.out.println(driver.findElement(By.cssSelector("[for=login-username]")).getText());

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("fgfg");

        test.info("username is set");

        WebElement txtPass = driver.findElement(By.cssSelector("#login-password"));
        txtPass.sendKeys("gfgfg");

        test.info("password is set");

        WebElement btnLogin = driver.findElement(By.cssSelector(".ic-right-arrow"));
        // or use  input.button
        btnLogin.click();

        test.info("login button is clicked");

        String expected ="https://stock.scriptinglogic.net/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "This is not a login page");
            test.pass("I got error (test is passed)");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
        }

    }

    @Test
    public void  loginTest3()
    {
        ExtentTest test = extent.createTest("blank login Test");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.net/");

        test.info("url is opened");

        System.out.println(driver.findElement(By.cssSelector("[for=login-username]")).getText());

        WebElement txtUser = driver.findElement(By.cssSelector("#login-username"));
        txtUser.sendKeys("fgfg");

        test.info("username is set");

        WebElement txtPass = driver.findElement(By.cssSelector("#login-password"));
        txtPass.sendKeys("gfgfg");

        test.info("password is set");

        WebElement btnLogin = driver.findElement(By.cssSelector(".ic-right-arrow"));
        // or use  input.button
        btnLogin.click();

        test.info("login button is clicked");

        String expected ="https://stock.scriptinglogic.net";
        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "This is not a login page");
            test.pass("I got error (test is passed)");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
        }
    }
}
