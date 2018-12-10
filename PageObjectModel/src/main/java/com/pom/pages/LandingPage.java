package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.objrepo.LandingPageProperties;
import com.pom.util.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProperties{

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void clickSigninIn() {
		click(SIGNIN_LOCATOR);
	}

	public void clickContactUs() {
		click(CONTACTUS_LOCATOR);
	}

	public void searchItem() {

	}
}
