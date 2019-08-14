package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(css = "#username_input")
    private WebElement userNameField;

    @FindBy(css = "#Password")
    private WebElement passwordField;

    @FindBy(css = "#sign_in_button")
    private WebElement signinButton;

    @FindBy(css = ".btn.btn-full.btn-secondary")
    private WebElement createAccoutButton;

    @FindBy(css = "#username_container > label.form-error.form-error-required")
    private WebElement userNameError;

    @FindBy(css = "#login_form > section.form-group.validate-form > div:nth-child(2) > label.form-error.form-error-required")
    private WebElement paswordError;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void fillUserName(String userName) {
        fillText(userNameField, userName);
    }

    public boolean isUserNameErrorDisplayed() {
        return isElementDisplayedDisplayed(userNameError);
    }

    public void fillPassword(String password) {
        fillText(passwordField, password);
    }

    public boolean isPasswordErrorDisplayed() {
        return isElementDisplayedDisplayed(paswordError);
    }

    public void pressSignInButton() {
        click(signinButton);
    }

    public void clickCreateAccount() {
        click(createAccoutButton);
    }

}
