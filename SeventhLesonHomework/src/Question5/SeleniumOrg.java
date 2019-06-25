package Question5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOrg {
    private static WebDriver driver;

    private static void lunchSite(String URL) {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    public static boolean visitPage(String URL) {
        lunchSite(URL);
        if (driver.getCurrentUrl().equals(URL)) {
            return true;
        } else return false;
    }//visitPage

    public static boolean isItSeleniumSite() {
        //lunchSite("http://www.seleniumhq.org");

        if (driver.getTitle().contains("Selenium - Web Browser Automation") || driver.getTitle().contains("Selenium")) {
            return true;
        } else return false;
    }

    public static boolean isTextExist(String text) {
        if (driver.getPageSource().contains(text)) {
            return true;
        } else
            return false;
    }
}
