package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseMenus {

    @FindBy(css = ".selected-country-wrapper .icon.icon-checkoutarrow")
    private WebElement preferencesButton;

    @FindBy(css = ".language-menu .row > div:nth-child(2) .select-language.ui.fluid.search.selection.dropdown")
    private WebElement languageMenuButton;

    @FindBy(css = ".language-menu .row > div:nth-child(2) .select-language.ui.fluid.search.selection.dropdown .menu.search-list.open label")
    private List<WebElement> languageDropDownList;

    @FindBy(css = ".save-selection.btn.btn-primary")
    private WebElement savePreferencesButton;

    @FindBy(css = "#txtSearch")
    private WebElement searchField;

    @FindBy(css = ".icon.icon-search")
    private WebElement btnSearch;

    @FindBy(css = ".products.clearfix .absolute-link.product-link")
    private List<WebElement> productsList;

    @FindBy(css = ".icon.icon-header_cart")
    private WebElement btnCart;

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void switchLanguage(String language) {
        click(preferencesButton);
        //sleep(1000);
        click(languageMenuButton);
        //sleep(2000);
        for (WebElement el : languageDropDownList) {
            if (getText(el).toLowerCase().contains(language.toLowerCase())) {
                click(el);
                break;
            }
        }
        //sleep(2000);
        click(savePreferencesButton);
        //sleep(1000);
    }

    public void search(String name) {
        fillText(searchField, name);
        click(btnSearch);
    }

    public void chooseProduct(String productName) {
        for (WebElement el : productsList) {
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
