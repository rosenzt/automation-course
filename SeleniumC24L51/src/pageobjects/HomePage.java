package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	@FindBy(css="#txtSearch")
	private WebElement searchField;

	@FindBy(css=".icon.icon-search")
	private WebElement btnSearch;

	@FindBy(css=".products.clearfix .absolute-link.product-link")
	private List<WebElement> productsList;

	@FindBy(css=".icon.icon-header_cart")
	private WebElement btnCart;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void search(String name) {
		fillText(searchField, name);
		click(btnSearch);
	}
	
	public void chooseProduct(String productName) {
		System.out.println("list = " + productsList.size());
		for (WebElement el : productsList) {
			System.out.println("el = " + el.getAttribute("title"));
			if (el.getAttribute("title").toLowerCase().contains(productName.toLowerCase())) {
				click(el);
				break;
			}
		}
		sleep(2000);
	}
	
	public void openCart() {
		click(btnCart);
	}
	
	

}
