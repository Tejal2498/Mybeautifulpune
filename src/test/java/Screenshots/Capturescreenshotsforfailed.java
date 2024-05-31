package Screenshots;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ScreenshotsBaseclass.BaseClassDWS;

public class Capturescreenshotsforfailed extends BaseClassDWS {
	@Test
	public void dwsLoginCorrect() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();	
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
	}
@Test
public void redbus() {
	driver.get("https://www.redbus.in/");
	assertEquals("Tejal","Tej");

}
}
