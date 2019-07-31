package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SettingsPage extends BasePage {

    @FindBy(css = "#settings_form [name='title'].in350")
    private WebElement titleField;

    @FindBy(css = ".form-buttons>[type=submit]")
    private WebElement submitButton;

    @FindBy(css = "#msg > span")
    private WebElement message;

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    public boolean changePageTitle(String newPageTitle) {
        TaskListPage taskListPage = new TaskListPage(driver);
        taskListPage.pressSettingsLink();
        sleep(500);
        fillText(titleField, newPageTitle);
        sleep(50);
        click(submitButton);
        sleep(10);
        System.out.println(getText(message));
        sleep(500);
        return getText(titleField).equals(newPageTitle);
    }

    public boolean changeLanguage(String language) {
        TaskListPage taskListPage = new TaskListPage(driver);
        taskListPage.pressSettingsLink();
        sleep(1000);
        Select langList = new Select(driver.findElement(By.cssSelector("#settings_form > table > tbody > tr:nth-child(2) > td > select")));
        if (convertLanguageInput(language) != null) {
            langList.selectByValue(convertLanguageInput(language));
        } else {
            return false;
        }
        sleep(50);
        click(submitButton);
        sleep(2000);
        return validateLanguage(taskListPage.getTasksButtonText(), language);
    }

    private String convertLanguageInput(String language) {
        switch (language) {
            case "English":
                return "en";
            case "Arabic":
                return "ar";
            case "Russian":
                return "ru";
        }
        return null;
    }

    private boolean validateLanguage(String text, String language) {
        return ((text.equals("Tasks") && language.equals("English")) || (text.equals("Задачи") && language.equals("Russian")) || (text.equals("الوسوم") && language.equals("Arabic")));
    }
}
