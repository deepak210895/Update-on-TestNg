package com.pom_hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
	public WebDriver driver;
	public Book_hotel(WebDriver bk_ht) {
		
		this.driver=bk_ht;
		PageFactory.initElements(driver, this);
		
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getName() {
		return name;
	}


	public WebElement getLname() {
		return lname;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCnos() {
		return cnos;
	}


	public WebElement getCdetail() {
		return cdetail;
	}


	public WebElement getCexp() {
		return cexp;
	}


	public WebElement getCyr() {
		return cyr;
	}


	public WebElement getCvvnos() {
		return cvvnos;
	}


	public WebElement getBook() {
		return book;
	}


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
	
	

}
