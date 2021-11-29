package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class address_pg {
	public WebDriver driver;
    
	public address_pg(WebDriver address) {
       this.driver=address;
       PageFactory.initElements(driver, this);
       
	}

	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getClick_address() {
		return click_address;
	}


	@FindBy(xpath="(//span)[44]")
	private WebElement click_address;
	

}
