package com.lnt.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lnt.qa.base.BaseClass;
import com.lnt.qa.pages.HomePage;
import com.lnt.qa.pages.LoginPage;

public class VerifySearchResults extends BaseClass {
	
LoginPage PayTmLoginPage;
HomePage homePage;
	
public VerifySearchResults(){
	super();
}
	
	@BeforeMethod
	public void setup() throws InterruptedException{
	initialize() ;
	PayTmLoginPage = new LoginPage();
	homePage = new HomePage();
	PayTmLoginPage.loggedin();
		
	}
	
	@Test
	public void  verifyPLP() throws InterruptedException{
		String title = homePage.verifyHomePage();
		System.out.println(title);
		
	Assert.assertEquals(title,"Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More","Home Page title is not matched");
		homePage.searchItem("Heater");
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	

	
	
}


