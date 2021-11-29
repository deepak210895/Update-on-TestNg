package com.testNG_Features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_verification_cls {
	@Test
	private void name() {
     String actual_Username ="starc";
     String expected_username="star";
     SoftAssert soft =new SoftAssert();
   //  soft.assertEquals(actual_Username, expected_username);
     soft.assertNotEquals(actual_Username, expected_username);
     System.out.println("Data validation");
	}
}
