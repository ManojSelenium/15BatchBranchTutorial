package com.pom.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase implements Setup{

	WebDriver driver;
	
	public WebDriver intilizeDriver() {
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
		System.out.println("Driver From Test Base : "+driver);
		return driver;
	}
	
	public void enterURL(String sURL) {
		driver.get(sURL);
	}
}


