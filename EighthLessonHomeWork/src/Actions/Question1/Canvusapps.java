package Actions.Question1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canvusapps {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://prd.canvusapps.com/signup");

        driver.findElement(By.cssSelector("#user_name")).sendKeys("User");
        driver.findElement(By.cssSelector("#user_email")).sendKeys("email@email.com");
        driver.findElement(By.cssSelector("#user_password")).sendKeys("password");
        driver.findElement(By.cssSelector("#user_password_confirmation")).sendKeys("password");
        driver.findElement(By.cssSelector("#company_name")).sendKeys("companyName");
        driver.findElement(By.cssSelector("[name='commit']")).click();
        driver.quit();
    }
}
