package Actions.Question4;

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
                WebElement we = driver.findElement(By.cssSelector("#comp-jl21s07ninlineContent"));
                Thread.sleep(3000);
                if (we.getText().contains("java") || we.getText().contains("Java") || we.getText().contains("JAVA")) {
                    javaPositions.add(list.get(URLs.indexOf(url)));
                    System.out.println(list.get(index).getText());
                }else System.out.println("Index" + index + "has no Java.");
                driver.navigate().to("https://www.wix.com/jobs/locations/tel-aviv/positions");
             }
        } catch (Exception e) {
            System.out.println(index + "\n" + e);
            driver.navigate().to("https://www.wix.com/jobs/locations/tel-aviv/positions");
            Thread.sleep(3000);
            for (WebElement i : javaPositions) {
                System.out.println(i.getText());
            }
        }

        System.out.println(index);
        driver.navigate().to("https://www.wix.com/jobs/locations/tel-aviv/positions");
        Thread.sleep(3000);
       // for (WebElement i : javaPositions) {
        for (WebElement i : list) {
            try {
                System.out.println(i.getText());
            } catch (Exception e) {
                System.out.println(e);
                continue;
            }
        }

        driver.quit();

    }//main
}//class
