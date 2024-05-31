package Listerns;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class Baseclass {
 public WebDriver driver;
 Readdatafromproperty ps = new Readdatafromproperty();

@BeforeSuite
public void BS() {
	System.out.println("Writing Logic for database conections");
}
@BeforeTest
public void BT() {
	System.out.println("Beforetest");
	System.out.println("pre condition for test testRunner");
}
@BeforeClass
public void openBrowser() throws IOException {
	String url = ps.getdatafromproperty("url");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to(url);
}
@BeforeMethod
public void login() throws IOException {
	String un = ps.getdatafromproperty("email");
	String pass = ps.getdatafromproperty("password");
	
	System.out.println("pre condition for testcase that is login");
	//at the time of execution same annotations are executing according to there
	//alphabate(asciii value)
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	driver.findElement(By.id("Email")).sendKeys(un);
	driver.findElement(By.id("Password")).sendKeys(pass);

	 driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
@AfterMethod
public void logout() {
	driver.findElement(By.xpath("//a[text()='Log out']")).click();
}
@AfterClass
public void closeBrowser() {
	System.out.println("@Afterclass");
	System.out.println("post Condition for test case");
	driver.close();
}
@AfterTest
public void at( ) {
	System.out.println("@Aftertest");
	System.out.println("post condition for testrunner");
}
@AfterSuite
public void Aftersuite() {
	System.out.println("disconnection for database");
}

}