package TestNGDemos.Sites;

import org.testng.annotations.Test;

public class JobSites extends InitDriverObject {

    @Test (priority = 1)
    public void naukri()
    {
        driver.get("http://naukri.com");
    }

    @Test (priority = 2)
    public void monster()
    {
        driver.get("http://monster.com");
    }

    @Test (priority = 4)
    public void shine()
    {
        driver.get("http://shine.com");
    }

    @Test (priority = 3)
    public void timesjobs()
    {
        driver.get("https://www.timesjobs.com/");
    }


}
