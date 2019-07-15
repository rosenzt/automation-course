package com.tests;

import com.pageobjects.AdvancedTaskPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAdvancedTaskTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");

        AdvancedTaskPage advancedTaskPage = new AdvancedTaskPage(driver);
        advancedTaskPage.addAdvancedTask("+1", "7/31/19", "newAdvancedTask", "newAdvancedTask", "newAdvancedTask");
        driver.quit();
    }
}
