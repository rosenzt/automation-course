package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TasksListPage extends BasePage {
    public TasksListPage(WebDriver driver) {
        super(driver);
    }

    private WebElement simpleTaskField = driver.findElement(By.cssSelector(""));
    protected WebElement addTaskButton = driver.findElement(By.cssSelector(""));
    private WebElement searchField = driver.findElement(By.cssSelector(""));
    private WebElement taskNumber = driver.findElement(By.cssSelector(""));
    private WebElement newListButton = driver.findElement(By.cssSelector(""));
    private WebElement newListNameField = driver.findElement(By.cssSelector(""));
    private WebElement listTab = driver.findElement(By.cssSelector(""));

    public void addSimpleTask(String taskName) {
        simpleTaskField.sendKeys(taskName);
        click(simpleTaskField);
    }

    public void searchForTask(String searchedString) throws Exception {
        searchField.sendKeys(searchedString);
        Thread.sleep(2000);
        taskNumber.getText();
    }

    public void createNewList(String newListName) {
        click(newListButton);
        newListNameField.sendKeys(newListName);
    }

    public void selectList(String listName) {
        click(listTab);
    }

    public void verifyHowManyTasks() {
        taskNumber.getText();
    }
}
