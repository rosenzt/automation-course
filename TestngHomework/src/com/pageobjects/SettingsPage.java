package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasePage {

    @FindBy(css="#settings_form [name='title'].in350")
    private WebElement titleField;

    @FindBy(css=".form-buttons>[type=submit]")
    private WebElement submitButton;

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    public void changePageTitle(String newPageTitle){
        TaskListPage taskListPage = new TaskListPage(driver);
        taskListPage.pressSettingsLink();
        sleep(500);
        fillText(titleField, newPageTitle);
        sleep(50);
        click(submitButton);
        sleep(500);
    }
}
