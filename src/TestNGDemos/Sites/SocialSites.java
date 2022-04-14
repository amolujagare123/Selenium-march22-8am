package TestNGDemos.Sites;

import org.testng.annotations.Test;

public class SocialSites extends InitDriverObject {


    @Test
    public void facebook()
    {
        driver.get("http://facebook.com");
    }

    @Test /*(enabled = false)*/
    public void linkedIn()
    {
        driver.get("http://linkedIn.com");
    }

    @Test
    public void Instagram()
    {
        driver.get("http://Instagram.com");
    }

}
