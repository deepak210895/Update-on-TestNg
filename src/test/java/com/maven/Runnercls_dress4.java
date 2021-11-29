package com.maven;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.mavenproject.Base_Cls;
import com.singleton_design_pattern.Page_Object_Manager;
import com.testdata.File_Reader_Manager;

public class Runnercls_dress4 extends Base_Cls{
	public static WebDriver driver = Base_Cls.getBrowser("chrome");
	public static Page_Object_Manager pom =new Page_Object_Manager(driver);
    static Logger log =Logger.getLogger(Runnercls_clsdress3.class);
	public static void main(String[] args) throws IOException, InterruptedException {
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
        String data_excel = data_excel("C:\\Users\\ELCOT\\eclipse-workspace\\maven\\Testcase for automaton.xlsx", 7, 5);
        inputValue(pom.getlp().getEmail(),data_excel);
		String data_excel2 = data_excel("C:\\Users\\ELCOT\\eclipse-workspace\\maven\\Testcase for automaton.xlsx", 8, 5);
        inputValue(pom.getlp().getPasswrd(),data_excel2);
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
