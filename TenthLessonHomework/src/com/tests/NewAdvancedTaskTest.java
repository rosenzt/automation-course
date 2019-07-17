package com.tests;

import com.pageobjects.AdvancedTaskPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewAdvancedTaskTest {
    WebDriver driver;
    AdvancedTaskPage advancedTaskPage = new AdvancedTaskPage(driver);

    @BeforeClass
    public void loadSite(){
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");
    }

    @Test
    public void testAdvancedTask(){
        advancedTaskPage.addAdvancedTask("+1", "7/31/19", "newAdvancedTask", "newAdvancedTask", "newAdvancedTask");
        driver.quit();
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
