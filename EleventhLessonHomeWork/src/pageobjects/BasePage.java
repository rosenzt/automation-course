package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

abstract class BasePage {
    WebDriver driver;

    JavascriptExecutor js;
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

    void scrollInToView(WebElement el) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
        sleep(500);
    }

    void scrollInElement(WebElement element){
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        eventFiringWebDriver.executeScript("document.querySelector(" + element + ").scrollTop = 500");
    }

    void hoverOverElement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    String getUrl(){
        return driver.getCurrentUrl();
    }

    void isVisable(WebElement element){
        element.isDisplayed();
    }

}
