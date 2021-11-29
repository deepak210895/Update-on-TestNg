package com.pom_hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pg {
	public WebDriver driver;
	public Login_pg(WebDriver log) {
		 this.driver=log;
	     
	     PageFactory.initElements(driver, this);
	     }

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getId() {
		return id;
	}

	public WebElement getPsswd() {
		return psswd;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath="//input[@type='text']")
	private WebElement id ;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement psswd ;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement login ;
	

}
