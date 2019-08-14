package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

class Header extends BasePage {

    @FindBy(css = ".nav-item-list [data-sticky-header-menu-category] [data-ga-event-label]")
    private List<WebElement> categories;

    Header(WebDriver driver) {
        super(driver);
    }

    void selectHeaderCategory(String category) {
        for (WebElement element : categories) {
            if (element.getAttribute("data-ga-event-label").toLowerCase().contains(category.toLowerCase())) {
                click(element);
                break;
            }
        }
    }
}
