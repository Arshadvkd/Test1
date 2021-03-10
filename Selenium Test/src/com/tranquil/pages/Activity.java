package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Activity 
{

	@FindBy(id="save-qtn1")
	WebElement finish;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	List<WebElement> yes;
	
	@FindBy(xpath="//div[@class='jconfirm-box']")
	WebElement frame;
	
	public void click_finish()
	{
		
		finish.click();
		
	}
	
	
	

//count=4 
	public void select_yes(int index) throws Exception 
	{
	
		int size=yes.size();
		System.out.println("count"+yes.size());
		
			
			WebElement ele=yes.get(index);
			
			
				ele.click();
			
			
			
			
		
		
	}
	

	


	
}
