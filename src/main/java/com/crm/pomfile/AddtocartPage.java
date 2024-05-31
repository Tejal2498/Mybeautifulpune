package com.crm.pomfile;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

//import Com.crm.DWSTestCase.List;

import org.openqa.selenium.support.FindBy;
public class AddtocartPage {
public AddtocartPage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
}
	 public @FindBy (xpath="(//a[@href='/digital-downloads'])[1]")
	 WebElement AddCart;
	 public @FindBy (xpath="//input[@value='Add to cart']")
	 WebElement DigitalDownload;
	public WebElement getDigitaldw() {
		// TODO Auto-generated method stub
		return null;

	}
	public List<WebElement> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	} 
	 

