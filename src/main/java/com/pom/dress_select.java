package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dress_select {
	public WebDriver driver;
    
	
	public dress_select(WebDriver drs) {
	this.driver = drs;
	
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="(//a[@title='T-shirts'])[2]")
	private WebElement click_dress;

    public WebDriver getDriver() {
		return driver;
	}

	public WebElement getClick_dress() {
		return click_dress;
	}

	public WebElement getClick1_img() {
		return click1_img;
	}

	public WebElement getClick_qty() {
		return click_qty;
	}

	public WebElement getClick_size() {
		return click_size;
	}

	public WebElement getClick_cart() {
		return click_cart;
	}

	@FindBy(xpath ="//img[@class='replace-2x img-responsive']")
    private WebElement click1_img;

    @FindBy(xpath ="//i[@class='icon-plus']")
    private WebElement click_qty;

     @FindBy(xpath ="//select[@name='group_1']")
     private WebElement click_size;

     @FindBy(xpath ="(//span)[53]")
     private WebElement click_cart;

}
