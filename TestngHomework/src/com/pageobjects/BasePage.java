package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

abstract class BasePage {
    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    void fillText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    void click(WebElement element) {
        element.click();
    }

    String getText(WebElement element) {
        return element.getText();
    }

    void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
