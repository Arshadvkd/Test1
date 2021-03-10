package com.tranquil.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptList 
{
	
	@FindBy(xpath="//button[@class='btn btn-add']")
	WebElement add_button;
	
	
	public void click_add() 
	{
		
		add_button.click();
		
	}
	
	
	

}
