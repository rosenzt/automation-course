import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        System.out.println("___Google logo___");
        System.out.println(driver.findElement(By.cssSelector("#hplogo")).getText());
        System.out.println(driver.findElement(By.cssSelector("#hplogo")).getAttribute("id"));
        System.out.println(driver.findElement(By.cssSelector("#hplogo")).getTagName());
        System.out.println(driver.findElement(By.cssSelector("#hplogo")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector("#hplogo")).isEnabled());

        System.out.println("___Login button___");
        System.out.println(driver.findElement(By.cssSelector("#gb_70")).getText());
        System.out.println(driver.findElement(By.cssSelector("#gb_70")).getAttribute("id"));
        System.out.println(driver.findElement(By.cssSelector("#gb_70")).getTagName());
        System.out.println(driver.findElement(By.cssSelector("#gb_70")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector("#gb_70")).isEnabled());

        System.out.println("___\"Footer\"___");
        System.out.println(driver.findElement(By.cssSelector("#SIvCob")).getText());
        System.out.println(driver.findElement(By.cssSelector("#SIvCob")).getAttribute("id"));
        System.out.println(driver.findElement(By.cssSelector("#SIvCob")).getTagName());
        System.out.println(driver.findElement(By.cssSelector("#SIvCob")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector("#SIvCob")).isEnabled());
    }
}
