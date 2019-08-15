package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Header extends BasePage {

    @FindBy(css = "#legacy-header .stackable-below .nav-item-list [data-sticky-header-menu-category] [data-ga-event-label]") //
    private List<WebElement> categories;

    @FindBy(css="li.sticky-header-menu-navigation-list-item.view-all [data-ga-event-label]")//
    private List<WebElement> viewAllButtons;



    public Header(WebDriver driver) {
        super(driver);
    }



    public void selectHeaderCategory(String category) {
        for (WebElement element : categories) {
            System.out.println(getText(element));
            if (element.getAttribute("data-ga-event-label").toLowerCase().contains(category.toLowerCase())) {
                hoverOverElement(element);
                pressViewAllButton(category);

            }
        }
    }

    public void pressViewAllButton(String category){
        for (WebElement element: viewAllButtons) {
            System.out.println(getText(element));
            if (element.getAttribute("data-ga-event-label").toLowerCase().contains(category.toLowerCase())){
                hoverOverElement(element);
                click(element);
                break;
            }
        }
    }
}
