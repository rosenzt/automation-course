package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart(int pos){
        List<WebElement> list = driver.findElements(By.cssSelector(".btn_primary.btn_inventory"));
        list.get(pos).click();
    }

    public void goToCart(){
        driver.findElement(By.cssSelector(".svg-inline--fa.fa-shopping-cart.fa-w-18.fa-3x > path ")).click();
    }
}
