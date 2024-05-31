package pom;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DWSLogin;

public class DWSLOGIN {
@Test
public void login() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(2000);
	DWSLogin dws=new DWSLogin(driver);
	dws.username.sendKeys("admin01@gmail.com");
	Thread.sleep(2000);
	dws.password.sendKeys("admin01");
	Thread.sleep(2000);
	dws.login.click();

}

}
