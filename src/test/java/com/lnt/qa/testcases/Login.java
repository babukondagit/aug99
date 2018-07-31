package com.lnt.qa.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lnt.qa.base.BaseClass;
import com.lnt.qa.pages.LoginPage;

public class Login extends BaseClass{
	
	LoginPage PayTmLoginPage;
	
	
	@BeforeMethod
	public void setup(){
	initialize() ;
	PayTmLoginPage = new LoginPage();
		
		
	}
	
	@Test
	public void  logintest() throws InterruptedException{
		System.out.println("Test");		
		System.out.println(prop.getProperty("url"));
		PayTmLoginPage.loggedin();
	}
	

	
	
}
