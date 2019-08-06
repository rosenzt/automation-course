package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

abstract class BasePage {
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	void fillText(WebElement el,String text) {
		el.clear();
		el.sendKeys(text);
	}

	public void click(WebElement el) {
		sleep(1000);
		el.click();
	}

	public String getText(WebElement el) {
		return el.getText();
	}

	public void alertOK(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}

	public void backToPreviousPage() {
		driver.navigate().back();
	}
	
	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



}
