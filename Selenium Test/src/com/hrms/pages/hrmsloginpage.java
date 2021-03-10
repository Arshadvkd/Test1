package com.hrms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class hrmsloginpage 
{
	
	WebDriver driver;
	public hrmsloginpage(WebDriver ldriver)
	{
		this.driver=ldriver;
		
	}

	
	@FindBy(id="txtUserName")
	WebElement User_Name;
	
	
	@FindBy(id="txtPassword")
	WebElement User_Pawd;
	
	
	@FindBy(id="saveButton")
	WebElement Submit_Button;
	
	public void Login(String uname,String paswd)
	{
		
		User_Name.sendKeys(uname);
		User_Pawd.sendKeys(paswd);
		Submit_Button.click();
		
	}
	
	
	

}
