package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class hrmsoverview 
{
	

	@FindBy(xpath="	//a[@id='sidebarCollapse']")
	WebElement menu;
	
	public void clickMenu()
	{
		menu.click();
		
		
	}
	

}
