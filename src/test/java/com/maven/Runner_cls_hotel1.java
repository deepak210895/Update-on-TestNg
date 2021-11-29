package com.maven;

import org.openqa.selenium.WebDriver;
import com.mavenproject.Basecls_hotel;
import com.pom_hotel.Book_hotel;
import com.pom_hotel.Booked_iteration;
import com.pom_hotel.Booking_conformation;
import com.pom_hotel.Login_pg;
import com.pom_hotel.Search_hotel;
import com.pom_hotel.Select_hotel;

public class Runner_cls_hotel1 extends Basecls_hotel {
public static WebDriver driver=Basecls_hotel.getBrowser("chrome");
public static Book_hotel book=new Book_hotel(driver);
public static Booked_iteration iteration=new Booked_iteration(driver);
public static Booking_conformation conformation=new Booking_conformation(driver);
public static Login_pg login=new Login_pg(driver);
public static Search_hotel search=new Search_hotel(driver);
public static Select_hotel select=new Select_hotel(driver);
	public static void main(String[]args) throws InterruptedException  {
		time();
		getUrl("https://adactinhotelapp.com/index.php");
		minimize();
		sendkey(login.getId(),"deepak1234");
		sendkey(login.getPsswd(),"deepak1234");
		clickon(login.getLogin());
		dropdown(search.getLocation(),"London","byvalue");
		dropdown(search.getHotel(),"Hotel Cornice","byvalue");
		dropdown(search.getRoomtype(),"Super Deluxe","byvalue");
		dropdown(search.getRoomnum(),"2","byvalue");  
		clear(search.getDate());
		sendkey(search.getDate4(),"21/11/2021");
		clear(search.getDate2());
		sendkey(search.getDate3(),"25/11/2021");
		dropdown(search.getAdult_room(),"2","byvalue");
		dropdown(search.getChild_room(),"1","byvalue");
		clickon(search.getSearch());
		clickon(select.getButton());
		clickon(select.getContinue1());
		sendkey(book.getName(),"deepak");
		sendkey(book.getLname(),"Tdek");
		sendkey(book.getAddress(),"deepak,chennai 12345");
		sendkey(book.getCnos(),"1234567890123456");
		dropdown(book.getCdetail(),"VISA","byvalue");
		dropdown(book.getCexp(),"3","byvalue");
		dropdown(book.getCyr(),"2020","byvalue");
		sendkey(book.getCvvnos(),"123");
		clickon(book.getBook());
		clickon(conformation.getClick1());
		clickon(iteration.getSall());
		clickon(iteration.getDeseall());
		alart();
		clickon(iteration.getLogot());
	   
}
}