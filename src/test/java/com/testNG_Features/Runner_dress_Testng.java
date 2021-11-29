package com.testNG_Features;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.maven.Runnercls_clsdress3;
import com.mavenproject.Base_Cls;
import com.singleton_design_pattern.Page_Object_Manager;
import com.testdata.File_Reader_Manager;

public class Runner_dress_Testng extends Base_Cls {
	public static WebDriver driver = Base_Cls.getBrowser("chrome");
public static Page_Object_Manager pom =new Page_Object_Manager(driver);
static Logger log =Logger.getLogger(Runnercls_clsdress3.class);
	@BeforeClass
	private void setproperty() {
		
	PropertyConfigurator.configure("log4j.properties");
	time();
	}
	@Test(priority=-1,groups = "url and purchus")
	private void url() throws IOException {
	maximize();
	String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
	getURL(url);
	log.info("pass_url");
	}
	@Test(priority=0,timeOut =15000 ,groups = "url and purchus")
	private void dress() throws IOException, InterruptedException {

	clickOnElement(pom.getds().getClick_dress());
	
	clickOnElement(pom.getds().getClick1_img());

	clickOnElement(pom.getds().getClick_qty());

	String size = File_Reader_Manager.getInstanceFRM().getInstanceCR().getsize();
	
	selectbyindex(pom.getds().getClick_size(),size);
	
	clickOnElement(pom.getds().getClick_cart());
	}
	@Test(priority=1,enabled = true)
	private void summary() {
	clickOnElement(pom.getptc().getClick_summary());
	}
	@Test(priority=2)
	private void element() {
	clickOnElement(pom.getptc().getClick_element());
	}
	@Test(priority=3)
	private void login() throws IOException {
    String data_excel = data_excel("C:\\Users\\ELCOT\\eclipse-workspace\\maven\\Testcase for automaton.xlsx", 7, 5);
    inputValue(pom.getlp().getEmail(),data_excel);
	String data_excel2 = data_excel("C:\\Users\\ELCOT\\eclipse-workspace\\maven\\Testcase for automaton.xlsx", 8, 5);
    inputValue(pom.getlp().getPasswrd(),data_excel2);
	clickOnElement(pom.getlp().getSubmit());
	}
	@Test(priority=4)
	private void address() throws InterruptedException {
	thread(2000);
	clickOnElement(pom.getad().getClick_address());
	}
	@Test(priority=5)
	private void checkbox() {
	clickOnElement(pom.getCk().getClick_checkbox());
	}
	@Test(priority=6)
	private void shipping() {
	clickOnElement(pom.getsh().getClick_shipping());
	}
	@Test(priority=7)
	private void paymentTest() {
	clickOnElement(pom.getpy().getClick_payment());
	}
	@Test(priority=8)
	private void completed() throws IOException {
	clickOnElement(pom.getcn().getClick_completed());
	screenshot();
	}
	@AfterClass
	private void backdata() {
	clickOnElement(pom.getbk().getClick_backdata());
	
	clickOnElement(pom.getbk().getClick_signout());
	}
}


