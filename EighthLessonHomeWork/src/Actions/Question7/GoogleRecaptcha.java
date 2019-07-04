package Actions.Question7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleRecaptcha {
    private WebDriver driver;

    public GoogleRecaptcha(WebDriver driver) {
        this.driver = driver;
    }

    private void lunchSite(WebDriver driver) {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/recaptcha/api2/demo");
    }

    private void moveToFrame() {
        WebElement fr = driver.findElement(By.cssSelector("#recaptcha-demo > div > div > iframe"));
        driver.switchTo().frame(fr);
    }

    private void selectRecaptcha() throws Exception{
        driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
        Thread.sleep(3000);
    }

    private void closeDriver() {
        driver.quit();
    }

    public void testGoogleRecaptcha(WebDriver driver) throws Exception {
        lunchSite(driver);
        moveToFrame();
        selectRecaptcha();
        closeDriver();
    }
}
