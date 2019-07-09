package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage extends BasePage {
    public YourCartPage(WebDriver driver) {
        super(driver);
    }

    public void checkout(){
        driver.findElement(By.cssSelector(".btn_action.checkout_button")).click();
    }


}
