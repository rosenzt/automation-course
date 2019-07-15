package tests;

import pageobjects.TasksPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class test123 {
    WebDriver driver;

    @BeforeClass
    public void lunchSite(){
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");
    }

    @Test
    public void search() throws Exception {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String taskName = Long.toString(timestamp.getTime());

        TasksPage tasksListPage = new TasksPage(driver);
        tasksListPage.addSimpleTask(taskName);
        tasksListPage.searchTask(taskName);
        driver.quit();
    }

}
