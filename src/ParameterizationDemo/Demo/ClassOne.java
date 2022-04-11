package ParameterizationDemo.Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {



    @Parameters({"myUsername","myUrl","myPassword"})
    @Test
    public void classOneTest1(String u1,String u2,String u3)
    {
        String url = u2;
        String username=u1;
        String password=u3;

        System.out.println("url="+url);
        System.out.println("username="+username+" Password="+password);

        System.out.println("classOneTest1");
    }

    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
