package com.tests;

import com.pageobjects.TasksListPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewSimpleTaskTest {
    WebDriver driver;

    @BeforeClass
    public void loadSite() {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");
    }

    @Test
    public void addNewTask() {
        TasksListPage tasksListPage = new TasksListPage(driver);
        tasksListPage.addSimpleTask("New simple task");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
