package Elements.Question2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.findElements(By.cssSelector("a"));
        List<WebElement> list = driver.findElements(By.cssSelector("a"));
        System.out.println("------------------------");

        for (WebElement e : list) {
            System.out.println(e.getText());
        }

        System.out.println("------------------------");

        for (WebElement e : list) {
            if (e.getText().contains("fight")){
                System.out.println(e.getText());
            }

        }

    }
}
