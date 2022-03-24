import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuitDemo {


    // https://nxtgenaiacademy.com/multiplewindows/


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://nxtgenaiacademy.com/multiplewindows/");

        driver.findElement(By.name("newbrowserwindow123")).click();


        Thread.sleep(4000);
        driver.close();

        //driver.quit();
    }
}
