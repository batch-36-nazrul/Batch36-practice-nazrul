package com.genoric;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);//handle null pointerex
	}
	
	@FindBy(xpath="//*[@class='fa fa-lock']")
	private WebElement LoginBtnHome;

	public WebElement getLoginBtnHome() {
		return LoginBtnHome;
	}
	@FindBy(xpath ="(//*[@name='email'])[1]")
	private WebElement EmailField;

	public WebElement getEmailField() {
		return EmailField;
	}
	@FindBy(xpath="//*[@name = 'password']")
	private WebElement PasswordField;

	public WebElement getPasswordField() {
		return PasswordField;
	}
    @FindBy(xpath="(//*[@class='btn btn-default'])[1]")
	private WebElement Login2;

	public WebElement getLogin2() {
		return Login2;
	}
	
	//costco
	@FindBy(xpath = "(//a[contains(text(),'Services')])[1]")
	private WebElement Services;
		
public WebElement getServices() {
		return Services;
}

//Drag and drop
@FindBy(xpath="//div[contains(text(),'Oslo')and@id='box1']")
private WebElement dragOslo;

public WebElement getDragOslo() {
	return dragOslo;
}

public WebElement getDropNorway() {
	return dropNorway;
}

@FindBy(xpath="//div[contains(text(),'Norway')]")
private WebElement dropNorway;


@FindBy(xpath="//div[contains(text(),'Washington')and@id ='box3' ]")
private WebElement washington;

@FindBy(xpath="//div[contains(text(),'United States')]")
private WebElement unitedStates;


public WebElement getWashington() {
	return washington;
}

public WebElement getUnitedStates() {
	return unitedStates;
}

@FindBy(xpath="//div[contains(text(),'Rome')and@id='box6']")
private WebElement rome;

@FindBy(xpath="//div[contains(text(),'Italy')]")
private WebElement italy;



public WebElement getRome() {
	return rome;
}

public WebElement getItaly() {
	return italy;
}

@FindBy(xpath="//div[contains(text(),'Madrid')and@id='box7']")
private WebElement madrid;

@FindBy(xpath="//div[contains(text(),'Spain')]")
private WebElement spain;

public WebElement getMadrid() {
	return madrid;
}

public WebElement getSpain() {
	return spain;
}
//Zoopla 
@FindBy(xpath="//span[contains(text(),'Accept all cookies')]")
private List< WebElement> acceptCookiesBtn;


public List<WebElement> getAcceptCookiesBtn() {
	return acceptCookiesBtn;
}
//zoopla login
@FindBy(xpath="(//span[contains(text(),'Sign in')])[2]")
private WebElement zooplaLoginBtn;


public WebElement getZooplaLoginBtn() {
	return zooplaLoginBtn;
}
@FindBy(xpath="//input[@id='email']")
private WebElement zooplaEmail;

@FindBy(xpath="//input[@id='current-password']")
private WebElement zooplaPassword;

@FindBy(xpath="//button[@class='_1erwn750 _1erwn751 _1erwn752 _1erwn75a _1dgm2fc8']")
private WebElement zooplaLoginBtn2;

public WebElement getZooplaEmail() {
	return zooplaEmail;
}

public WebElement getZooplaPassword() {
	return zooplaPassword;
}

public WebElement getZooplaLoginBtn2() {
	return zooplaLoginBtn2;
}

//operaPractice
@FindBy(xpath="//*[@class='btn width-100 btn--primary cookie-consent__btn cookie-basic-consent__btn']")
private List <WebElement> acceptOperaCookies;

public List<WebElement> getAcceptOperaCookies() {
	return acceptOperaCookies;
}

@FindBy(xpath="//*[@class='fa fa-lock']")
		private WebElement logoutbtn;

public WebElement getLogoutbtn() {
	return logoutbtn;
}

	
}	


