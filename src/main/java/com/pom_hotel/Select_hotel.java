package com.pom_hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	public WebDriver driver;
	public Select_hotel(WebDriver select_htl) {
	this.driver=select_htl;
	PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getContinue1() {
		return continue1;
	}

	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement button;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continue1;

}
