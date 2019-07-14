package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.TasksPage;

import java.sql.Timestamp;

public class Test3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.mytinytodo.net/demo/");

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String taskName = Long.toString(timestamp.getTime());

        TasksPage tp = new TasksPage(driver);
        tp.searchTask(taskName);

        if (tp.howManyTasks() == 1) {
            System.out.println("passed");
        } else System.out.println("Failed");
    }

}
