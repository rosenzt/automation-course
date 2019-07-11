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
    private WebElement searchField = driver.findElement(By.cssSelector("#search"));
    protected WebElement addAdvancedTaskButton = driver.findElement(By.cssSelector("#newtask_adv"));
    private WebElement taskNumber = driver.findElement(By.cssSelector("#total"));
    private WebElement newListButton = driver.findElement(By.cssSelector(".mtt-tabs-add-button"));

    public void addSimpleTask(String taskName) {
        simpleTaskField.sendKeys(taskName);
        click(addSimpleTaskButton);
    }

    public void searchForTask(String searchedString) throws Exception {
        searchField.sendKeys(searchedString);
        Thread.sleep(1000);
        System.out.println(taskNumber.getText());
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
        if (taskNumber.getText().equals(howManyTasks)) {
            return "Test passed";
        } else {
            return "Test failed";
        }
    }
}
