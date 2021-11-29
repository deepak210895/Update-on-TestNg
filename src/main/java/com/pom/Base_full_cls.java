package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Base_full_cls {
	
	public WebDriver driver;
	
	@FindBy(xpath ="(//a[@title='T-shirts'])[2]")
			private WebElement click_dress;
	
	@FindBy(xpath ="//img[@class='replace-2x img-responsive']")
	private WebElement click1_img;
	
	@FindBy(xpath ="//i[@class='iconplus']")
	private WebElement click_qty;
	
	@FindBy(xpath ="//select[@name='group_1']")
	private WebElement click_size;
	
	@FindBy(xpath ="(//span)[53]")
	private WebElement click_cart;
	
	@FindBy(xpath ="//a[@title='Proceed to checkout']")
	private WebElement click_summary;
	
	@FindBy(xpath ="(//a[@title='Proceed to checkout'])[2]")
	private WebElement click_element;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath ="//input[@name='passwd']")
	private WebElement passwrd;
	
	@FindBy(xpath ="(//button[@type='submit'])[3]")
	private WebElement submit;
	
	@FindBy(xpath="(//span)[44]")
	private WebElement click_address;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement click_checkbox;
	
	@FindBy(xpath="(//span)[38]")
	private WebElement click_shipping;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement click_payment;
	
	@FindBy(xpath="(//span)[36]")
	private WebElement click_completed;
	
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement click_backdata;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement click_signout;
	
}
