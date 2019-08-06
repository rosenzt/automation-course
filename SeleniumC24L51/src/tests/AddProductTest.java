package tests;

import org.testng.annotations.Test;

import pageobjects.*;

import java.sql.Timestamp;

public class AddProductTest extends BaseTest {
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	String name = Long.toString(timestamp.getTime());
	@Test
	public void addProduct() {
		HomePage hp = new HomePage(driver);
		hp.search("omega 3");
		hp.chooseProduct("California Gold Nutrition");
		ProductPage pp = new ProductPage(driver);
		pp.addToCart();
		
		hp.chooseProduct("Now Foods, Omega-3");
		pp = new ProductPage(driver);
		pp.addToCart();
		
		hp.openCart();

		CartPage cartPage = new CartPage(driver);
		cartPage.proceedToCheckout();

		SignInPage signInPage  = new SignInPage(driver);
		signInPage.clickCreateAccount();

		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		createAccountPage.selectCountryCode("IL");
		createAccountPage.userNameField(name);
		createAccountPage.fillPassword(name);
		createAccountPage.fillConfirmPasswordField(name);
		createAccountPage.selectAgeCheckbox();
		createAccountPage.createAccount();

		
	}
}
