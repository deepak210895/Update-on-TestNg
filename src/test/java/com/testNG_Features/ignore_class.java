package com.testNG_Features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignore_class {
  @Test
  public void name() {
	  System.out.println("dee");
  }
  @Test
  public void name1() {
	  System.out.println("kumar");
  }
  @Ignore
  @Test
  public void name2() {
	  System.out.println("man");
  }
  @Test(enabled=false)
  public void name3() {
	  System.out.println("kandan");
  }
}
