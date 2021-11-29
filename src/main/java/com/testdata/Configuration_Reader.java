package com.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
public static Properties p;
	
	public Configuration_Reader() throws IOException {
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\mavenproject\\src\\main\\java\\com\\properties\\Configuration.properties");
		
      FileInputStream fi=new FileInputStream(f);
      p=new Properties();
      p.load(fi);
      
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
    
	}
	public String getusername() {
       String user = p.getProperty("username");
       return user;
	}
	public String getpassword() {
	       String psw = p.getProperty("password");
	       return psw;
		}
	public String getsize() {
	       String sz = p.getProperty("size");
	       return sz;
		}


}