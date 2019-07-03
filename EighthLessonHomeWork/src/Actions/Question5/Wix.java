package Actions.Question5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.List;

public class Wix {

    private WebDriver driver;
    private List<String> URLs = new ArrayList<>();
    private List<WebElement> javaPositions = new ArrayList<>();
    private List<WebElement> list = new ArrayList<>();
    private int index;

    public Wix(WebDriver driver) {
        this.driver = driver;
    }

    public void lunchSite() {
        driver.manage().window().maximize();
        driver.get("https://www.wix.com/jobs/locations/tel-aviv/positions");
    }

    public void listAllLinks() {
        list = driver.findElements(By.cssSelector(".style-jozadwanchooseFileButton > [href]"));

        for (WebElement w : list) {
            URLs.add(w.getAttribute("href"));
        }
    }

    public void getCertianJobs() throws Exception {
        try {
            for (String url : URLs) {
                driver.navigate().to(url);
                index++;
                WebElement we = driver.findElement(By.cssSelector("#comp-jl21s07ninlineContent"));
                Thread.sleep(3000);
                if (we.getText().contains("java") || we.getText().contains("Java") || we.getText().contains("JAVA")) {
                    javaPositions.add(list.get(URLs.indexOf(url)));
                }
                driver.navigate().to("https://www.wix.com/jobs/locations/tel-aviv/positions");
            }
        } catch (Exception e) {
            printJobs();
        }
    }

    public void printJobs() throws Exception {
        System.out.println(index);
        driver.navigate().to("https://www.wix.com/jobs/locations/tel-aviv/positions");
        Thread.sleep(3000);
        for (WebElement i : javaPositions) {
            try {
                System.out.println(i.getText());
            } catch (Exception e) {
                continue;
            }
        }
    }

    public void closeDriver(){
        driver.quit();
    }

}
