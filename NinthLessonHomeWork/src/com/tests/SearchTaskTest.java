package com.tests;

import com.pageobjects.TasksListPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTaskTest {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");

        TasksListPage tasksListPage  =new TasksListPage(driver);
        tasksListPage.searchForTask("talstest");
    }

}
