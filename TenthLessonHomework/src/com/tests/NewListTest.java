package com.tests;

import com.pageobjects.TasksListPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Timestamp;

public class NewListTest {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String listName = Long.toString(timestamp.getTime());
        TasksListPage tasksListPage = new TasksListPage(driver);
        tasksListPage.createNewList(listName);
        Thread.sleep(2000);
        tasksListPage.selectList(listName);
        Thread.sleep(2000);
        tasksListPage.addSimpleTask(Long.toString(timestamp.getTime()));
        Thread.sleep(1000);
        tasksListPage.addSimpleTask(Long.toString(timestamp.getTime()));
        Thread.sleep(1000);
        System.out.println(tasksListPage.verifyHowManyTasks("2"));
        driver.quit();
    }
}
