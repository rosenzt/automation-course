package Actions.Question1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        Canvusapps canvusapps = new Canvusapps(driver);
        canvusapps.testCanvusappsSingUp(driver);
    }
}
