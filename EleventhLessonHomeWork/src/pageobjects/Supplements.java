package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Supplements extends BaseMenus {

    public Supplements(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#FilteredProducts .product.ga-product.col-xs-12.col-sm-12.col-md-8.col-lg-6 .price bdi")
    List<WebElement> productsList;


    public void getPrices(){
        for (WebElement element : productsList) {
            Integer.valueOf(getText(element));
        }
    }
}
