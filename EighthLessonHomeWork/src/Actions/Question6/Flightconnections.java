package Actions.Question6;

import javafx.css.CssMetaData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Flightconnections {
    private WebDriver driver;

    public Flightconnections(WebDriver driver) {
        this.driver = driver;
    }

    public void lunchSite() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.flightconnections.com/");
        Thread.sleep(5000);
    }

    public void insertDestinations() {
        driver.findElement(By.cssSelector("#from")).click();
        driver.findElement(By.cssSelector("#from-input")).sendKeys("TLV");
        WebElement webElement = driver.findElement(By.cssSelector(".ui-menu-item-wrapper"));
        Select select = new Select(webElement);
        select.selectByValue("TLV - Tel Aviv");
    }
}
