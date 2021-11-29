package com.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader_hotel {
	public static Properties p;
	
	public Configuration_Reader_hotel() throws Throwable {File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\maven\\src\\main\\java\\com\\properties\\Configurationhotel.properties");
	
    FileInputStream fi=new FileInputStream(f);
    p=new Properties();
    p.load(fi);
	}
	public String geturl() {
      String url = p.getProperty("url");
      return url;
	}
	public String getusername() {
		String name = p.getProperty("username");
		return name;
    
	}
	public String getpassword() {
       String psw = p.getProperty("password");
       return psw;
	}
	public String location() {
	       String l = p.getProperty("location");
	       return l;
		}
	public String gethotel() {
	       String h = p.getProperty("hotel");
	       return h;
		}
	public String getroomtype() {
		String rt = p.getProperty("roomtype");
		return rt;
    
	}
	public String getroomnum() {
       String rn = p.getProperty("roomnum");
       return rn;
	}
	public String getdate1() {
	       String d1 = p.getProperty("date1");
	       return d1;
		}
	public String getdate2() {
	       String d2 = p.getProperty("date2");
	       return d2;
		}
	public String getaroom() {
		String ar = p.getProperty("aroom");
		return ar;
    
	}
	public String getcroom() {
       String cr = p.getProperty("croom");
       return cr;
	}
	public String getname() {
	       String n = p.getProperty("getname");
	       return n;
		}
	public String getLname() {
	       String ln = p.getProperty("getLname");
	       return ln;
		}
	public String getaddress() {
	       String add = p.getProperty("address");
	       return add;
		}
		public String getcnos() {
		       String cn = p.getProperty("cno");
		       return cn;
			}
		public String getcdetail() {
		       String cd = p.getProperty("cdetail");
		       return cd;
			}
		public String getcexp() {
			String ce = p.getProperty("cexp");
			return ce;
	    
		}
		public String getcyr() {
	       String cy = p.getProperty("cyr");
	       return cy;
		}
		public String getcvvnos() {
		       String cv = p.getProperty("cvvnos");
		       return cv;
			}
	
	
	

}
