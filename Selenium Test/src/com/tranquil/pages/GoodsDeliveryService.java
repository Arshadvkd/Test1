package com.tranquil.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoodsDeliveryService 
{

	
	@FindBy(id="csogdnCheckBox_1")
	WebElement checkbox;
	
	
	@FindBy(id="txtQuantity_1")
	WebElement qty1;
	
	@FindBy(id="save-qtn")
	WebElement save;
	
	public void click_checkbox1()
	
	
	{
		checkbox.click();
		
		
	}
	
	public void click_qty1(String qty)
	{
		
		qty1.sendKeys(qty);
		
	}
	
	public void click_save()
	{
		
		save.click();
		
	}
	
}
