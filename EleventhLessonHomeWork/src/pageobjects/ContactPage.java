package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BaseMenus {

    @FindBy(css=".hc-search-text")
    private WebElement contactPageTitle;

    @FindBy(css="#hcSearchInput")
    private WebElement searchField;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return getText(contactPageTitle);
    }

    public String getSearchFieldPlaceholder(){
        return searchField.getAttribute("placeholder");
    }

    public void enterInputToSearchField(String text){
        fillText(searchField, text);
    }




}
