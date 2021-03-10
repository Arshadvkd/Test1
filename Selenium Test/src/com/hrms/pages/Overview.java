package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Overview 
{
	
	@FindBy(xpath="//a[@id='main-nav']")
	WebElement menu;
	
	public void clickMenu()
	{
		menu.click();
		
		
	}

}
