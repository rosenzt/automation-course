package com.tests;

import com.pageobjects.TaskListPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class SearchTaskTest {
    WebDriver driver;

    @BeforeClass
    void lunchSite(){
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");
    }

    @Test
    void search(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String taskName = Long.toString(timestamp.getTime());

        TaskListPage taskListPage = new TaskListPage(driver);
        taskListPage.addSimpleTask(taskName);
        System.out.println(taskListPage.searchForTasks(taskName));
    }

    @AfterClass
    void close(){
        driver.quit();
    }

}
