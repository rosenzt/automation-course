package Elements.Question3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.echoecho.com/htmlforms10.htm");

        driver.findElement(By.cssSelector(".table8 > [name='radio1']:nth-child(2)")).click();

        driver.findElement(By.cssSelector(".table5 > [name='group1']:nth-child(5)")).click();
        driver.findElement(By.cssSelector(".table5 > [name='group2']:nth-child(11)")).click();
        driver.quit();
    }
}