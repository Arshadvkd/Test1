package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditNoteList 

{
	

	@FindBy(xpath="//button[@class='btn btn-add']")
	WebElement add_button;
	
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle table-drop action-btn']")
	List<WebElement> action;
	
	public void click_add() 
	{
		
		add_button.click();
		
	}
	
	public void click_action(int index)
	{
		int count=action.size();
		
		for(int i=0;i<=count;i++)
		{
			
			WebElement ele=action.get(i);
			{
			ele.click();
			break;
			}
			
		}
		
		
	}
	
	

}
