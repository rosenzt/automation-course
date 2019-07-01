package Elements.Question1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canvas {
    private WebDriver driver;

    public void lunchSite() {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://prd.canvusapps.com/signup");
    }

    public void fillInvalidData() {
        driver.findElement(By.cssSelector("#user_name")).sendKeys("#&^%*^");
        driver.findElement(By.cssSelector("#user_email")).sendKeys("879797@34v534.comrtybery");
        driver.findElement(By.cssSelector("#user_password")).sendKeys("#&^%*^");
        driver.findElement(By.cssSelector("#user_password_confirmation")).sendKeys("#&^%*^");
        driver.findElement(By.cssSelector("#company_name")).sendKeys("#&^%*^");
        driver.findElement(By.cssSelector(".submit.btn.btn-primary")).click();
    }

    public void getErrorMessage() {
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-error.alert-block.error")).getText());
    }

    public void handleAllReadyExistingUser(){
        driver.findElement(By.cssSelector("small > a")).click();
    }

    public void handleForgottenPassWord(){
        driver.findElement(By.cssSelector("p > a")).click();
        if (!driver.findElement(By.cssSelector("h3")).getText().equals("Forgot Your Password")){
            System.out.println("Not the correct URL.");
        }else{
            driver.findElement(By.cssSelector("#email")).sendKeys("mail@mail.com");
            driver.findElement(By.cssSelector("[name='commit']")).click();
        }
    }

    public void closeBrowser(){
        driver.quit();
    }

}
