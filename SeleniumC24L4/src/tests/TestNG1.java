package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.TasksPage;

public class TestNG1 {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void openSite(){
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");
    }

    @Test
    public void addSimpleTask() {
        TasksPage tp = new TasksPage(driver);
        tp.addSimpleTask("this is my first task #1");
    }

    @AfterClass
    public void close(){
        driver.quit();
    }
}
