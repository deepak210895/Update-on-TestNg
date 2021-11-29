package com.maven;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.mavenproject.Base_Cls;
import com.singleton_design_pattern.Page_Object_Manager;

public class Runner_clsdress2 extends Base_Cls{
	public static WebDriver driver = Base_Cls.getBrowser("chrome");
	public static Page_Object_Manager pom =new Page_Object_Manager(driver);
	public static void main(String[] args) throws IOException, InterruptedException {
		time();
		maximize();
		getURL("http://automationpractice.com/index.php");
		clickOnElement(pom.getds().getClick_dress());
		clickOnElement(pom.getds().getClick1_img());
		clickOnElement(pom.getds().getClick_qty());
		selectbyindex(pom.getds().getClick_size(), "2");
		clickOnElement(pom.getds().getClick_cart());
		clickOnElement(pom.getptc().getClick_summary());
		clickOnElement(pom.getptc().getClick_element());
		inputValue(pom.getlp().getEmail(), "deepk12345@gmail.com");
		inputValue(pom.getlp().getPasswrd(), "deepak1234");
		clickOnElement(pom.getlp().getSubmit());
		thread(2000);
		clickOnElement(pom.getad().getClick_address());
		clickOnElement(pom.getCk().getClick_checkbox());
		clickOnElement(pom.getsh().getClick_shipping());
		clickOnElement(pom.getpy().getClick_payment());
		clickOnElement(pom.getcn().getClick_completed());
		screenshot();
		clickOnElement(pom.getbk().getClick_backdata());
		clickOnElement(pom.getbk().getClick_signout());
	}
}

