package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listerns.DwS.class)
public class DwS {
 @Test
 public void login() {
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://demowebshop.tricentis.com/");
	 driver.findElement(By.className("ico-login")).click();
	 driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
	 driver.findElement(By.id("Password")).sendKeys("Admin01");
	 driver.findElement(By.xpath("//input[@value='Log in']")).click();
	 driver.close();
 } 
@Test
 public void login1 () {
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://www.redbus.in/");
	 driver.close();
}
@Test(dependsOnMethods="login")
public void maniDum() {
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://manis.in/");
	 driver.close();
}

}

