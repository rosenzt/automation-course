package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class TasksListPage extends BasePage {
    public TasksListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#task_placeholder")
    private WebElement simpleTaskField;

    @FindBy(css = "#newtask_submit")
    private WebElement addSimpleTaskButton;

    @FindBy(css = "#search")
    private WebElement searchField;

    @FindBy(css = "#newtask_adv")
    protected WebElement addAdvancedTaskButton;

    @FindBy(css = "#total")
    private WebElement taskNumber;

    @FindBy(css = ".mtt-tabs-add-button")
    private WebElement newListButton;

    public void addSimpleTask(String taskName) {
        fillText(simpleTaskField, taskName);
        click(addSimpleTaskButton);
    }

    public void searchForTask(String searchedString) throws Exception {
        fillText(searchField, searchedString);
        sleep(1000);
        getText(taskNumber);
    }

    public void createNewList(String newListName) {
        click(newListButton);
        driver.switchTo().alert().sendKeys(newListName);
        driver.switchTo().alert().accept();
    }

    public void selectList(String listName) throws Exception {
        List<WebElement> lists = driver.findElements(By.cssSelector("#lists .mtt-tab a span"));
        for (WebElement element : lists) {
            if (element.getText().equals(listName)) {
                click(element);
                break;
            }
        }
    }

    public String verifyHowManyTasks(String howManyTasks) {
        if (getText(taskNumber).equals(howManyTasks)) {
            return "Test passed";
        } else {
            return "Test failed";
        }
    }
}
