package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Header extends BasePage {

    @FindBy(css = "#legacy-header .stackable-below .nav-item-list [data-sticky-header-menu-category] [data-ga-event-label]")
    //
    private List<WebElement> categories;

    @FindBy(css = "li.sticky-header-menu-navigation-list-item.view-all [data-ga-event-label][data-ga-event-action]")//
    private List<WebElement> viewAllButtons;

    @FindBy(css = "#legacy-header .secondary-header-categories-menu [data-ga-event-label]")
    // .secondary-header-categories-menu
    private List<WebElement> secondaryHearder;


    public Header(WebDriver driver) {
        super(driver);
    }


    public boolean selectAndClickHeaderCategory(String category) {
        for (WebElement element : categories) {
            //if (element.getAttribute("data-ga-event-label").toLowerCase().equals(category.toLowerCase())) {
            try {
                if (getText(element).toLowerCase().equals(category.toLowerCase())) {
                    //hoverOverElement(element);
                    //pressViewAllButton(category);
                    Actions actions = new Actions(driver);
                    //actions.moveToElement(element).moveToElement(pressViewAllButton(category)).click().build().perform();
                    actions.moveToElement(element).click().perform();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return getUrl().toLowerCase().contains(category.toLowerCase());
    }

    public WebElement selectHeaderCategory(String category) {
        for (WebElement element : categories) {
            try {
                if (getText(element).toLowerCase().equals(category.toLowerCase())) {
                    return element;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return null;
    }

    public WebElement pressViewAllButton(String category) { //Tried to click the "View All" buttons --> didn't work yet.
        for (WebElement element : viewAllButtons) {
            System.out.println("1");
            System.out.println(getText(element));
            if (element.getAttribute("href").toLowerCase().contains("//il.iherb.com/" + category.toLowerCase())) {
                // if (getText(element).toLowerCase().equals(category.toLowerCase())) {
                System.out.println("3");
                return element;
//                hoverOverElement(element);
//                click(element);
//                break;
            }
        }
        return null;
    }

    public void getSecondaryHeaderMenuItem(String category) {
        Actions actions = new Actions(driver);
        actions.moveToElement(selectHeaderCategory(category)).moveToElement(getSomeThing("New"));


    }

    public WebElement getSomeThing(String item) {
        for (WebElement element : secondaryHearder) {
            System.out.println(element.getAttribute("data-ga-event-label"));
//            if (element.getAttribute("data-ga-event-label").equals(item)){
//                return element;
//            }
        }
        return null;
    }
}
