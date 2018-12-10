package com.pom.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils {

	WebDriver driver;
	
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}

	public void click(By prop) {
		driver.findElement(prop).click();
	}
	public void clearVaueFromTextBox(By prop) {
		driver.findElement(prop).clear();
	}
	
	public void enterText(By prop,String testData) {
		clearVaueFromTextBox(prop);
		driver.findElement(prop).sendKeys(testData);
	}

	public String getText(By prop) {
		return driver.findElement(prop).getText();
	}

	public String getAttribute(By prop,String key) {
		return driver.findElement(prop).getAttribute(key);
	}

	public void selectValueFromDropDown(By prop,int index) {
		new Select(driver.findElement(prop)).selectByIndex(index);
	}
	public void selectValueFromDropDown(By prop,String value) {
		new Select(driver.findElement(prop)).selectByValue(value);
	}

	public boolean isElementPresent(By prop) {
		return driver.findElement(prop).isDisplayed();
	}

	public boolean isElementPresentWithOutException(By prop) {
		boolean elementFound=false;
		try {
			driver.findElement(prop);
			elementFound=true;
			return elementFound;
		} catch (Exception e) {
			return elementFound;
		}
	}
	
	public int verifyForElement(By prop) {
		return driver.findElements(prop).size();
	}
}
