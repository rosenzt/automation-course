package Actions.Question5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        Wix wix = new Wix(driver);
        wix.lunchSite();
    }
}
