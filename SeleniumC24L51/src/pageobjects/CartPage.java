package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css = ".checkout-btn")
    private WebElement proceedToCheckoutButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProceedToCheckoutButtonDisplayed(){
            return isElementDisplayedDisplayed(proceedToCheckoutButton);
    }

    public void proceedToCheckout(){
        click(proceedToCheckoutButton);
    }
}
