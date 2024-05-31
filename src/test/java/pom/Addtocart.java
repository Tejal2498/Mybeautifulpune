package pom;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Addtocart {

		// TODO Auto-generated constructor stub

public Addtocart(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
	}

@Test
public void Addtocart() throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(2000);
	Addtocart cart=new Addtocart(driver);
	
}
}