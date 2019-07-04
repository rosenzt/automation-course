package Elements.Question2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Alitalia {
    private WebDriver driver;
    private List<WebElement> list = new ArrayList<>();

    public Alitalia(WebDriver driver) {
        this.driver = driver;
    }

    private void lunchSite(WebDriver driver) {
        driver.manage().window().maximize();
        driver.get("https://www.alitalia.com/en_il");
    }

    private void creatList() {
        driver.findElements(By.cssSelector("a"));
        List<WebElement> list = driver.findElements(By.cssSelector("a"));
    }

    private void displayList() {
        for (WebElement e : list) {
            System.out.println(e.getText());
        }
        System.out.println("-------- Full links list is done --------");
    }

    private void displayCertainLinks() {
        for (WebElement e : list) {
            if (e.getText().contains("fight")) {
                System.out.println(e.getText());
            }
            System.out.println("--------Selected links list is done--------");
        }
    }


}
