package com.testNG_Features;

import org.testng.annotations.Test;

public class Expected_Exception {
    @Test(expectedExceptions =ArithmeticException.class )
	private void sum() {
    int a =10;
    		//System.out.println(a/0);
    		System.out.println(a/2);
	}
}
