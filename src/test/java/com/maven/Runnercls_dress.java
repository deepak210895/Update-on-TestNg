package com.maven;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mavenproject.Base_Cls;

public class Runnercls_dress extends Base_Cls {
	public static WebDriver driver;//null

	public static void main(String[] args) throws IOException, InterruptedException {

		driver = getBrowser("chrome");

		time();

		getURL("http://automationpractice.com/index.php");

		maximize();

		WebElement clickdress = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		clickOnElement(clickdress);

		WebElement clickimage = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive']"));
		clickOnElement(clickimage);
		thread(2000);

		WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		clickOnElement(quantity);

		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		selectbyindex(size, "2");

		WebElement clickcart = driver.findElement(By.xpath("(//span)[53]"));
		clickOnElement(clickcart);

		// summary proced

		WebElement clicksummary = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickOnElement(clicksummary);

		WebElement clickonelement = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickOnElement(clickonelement);

		// sign in
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		inputValue(email, "deepk12345@gmail.com");

		WebElement passwrd = driver.findElement(By.xpath("//input[@name='passwd']"));
		inputValue(passwrd, "deepak1234");

		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickOnElement(submit);

		// address
		WebElement clickaddress = driver.findElement(By.xpath("(//span)[44]"));
		clickOnElement(clickaddress);

		// agree button
		WebElement clickcheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickOnElement(clickcheckbox);
		// shipping procced

		WebElement clickshipping = driver.findElement(By.xpath("(//span)[38]"));
		clickOnElement(clickshipping);

		// payment
		WebElement clickpayment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		clickOnElement(clickpayment);

		// completed
		WebElement clickcompleted = driver.findElement(By.xpath("(//span)[36]"));
		clickOnElement(clickcompleted);
		screenshot();

		WebElement backdata = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		clickOnElement(backdata);

		WebElement signout = driver.findElement(By.xpath("//a[@class='logout']"));
		clickOnElement(signout);
	}
}
