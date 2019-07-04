package Elements.Question7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private WebDriver driver;
    private List<WebElement> list = new ArrayList<WebElement>();

    public Amazon(WebDriver driver) {
        this.driver = driver;
    }

    private void lunchSite(WebDriver driver) {
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
    }

    private void searchForProduct(String product) {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(product);
        driver.findElement(By.cssSelector("[value='Go']")).click();
    }

    private void getList() {
        list = driver.findElements(By.cssSelector(".a-size-medium.a-color-base.a-text-normal"));
        for (WebElement e : list) {
            System.out.println(e.getText());
        }
    }

    private void moveResultsPages(int numberOfPageMovements) throws Exception {
        for (int i = 0; i < numberOfPageMovements; i++) {
            driver.findElement(By.cssSelector(".a-last")).click();
            Thread.sleep(10000);
            getList();
        }
    }

    private void closeBrowser() {
        driver.quit();
    }

    public void testAmazonProductSearch(WebDriver driver, String product, int numberOfPageMovements) throws Exception {
        lunchSite(driver);
        searchForProduct(product);
        getList();
        moveResultsPages(numberOfPageMovements);
        closeBrowser();
    }
}
