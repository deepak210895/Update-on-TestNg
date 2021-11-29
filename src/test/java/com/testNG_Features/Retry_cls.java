package com.testNG_Features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_cls implements IRetryAnalyzer  {
	int start =1;
	int end =5;
	public boolean retry(IRetryAnalyzer results) {
       if (start<=end) {
    	   start++;
    	   return true;
    	   
		
	}
	return false;
	}
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}

}
