import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {

    private static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        runTest("___Google logo___", "#hplogo", "id");
        runTest("___Login button___", "#gb_70", "id");
        runTest("___\"Footer\"___", "#SIvCob", "id");

        driver.quit();
    }

    private static void runTest(String element, String selector, String attributeName) {
        System.out.println(element);
        System.out.println(driver.findElement(By.cssSelector(selector)).getText());
        System.out.println(driver.findElement(By.cssSelector(selector)).getAttribute(attributeName));
        System.out.println(driver.findElement(By.cssSelector(selector)).getTagName());
        System.out.println(driver.findElement(By.cssSelector(selector)).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector(selector)).isEnabled());
    }
}
