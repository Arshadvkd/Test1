package com.tranquil.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CSOCustomerApproval 
{
	

	@FindBy(id="save-cso")
    WebElement approve;	
	
	
	public void select_apporve()
	{
		
		approve.click();
	}
	

}
