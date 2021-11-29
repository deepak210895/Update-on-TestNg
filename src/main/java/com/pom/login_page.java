package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	public WebDriver driver;
	public login_page(WebDriver log) {
     this.driver= log;
     
     PageFactory.initElements(driver,this);
	}
    
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath ="//input[@name='passwd']")
	private WebElement passwrd;
	
	@FindBy(xpath ="(//button[@type='submit'])[3]")
	private WebElement submit;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getSubmit() {
		return submit;
	}
	

}
