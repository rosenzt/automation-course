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

    public boolean validatePrices(String biggerSmallerOrBetween, int value, Integer value2) {
        for (WebElement element : productsList) {
            switch (biggerSmallerOrBetween.toLowerCase()) {
                case "bigger":
                    return Integer.valueOf(getText(element)) > value;
                case "lower":
                    return Integer.valueOf(getText(element)) < value;
                case "between":
                    return Integer.valueOf(getText(element)) > value && Integer.valueOf(getText(element)) < value2;
                default:
                    return false;
            }//switch
        }//for
        return false;
    }//validatePrices
}
