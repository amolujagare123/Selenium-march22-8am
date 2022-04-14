package TestNGDemos.Sites;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TutorialsSites  extends InitDriverObject {

    @Test
    public void scriptinglogic()
    {
        driver.get("http://scriptinglogic.com");
    }

    @Test
    public void javatpoint()
    {
        driver.get("http://javatpoint.com");
    }

    @Test
    public void tutorialpoints()
    {
        driver.get("http://gmail.com");
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://www.tutorialspoint.com/index.htm","this is not tutorials website");
    }

    @Test
    public void w3scools()
    {
        driver.get("http://w3scools.com");
    }


}
