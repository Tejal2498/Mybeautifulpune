package WebElement;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Parameters;
public class TextBox {
 @BeforeSuite
 public void beforesuite() {
	 System.out.println("Connecting to the database");  }
@BeforeTest
 public void beforetest() {
	System.out.println("Precondition for test runner");
}
//@Parameters({"url","name","EmailId","password"})
@BeforeClass
public void beforeclass() {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("url");
}
@BeforeMethod
public void beforemethod() {
	System.out.println("beforemethod");
}
@AfterMethod
public void aftermethod() {
	System.out.println("after method");
}
}

