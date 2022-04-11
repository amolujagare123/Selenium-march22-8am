package ParameterizationDemo.Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {
    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classThreeTest1(String v1,String v2,String v3)
    {
        String url = v1;
        String username=v2;
        String password=v3;

        System.out.println("url="+url);
        System.out.println("username="+username+" Password="+password);

        System.out.println("classThreeTest1");
    }

    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
