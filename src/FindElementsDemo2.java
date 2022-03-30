import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://scriptinglogic.org/");

        /*String text = driver.findElement(By.className("elementor-button-text")).getText();
        System.out.println(text);*/

        List<WebElement> txtList = driver.findElements(By.className("elementor-button-text"));

        System.out.println(txtList.get(0).getText());
        System.out.println(txtList.get(1).getText());
        System.out.println(txtList.get(2).getText());
        System.out.println(txtList.get(3).getText());

        for (int i=0;i<txtList.size();i++)
            System.out.println(txtList.get(i).getText());

        for (WebElement wb:txtList)
            System.out.println(wb.getText());
    }
}
