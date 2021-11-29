package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkbox_pg {
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getClick_checkbox() {
		return click_checkbox;
	}


	public checkbox_pg(WebDriver check) {

		this.driver=check;
		
		PageFactory.initElements(driver, this);
	}


	public WebDriver driver;
    
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement click_checkbox;
	

}
