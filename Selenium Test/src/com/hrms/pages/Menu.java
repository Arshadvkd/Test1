package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu 
{
	
	
	@FindBy(linkText="HRMS")
	WebElement hrms;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	
	public void click_hrms()
	
	{
		
		hrms.click();
		
	}
	
public void click_logout()
	
	{
		
	logout.click();
		
	}
	

}
