package com.pom_hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Base_fullcls_hotel {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement id ;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement psswd ;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement login ;
	
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
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement button;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continue1;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement name;
	
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement cnos ;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cdetail ;
	
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement cexp ;
	
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement cyr;
	
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvnos ;
	
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement book;
	
	
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement click1 ;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement sall;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement deseall ;
	
	@FindBy(xpath="(//input[@type='button'])[3]")
	private WebElement logot;
	
	
}
