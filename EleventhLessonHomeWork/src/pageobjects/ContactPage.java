package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactPage extends BaseMenus {

    private String searchResultId;

    @FindBy(css = ".hc-search-text")
    private WebElement contactPageTitle;

    @FindBy(css = "#hcSearchInput")
    private WebElement searchField;

    @FindBy(css = ".hc-search-input-container>.hc-search-suggestions [data-hc-id]")
    private List<WebElement> searchSuggestions;

    @FindBy(css = ".hc-core-search .hc-search-content .hc-search-content-list .hc-search-content-list-item")
    private List<WebElement> searchSuggestionsAnswers;

    @FindBy(css = ".hc-core-search .hc-search-content .hc-search-content-list .hc-search-content-list-item>.hc-search-content-item-button.hc-search-content-list-item-unclickable>.hc-search-content-title")
    private WebElement selectedAnswerTitle;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return getText(contactPageTitle);
    }

    public String getSearchFieldPlaceholder() {
        return searchField.getAttribute("placeholder");
    }

    public void enterInputToSearchField(String text) {
        fillText(searchField, text);
        sleep(1000);
    }

    public void enterAndClickSearchField(String text) {
        fillText(searchField, text);
        click(searchField);
    }

    public boolean verifySearchSuggestions(String text) {
        for (WebElement element : searchSuggestions) {
            if (getText(element).toLowerCase().contains(text.toLowerCase()))
                return true;
        }
        return false;
    }

    public void clickSearchSuggestion(String text) {
        for (WebElement element : searchSuggestions) {
            if (getText(element).toLowerCase().contains(text.toLowerCase())) {
                click(element);
                searchResultId = element.getAttribute("id");
            }
        }
    }

    public WebElement getSearchSuggestionElement() {
        for (WebElement element : searchSuggestionsAnswers) {
            if (element.getAttribute("id").contains(searchResultId)) {
                return element;
            }
        }
        return null;
    }

    public String getSearchAnswerTitle() {
        return getText(selectedAnswerTitle);
    }


}
