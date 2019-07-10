package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AdvancedTaskPage extends TasksListPage {

    private WebElement priorityDropList = driver.findElement(By.cssSelector(""));
    private WebElement dueDateField = driver.findElement(By.cssSelector(""));
    private WebElement taskTitleField = driver.findElement(By.cssSelector(""));
    private WebElement noteField = driver.findElement(By.cssSelector(""));
    private WebElement tagsField = driver.findElement(By.cssSelector(""));
    private WebElement saveButton = driver.findElement(By.cssSelector(""));


    public AdvancedTaskPage(WebDriver driver) {
        super(driver);
    }

    public void addAdvancedTask(String priority, String dueDate, String taskTitle, String note, String tags) {
        click(addTaskButton);
        click(priorityDropList);
        priorityDropList.sendKeys(priority);
        dueDateField.sendKeys(dueDate);
        taskTitleField.sendKeys(taskTitle);
        noteField.sendKeys(note);
        tagsField.sendKeys(tags);
        click(saveButton);
    }
}
