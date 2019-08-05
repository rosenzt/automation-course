package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(css = "#txtSearch")
    private WebElement searchBox;

    @FindBy(css = "#searchBtn")
    private WebElement searchButton;

    @FindBy(css = ".products.clearfix [itemscope][itemtype='http://schema.org/Product']")
    private List<WebElement> productsList;

    @FindBy(css="#icon-header_cart")
    private WebElement cartButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchBoxForProduct(String product) {
        fillText(searchBox, product);
        click(searchButton);
    }

    public boolean selectProduct(String product) {
        List<WebElement> products = productsList;
        for (WebElement e : products) {
            if (e.getAttribute("title").toLowerCase().contains(product.toLowerCase())) {
                click(e);
                return true;
            }
        }
        return false;
    }

    public void openCart(){
        click(cartButton);
    }

}
