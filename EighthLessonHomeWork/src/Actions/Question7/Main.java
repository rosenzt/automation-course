package Actions.Question7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/recaptcha/api2/demo");

        WebElement fr = driver.findElement(By.cssSelector("#recaptcha-demo > div > div > iframe"));
        driver.switchTo().frame(fr);

        driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
