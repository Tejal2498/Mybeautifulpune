package Extentreport;

import static org.testng.Assert.assertEquals;

import java.io.ObjectInputFilter.Status;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.Baseclassutility.Baseclass;
import com.crm.pomfile.loginPage;


public class Reportswithactualtestycase  extends Baseclass{
    ExtentReports report;
    ExtentTest test;
    @Test
	public void dwsLoginCorrect() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();	
		loginPage dws =new loginPage(driver);
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com") ;
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
		
	}
	@Test 
	public void dwsLoginWrong() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();	
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com") ;
		driver.findElement(By.id("Password")).sendKeys("admin02");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		test.log(Status.FAIL, "failed due to dwsLogin")
	}
@Test
public void redbus() {
	driver.get("https://www.redbus.in/");
	assertEquals("Tejal","Tej");

}
}