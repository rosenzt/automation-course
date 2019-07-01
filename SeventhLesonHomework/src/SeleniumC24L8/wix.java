package SeleniumC24L8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class wix  {

    public static void main(String[] args) throws Exception{
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wix.com/jobs/locations/tel-aviv/positions");

        Thread.sleep(10000);

        List<WebElement> list = driver.findElements(By.cssSelector(".style-jozadwanchooseFileButton"));
        for (WebElement w: list){
            System.out.println(w.getText());
        }
        driver.quit();
    }//main


}//class