package com.maven;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.mavenproject.Base_Cls;
import com.singleton_design_pattern.Page_Object_Manager;
import com.testdata.File_Reader_Manager;
import com.testdata.File_Reader_hotel;

public class Runnercls_clsdress3 extends Base_Cls{
	
	public static WebDriver driver = Base_Cls.getBrowser("chrome");
	public static Page_Object_Manager pom =new Page_Object_Manager(driver);
    static Logger log =Logger.getLogger(Runnercls_clsdress3.class);
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		time();
		maximize();
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		getURL(url);
		log.info("pass_url");
		clickOnElement(pom.getds().getClick_dress());
		clickOnElement(pom.getds().getClick1_img());
		clickOnElement(pom.getds().getClick_qty());
		String size = File_Reader_Manager.getInstanceFRM().getInstanceCR().getsize();
		selectbyindex(pom.getds().getClick_size(),size);
		clickOnElement(pom.getds().getClick_cart());
		clickOnElement(pom.getptc().getClick_summary());
		clickOnElement(pom.getptc().getClick_element());
		String name = File_Reader_hotel.getInstanceFRM().getInstanceCR().getusername();
		String getusername = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		inputValue(pom.getlp().getEmail(),getusername);
		String getpassword = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpassword();
		inputValue(pom.getlp().getPasswrd(),getpassword);
         
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
