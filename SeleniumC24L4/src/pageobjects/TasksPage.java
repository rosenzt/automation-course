package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage {
	@FindBy(css="#task")
	private WebElement taskField;
	@FindBy(css="#newtask_submit")
	private WebElement btnSubmit;
	@FindBy(css="#newtask_adv > span")
	private WebElement btnAdvTask;
	@FindBy(css="#search")
	private WebElement searchField;
	@FindBy(css = "#total")
	private WebElement numberOfTasks;
	
	public TasksPage(WebDriver driver) {
		super(driver);
	}

	public void addSimpleTask(String task) {
		fillText(taskField, task);
		click(btnSubmit);
	}
	
	public void openAdvTask() {
		click(btnAdvTask);
	}

	public void searchTask(String taskName){
		fillText(searchField, taskName);
		sleep(1000);
	}

	public int howManyTasks(){
		return Integer.parseInt(getText(numberOfTasks));
	}
	
}
