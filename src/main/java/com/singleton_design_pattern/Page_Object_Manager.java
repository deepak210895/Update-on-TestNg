package com.singleton_design_pattern;

import org.openqa.selenium.WebDriver;

import com.pom.address_pg;
import com.pom.backdata_pg;
import com.pom.checkbox_pg;
import com.pom.contine_pg;
import com.pom.dress_select;
import com.pom.login_page;
import com.pom.payment_pg;
import com.pom.proced_to_cart;
import com.pom.shipping_pg;

public class Page_Object_Manager {
	
	public WebDriver driver;
	private address_pg ad; 
    public Page_Object_Manager(WebDriver driver3) {
     this.driver =driver3;
    }
	public  address_pg getad() {
    	if(ad==null) {
       ad=new address_pg(driver);
    	}
		return ad;
    	
    }
	private backdata_pg bk;
	public backdata_pg getbk() {
		if(bk==null) {
		bk=new backdata_pg(driver);
		}
		return bk;
	}
	private checkbox_pg ck;
	public checkbox_pg getCk() {
		if(ck==null) {
	    ck=new checkbox_pg(driver);
		}
		return ck;
	}
    private contine_pg cn;
    public contine_pg getcn() {
    	if(cn==null) {
    		cn=new contine_pg(driver);
    	}
		return cn;
    }
    private dress_select ds;
    public dress_select getds() {
    	if(ds==null) {
    		ds=new dress_select(driver);
    	}
		return ds;
    }
    private login_page lp;
    public login_page getlp() {
    	if(lp==null) {
    		lp=new login_page(driver);
    	}
		return lp;
    }
    private payment_pg py;
    public payment_pg getpy() {
    	if(py==null) {
    		py=new payment_pg(driver);
    	}
		return py;
    }
    private proced_to_cart ptc;
    public proced_to_cart getptc() {
    	if(ptc==null) {
    		ptc=new proced_to_cart(driver);
    	}
		return ptc;
    	
    }
    private shipping_pg sh;
    public shipping_pg getsh() {
    	if(sh==null) {
    		sh=new shipping_pg(driver);
    	}
		return sh;
    	
    }
    	  }

