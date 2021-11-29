package com.pom_hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_iteration {
	public WebDriver driver;
	public Booked_iteration(WebDriver iteration) {
		this.driver=iteration;
		PageFactory.initElements(driver,this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSall() {
		return sall;
	}

	public WebElement getDeseall() {
		return deseall;
	}

	public WebElement getLogot() {
		return logot;
	}

	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement sall;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement deseall ;
	
	@FindBy(xpath="//input[@name='logout']")
	private WebElement logot;
	

}
