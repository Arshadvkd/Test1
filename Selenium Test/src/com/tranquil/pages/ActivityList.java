package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityList 
{
	

	@FindBy(xpath="//div[@class='btn-group tbl-btn-grp']/button[@class='btn btn-default dropdown-toggle table-drop action-btn']")
	List<WebElement> action;	 

	@FindBy(xpath="//ul[@class='dropdown-menu action-drop-list']/li/a")
	List<WebElement> action_items;
	
public void clickAction(int index)
	
	{
		
		int count=action.size();
		System.out.println("total"+count);
				
		
		for(int i=0;i<=count;i++) 
		{
		
			WebElement ele=action.get(index);
			
			
			{
			
			ele.click();
			break;
		
			}
			
		}
		
		
	}
	


public void select_materialrequest() throws Exception 
{

	int size=action_items.size();
	System.out.println("count"+action_items.size());
	for(int i=0;i<=size;i++)
	{
		
		WebElement ele=action_items.get(i);
		
		String DS=ele.getAttribute("innerHTML");
			
			if(DS.contentEquals("Material Request"))
		{
			ele.click();
			break;
		}
		
		
	}
}
	
	public void select_edit() throws Exception 
	{

		int size=action_items.size();
		System.out.println("count"+action_items.size());
		for(int i=0;i<=size;i++)
		{
			
			WebElement ele=action_items.get(i);
			
			String DS=ele.getAttribute("innerHTML");
				
				if(DS.contentEquals("Edit"))
			{
				ele.click();
				break;
			}
			
			
		}
	
	
	
}



	
	
	
	

}
