package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSLogin {
 public DWSLogin(WebDriver driver) {
	 PageFactory.initElements(driver,this);
 }
  public @FindBy(id="Email")
 WebElement username;
 public @FindBy(name="Password")
 WebElement password;
 public @FindBy(xpath ="//input[@value='Log in']")
 WebElement login;
 //private @FindBy(id="Email")
 //WebElement username;
 //private @FindBy(name="Password")
 //WebElement password;
 //private @FindBy(xpath="//input[@value='Log in']")
 //WebElement login;

 }
