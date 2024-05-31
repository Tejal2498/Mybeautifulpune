package Listerns;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenrsIRetryAnalyzer implements IRetryAnalyzer {
	public boolean retry(ITestResult result)
	{
		int start=0;int end=5;
		while(start<end) {
			start++;
			return true;
		}
		return false;
		
	}
}
