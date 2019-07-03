package Actions.Question3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Wix {

    public static void main(String[] args) throws Exception {

        List<String> URLs = new ArrayList<>();
        List<WebElement> javaPositions = new ArrayList<>();
        int index = 0;
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wix.com/jobs/locations/tel-aviv/positions");
        Thread.sleep(3000);

        List<WebElement> list = driver.findElements(By.cssSelector(".style-jozadwanchooseFileButton > [href]"));

        for (WebElement w : list) {
            URLs.add(w.getAttribute("href"));
        }

        try {
            for (String url : URLs) {
                driver.navigate().to(url);
                index++;
                Thread.sleep(3000);
                if (driver.findElement(By.cssSelector("#comp-jl21s07ninlineContent")).getText().contains("java")) {
                    javaPositions.add(list.get(URLs.indexOf(url)));
                }
                driver.navigate().to("https://www.wix.com/jobs/locations/tel-aviv/positions");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println(index);
            for (WebElement i : javaPositions) {
                System.out.println(i.getText());
            }
        }

        for (WebElement i : javaPositions) {
            System.out.println(i.getText());
        }

        driver.quit();

    }//main
}//class
