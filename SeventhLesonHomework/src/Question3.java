import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
    private static WebDriver driver;

    public static void main(String[] args) {
       ebayAdvancedSearchFlow("https://www.ebay.com/sch/ebayadvsearch");
    }

    private static void lunchSite(String URL) {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
    }

    private static void ebayAdvancedSearchFlow(String URL) {
        lunchSite(URL);
        driver.findElement(By.cssSelector("#_nkw")).sendKeys("Batman");
        driver.findElement(By.cssSelector("#_ex_kw")).sendKeys("key chain ring keychain keyring");

        if (!driver.findElement(By.cssSelector("#LH_BIN")).isSelected()) {
            driver.findElement(By.cssSelector("#LH_BIN")).click();
        }

        driver.findElement(By.cssSelector("#searchBtnLowerLnk")).click();
        driver.navigate().back();
        driver.findElement(By.cssSelector(".btn.btn-prim")).click();
        driver.quit();
    }//ebayFlow

}//class
