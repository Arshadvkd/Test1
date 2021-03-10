package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotationList 

{ 
	
	@FindBy(xpath="//button[@class='btn btn-add']")
	WebElement add_button;
	
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle table-drop action-btn']")
	List<WebElement> action;
	
	@FindBy(xpath="//ul[@class='dropdown-menu action-drop-list']/li/a")
	List<WebElement> action_items;
	
	@FindBy(xpath="//td/span")
	List<WebElement> status;
	
	public void click_add() 
	{
		
		add_button.click();
		
	}
	
	
	public void click_action(int index)
	
	{
		
		int size=action.size();
	
			WebElement ele=action.get(index);
			ele.click();
		
	}
	
	public void click_verify()
	{
		int size=action_items.size();
		for(int i=0;i<=size;i++)
		{
			
			WebElement ele=action_items.get(i);
			String ds=ele.getAttribute("innerHTML");
			if(ds.contentEquals("Verify"))
			{
				
				
				ele.click();
				break;
			}
			
			
		}
		}
		
		
		public void click_approve()
		{
			int size=action_items.size();
			for(int i=0;i<=size;i++)
			{
				
				WebElement ele=action_items.get(i);
				String ds=ele.getAttribute("innerHTML");
				if(ds.contentEquals("Approve"))
				{
					
					
					ele.click();
					break;
				}
				
				
				
			}
		
		
		
		}
		
		public void click_order()
		{
			int size=action_items.size();
			for(int i=0;i<=size;i++)
			{
				
				WebElement ele=action_items.get(i);
				String ds=ele.getAttribute("innerHTML");
				if(ds.contentEquals("Order"))
				{
					
					
					ele.click();
					break;
				}
				
				
				
			}
		
		
		
		}
		
		public void click_view()
		{
			int size=action_items.size();
			for(int i=0;i<=size;i++)
			{
				
				WebElement ele=action_items.get(i);
				String ds=ele.getAttribute("innerHTML");
				if(ds.contentEquals("View"))
				{
					
					
					ele.click(); 
					break;
				}
				
				
			}
		}
		
		

		public void click_edt()
		{
			int size=action_items.size();
			for(int i=0;i<=size;i++)
			{
				
				WebElement ele=action_items.get(i);
				String ds=ele.getAttribute("innerHTML");
				if(ds.contentEquals("Edit"))
				{
					
					
					ele.click(); 
					break;
				}
				
				
			}
		}
		public String get_status()
		{

			WebElement ele = status.get(12);

			String DS = ele.getAttribute("innerHTML");

			return DS;

		}
}
