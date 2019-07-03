package Actions.Question6;

import javafx.css.CssMetaData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightConnections {
    private WebDriver driver;

    public FlightConnections(WebDriver driver) {
        this.driver = driver;
    }

    private void lunchSite(WebDriver driver) throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.flightconnections.com/");
        Thread.sleep(5000);
    }

    private void insertFromDestination(String flightFrom) throws Exception {
        driver.findElement(By.cssSelector("#from")).click();
        driver.findElement(By.cssSelector("#from-input")).sendKeys(flightFrom);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".ui-menu-item > .ui-menu-item-wrapper")).click();

        //Vienna
    }

    private void insertToDestination(String flightTo) throws Exception {
        driver.findElement(By.cssSelector("#to")).click();
        driver.findElement(By.cssSelector("#to-input")).sendKeys(flightTo);
        Thread.sleep(3000);
        driver.findElements(By.cssSelector(".ui-menu-item > .ui-menu-item-wrapper")).get(1).click();
    }

    public void flight( WebDriver driver, String flightFrom,String flightTo) throws Exception{
        lunchSite(driver);
        insertFromDestination(flightFrom);
        insertToDestination(flightTo);
    }
}
