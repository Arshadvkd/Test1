package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesInvoiceAdj 
{
	
	
	@FindBy(id="checkIsAdjustment")
	WebElement adjustment;
	
	@FindBy(id="txtCustomerName")
	WebElement customername;
	
	@FindBy(id="accounttypeA_1_chosen")
	WebElement account1;
	

	@FindBy(id="accounttypeA_3_chosen")
	WebElement account2;
	
	@FindBy(id="addAdjustRow")
    WebElement addrow;
	
	@FindBy(id="txtRateA_1")
	WebElement unitprice1;
	
	@FindBy(xpath="//div[@class='chosen-drop']/ul[@class='chosen-results']/li")
	List<WebElement>accountslist;
	
	
	@FindBy(xpath="//div[@id='accounttypeA_3_chosen']//ul[@class='chosen-results']/li")
	List<WebElement> accountlist3;
	
	
	@FindBy(id="txtVATIdsA_1")
	WebElement Vat;
	
	public void click_adjustment()
	{
		
		adjustment.click();
		
	}
	
	public void enter_unitprice(String unit)
	
	{
		
		unitprice1.sendKeys(unit);
	}
	
	public void select_customer(String name)
	{
		
		customername.sendKeys(name);
		customername.sendKeys(Keys.ARROW_DOWN);
		customername.sendKeys(Keys.ENTER);
		
	}
	
	public void vat()
	
	{
		Vat.click(); 
		Vat.sendKeys(Keys.ARROW_DOWN);
		Vat.sendKeys(Keys.ENTER);
		
		
	}
	
	public void click_addrow()
	{
		addrow.click();
		
		
	}
	
	
	public void addaccount1()
	{
		account1.click();
		
		
	}
	
	
	public void addaccount2()
	{
		account2.click();
		
		
		
	}
	
	
	public void select_account(String account)
	{
		int count=accountslist.size();
		for(int i=0;i<count;i++)
		{
			WebElement ele=accountslist.get(i);
			String DS=ele.getAttribute("innerHTML");
			if(DS.contentEquals(account))
			{
				
				ele.click();
				break;
				
			}
			
			
		}
		
		
		
	}
	
	
	
	public void select_account1(String account)
	{
		int count=accountlist3.size();
		for(int i=0;i<count;i++)
		{
			WebElement ele=accountlist3.get(i);
			String DS=ele.getAttribute("innerHTML");
			if(DS.contentEquals(account))
			{
				
				ele.click();
				break;
				
			}
			
			
		}
		
		
		
	}

}
