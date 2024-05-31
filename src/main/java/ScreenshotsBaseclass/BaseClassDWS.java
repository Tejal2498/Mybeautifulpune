package ScreenshotsBaseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassDWS {
 public static WebDriver driver;
 @BeforeClass
 public void beforeclass() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 }
 @BeforeMethod
 public void beforemethod () {
	 System.out.println("Welcome to the page");
 }
 
 @AfterMethod
 public void afterMethdo() {
	 System.out.println("Thanks for Coming");
 }
 @AfterClass
 public void afterclass() {
	 driver.quit();
 
 }
}
