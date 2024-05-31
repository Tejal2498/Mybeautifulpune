package Com.crm.DWSTestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pomfile.AddtocartPage;

public class AddToCart {
@Test
public void AddToCart() throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("https://demowebshop.tricentis.com/");
	AddtocartPage ac=new AddtocartPage(driver);
	Thread.sleep(2000);
	WebElement digiDownload=ac.getDigitaldw();
	Thread.sleep(2000);
	List<WebElement> listOfProducts = ac.getProducts();
	for (WebElement list : listOfProducts) {
		list.click();
	}
	Thread.sleep(2000);
	}
	
}

//This test Case is not run