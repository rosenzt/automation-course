package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import static org.openqa.selenium.support.How.CSS;

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

    @FindBy(css = "#newtask_adv > span")
    private WebElement addAdvancedTaskButton;

    @FindBy(css = "#total")
    private WebElement taskNumber;

    @FindBy(css = ".mtt-tabs-add-button")
    private WebElement newListButton;

    @FindBy(how = CSS, using = "#lists .mtt-tab a span")
    private List<WebElement> webElements;

    public void addSimpleTask(String taskName) {
        fillText(simpleTaskField, taskName);
        click(addSimpleTaskButton);
    }

    public void searchForTask(String searchedString) {
        fillText(searchField, searchedString);
        sleep(1000);
        getText(taskNumber);
    }

    public void openAdvancedTask() {
        click(addAdvancedTaskButton);
    }

    public void createNewList(String newListName) {
        click(newListButton);
        driver.switchTo().alert().sendKeys(newListName);
        driver.switchTo().alert().accept();
    }

    public void selectList(String listName) {
        //List<WebElement> lists = driver.findElements(By.cssSelector("#lists .mtt-tab a span"));
        for (WebElement element : webElements) {
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
