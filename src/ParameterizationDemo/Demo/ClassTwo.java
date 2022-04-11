package ParameterizationDemo.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {


    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classTwoTest1(String v1,String v2,String v3)
    {
        String url = v1;
        String username=v2;
        String password=v3;

        System.out.println("url="+url);
        System.out.println("username="+username+" Password="+password);

        System.out.println("classTwoTest1");
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
