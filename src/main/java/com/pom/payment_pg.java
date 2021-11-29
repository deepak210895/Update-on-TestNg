package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payment_pg {
	public WebDriver driver;
	public payment_pg(WebDriver pay) {
    
		this.driver=pay;
		PageFactory.initElements(driver, this);
	
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClick_payment() {
		return click_payment;
	}

	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement click_payment;
	

}
