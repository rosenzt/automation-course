package com.tests;

import com.pageobjects.AdvancedTaskPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAdvancedTaskPage {
    WebDriver driver;

    @BeforeClass
    void lunchSite() {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");
    }

    @Test
    void addAdvancedTask(){
        AdvancedTaskPage advancedTaskPage = new AdvancedTaskPage(driver);
        advancedTaskPage.addAdvancedTask("+1", "7/31/19", "newAdvancedTask", "newAdvancedTask", "newAdvancedTask");
    }

    @AfterClass
    void close(){
        driver.quit();
    }
}
