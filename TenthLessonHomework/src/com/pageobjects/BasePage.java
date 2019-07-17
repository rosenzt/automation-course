package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class BasePage {
    WebDriver driver;


    BasePage(WebDriver driver) {
        this.driver = driver;
    }

    void fillText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    String getText(WebElement element){
        return element.getText();
    }

    public void click(WebElement webElement) {
        webElement.click();
    }

    void sleep(long millis){
        try{
            Thread.sleep(millis);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
