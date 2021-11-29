package com.testNG_Features;

import org.testng.annotations.Test;

public class Timeout_cls1 {
	@Test(timeOut = 5000)
	private void login() throws InterruptedException {
     System.out.println("browser lanch");
     Thread.sleep(1000);
	 System.out.println("use enter credential");
	 Thread.sleep(2000);
	 System.out.println("click on button");
	 Thread.sleep(2000);
	}
}
