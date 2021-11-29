package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class backdata_pg {
	
	public backdata_pg(WebDriver back) {
     this.driver=back;
     
     PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClick_backdata() {
		return click_backdata;
	}

	public WebElement getClick_signout() {
		return click_signout;
	}

	public WebDriver driver;
     
	
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement click_backdata;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement click_signout;

}
