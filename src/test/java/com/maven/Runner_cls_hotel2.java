package com.maven;

import org.openqa.selenium.WebDriver;

import com.mavenproject.Basecls_hotel;
import com.singleton_design_pattern.page_object_manager_hotel;

public class Runner_cls_hotel2 extends Basecls_hotel{

	public static WebDriver driver=Basecls_hotel.getBrowser("chrome");
	public static page_object_manager_hotel pom=new page_object_manager_hotel(driver);

		public static void main(String[]args) throws InterruptedException  {
			time();
			getUrl("https://adactinhotelapp.com/index.php");
			minimize();
			sendkey(pom.l().getId(),"deepak1234");
			sendkey(pom.l().getPsswd(),"deepak1234");
			clickon(pom.l().getLogin());
			dropdown(pom.sh().getLocation(),"London","byvalue");
			dropdown(pom.sh().getHotel(),"Hotel Cornice","byvalue");
			dropdown(pom.sh().getRoomtype(),"Super Deluxe","byvalue");
			dropdown(pom.sh().getRoomnum(),"2","byvalue");  
			clear(pom.sh().getDate());
			sendkey(pom.sh().getDate4(),"21/11/2021");
			clear(pom.sh().getDate2());
			sendkey(pom.sh().getDate3(),"25/11/2021");
			dropdown(pom.sh().getAdult_room(),"2","byvalue");
			dropdown(pom.sh().getChild_room(),"1","byvalue");
			clickon(pom.sh().getSearch());
			clickon(pom.sel().getButton());
			clickon(pom.sel().getContinue1());
			sendkey(pom.getbk().getName(),"deepak");
			sendkey(pom.getbk().getLname(),"Tdek");
			sendkey(pom.getbk().getAddress(),"deepak,chennai 12345");
			sendkey(pom.getbk().getCnos(),"1234567890123456");
			dropdown(pom.getbk().getCdetail(),"VISA","byvalue");
			dropdown(pom.getbk().getCexp(),"3","byvalue");
			dropdown(pom.getbk().getCyr(),"2020","byvalue");
			sendkey(pom.getbk().getCvvnos(),"123");
			clickon(pom.getbk().getBook());
			clickon(pom.bc().getClick1());
			clickon(pom.getbi().getSall());
			clickon(pom.getbi().getDeseall());
			alart();
			clickon(pom.getbi().getLogot());
		   
	}
	}
