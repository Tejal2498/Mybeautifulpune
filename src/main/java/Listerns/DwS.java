package Listerns;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DwS implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTeststart");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
	 System.out.println("onTestSucess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
       System.out.println("ITestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	   System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	}

}
