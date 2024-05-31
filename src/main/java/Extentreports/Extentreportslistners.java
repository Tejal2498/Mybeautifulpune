package Extentreports;

import java.io.File;
import java.io.ObjectInputFilter.Status;

import javax.sound.sampled.Port;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Extentreportslistners implements ITestListener {
	public ExtentReports report;
	public ExtentSparkReporter spark;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		report.createTest(name);
		System.out.println("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getMethod().getMethodName();
		System.out.println("onTestSuccess");
		test.log(Status.PASS, name+" +is passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getMethod().getMethodName();
		System.out.println("onTestFailure");
		test.log(Status.FAIL, name+" is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getMethod().getMethodName();
		System.out.println("onTestSkipped");
		test.log(Status.SKIP , name+" "+"is skipped");
	 
	}
   
	@Override
	public void onStart(ITestContext context) {
	  File path=new File("./Extent)Report/TestRun.html");
	  spark=new Extentreportslistners(path);
	  spark.config().setDocumentTitle("DemoWorkshop");
	  spark.config().setReportName("Tejal");
	  spark.config().setTheme(Theme.STANDARD);
	  report=new ExtentReports();
	  report.setSystemInfo("Os","Window-10");
	  report.setSystemInfo("Browser","Chrome");
	  report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish");
		report.flush();
		}
	

}
