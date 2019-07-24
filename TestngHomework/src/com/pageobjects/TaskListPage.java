package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskListPage extends BasePage{

    @FindBy(css="#task")
    private WebElement taskField;

    @FindBy(css="#newtask_submit")
    private WebElement btnSumbit;

    @FindBy(css="#newtask_adv > span")
    private WebElement btnAdvancedTask;

    @FindBy(css="#search")
    private WebElement searchField;

    @FindBy(css="#total")
    private WebElement numberOfTasks;

    public TaskListPage(WebDriver driver) {
        super(driver);
    }

    public void addSimpleTask(String task){
        fillText(taskField, task);
        click(btnSumbit);
    }


}
