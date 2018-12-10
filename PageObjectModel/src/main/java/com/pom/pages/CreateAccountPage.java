package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.dao.CreateUserBean;
import com.pom.objrepo.CreateAccountPageProperties;
import com.pom.util.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProperties{

	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	public void enterFirstName(CreateUserBean bean) {
	
		new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(FIRSTNAME_LOCATOR));
		enterText(FIRSTNAME_LOCATOR, bean.getFirstName());
	}
	
	public void enterLastName(CreateUserBean bean) {
		
		enterText(LASTNAME_LOCATOR, bean.getLastName());
	}
	
	public void enterPasswod(CreateUserBean bean) {
		
		//enterText(PASSWORD_LOCATOR, bean.getPassword());
	}
	
	
}
