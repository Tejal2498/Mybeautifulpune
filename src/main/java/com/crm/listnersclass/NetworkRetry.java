package com.crm.listnersclass;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class NetworkRetry implements IRetryAnalyzer {
int start=0,end=3;
	@Override
	public boolean retry(ITestResult result) {
		if(start<end) {
			start++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}