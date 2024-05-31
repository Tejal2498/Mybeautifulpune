package com.crm.pomfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
@Test
public class loginPage {
public loginPage (WebDriver driver) {
	 PageFactory.initElements(driver,this);
}
 public @FindBy(id="Email")
WebElement username;
public @FindBy(name="Password")
WebElement password;
public @FindBy(xpath ="//input[@value='Log in']")
WebElement login;
}

