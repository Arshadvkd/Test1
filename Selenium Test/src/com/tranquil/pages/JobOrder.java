package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobOrder 

{

	@FindBy(id="cmbStaff_chosen")
	WebElement Salesman;

	@FindBy(xpath="//div[@id='cmbStaff_chosen']//ul/li")
	List<WebElement> salesmanlist;
	
	
	@FindBy(id="txtReferenceNo")
	WebElement customerrefernce;
	
	@FindBy(id="txtFault_1")
	WebElement fault1;
	
	@FindBy(id="save-cso")
	WebElement save;
	
	public void select_saleman(String salemanname)
	{
		Salesman.click();
		
		int size=salesmanlist.size();
		for(int i=0;i<=size;i++)
		{
			WebElement ele=salesmanlist.get(i);
			
			String ds=ele.getAttribute("innerHTML");
			if(ds.contentEquals(salemanname))
			{
				
				ele.click();
				break;
				
			}
			
			
		}
		
	}
	
	public void enter_fault(String fault) throws Throwable 
	
	{
		fault1.sendKeys(fault);	
		Thread.sleep(1000);
		fault1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		fault1.sendKeys(Keys.ENTER);
		
	}
	
	public void click_save()
	{
		
		
		save.click();
		
	}
	
	
	public void enter_cusrefernce(String reference)
	{
		
		customerrefernce.sendKeys(reference);
		
	}
	
	
	
	
	
	
	
}
