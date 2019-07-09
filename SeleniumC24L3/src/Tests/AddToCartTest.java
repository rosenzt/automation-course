package Tests;

import PageObjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart(0);
        productPage.goToCart();

        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.checkout();

        YourInformationPage yourInformationPage = new YourInformationPage(driver);
        yourInformationPage.fillForm("test", "test", "test");
        yourInformationPage.clickSubmit();

        OverviewPage overviewPage = new OverviewPage(driver);
        overviewPage.clickFinish();
    }

}
