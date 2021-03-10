package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class branch 
{

	@FindBy(xpath="//a[@onclick='objLogin.SelectBranch(5)']")
	WebElement branch;
	
	public void selectbranch()
	{
		
		branch.click();
		
		
	}
	
	
	
	
}
