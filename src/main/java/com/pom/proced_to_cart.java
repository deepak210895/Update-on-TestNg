package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proced_to_cart {
    public WebDriver driver;
    
	public proced_to_cart(WebDriver prcd) {
		this.driver=prcd;
		PageFactory.initElements(driver, this);
	
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClick_summary() {
		return click_summary;
	}

	public WebElement getClick_element() {
		return click_element;
	}

	@FindBy(xpath ="//a[@title='Proceed to checkout']")
	private WebElement click_summary;
	
	@FindBy(xpath ="(//a[@title='Proceed to checkout'])[2]")
	private WebElement click_element;
}
