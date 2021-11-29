package com.testNG_Features;

import org.testng.annotations.Test;

public class Priority_cls {
	
	@Test(priority = -1)
	private void setproperty() {
   System.out.println("setproperty");
	}
	

	@Test
	private void url() {
   System.out.println("url");
	}
	@Test(priority = 1)
	private void windowmaximize() {
   System.out.println("windowmaximize");
	
	
	}

}
