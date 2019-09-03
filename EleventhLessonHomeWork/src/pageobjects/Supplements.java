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
            StringBuilder rawPrice = new StringBuilder(getText(element)); //Converting to String builder
            rawPrice.deleteCharAt(0); //Removing the $ sign
            String price = rawPrice.toString(); //Converting back to String
            double aDouble = Double.parseDouble(price); //Converting to double

            switch (biggerSmallerOrBetween.toLowerCase()) {
                case "bigger":
                    if (!(aDouble > value)) {
                        return false;
                    } else
                        continue;
                case "lower":
                    if (!(aDouble < value)) {
                        return false;
                    } else continue;
                case "between":
                    if (!(aDouble > value && aDouble < value2)) {
                        return false;
                    } else continue;
                default:
                    return false;
            }//switch
        }//for
        return true;
    }//validatePrices

}
