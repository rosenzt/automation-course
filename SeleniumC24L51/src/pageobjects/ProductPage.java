package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
	@FindBy(css=".btn-add-to-cart")
	private WebElement btnAddToCart;
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	public void addToCart() {
		click(btnAddToCart);
		sleep(2000);
		backToPreviousPage();
	}

}
