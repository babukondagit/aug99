package com.lnt.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lnt.qa.base.BaseClass;

public class HomePage extends BaseClass  {
	
	public HomePage() {		
		PageFactory.initElements(driver, this);
		}
	
	// Declared web elements
	@FindBy(xpath = "//input[@name='q']")  
	WebElement SearchItem;
	
	@FindBy(xpath = "//*[@id='container']/div/header/div[1]/div/div/div/div[1]/form/div/div[2]/button") 
	WebElement Searchbutton;
	
	@FindBy(xpath = "//a[@text='Electronics']")  
	WebElement electronicsLink;
	
	public String verifyHomePage(){
	return driver.getTitle(); 
		}
	
	public ElectronicPage ClickOnElectronicsLink(){
		electronicsLink.click();
		return new ElectronicPage();
	}
	
	public ProductListingPage ClickOnSearchButton(){
		Searchbutton.click();
		return new ProductListingPage();
	}
	
	public ProductListingPage searchItem(String SearchItm) throws InterruptedException{
		
		
		//Thread.sleep(30);
		SearchItem.sendKeys("Mobile");
		Thread.sleep(30);
		SearchItem.sendKeys(SearchItm);
		Thread.sleep(30);
		SearchItem.sendKeys(Keys.ENTER);
		
		//Searchbutton.click();
		return new ProductListingPage();
		
		
	}
	
	
	
	
	
	
	
	}


