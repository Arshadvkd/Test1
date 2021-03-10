package com.tranquil.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContraList 
{
	@FindBy(xpath="//button[@class='btn btn-add']")
	WebElement add;
	
	
	public void clic_add()
	
	{
		add.click();
		
	}
	
	
	
	

}
