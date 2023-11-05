package com.genoric;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropdown {

	public void getDropdown() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Select sc = new Select(driver.findElement(By.xpath("//select")));
		//select by using SelectByVisibleText()
		sc.selectByVisibleText("Cyprus");
		Thread.sleep(2000);
		//Select Algeria by using SelectByIndex()
		sc.selectByIndex(3);
		Thread.sleep(2000);
		//Select Bangladesh by using SelectByValue()
		sc.selectByValue("BGD");
		Thread.sleep(2000);
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		PracticeDropdown obj = new PracticeDropdown();
		obj.getDropdown();
	}
	
}
