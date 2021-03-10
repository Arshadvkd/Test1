package com.tranquil.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Overview 
{
	
	

	@FindBy(xpath="//a[@id='main-nav']")
	WebElement menu;
	
	@FindBy(id="divCurrentProfit")
	WebElement  Grossprofit;
	
	
	@FindBy(id="//span[@id='divLastMonthProfit']")
	WebElement Lastmonthprofit;
	
	
	
	
	
	
	public void clickMenu()
	{
		menu.click();
		
		
		
	}
	
	
}
