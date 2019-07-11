package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public WebDriver driver;
    protected WebElement addAdvancedTaskButton = driver.findElement(By.cssSelector("#newtask_adv"));

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement webElement){
        webElement.click();
    }
}
