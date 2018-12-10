package com.sprint1.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.dao.BeanFactory;
import com.pom.dao.CreateUserBean;
import com.pom.pages.CreateAccountPage;
import com.pom.pages.LandingPage;
import com.pom.pages.SigninPage;
import com.pom.util.TestBase;

public class S123_Create_Account extends TestBase{
	
	LandingPage landingPage;
	SigninPage signInPage;
	CreateAccountPage createAccountPage;
	
	@BeforeMethod
	public void BeforeMethod() {
		
		WebDriver driver=intilizeDriver();
		enterURL(URL);
		landingPage=new LandingPage(driver);
		signInPage=new SigninPage(driver);
		createAccountPage=new  CreateAccountPage(driver);
	}
	
	@Test
	public void createAccountWithValidData(){
		
		//Click Signin 
		landingPage.clickSigninIn();
		//Enter Email Address
		String emalAddress="a";
		signInPage.enterEmailAddress("jhghkj@mailinator.com");
		signInPage.clickCreateAnAccount();
		CreateUserBean bean=new CreateUserBean();
		//Click Create An Account
		BeanFactory factory=new BeanFactory();
		factory.setUpDataForNewUser(bean);
		bean.setFirstName("Manoj");
		
		
		createAccountPage.enterFirstName(bean);
		createAccountPage.enterLastName(bean);
		createAccountPage.enterPasswod(bean);
		
		//Enter FirstName
		Assert.assertEquals(emalAddress, bean.getFirstName());
	}
	
	
	//@Test
	public void createAccountWithInValidData(){
		
		landingPage.clickSigninIn();
		signInPage.enterEmailAddress("a");
		signInPage.clickCreateAnAccount();
		
	}
}
