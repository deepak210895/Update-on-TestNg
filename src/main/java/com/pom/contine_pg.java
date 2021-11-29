package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contine_pg {
	public WebDriver driver;
   
	public contine_pg(WebDriver continee) {

	this.driver=continee;
	
	PageFactory.initElements(driver, this);
	
	}


   
	public WebDriver getDriver() {
		return driver;
	}



	public WebElement getClick_completed() {
		return click_completed;
	}



	@FindBy(xpath="(//span)[36]")
	private WebElement click_completed;
	

}
