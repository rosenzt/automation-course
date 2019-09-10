package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy(css = ".hc-core-search .hc-search-content .hc-search-content-list .hc-search-content-list-item>.hc-search-content-item-button>.hc-search-content-title")
    private List<WebElement> titlesList;

    @FindBy(css = ".hc-core-search .hc-search-content .hc-search-content-list .hc-search-content-list-item")
    private List<WebElement> suggstionsList;

    @FindBy(css = "#contact-us-form [data-content-id='#email-us-content']")
    private WebElement emailUsTab;

    @FindBy(css = "#contact-us-form [data-content-id='#chat-with-us-content']")
    private WebElement chatWithUsTab;

    @FindBy(css = "#ContactForm_FullName_Value")
    private WebElement contactFormFullName;

    @FindBy(css = "#ContactForm_Email_Value")
    private WebElement contactFormEmail; //contact-form-categories

    @FindBy(css = "#contact-form-categories")
    private WebElement contactFormCategoryDropList;

    @FindBy(css = "#ContactForm_OrderNumber_Value")
    private WebElement contactFormOrderNumber;

    @FindBy(css = "#ContactForm_Message_Value")
    private WebElement contactFormMessageField;

    @FindBy(css = "#ContactSubmit")
    private WebElement contactFormSubmitButton;

    @FindBy(css = "#chat-with-us-content")
    private WebElement chatWithUsContent;

    @FindBy(css = "#contact-us-chat-button")
    private WebElement chatWithUsButton;

    @FindBy(css = "#contact-us-form #CustomerServiceFormContainer #ContactSavedMessage .save-success span")
    private WebElement successMessage;

    @FindBy(css = "#contact-us-form #CustomerServiceFormContainer [action='/info/contact'] .form-group .danger")
    private List<WebElement> errorList;

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
        sleep(2000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.RETURN).build().perform();
        sleep(2000);
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
                sleep(1000);
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

    public boolean verifySuggestionIsDisplayed() {
        for (WebElement element : searchSuggestionsAnswers) {
            if (!isElementDisplayedDisplayed(element)) {
                return false;
            }
        }
        return true;
    }

    public void clickAnswerTitle(String text) {
        for (WebElement element : titlesList) {
            if (getText(element).toLowerCase().contains(text.toLowerCase())) {
                click(element);
            }
        }
        sleep(1000);
    }

    public void suggestions() {
        for (WebElement element : suggstionsList) {
            System.out.println(element.toString());
        }
    }

    public void selectChatWithUs() {
        click(chatWithUsTab);
        sleep(1000);
    }

    public boolean verifyChatTabContent() {
        return isElementDisplayedDisplayed(chatWithUsContent);
    }

    public void selectEmailUsTab() {
        click(emailUsTab);
    }

    public void fillContactUsForm(String fullName, String email, String category, String orderNumber, String message) {
        try {
            click(emailUsTab);
            sleep(500);
            fillText(contactFormFullName, fullName);
            fillText(contactFormEmail, email);
            handleCategory(category);
            fillText(contactFormOrderNumber, orderNumber);
            fillText(contactFormMessageField, message);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void handleCategory(String category) {
        try {
            Select categorySelection = new Select(contactFormCategoryDropList);
            categorySelection.selectByVisibleText(category);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void submitMessage() {
        scrollInToView(contactFormSubmitButton);
        click(contactFormSubmitButton);
    }

    public String getSuccessMessage() {
        sleep(2000);
        return getText(successMessage);
    }

    public void getErrorMessages() {
        for (WebElement element : errorList) {
            System.out.println(getText(element));
        }
    }

}

