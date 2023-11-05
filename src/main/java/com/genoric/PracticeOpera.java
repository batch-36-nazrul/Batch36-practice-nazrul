package com.genoric;

import org.openqa.selenium.WebDriver;

public class PracticeOpera {
	WebDriver driver;	
	public void getLogInOpera() {
		DriverManager dm = new DriverManager();
		driver= dm.getDriver(driver);
		
		driver.navigate().to("https://www.opera.com/?utm_campaign=%2300%20-%20WW%20-%20Search%20-%20EN%20-%20Branded&utm_content=37670026502&gclid=EAIaIQobChMIivrkwKeNggMVYg1lCh2-fAlYEAAYASAAEgLDsPD_BwE");
		MasterPageFactory mpf = new MasterPageFactory(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(mpf.getAcceptOperaCookies().size()>0) {
			mpf.getAcceptOperaCookies().get(0).click();
			
		}
	}
	public static void main(String[] args) {
		PracticeOpera obj = new PracticeOpera();
		obj.getLogInOpera();
	}
	
	
}
