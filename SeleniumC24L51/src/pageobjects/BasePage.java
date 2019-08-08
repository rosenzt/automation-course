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

    boolean isElementDisplayedDisplayed(WebElement webElement) {
        return webElement.isDisplayed();
    }

    void fillText(WebElement el, String text) {
        el.clear();
        el.sendKeys(text);
    }

    void click(WebElement el) {
        sleep(1000);
        el.click();
    }

    String getText(WebElement el) {
        return el.getText();
    }

    public void alertOK(String text) {
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }

    void backToPreviousPage() {
        driver.navigate().back();
    }

    void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
