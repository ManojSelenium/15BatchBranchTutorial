package com.sprint1.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.pages.LandingPage;
import com.pom.util.TestBase;

public class S234_Edit_Account extends TestBase{

	LandingPage landingPage;

	@BeforeMethod
	public void BeforeMethod() {
		intilizeDriver();
		enterURL(URL);
		//landingPage=new LandingPage();
	}

	@Test
	public void editAccountWithValidData(){
		landingPage.clickSigninIn();

	}


	@Test
	public void editAccountWithInValidData(){

	}
}
