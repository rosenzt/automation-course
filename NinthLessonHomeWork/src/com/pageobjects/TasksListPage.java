package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TasksListPage extends BasePage {
    public TasksListPage(WebDriver driver) {
        super(driver);
    }

    private WebElement simpleTaskField = driver.findElement(By.cssSelector(""));
private WebElement addTaskButton = driver.findElement(By.cssSelector(""));

    public void addSimpleTask(String taskName){
        simpleTaskField.sendKeys(taskName);
        simpleTaskField.click();
    }

    public void addAdvacedTask(){
        addTaskButton.click();
        
    }
}
