package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TasksListPage extends BasePage {
    public TasksListPage(WebDriver driver) {
        super(driver);
    }

    private WebElement simpleTaskField = driver.findElement(By.cssSelector("#task_placeholder"));
    private WebElement addSimpleTaskButton = driver.findElement(By.cssSelector("#newtask_submit"));
    protected WebElement addAdvancedTaskButton = driver.findElement(By.cssSelector("#newtask_adv"));
    private WebElement searchField = driver.findElement(By.cssSelector("#search"));
    private WebElement taskNumber = driver.findElement(By.cssSelector("#total"));
    private WebElement newListButton = driver.findElement(By.cssSelector(".mtt-tabs-add-button"));
    //private WebElement newListNameField = driver.findElement(By.cssSelector(""));
    //private WebElement listTab = driver.findElement(By.cssSelector(""));

    public void addSimpleTask(String taskName) {
        simpleTaskField.sendKeys(taskName);
        click(addSimpleTaskButton);
    }

    public void searchForTask(String searchedString) throws Exception {
        searchField.sendKeys(searchedString);
        Thread.sleep(2000);
        System.out.println(taskNumber.getText());
    }

    public void createNewList(String newListName) {
        click(newListButton);
        driver.switchTo().alert().sendKeys(newListName);
        driver.switchTo().alert().accept();
        //newListNameField.sendKeys(newListName);
    }

    public void selectList(String listName) {
        List<WebElement> lists = driver.findElements(By.cssSelector("#lists .mtt-tab a span"));
        for (WebElement element : lists) {
            if (element.getText().equals(listName)) {
                click(element);
                break;
            }
        }
    }
//
//    public void verifyHowManyTasks() {
//        taskNumber.getText();
//    }
}
