package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.objrepo.SininPageProperties;
import com.pom.util.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SininPageProperties{

	WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterEmailAddress(String testData) {
		enterText(EMAIL_ADDRESS, testData);
	}
	
	
	public void clickCreateAnAccount() {
		click(CREATE_AN_ACCOUNT_LOCATOR);
	}
	
	public void enterUserName() {
		
	}
	
	public void clickForgotPassword() {
		
	}
}
