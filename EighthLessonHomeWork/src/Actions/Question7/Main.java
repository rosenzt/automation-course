package Actions.Question7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        GoogleRecaptcha googleRecaptcha = new GoogleRecaptcha(driver);
        googleRecaptcha.testGoogleRecaptcha(driver);
    }
}
