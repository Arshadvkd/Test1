package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpenseList 
{
	
	
	@FindBy(xpath="//button[@class='btn btn-add']")
	WebElement add_button;
	
	
	
	public void click_add() 
	{
		
		add_button.click();
		
	}
	
	
	
	

}
