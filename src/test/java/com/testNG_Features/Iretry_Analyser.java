package com.testNG_Features;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iretry_Analyser {
	@Test(retryAnalyzer = Retry_cls.class)
	private void username() {
    String username="dee";
    String actualname="dee";
    Assert.assertEquals(username, actualname);
	}
	@Test(retryAnalyzer = Retry_cls.class)
	private void password() {
		String password="deepak123";
	    String actualpassword="deepak";
	    Assert.assertEquals(password, actualpassword);
	}

}
