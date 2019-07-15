package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement webElement) {
        webElement.click();
    }
}
