package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {

    @FindBy(css=".select-country-code")
    private WebElement selectCountryCode;

    @FindBy(css="#Username")
    private WebElement userNameField;

    @FindBy(css="#Password")
    private WebElement passwordField;

    @FindBy(css="#ConfirmPassword")
    private WebElement confirmPasswordField;

    @FindBy(css="#ConsentTC")
    private WebElement concentAgeCheckBox;

    @FindBy(css="#ConsentMKT")
    private WebElement concentMarketingCheckBox;

    @FindBy(css="#CreateAccount")
    private WebElement createAccountButton;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void selectCountryCode(String countryCode){
        Select countryCodeSelection = new Select(selectCountryCode);
        countryCodeSelection.selectByValue(countryCode);
        sleep(100);
    }

    public void userNameField(String userName){
        fillText(userNameField, userName);
    }

    public void fillPassword(String password){
        fillText(passwordField, password);
    }

    public void fillConfirmPasswordField(String password){
        fillText(confirmPasswordField, password);
    }

    public void selectAgeCheckbox(){
        sleep(100);
        click(concentAgeCheckBox);
        sleep(100);
    }

    public void selectMarketingCheckbox(){
        click(concentMarketingCheckBox);
    }

    public void createAccount(){
        click(createAccountButton);
    }

}
