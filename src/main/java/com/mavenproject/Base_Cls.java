package com.mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Cls {
	public static String stringCellValue;

	public static WebDriver driver;

	public static WebDriver getBrowser(String method) {
		if (method.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			driver =  new ChromeDriver();
			
		}
		else if (method.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		return driver;
		
		
		
		
	}
	 public static void clickOnElement(WebElement element) {
		element.click();

	}
	 public static void inputValue(WebElement element,String value) {
		 element.sendKeys(value);

	}
	 public static void selectbyindex(WebElement size,String two) {
		 
		 Select s=new Select(size);
	       s.selectByValue(two);
	}
	 
	 public static void getURL(String Url) {
	 driver.get(Url);
	 }
	 
	 public static void maximize() {
	 driver.manage().window().maximize();
	 }
	 
	 public static void time() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 }
	 public static void screenshot() throws IOException {
		    TakesScreenshot s=(TakesScreenshot)driver;
			File f =s.getScreenshotAs(OutputType.FILE);
			File f1= new File("C:\\Users\\ELCOT\\eclipse-workspace\\mavenproject\\Screenshot.png");
			FileUtils.copyFile(f,f1);
			

	}
	 public static void  thread(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
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
