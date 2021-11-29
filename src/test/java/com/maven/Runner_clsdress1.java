package com.maven;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import com.mavenproject.Base_Cls;
import com.pom.address_pg;
import com.pom.backdata_pg;
import com.pom.checkbox_pg;
import com.pom.contine_pg;
import com.pom.dress_select;
import com.pom.login_page;
import com.pom.payment_pg;
import com.pom.proced_to_cart;
import com.pom.shipping_pg;

public class Runner_clsdress1 extends Base_Cls {
	public static WebDriver driver = Base_Cls.getBrowser("chrome");
	public static dress_select dress = new dress_select(driver);
	public static proced_to_cart cart = new proced_to_cart(driver);
	public static login_page login = new login_page(driver);
	public static address_pg address = new address_pg(driver);
	public static shipping_pg shipp = new shipping_pg(driver);
	public static checkbox_pg check = new checkbox_pg(driver);
	public static payment_pg pay = new payment_pg(driver);
	public static contine_pg contine = new contine_pg(driver);
	public static backdata_pg back = new backdata_pg(driver);
	public static void main(String[] args) throws IOException, InterruptedException {
		time();
		maximize();
		getURL("http://automationpractice.com/index.php");
		clickOnElement(dress.getClick_dress());
		clickOnElement(dress.getClick1_img());
		clickOnElement(dress.getClick_qty());
		selectbyindex(dress.getClick_size(), "2");
		clickOnElement(dress.getClick_cart());
		clickOnElement(cart.getClick_summary());
		clickOnElement(cart.getClick_element());
		inputValue(login.getEmail(), "deepk12345@gmail.com");
		inputValue(login.getPasswrd(), "deepak1234");
		clickOnElement(login.getSubmit());
		thread(2000);
		clickOnElement(address.getClick_address());
		clickOnElement(check.getClick_checkbox());
		clickOnElement(shipp.getClick_shipping());
		clickOnElement(pay.getClick_payment());
		clickOnElement(contine.getClick_completed());
		screenshot();
		clickOnElement(back.getClick_backdata());
		clickOnElement(back.getClick_signout());
	}
}
