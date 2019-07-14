package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

abstract class BasePage {
    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    void fillText(WebElement el, String text) {
        el.clear();
        el.sendKeys(text);
    }

    void click(WebElement el) {
        //write to log
        //highlight
        el.click();
    }

    String getText(WebElement el) {
        //highlight
        return el.getText();
    }

    void sleep(long millis){
       try{
        Thread.sleep(millis);}
       catch (Exception e){
           System.out.println(e);
       }
    }
}
