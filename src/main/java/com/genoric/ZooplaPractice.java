package com.genoric;

import org.openqa.selenium.WebDriver;

public class ZooplaPractice {
	
	WebDriver driver;
	
	public void getLogin() {
		
		DriverManager dm = new DriverManager();
		
		driver = dm.getDriver(driver);
		
		driver.navigate().to("https://www.zoopla.co.uk/");
		MasterPageFactory mpf = new MasterPageFactory(driver);
		if(mpf.getAcceptCookiesBtn().size()>0) {
			mpf.getAcceptCookiesBtn().get(0).click();
			
		}
		//click on Login
		mpf.getZooplaLoginBtn().click();
		//Enter email
		mpf.getZooplaEmail().sendKeys("rezwanislam@rocketmail.com");
		//enter password
		mpf.getZooplaPassword().sendKeys("Boston2023!");
		//click on sign in button
		mpf.getZooplaLoginBtn2().click();
		
	}
	
	public static void main(String[] args) {
		ZooplaPractice obj = new ZooplaPractice();
		obj.getLogin();
		
	}
	

}
