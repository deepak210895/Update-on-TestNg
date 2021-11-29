package com.testNG_Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_cls {
	@Test(dataProvider = "data")
	private void given_data(String username,int password) {
      System.out.println("username :"+ username);
      System.out.println("password :"+password);
	}
	
	@DataProvider
	private Object[][] data() {
        return new Object[][]{
        {"starc",123},
        {"dee",234},
        {"kumar",344}
	};
	}

}
