package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage {

    @FindBy(css=".select-country-code")
    private WebElement selectCountryCode;

    @FindBy(css="#PhoneNumber")
    private WebElement phoneNUmberField;

    @FindBy(css="#Username")
    private WebElement userNameField;

    @FindBy(css="#Password")
    private WebElement passwordField;

    @FindBy(css="#ConfirmPassword")
    private WebElement confirmPasswordField;

    @FindBy(css="div.form-row.consent-section > label:nth-child(1) > span.select-option-check")
    private WebElement concentAgeCheckBox;

    @FindBy(css="#ConsentMKT")
    private WebElement concentMarketingCheckBox;

    @FindBy(css="#CreateAccount")
    private WebElement createAccountButton;

    @FindBy(css="#create_account > section > section.error-messages > ul > li")
    private WebElement phoneErrorMassage;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    private void selectCountryCode(String countryCode){
        Select countryCodeSelection = new Select(selectCountryCode);
        countryCodeSelection.selectByValue(countryCode);
        sleep(100);
    }

    public void fillAllFields(String countryCode, String phoneNumber, String userName, String password, String confirmPassword){
        selectCountryCode(countryCode);
        fillText(phoneNUmberField, phoneNumber);
        fillText(userNameField, userName);
        fillText(passwordField, password);
        fillText(confirmPasswordField, confirmPassword);
    }

    public void selectAgeCheckbox(){
        //sleep(100);
        click(concentAgeCheckBox);
        //sleep(100);
    }

    public void selectMarketingCheckbox(){
        click(concentMarketingCheckBox);
    }

    public String getErrorMassage(){
        sleep(2000);
       return getText(phoneErrorMassage);
    }

    public void pressCreateAccountButton(){
        click(createAccountButton);
    }

}
