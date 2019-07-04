package Actions.Question1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canvusapps {
    private WebDriver driver;

    public Canvusapps(WebDriver driver) {
        this.driver = driver;
    }

    private void lunchSite(WebDriver driver) throws Exception {
        driver.manage().window().maximize();
        driver.get("https://prd.canvusapps.com/signup");
        Thread.sleep(5000);
    }

    private void fillForm() {
        driver.findElement(By.cssSelector("#user_name")).sendKeys("User");
        driver.findElement(By.cssSelector("#user_email")).sendKeys("email@email.com");
        driver.findElement(By.cssSelector("#user_password")).sendKeys("password");
        driver.findElement(By.cssSelector("#user_password_confirmation")).sendKeys("password");
        driver.findElement(By.cssSelector("#company_name")).sendKeys("companyName");
        driver.findElement(By.cssSelector("[name='commit']")).click();
    }

    private void closeBrowser() {
        driver.quit();
    }

    public void testCanvusappsSingUp(WebDriver driver) throws Exception {
        lunchSite(driver);
        fillForm();
        closeBrowser();
    }
}
