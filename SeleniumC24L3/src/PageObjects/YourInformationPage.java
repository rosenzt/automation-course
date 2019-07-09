package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourInformationPage extends BasePage {
    public YourInformationPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String firstName, String lastName, String zipCode){
        driver.findElement(By.cssSelector("#first-name")).sendKeys(firstName);
        driver.findElement(By.cssSelector("#last-name")).sendKeys(lastName);
        driver.findElement(By.cssSelector("#postal-code")).sendKeys(zipCode);
    }

    public void clickSubmit(){
        driver.findElement(By.cssSelector(".btn_primary.cart_button")).click();
    }
}
