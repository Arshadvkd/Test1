package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManualJournalList

{

	@FindBy(xpath = "//button[@class='btn btn-add']")
	WebElement add_new;

	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle table-drop action-btn']")
	List<WebElement> action;

	@FindBy(xpath = "//ul[@class='dropdown-menu action-drop-list']/li/a")
	List<WebElement> action_items;
	
	

	

	public void click_add()

	{
		add_new.click();

	}

	public void click_action(int index)

	{
		int size = action.size();

		for (int i = 0; i <= size; i++) {
			WebElement ele = action.get(i);

			ele.click();
			break;

		}

	}
	
	
	
	public void select_view() throws Exception {
		
		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i=0;i<=size;i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");
			
			System.out.println("STring"+ DS);

			if (DS.contentEquals("View")) 
			{
				ele.click();
				System.out.println("STring"+ DS);
				break;
			}

		}

	}

}
