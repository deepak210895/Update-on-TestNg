package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mavenproject.Basecls_hotel;

public class Runnercls_Hotel extends Basecls_hotel{
	public static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException  {
		
		driver = getBrowser("chrome");
		
		time();
		
		getUrl("https://adactinhotelapp.com/index.php");
		minimize();
		
	   WebElement id = driver.findElement(By.xpath("//input[@type='text']"));
	   sendkey(id,"deepak1234");
	   
	   WebElement psswd = driver.findElement(By.xpath("//input[@type='password']"));
	   sendkey(psswd,"deepak1234");
	   
	   
	   WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
	   clickon(login);
	   
      WebElement Location = driver.findElement(By.xpath("//select[@name='location']"));
      dropdown(Location,"London","byvalue"); 
	   
       WebElement Hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
	   dropdown(Hotel,"Hotel Cornice","byvalue");
	   
       WebElement Roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
	   dropdown(Roomtype,"Super Deluxe","byvalue");
	   
       WebElement Roomnum = driver.findElement(By.xpath("//select[@name='room_nos']"));
	   dropdown(Roomnum,"2","byvalue");
	   
	   WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	   clear(date);
	   WebElement date4 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	   sendkey(date4,"21/11/2021");
	   
	   WebElement date2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	   clear(date2);
	   
	   WebElement date3 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	   sendkey(date3,"25/11/2021");
	   
       WebElement adult_room = driver.findElement(By.xpath("//select[@name='adult_room']"));
       dropdown(adult_room,"2","byvalue");
	   
       WebElement child_room = driver.findElement(By.xpath("//select[@name='child_room']"));
       dropdown(child_room,"1","byvalue");
	  
	   
	   WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	   clickon(search);
	  
	   WebElement button = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	   clickon(button);
	  
	   WebElement continue1 = driver.findElement(By.xpath("//input[@type='submit']"));
	   clickon(continue1);
	  
	   WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
	   sendkey(name,"deepak");
	  
	   WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
	   sendkey(lname,"Tdek");
	  
	   WebElement address  = driver.findElement(By.xpath("//textarea[@name='address']"));
	   sendkey(address,"deepak,chennai 12345");
	  
	   WebElement cnos = driver.findElement(By.xpath("//input[@name='cc_num']"));
	   sendkey(cnos,"1234567890123456");
	   
       WebElement cdetail = driver.findElement(By.xpath("//select[@name='cc_type']"));
       dropdown(cdetail,"VISA","byvalue");
	 
      WebElement cexp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	   dropdown(cexp,"3","byvalue");
	 
      WebElement cyr = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	   dropdown(cyr,"2020","byvalue");
	   
	   WebElement cvvnos  = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	   sendkey(cvvnos,"123");
	   
	   WebElement book  = driver.findElement(By.xpath("//input[@type='button']"));
	   clickon(book);
	   
	   WebElement click1  = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
	   clickon(click1);
	   
	   WebElement sall = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	   clickon(sall);
	  thread(1000);
	  
	  WebElement deseall = driver.findElement(By.xpath("//input[@name='cancelall']"));
	  clickon(deseall);
	  
	  alart();
	  
	  WebElement logot = driver.findElement(By.xpath("//input[@name='logout']"));
	  clickon(logot);
	   
}


}
