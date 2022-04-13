package ExtentReportsDemos.Demo;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo {


    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
        Assert.assertEquals(true,false,"I have failed this test");
    }

    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
