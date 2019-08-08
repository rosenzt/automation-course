package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.*;

import java.sql.Timestamp;

public class AddProductTest extends BaseTest {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    String name = Long.toString(timestamp.getTime());

    @Test
    public void test1AddProduct() {
        HomePage homePage = new HomePage(driver);
        homePage.search("omega 3");
        homePage.chooseProduct("California Gold Nutrition");
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();

//		homePage.chooseProduct("Now Foods, Omega-3");
//		productPage = new ProductPage(driver);
//		productPage.addToCart();

        homePage.openCart();

        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isProceedToCheckoutButtonDisplayed());

    }

    @Test
    public void test2TestEmptySignIn() {
        CartPage cartPage = new CartPage(driver);
        cartPage.proceedToCheckout();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.signIn();
        sleep(1000);
        Assert.assertTrue(signInPage.isUserNameErrorDisplayed());
        Assert.assertTrue(signInPage.isPasswordErrorDisplayed());
    }

    @Test
    public void test3TestInvalidSignUp() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage.clickCreateAccount();

        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.selectCountryCode("IL");
        createAccountPage.fillPhoneNumber(name);
        createAccountPage.userNameField(name + '@' + name);
        createAccountPage.fillPassword(name);
        createAccountPage.fillConfirmPasswordField(name);
        createAccountPage.selectAgeCheckbox();
        createAccountPage.createAccount();

        Assert.assertEquals(createAccountPage.getErrorMassage(), "Phone number is too long. Please enter a valid phone number");
    }
}
