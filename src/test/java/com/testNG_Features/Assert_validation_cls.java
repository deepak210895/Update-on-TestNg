package com.testNG_Features;

import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class Assert_validation_cls {
	@Test
	private void name() {
     String actual_Username ="starc";
     String expected_username="star";
   //assertEquals(actual_Username, expected_username);
     assertNotEquals(actual_Username, expected_username);
     System.out.println("Data validation");
	}

}
