package com.mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basecls_hotel {
	
	public static WebDriver driver;
	public static String stringCellValue;
	
	public static WebDriver getBrowser(String method) {
		 if (method.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			 driver=new ChromeDriver();
			
		}
		 else if (method.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			 driver=new FirefoxDriver();
			
		} 
		return driver;
	}
	
     public static void time() {
    	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  	   
	}
     
     public static void getUrl(String url) {
       driver.get(url);
	}
     public static void minimize() {
    	 driver.manage().window().maximize();
  	   
	}
     public static void sendkey(WebElement element,String value) {
    	 element.sendKeys(value);
     }
     public static void clickon(WebElement element) {
    	 element.click();
     }
     public static void dropdown(WebElement element,String value,String type) {
    	 Select a =new Select(element);
    	 if (type.equalsIgnoreCase("byvalue")) {
    		 a.selectByValue(value);			
		} else if (type.equalsIgnoreCase("byindex")) {
			int index=Integer.parseInt(value);
		   a.selectByIndex(index);	
		}
		else if (type.equalsIgnoreCase("by.visibletext")) {
			a.selectByVisibleText(value);
			
		}
    	 
	}
     public static void clear(WebElement element) {
    	 element.clear();
    	 
     }
     public static void action() {
      Actions a =new Actions(driver);
      
	}
     public static void thread(int milli) {
     try {
    	 Thread.sleep(milli);
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}
     
     public static  void alart() {
    	 driver.switchTo().alert().accept();
  	   
	}
     public static String data_excel(String path,int row,int cell) throws IOException  {
		  File f=new File(path);
		  FileInputStream fi=new FileInputStream(f);
		  Workbook w=new XSSFWorkbook(fi);
		  Sheet sheetAt = w.getSheetAt(0);
		  Row row2 = sheetAt.getRow(row);
		  Cell cell2 = row2.getCell(cell);
		  CellType cellType = cell2.getCellType();
		  if (cellType.equals(CellType.STRING)) {
			   stringCellValue = cell2.getStringCellValue();	
		}
		  else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell2.getNumericCellValue();
		  int val=(int) numericCellValue;
		   stringCellValue = cell2.getStringCellValue();
		  
		  }
		  return stringCellValue;
	  }
     

}
