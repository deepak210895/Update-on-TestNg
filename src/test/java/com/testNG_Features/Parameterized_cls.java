package com.testNG_Features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_cls{
	@Test
	@Parameters({"Username","Password"})
	private void given(@Optional("dk")String username,@Optional("kr")String password) {
      
		System.out.println("Username:"+ username);
		System.out.println("Password:"+ password);
	}

}
