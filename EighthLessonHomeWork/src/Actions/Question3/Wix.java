package Actions.Question3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Wix {

    public static void main(String[] args) throws Exception {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wix.com/jobs/locations/tel-aviv/positions");

        Thread.sleep(3000);
       // List<WebElement> javaPositions = new ArrayList<WebElement>();

        List<WebElement> list = driver.findElements(By.cssSelector(".style-jozadwanchooseFileButton > [href]"));

        for (WebElement w : list) {
            driver.navigate().to(w.getAttribute("href"));
            Thread.sleep(3000);
            if (driver.findElement(By.cssSelector("#comp-jl21s07ninlineContent")).getText().contains("java")) {
                //javaPositions.add(w);
                System.out.println(w.getText());
            }

            driver.navigate().back();
            Thread.sleep(5000);
        }

//        for (WebElement i : javaPositions) {
//            System.out.println(i.getText());
//        }
        driver.quit();

    }//main
}//class
