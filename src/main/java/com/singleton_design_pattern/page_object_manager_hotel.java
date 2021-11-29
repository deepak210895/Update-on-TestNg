package com.singleton_design_pattern;

import java.awt.print.Book;

import org.openqa.selenium.WebDriver;

import com.pom_hotel.Base_fullcls_hotel;
import com.pom_hotel.Book_hotel;
import com.pom_hotel.Booked_iteration;
import com.pom_hotel.Booking_conformation;
import com.pom_hotel.Login_pg;
import com.pom_hotel.Search_hotel;
import com.pom_hotel.Select_hotel;

public class page_object_manager_hotel {
	public WebDriver driver;
	
    public page_object_manager_hotel(WebDriver driver3) {
     this.driver =driver3;
    }
    private Book_hotel bk; 
	public  Book_hotel getbk() {
    	if(bk==null) {
       bk=new Book_hotel(driver);
    	}
		return bk;
    	
    }
	  private Booked_iteration bi; 
		public  Booked_iteration getbi() {
	    	if(bi==null) {
	       bi=new Booked_iteration(driver);
	    	}
			return bi;
	    	
	    }
		private Login_pg l;
		public  Login_pg l() {
			if(l==null) {
         l=new Login_pg(driver);
			    	}
		return l;
			    	
			

		}
		
		private Booking_conformation bc;
		public  Booking_conformation bc() {
	    	if(bc==null) {
	    		bc=new Booking_conformation(driver);
	    	}
			return bc;
	    	
	    }
		private Search_hotel sh;
		public  Search_hotel sh() {
	    	if(sh==null) {
	    		sh=new Search_hotel(driver);
	    	}
			return sh;
	    	
	    }
		private Select_hotel sel;
		public  Select_hotel sel() {
	    	if(sel==null) {
	       sel=new Select_hotel(driver);
	    	}
			return sel;
	    	
	    }
		
}
	

