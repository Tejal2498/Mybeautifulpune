package Listerns1;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class NetworkFailure  {
	@Test(retryAnalyzer=com.crm.listnersclass.NetworkRetry.class)
 public void main() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//assertEquals("Tejal" , "Tejal");//To Pass the testcases that time we need to use Retry Analyzer
		assertEquals ("Tejal","Tej"); //intentionally I have failed this test cases when test case is failed due to network issue that time we use retryAnlayzer
	}
}
