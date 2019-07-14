package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.AdvTaskPage;
import pageobjects.TasksPage;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/tal/automation/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.mytinytodo.net/demo/");
		
		TasksPage tp = new TasksPage(driver);
		tp.openAdvTask();
		
		AdvTaskPage atp = new AdvTaskPage(driver);
		atp.fillTask("2", "10/10/10", "my task #1", "note task #!", "gal");

	}

}
