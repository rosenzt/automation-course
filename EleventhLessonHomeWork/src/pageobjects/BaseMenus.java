package pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BaseMenus extends BasePage {

    @FindBy(css = "#universal-branded-header .branded-header-start .menu-dropdown")
    private WebElement headerDropdown;

    @FindBy(css = "#universal-branded-header .iherb-header.iherb-header.iherb-header-layout.stackable-base .iherb-header-primary.branded-header .mega-menu.mega-menu-shop .sticky-header-menu-categories-list [data-sticky-header-menu-category]")
//(css = "#legacy-header .stackable-below .nav-item-list [data-sticky-header-menu-category] [data-ga-event-label]")
    private List<WebElement> categories;

    @FindBy(css = "li.sticky-header-menu-navigation-list-item.view-all [data-ga-event-label][data-ga-event-action]")
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

    @FindBy(css = ".iherb-header-primary.branded-header .branded-header-end .iherb-header-share.share-page .hidden-xs.hidden-sm")
//(css = "#legacy-header .iherb-header.stackable-base .iherb-header-share.share-page.float-right .hidden-xs.hidden-sm")
    private WebElement shareButton;

    @FindBy(css = ".iherb-header-help-link")
//(css = "#legacy-header .iherb-header.stackable-base .iherb-header-primary .container-fluid .iherb-header-help-link.float-right")
    private WebElement helpButton;

    @FindBy(css = "#universal-branded-header .branded-header-start .menu-dropdown.hidden-xs")
    private List<WebElement> headerMenues;

    public BaseMenus(WebDriver driver) {
        super(driver);
    }

    /**
     * //actions.moveToElement(element).moveToElement(pressViewAllButton(category)).click().build().perform();
     * //actions.moveToElement(driver.findElement(By.linkText("Healthcare"))).doubleClick().build().perform();
     * //actions.contextClick(driver.findElement(By.linkText("bla bla"))).build().perform();
     * //actions.keyDown(Keys.).sendKeys(Keys.).build().perform();
     */

    public String handleHeaderMenu(String menu) {
        switch (menu.toLowerCase()) {
            case "Shop":
                return ".shop-menu";
            case "Brands":
                return ".brands-menu";
            case "Help With":
                return ".help-with-menu";
            case "Deals":
                return ".hidden-xs.hidden-sm";
            default:
                return null;
        }
    }

    public void headerMenu(String menu) {
        moveToElement(headerDropdown.toString() + handleHeaderMenu(menu.toLowerCase()));
    }

    public boolean selectAndClickHeaderCategory(String category) {
        for (WebElement element : categories) {
            try {
                if (getText(element).toLowerCase().equals(category.toLowerCase())) {
                    //hoverOverElement(element);
                    Actions actions = new Actions(driver);
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
                if (Integer.valueOf(getText(element)) == (handleCategories(category))) {
                    //moveAndClick(element);
                    return element;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return null;
    }

    private int handleCategories(String category) {
        switch (category) {
            case "Supplements":
                return 4;
            case "Herbs & Homeopathy":
                return 11;
            case "Bath & Personal Care":
                return 12;
            case "Beauty":
                return 13;
            case "Sports":
                return 6;
            case "Grocery":
                return 7;
            case "Baby & Kids":
                return 8;
            case "Pets":
                return 9;
            case "Home":
                return 10;
            case "Specialty Stores":
                return 3;
            default:
                return 0;
        }
    }

    public void testHoverMenu(String category, String linkText) {
        Actions actions = new Actions(driver);
        actions.moveToElement(selectHeaderCategory(category)).perform();
        actions.moveToElement(driver.findElement(By.linkText(linkText))).click().perform();
    }


    public void testNewMenu(String menu, String category, String linkText) {
        System.out.println(headerDropdown.toString() + handleHeaderMenu(menu.toLowerCase()));
        System.out.println(selectHeaderCategory(category));

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(headerDropdown.toString() + handleHeaderMenu(menu.toLowerCase())))).build().perform();//Mega menu
        actions.moveToElement(selectHeaderCategory(category)).build().perform();
        actions.moveToElement(driver.findElement(By.linkText(linkText))).click().perform();    //Link

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

    public void clickShareButton() {
        click(shareButton);
    }

    public void clickHelpButton() {
        click(helpButton);
    }


}
