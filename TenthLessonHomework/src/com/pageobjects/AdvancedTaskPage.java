package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdvancedTaskPage extends BasePage {

    @FindBy(css = "[name='prio']")
    private WebElement priorityDropList;

    @FindBy(css = "#duedate")
    private WebElement dueDateField;

    @FindBy(css = "[type=text][name=task].in500")
    private WebElement taskTitleField;

    @FindBy(css = "[name='note']")
    private WebElement noteField;

    @FindBy(css = "#edittags")
    private WebElement tagsField;

    @FindBy(css = "[type=submit][value='Save']")
    private WebElement saveButton;

    TasksListPage tasksListPage = new TasksListPage(driver);

    public AdvancedTaskPage(WebDriver driver) {
        super(driver);
    }

    public void addAdvancedTask(String priority, String dueDate, String taskTitle, String note, String tags) {
        sleep(500);
        tasksListPage.openAdvancedTask();
        sleep(500);
        click(priorityDropList);
        Select priorityDropdown = new Select(priorityDropList);
        priorityDropdown.selectByVisibleText(priority);
        fillText(dueDateField, dueDate);
        fillText(taskTitleField, taskTitle);
        fillText(noteField, note);
        fillText(tagsField, tags);
        click(saveButton);
    }
}
