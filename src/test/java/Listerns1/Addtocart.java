package Listerns1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Listerns.Baseclass;

public class Addtocart extends Baseclass {
		@Test
		public void AddtoCart() throws InterruptedException {
			driver.findElement(By.xpath("(//a[@href='/digital-downloads'])[1]")).click();
			
			List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
			
			for (WebElement web : products) {
				web.click();
			}
			Thread.sleep(3000);
		
	}
}