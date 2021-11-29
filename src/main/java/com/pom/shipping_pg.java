package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shipping_pg {
	
	public shipping_pg(WebDriver ship) {
		
		this.driver=ship;
		
		PageFactory.initElements(driver,this);
	}


	public WebDriver driver;
    
	
	@FindBy(xpath="(//span)[38]")
	private WebElement click_shipping;


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getClick_shipping() {
		return click_shipping;
	}

}
