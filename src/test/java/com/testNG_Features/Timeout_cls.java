package com.testNG_Features;

import org.testng.annotations.Test;

public class Timeout_cls {
	@Test(timeOut = 2000)
	private void login() throws InterruptedException {
     System.out.println("browser lanch");
     Thread.sleep(1000);
	 System.out.println("use enter credential");
	 System.out.println("click on button");
	}

}
