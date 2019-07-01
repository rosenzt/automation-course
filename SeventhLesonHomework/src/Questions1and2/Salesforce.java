package Questions1and2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {
    private static WebDriver driver;

    private static void lunchSite(String URL) {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    private static void question1CheckLogin(String URL, boolean isTogether) {
        lunchSite(URL);
        driver.findElement(By.cssSelector("[name='username']")).sendKeys("use@user.com");
        driver.findElement(By.cssSelector("[name='pw']")).sendKeys("PW123");
        driver.findElement(By.cssSelector(".r4.fl.mr8")).click();

        if (driver.findElement(By.cssSelector(".r4.fl.mr8")).isSelected()) {
            driver.findElement(By.cssSelector("#Login")).click();
        }
        if (!isTogether) driver.quit();
    }

    private static void question2CheckForgotPassword(String URL, boolean isTogether) {
        if (!isTogether) lunchSite(URL);
        driver.findElement(By.cssSelector("#forgot_password_link")).click();

        if (driver.findElement(By.cssSelector("#header.mb12")).getText().equals("Forgot Your Password")) {
            driver.findElement(By.cssSelector(".input.wide.mb12.mt8.username")).sendKeys("user@user.com");
            driver.findElement(By.cssSelector("[value='Continue']")).click();
            System.out.println(driver.findElement(By.cssSelector("#header.mb12")).getText());
        } else {
            System.out.println("The page is not the one you wanted.");
        }
        driver.quit();
    }

    public static void question1CheckLogin(String URL) {
        question1CheckLogin(URL, false);
    }

    public static void question2CheckForgotPassword(String URL) {
        question2CheckForgotPassword(URL, false);
    }

    public static void checkRunBoth(String URL) {
        question1CheckLogin(URL, true);
        question2CheckForgotPassword(URL, true);
    }
}
