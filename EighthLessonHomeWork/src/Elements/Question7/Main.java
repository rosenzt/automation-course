package Elements.Question7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Tent");
        driver.findElement(By.cssSelector("[value='Go']")).click();

        getList(driver);

        for (int i = 0; i < 9; i++) {
            driver.findElement(By.cssSelector(".a-last")).click();
            Thread.sleep(10000);
            getList(driver);
        }

        driver.quit();
    }

    public static void getList(WebDriver driver){
        List<WebElement> list = driver.findElements(By.cssSelector(".a-size-medium.a-color-base.a-text-normal"));
        for (WebElement e : list) {
            System.out.println(e.getText());
        }
    }
}
