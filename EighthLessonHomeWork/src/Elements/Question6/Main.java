package Elements.Question6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://whatismyipaddress.com/");
        Thread.sleep(5000);
        String ip = driver.findElement(By.cssSelector("#ipv4")).getText();

        driver.get("http://ripe.net");
        driver.findElement(By.cssSelector("#searchtext")).sendKeys(ip);

        driver.findElement(By.cssSelector("form > div > button > i")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector(".resultpane")).getText());
        driver.quit();

    }
}
