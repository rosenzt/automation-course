package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TaskListPage extends BasePage {

    @FindBy(css = "#task")
    private WebElement taskField;

    @FindBy(css = "#newtask_submit")
    private WebElement btnSumbit;

    @FindBy(css = "#newtask_adv")
    private WebElement btnAdvancedTask;

    @FindBy(css = "#search")
    private WebElement searchField;

    @FindBy(css = "#total")
    private WebElement numberOfTasks;

    @FindBy(css = ".mtt-tabs-add-button")
    private WebElement newListButton;

    @FindBy(css = ".mtt-tab.mtt-tabs-selected .list-action")
    private WebElement listActionsButton;

    @FindBy(css = "#btnClearCompleted")
    private WebElement clearComletedTasksButton;

    @FindBy(css = "#btnRenameList")
    private WebElement renameListButton;

    @FindBy(css = ".mtt-tab.mtt-tabs-selected a span")
    private WebElement listName;

    @FindBy(css = "#btnDeleteList")
    private WebElement deleteListButton;

    @FindBy(css = "#settings")
    private WebElement settingsLink;

    @FindBy(css = "#taskview > .btnstr")
    private WebElement tasksButton;

    public TaskListPage(WebDriver driver) {
        super(driver);
    }

    public void addSimpleTask(String task) {
        fillText(taskField, task);
        click(btnSumbit);
    }

    public int searchForTasks(String taskName) {
        fillText(searchField, taskName);
        sleep(500);
        try {
            return Integer.parseInt(getText(numberOfTasks));
        } catch (Exception e) {
            return 0;
        }
    }

    public void clickAdvancedTaskButton() {
        click(btnAdvancedTask);
    }

    public void createNewList(String newListName) {
        sleep(5000);
        click(newListButton);
        driver.switchTo().alert().sendKeys(newListName);
        driver.switchTo().alert().accept();
        sleep(1000);
    }

    public boolean selectList(String listName) {
        List<WebElement> lists = driver.findElements(By.cssSelector("#lists .mtt-tab a span"));
        for (WebElement element : lists) {
            if (element.getText().equals(listName)) {
                click(element);
                sleep(2000);
                return true;
            }
        }
        sleep(2000);
        return false;

    }

    public int howManyTasks() {
        return Integer.parseInt(getText(numberOfTasks));
    }

    public boolean renameList(String newListName) {
        createNewList("listToBeRenamed");
        selectList("listToBeRenamed");
        click(listActionsButton);
        click(renameListButton);
        driver.switchTo().alert().sendKeys(newListName);
        driver.switchTo().alert().accept();
        sleep(2000);
        System.out.println(newListName);
        return listName.getText().equals(newListName);
    }


    public boolean deleteList(String listName) {
        selectList(listName);
        click(listActionsButton);
        click(deleteListButton);
        driver.switchTo().alert().accept();
        if (!selectList(listName)) {
            return true;
        } else {
            return false;
        }
    }

    public void pressSettingsLink(){
        click(settingsLink);
    }

    public String getTasksButtonText(){
        return getText(tasksButton);
    }
}
