package ExtentReportsDemos.utils;

import TestNGDemos.Sites.InitDriverObject;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ExtentReportsDemos.utils.ForExtentReports.initExtentReport;
import static ExtentReportsDemos.utils.ForExtentReports.takingScreenshot;

public class ExtentReportListener extends InitDriverObject implements ITestListener {

    static ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        test.info(result.getMethod().getMethodName());
        test.pass("this test is passed");
    }

    public void onTestFailure(ITestResult result) {
        test.info(result.getMethod().getMethodName());
        test.fail("this test is failed | "+result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+takingScreenshot(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {
        test.info(result.getMethod().getMethodName());
        test.skip("this test is skipped | "+result.getThrowable());
    }

    public void onStart(ITestContext context) {

        if (extent==null)
            extent = initExtentReport();

    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish");

        extent.flush();
    }
}
