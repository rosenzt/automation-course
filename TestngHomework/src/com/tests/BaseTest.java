package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

abstract class BaseTest {
WebDriver driver;

    @BeforeClass
    void lunchSite() {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");
    }

    @AfterClass
    void close() {
        driver.quit();
    }

    void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
