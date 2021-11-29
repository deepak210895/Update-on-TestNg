package com.pom_hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	public WebDriver driver;
	public Search_hotel(WebDriver ser_htl) {
		this.driver=ser_htl;
		PageFactory.initElements(driver, this);
		
	}
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getRoomnum() {
		return Roomnum;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getDate3() {
		return date3;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath="//select[@name='location']")
	private WebElement Location ;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement Hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement Roomtype ;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement Roomnum ;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement date ;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement date4 ;
	
	
	public WebElement getDate4() {
		return date4;
	}
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement date2;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement date3 ;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult_room;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child_room ;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search ;
	

}
