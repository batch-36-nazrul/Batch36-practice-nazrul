package com.genoric;

import org.openqa.selenium.WebDriver;

public class CostcoPractice1 {
	
	WebDriver driver;
	
	public void getLogInCostco() {
		DriverManager dm = new DriverManager();
		driver= dm.getDriver(driver);
		driver.navigate().to("https://www.costco.com/");
		MasterPageFactory mpf = new MasterPageFactory(driver);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		CostcoPractice1 obj = new CostcoPractice1();
		obj.getLogInCostco();
		
		
	}
	

}
