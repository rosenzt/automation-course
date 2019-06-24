import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.salesforce.com");

        driver.findElement(By.cssSelector("#forgot_password_link")).click();

        if (driver.findElement(By.cssSelector("#header.mb12")).getText().equals("Forgot Your Password")) {
            driver.findElement(By.cssSelector(".input.wide.mb12.mt8.username")).sendKeys("user@user.com");
            driver.findElement(By.cssSelector("[value='Continue']")).click();
            System.out.println(driver.findElement(By.cssSelector("#header.mb12")).getText());
        } else {
            System.out.println("The page is not the one you wanted.");
        }
    }
}
