package com.pom_hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_conformation {
	public WebDriver driver;
	public Booking_conformation(WebDriver conformation) {
		this.driver=conformation;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement click1 ;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClick1() {
		return click1;
	}

}
