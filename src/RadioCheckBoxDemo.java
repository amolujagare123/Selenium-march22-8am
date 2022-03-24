import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBoxDemo {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        driver.findElement(By.id("rad1")).click();

        WebElement java = driver.findElement(By.name("mycheck0"));
        WebElement selenium = driver.findElement(By.name("mycheck1"));
        WebElement cucumber =  driver.findElement(By.name("mycheck2"));

        if (!java.isSelected())
            java.click();
        if (selenium.isSelected()==false)
            selenium.click();
        if (cucumber.isSelected()==false)
            cucumber.click();


    }
}
