package com.maven;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.mavenproject.Basecls_hotel;
import com.singleton_design_pattern.page_object_manager_hotel;
import com.testdata.File_Reader_hotel;

public class Runnercls_hotel3 extends Basecls_hotel {
	public static WebDriver driver=Basecls_hotel.getBrowser("chrome");
	public static page_object_manager_hotel pom=new page_object_manager_hotel(driver);
    static Logger log =Logger.getLogger(Runnercls_hotel3.class); 
		public static void main(String[]args) throws Throwable  {
			PropertyConfigurator.configure("log4j.properties");
			time();
			String url = File_Reader_hotel.getInstanceFRM().getInstanceCR().geturl();
			getUrl(url);
			log.info("pass url");
			minimize();
			String name = File_Reader_hotel.getInstanceFRM().getInstanceCR().getusername();
			sendkey(pom.l().getId(),name);
			String password = File_Reader_hotel.getInstanceFRM().getInstanceCR().getpassword();
			sendkey(pom.l().getPsswd(),password);
			clickon(pom.l().getLogin());
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
			clickon(pom.sel().getButton());
			clickon(pom.sel().getContinue1());
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
			clickon(pom.bc().getClick1());
			clickon(pom.getbi().getSall());
			clickon(pom.getbi().getDeseall());
			alart();
			clickon(pom.getbi().getLogot());
		   
	}
}
