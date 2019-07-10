package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AdvancedTaskPage extends TasksListPage {

    private WebElement priorityDropList = driver.findElement(By.cssSelector("[name='prio']"));
    private WebElement dueDateField = driver.findElement(By.cssSelector("#duedate"));
    private WebElement taskTitleField = driver.findElement(By.cssSelector("[type=text][name=task].in500"));
    private WebElement noteField = driver.findElement(By.cssSelector("[name='note']"));
    private WebElement tagsField = driver.findElement(By.cssSelector("#edittags"));
    private WebElement saveButton = driver.findElement(By.cssSelector("[type=submit][value='Save']"));


    public AdvancedTaskPage(WebDriver driver) {
        super(driver);
    }

    public void addAdvancedTask(String priority, String dueDate, String taskTitle, String note, String tags) {
        click(addAdvancedTaskButton);
        click(priorityDropList);
        Select priorityDropdown = new Select(driver.findElement(By.cssSelector("[name='prio']")));
        priorityDropdown.selectByVisibleText(priority);
        dueDateField.sendKeys(dueDate);
        taskTitleField.sendKeys(taskTitle);
        noteField.sendKeys(note);
        tagsField.sendKeys(tags);
        click(saveButton);
    }
}
