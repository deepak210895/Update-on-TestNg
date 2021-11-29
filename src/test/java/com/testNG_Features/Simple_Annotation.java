package com.testNG_Features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Simple_Annotation {
	@BeforeSuite
    private void setproperty() {
		System.out.println("setproperty");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("browserLaunch");
	}
	@BeforeClass
	private void url() {
     System.out.println("url");
	}
	 @BeforeMethod
	  private void signin() {
	   System.out.println("signin");
	}
	@Ignore
  @Test(priority = 0)
  private void women() {
   System.out.println("women");
}
  @AfterMethod
  private void signout() {
   System.out.println("signout");
}
  @Test(priority = 1)
  private void dress() {
   System.out.println("dress");
}
  @Test(priority = 2)
  private void tshirt() {
     System.out.println("tshirt");
}
  @AfterClass
  private void homepg() {
    System.out.println("homepg");
}
  @AfterTest
  private void close() {
    System.out.println("close");
}
  @AfterSuite
  private void cookies() {
   System.out.println("Delete cookies");
}
  
}
