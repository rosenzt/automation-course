package Actions.Question2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;

public class Salesforce {
    private WebDriver driver;

    public Salesforce(WebDriver driver) {
        this.driver = driver;
    }

    private void lunchSite(WebDriver driver) throws Exception {
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");
        Thread.sleep(1000);
    }

    private void testLoginError() throws Exception{
        driver.findElement(By.cssSelector("#username")).sendKeys("user@user.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("password");

        driver.findElement(By.cssSelector("#rememberUn")).click();
        driver.findElement(By.cssSelector("#Login")).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector("#error")).getText());
    }

    private void testforgotPassWord() throws Exception{
        driver.findElement(By.cssSelector("#forgot_password_link")).click();
        driver.findElement(By.cssSelector("#un")).sendKeys("Bad user name");
        driver.findElement(By.cssSelector("#continue")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".mb16.error")).getText());

    }

    private void closeBrowser(){
        driver.quit();
    }

    public void testSalesForce(WebDriver driver) throws Exception{
        lunchSite(driver);
        testLoginError();
        testforgotPassWord();
        closeBrowser();
    }
}
