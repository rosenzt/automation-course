package Elements.Question1;

import Elements.Question1.Canvas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        Canvas canvas = new Canvas(driver);

        canvas.testCanvas(driver);

    }
}
