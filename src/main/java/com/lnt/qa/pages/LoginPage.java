package com.lnt.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lnt.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	//Constructor
		public LoginPage() {		
			PageFactory.initElements(driver, this);
			}
		
		// Declared web elements
		@FindBy(xpath = "//input[@class='_2zrpKA']")  
		WebElement UserNam;
		
		@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv']")
  
		WebElement Pwd;
		
		@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")  
		WebElement SignInButton;
		
		@FindBy(xpath = "//a[text()='Login & Signup']")  
		WebElement SignInLink;
		
		

     public void loggedin() throws InterruptedException{
    	// Thread.sleep(2000);
    	// SignInLink.click();
    	// Thread.sleep(2000);
    	 //driver.switchTo().frame(0);
    	 UserNam.sendKeys(prop.getProperty("UserName"));
    	// Thread.sleep(2000);
    	 Pwd.sendKeys(prop.getProperty("Pwd"));
    	 //Thread.sleep(2000);
    	 SignInButton.click();
    	 
    	   	 
     }
     
}


