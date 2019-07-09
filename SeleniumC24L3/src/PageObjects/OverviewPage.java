package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage{
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public void clickFinish(){
        driver.findElement(By.cssSelector(".cart_footer > .btn_action.cart_button")).click();
    }
}
