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
        click(newListButton);
        driver.switchTo().alert().sendKeys(newListName);
        driver.switchTo().alert().accept();
        sleep(1000);
    }

    public void selectList(String listName) {
        List<WebElement> lists = driver.findElements(By.cssSelector("#lists .mtt-tab a span"));
        for (WebElement element : lists) {
            if (element.getText().equals(listName)) {
                click(element);
                break;
            }
        }
        sleep(2000);
    }

    public int howManyTasks(){
        return Integer.parseInt(getText(numberOfTasks));
    }


}
