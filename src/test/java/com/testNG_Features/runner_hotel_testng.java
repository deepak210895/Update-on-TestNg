package com.testNG_Features;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import com.maven.Runnercls_hotel4;
import com.mavenproject.Basecls_hotel;
import com.singleton_design_pattern.page_object_manager_hotel;
import com.testdata.File_Reader_hotel;

public class runner_hotel_testng extends Basecls_hotel {
	public static WebDriver driver=Basecls_hotel.getBrowser("chrome");
	public static page_object_manager_hotel pom=new page_object_manager_hotel(driver);
	static Logger log = Logger.getLogger(Runnercls_hotel4.class);
    @BeforeTest
    private void setproperty() throws Throwable {
	PropertyConfigurator.configure("log4j.properties");
	time();
	String url = File_Reader_hotel.getInstanceFRM().getInstanceCR().geturl();
	getUrl(url);
	minimize();
	log.info("step to user name");
    }
	@Test(priority = -2,groups = "data and login")
	private void login() throws IOException {
	String data_excel = data_excel("C:\\Users\\ELCOT\\eclipse-workspace\\maven\\Adapting_hotel.xlsx", 1, 5);
	sendkey(pom.l().getId(),data_excel);
			
	String data_excel2 = data_excel("C:\\Users\\ELCOT\\eclipse-workspace\\maven\\Adapting_hotel.xlsx", 2, 5);
	sendkey(pom.l().getPsswd(),data_excel2);
	}
	@Test(priority = -1,groups = "data and login")
	private void click() {
	clickon(pom.l().getLogin());
	}
	@Test(priority = 1,enabled = true)
	private void search() throws Throwable {
	String location = File_Reader_hotel.getInstanceFRM().getInstanceCR().location();
	dropdown(pom.sh().getLocation(),location,"byvalue");
	String hotel = File_Reader_hotel.getInstanceFRM().getInstanceCR().gethotel();
	dropdown(pom.sh().getHotel(),hotel,"byvalue");
	String roomtype = File_Reader_hotel.getInstanceFRM().getInstanceCR().getroomtype();
	dropdown(pom.sh().getRoomtype(),roomtype,"byvalue");
	String roomnum = File_Reader_hotel.getInstanceFRM().getInstanceCR().getroomnum();
	dropdown(pom.sh().getRoomnum(),roomnum,"byvalue");  
	clear(pom.sh().getDate());
	String date1 = File_Reader_hotel.getInstanceFRM().getInstanceCR().getdate1();
	sendkey(pom.sh().getDate4(),date1);
	clear(pom.sh().getDate2());
	String date2 = File_Reader_hotel.getInstanceFRM().getInstanceCR().getdate2();
	sendkey(pom.sh().getDate3(),date2);
	String aroom = File_Reader_hotel.getInstanceFRM().getInstanceCR().getaroom();
	dropdown(pom.sh().getAdult_room(),aroom,"byvalue");
	String croom = File_Reader_hotel.getInstanceFRM().getInstanceCR().getcroom();
	dropdown(pom.sh().getChild_room(),croom,"byvalue");
	clickon(pom.sh().getSearch());
	}
	@Test(priority = 2,timeOut = 3000)
	private void select() {
	clickon(pom.sel().getButton());
	thread(500);
	clickon(pom.sel().getContinue1());
	}
	@Test(priority = 3)
	private void book() throws Throwable {
	String name1 = File_Reader_hotel.getInstanceFRM().getInstanceCR().getname();
	sendkey(pom.getbk().getName(),name1);
	String lname = File_Reader_hotel.getInstanceFRM().getInstanceCR().getLname();
	sendkey(pom.getbk().getLname(),lname);
	String address = File_Reader_hotel.getInstanceFRM().getInstanceCR().getaddress();
	sendkey(pom.getbk().getAddress(),address);
	String cnos = File_Reader_hotel.getInstanceFRM().getInstanceCR().getcnos();
	sendkey(pom.getbk().getCnos(),cnos);
	String cdetail = File_Reader_hotel.getInstanceFRM().getInstanceCR().getcdetail();
	dropdown(pom.getbk().getCdetail(),cdetail,"byvalue");
	String cexp = File_Reader_hotel.getInstanceFRM().getInstanceCR().getcexp();
	dropdown(pom.getbk().getCexp(),cexp,"byvalue");
	String cyr = File_Reader_hotel.getInstanceFRM().getInstanceCR().getcyr();
	dropdown(pom.getbk().getCyr(),cyr,"byvalue");
	String cvvnos = File_Reader_hotel.getInstanceFRM().getInstanceCR().getcvvnos();
	sendkey(pom.getbk().getCvvnos(),cvvnos);
	clickon(pom.getbk().getBook());
	}
	@Test(priority = 4)
	private void bc() {
	clickon(pom.bc().getClick1());
	}
	@Test(priority = 5,invocationCount = 3)
    private void bookiteration() {
	clickon(pom.getbi().getSall());
	
	}
	@Test(priority = 6,timeOut = 4000)
	private void deselect() {
	clickon(pom.getbi().getDeseall());
	alart();
	
	clickon(pom.getbi().getLogot());
	thread(2000);
	}   
}

