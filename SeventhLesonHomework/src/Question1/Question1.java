package Question1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.salesforce.com");

        driver.findElement(By.cssSelector("[name='username']")).sendKeys("use@user.com");
        driver.findElement(By.cssSelector("[name='pw']")).sendKeys("PW123");
        driver.findElement(By.cssSelector(".r4.fl.mr8")).click();

        if (driver.findElement(By.cssSelector(".r4.fl.mr8")).isSelected()) {
            driver.findElement(By.cssSelector("#Login")).click();
        }

        driver.close();
    }


}
