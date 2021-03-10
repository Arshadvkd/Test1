package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalaryRevisionList {

	@FindBy(xpath ="//button[@class='btn btn-add']")
	WebElement add;

	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle table-drop action-btn']")
	List<WebElement> action;

	@FindBy(xpath = "//ul[@class='dropdown-menu action-drop-list']/li/a")
	List<WebElement> action_items;
	
	public void click_add()

	{
		
     add.click();
	}
	public void action_click(int index) {

		WebElement ele = action.get(index);
		ele.click(); 

	} 
	
	public void click_view()
	{
		
		int size=action_items.size();
		for(int i=0;i<size;i++)
		{
			WebElement ele=action_items.get(i);
			String DS=ele.getAttribute("innerHTML");
			if(DS.contentEquals("View"))
			{
				ele.click();
				break;
				
			}
			
			
		}
		
	}
	
	public void click_log()
	{
		
		int size=action_items.size();
		for(int i=0;i<size;i++)
		{
			WebElement ele=action_items.get(i);
			String DS=ele.getAttribute("innerHTML");
			if(DS.contentEquals("History"))
			{
				ele.click();
				break;
				
			}
			
			
		}
		
	}
	public void click_PDF()
	{
		
		int size=action_items.size();
		for(int i=0;i<size;i++)
		{
			WebElement ele=action_items.get(i);
			String DS=ele.getAttribute("innerHTML");
			if(DS.contentEquals("PDF"))
			{
				ele.click();
				break;
				
			}
			
			
		}
		
	}

}
