package Actions.Question2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;

public class Salesforce {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.salesforce.com/");

        driver.findElement(By.cssSelector("#username")).sendKeys("user@user.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("password");

        driver.findElement(By.cssSelector("#rememberUn")).click();
        driver.findElement(By.cssSelector("#Login")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector("#error")).getText());


        driver.findElement(By.cssSelector("#forgot_password_link")).click();
        driver.findElement(By.cssSelector("#un")).sendKeys("Bad user name");
        driver.findElement(By.cssSelector("#continue")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".mb16.error")).getText());
        driver.quit();
    }
}
