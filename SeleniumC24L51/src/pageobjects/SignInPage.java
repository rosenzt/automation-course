package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(css = "#username_input")
    private WebElement userNameField;

    @FindBy(css = "#Password")
    private WebElement passwordField;

    @FindBy(css = "#sign_in_button")
    private WebElement signinButton;

    @FindBy(css = ".btn.btn-full.btn-secondary")
    private WebElement createAccoutButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void fillUserName(String userName){
        fillText(userNameField, userName);
    }

    public void fillPassword(String password){
        fillText(passwordField, password);
    }

    public void signIn(){
        click(signinButton);
    }

    public void clickCreateAccount(){
        click(createAccoutButton);
    }
}
