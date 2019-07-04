package Elements.Question6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatsMyIpAddress {
    private WebDriver driver;
    private String IP;

    public WhatsMyIpAddress(WebDriver driver) {
        this.driver = driver;
    }

    private void lunchSite(WebDriver driver) throws Exception {
        driver.manage().window().maximize();
        driver.get("https://whatismyipaddress.com/");
        Thread.sleep(5000);
    }

    private void getIpAddress() {
        IP = driver.findElement(By.cssSelector("#ipv4")).getText();
    }

    private void searchIpDetails() throws Exception {
        driver.get("http://ripe.net");
        driver.findElement(By.cssSelector("#searchtext")).sendKeys(IP);
        driver.findElement(By.cssSelector("form > div > button > i")).click();
        Thread.sleep(5000);
    }

    private void getResultsPane() {
        System.out.println(driver.findElement(By.cssSelector(".resultpane")).getText());
    }

    private void closeBrowser() {
        driver.quit();
    }

    public void findIpDetails(WebDriver driver) throws Exception {
        lunchSite(driver);
        getIpAddress();
        searchIpDetails();
        getResultsPane();
        closeBrowser();
    }


}
