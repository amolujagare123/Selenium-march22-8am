import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {

    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe") ;

       WebDriver driver = new ChromeDriver(); // up casting

        driver.manage().window().maximize();

        driver.get("http://facebook.com");

    }
}
