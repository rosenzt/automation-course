package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BaseMenus extends BasePage {

    @FindBy(css = "#legacy-header .stackable-below .nav-item-list [data-sticky-header-menu-category] [data-ga-event-label]")
    private List<WebElement> categories;

    @FindBy(css = "li.sticky-header-menu-navigation-list-item.view-all [data-ga-event-label][data-ga-event-action]")//
    private List<WebElement> viewAllButtons;

    @FindBy(css = "#legacy-header .secondary-header-categories-menu [data-ga-event-label]")
    private List<WebElement> secondaryHearder;

    @FindBy(css = "#PriceFilters")
    private WebElement priceFilters;

    @FindBy(css = "#PriceFilters .price-range")
    private WebElement priceRange;

    @FindBy(css = "#PriceFilters .filter-list.no-scroll .filter-name .checkbox-filter")
    private List<WebElement> fixedPriceRanges;

    @FindBy(css = "#exclusive-brands-checkbox")
    private WebElement exclusive;

    @FindBy(css = ".popup-container.modal-exclusive.show")
    private WebElement toolTip;

    @FindBy(css = ".popup-container.modal-exclusive.show .popup-title")
    private WebElement toolTipTitle;

    @FindBy(css = ".popup-container.modal-exclusive.show .popup-content")
    private WebElement toolTipContent;

    @FindBy(css = ".popup-container.modal-exclusive.show .popup-close .icon-circlex")
    private WebElement toolTipTitleClosingButton;

    @FindBy(css = "#exclusive-brands-checkbox .filter-name [for=FilterExclusive7]")
    private WebElement exclusiveFilter;

    @FindBy(css = ".pagination>.pagination-link span")
    private List<WebElement> pagination;

    @FindBy(css = "#FilteredProducts .applied-filters .applied-filter-row .applied-filter")
    private List<WebElement> appliedFilter;

    @FindBy(css="#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .hidden-xs.hidden-sm")
    private WebElement shareButton;

    public BaseMenus(WebDriver driver) {
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
                    actions.moveToElement(element).click().build().perform();
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
        actions.moveToElement(selectHeaderCategory(category)).moveToElement(getSomeThing("New")).click().build().perform();
    }

    private WebElement getSomeThing(String item) {
        for (WebElement element : secondaryHearder) {
            System.out.println(element.getAttribute("data-ga-event-label"));
            if (element.getAttribute("data-ga-event-label").equals(item)) {
                return element;
            }
        }
        return null;
    }

    /****
     * Tried to click elements visible only while hover over is in effect -> didn't work
     * Also wanted to verify their visibility.*/

    public void clickPriceFilter() {
        click(priceFilters);
        sleep(3000);
    }

    public void selectedFixedPriceRange(String id) {
        for (WebElement element : fixedPriceRanges) {
            if (element.getAttribute("id").equals(id)) {
                try {
                    click(driver.findElement(By.cssSelector("#Filter$0-$51")));
                } catch (Exception e) {
                    Actions action = new Actions(driver);
                    action.moveToElement(element).click(element).build().perform();
                }
            } else {
                System.out.println(id + "Not found.");
            }
        }
    }//selectedFixedPriceRange

    public void exclusiveToolTip() {
        Actions action = new Actions(driver);
        action.moveToElement(exclusive).click(exclusive).build().perform();
    }

    public boolean verifyToolTipAppears() {
        return isElementDisplayedDisplayed(toolTip);
    }

    public String getToolTipTitle() {
        return getText(toolTipTitle);
    }

    public String getToolTipContent() {
        return getText(toolTipContent);
    }

    public void closeToolTip() {
        click(toolTipTitleClosingButton);
    }

    public void addExclusiveFilter() {
        click(exclusiveFilter);
        sleep(2000);
    }

    public String getLastPaginationValue() {
        return getText(pagination.get(pagination.size() - 1));
    }

    public boolean verifyAppliedFilters(String filterName) {
        for (WebElement element : appliedFilter) {
            if (getText(element).toLowerCase().equals(filterName.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public void closeAppliedFilter(String filterName) {
        for (WebElement element : appliedFilter) {
            if (getText(element).toLowerCase().equals(filterName.toLowerCase()))
                click(element);
        }
        sleep(2000);
    }

    public void clickShareButton(){
        click(shareButton);
    }

}
