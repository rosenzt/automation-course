package com.pageobjects;

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
		//write to log
		//highlight
		el.click();
	}

	public String getText(WebElement el) {
		//highlight
		return el.getText();
	}

	public void alertOK(String text) {
		//insert name to alert
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}

	public void backToPreviosePage(){
		driver.navigate().back();
	}

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
