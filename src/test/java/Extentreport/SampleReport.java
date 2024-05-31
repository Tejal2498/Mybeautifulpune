package Extentreport;

import java.io.File;
import java.io.ObjectInputFilter.Status;

import org.testng.annotations.Test;

public class SampleReport {
@Test
public void launchThereport() {		
	ExtentReports report=new ExtentReports();
	File path=new File("./ExtentReport/sample.html");
	ExtentSparkReporter spark=new ExtentSparkReporter(path);
	spark.config().setDocumentTitle("M3&A5 Batch");
	spark.config().setTheme(Theme.DARK);
	spark.config().setTheme("Manikandan");
	//attach the report
	report.attchReporter(spark);
	//create test case
	ExtentTest test1 = report.createTest("test1");
	test1.log(Status.FAIL, "Login Function error");
	report.flush();
}
}
