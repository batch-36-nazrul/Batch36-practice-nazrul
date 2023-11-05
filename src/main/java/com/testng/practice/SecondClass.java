package com.testng.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.genoric.MasterPageFactory;
import com.util.BasicConfig;
import com.util.Highlighter;
import com.util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondClass {
	
	@Test
	public void getSignIn()  {
		
	WebDriverManager.chromedriver()	.setup();
	WebDriver driver = new ChromeDriver();//upcasting
	
	//Headless/ghost browser
//ChromeOptions headLessChrome = new ChromeOptions();
	//headLessChrome.addArguments("--headless");
//WebDriver driver = new ChromeDriver(headLessChrome);
	
	//implicit wait
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.navigate().to(BasicConfig.getConfigValue("QA_URL"));
	driver.manage().window().maximize();
	
	MasterPageFactory mpf = new  MasterPageFactory(driver);
		
	//Explicit wait (to wait until the Login btn in homepage is loaded)
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(mpf.getLoginBtnHome()));
	mpf.getLoginBtnHome().click();
	
	
	
	
	
	//Highlighter LoginBtnHome
	Highlighter.addColor(driver, mpf.getLoginBtnHome());
	
	mpf.getLoginBtnHome().click();
	//Highlighter EmailField
	
	//screenshots:
	Screenshot.getScreenShot(driver, "Login page");
	
	Highlighter.addColor(driver, mpf.getEmailField());
	
	mpf.getEmailField().sendKeys(BasicConfig.getConfigValue("email"));
	
	Highlighter.addColor(driver, mpf.getPasswordField());
	
	mpf.getPasswordField().sendKeys(BasicConfig.getConfigValue("password"));
	Highlighter.addColor(driver, mpf.getLogin2());
	
	mpf.getLogin2().click();
	}
}
