package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdvTaskPage extends BasePage{
	@FindBy(css="[name='prio']")
	private WebElement selectPriority;
	@FindBy(css="#duedate")
	private WebElement duedateField;
	@FindBy(css="[name='task'].in500")
	private WebElement taskField;
	@FindBy(css="[name='note']")
	private WebElement noteField;
	@FindBy(css="#edittags")
	private WebElement tagsField;
	@FindBy(css="[value='Save']")
	private WebElement btnSave;
	
	public AdvTaskPage(WebDriver driver) {
		super(driver);
	}
	
	public void fillTask(String priority,String date, String task, String note, String tags) {
		Select s = new Select(selectPriority);
		s.selectByValue(priority);
		
		fillText(duedateField, date);
		fillText(taskField, task);
		fillText(noteField, note);
		fillText(tagsField, tags);
		click(btnSave);
	}
	
	

}
