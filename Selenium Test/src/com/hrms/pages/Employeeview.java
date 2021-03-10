package com.hrms.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Employeeview 
{
	
	@FindBy(xpath="//button[@id='btnNext']")
	WebElement approve;
	
	
	
	public void click_approve() throws Throwable
	{
		
		approve.click();
		
	}
	

}
