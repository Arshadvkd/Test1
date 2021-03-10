package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditNote 
{
	
	@FindBy(id="txtCustomerName")
	WebElement customername;
	
	@FindBy(id="cmbCostCenter_chosen")
	WebElement costcenter;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> costcenter_options;
	
	@FindBy(id="txtProduct_1")
	WebElement itemname1;
	
	@FindBy(id="txtProduct_2")
	WebElement itemname2;
	
	
	@FindBy(id="cmbWarehouse_1")
	WebElement warehouse1;
	
	@FindBy(id="cmbWarehouse_2")
	WebElement warehouse2;
	
	
	@FindBy(id="txtSalesRate_1")
	WebElement unitprice1;
	

	@FindBy(id="txtSalesRate_2")
	WebElement unitprice2;
	
	@FindBy(id="addRow")
	WebElement addrow;
	
	@FindBy(xpath="//div[@class='note-editable']")
	WebElement notes;
	
	@FindBy(id="save-CreditNote")
	WebElement save;
	
	public void enter_customername(String customer) throws Throwable
	{
		customername.sendKeys(customer);
		Thread.sleep(1000);
		customername.sendKeys(Keys.ARROW_DOWN);
		customername.sendKeys(Keys.ENTER);
		
	}
	
	public void enter_costcenter(String costcentername)
	{
		
		costcenter.click();
		int size=costcenter_options.size();
				for(int i=0;i<=size;i++)
				{
					WebElement ele=costcenter_options.get(i);
					String DS=ele.getAttribute("innerHTML");
					if(DS.contentEquals(costcentername))
					{
						ele.click();
						break;
						
					}
					
					
					
				}
		
		
	}
	
	
	public void enter_itemname1(String itemname) throws Throwable
	{
		
		itemname1.sendKeys(itemname);
		Thread.sleep(1000);
		itemname1.sendKeys(Keys.ARROW_DOWN);
		itemname1.sendKeys(Keys.ENTER);
		
		
	}
	
	public void enter_itemname2(String itemname) throws Throwable
	{
		
		itemname2.sendKeys(itemname);
		Thread.sleep(1000);
		itemname2.sendKeys(Keys.ARROW_DOWN);
		itemname2.sendKeys(Keys.ENTER);
		
	}
	
	
	public void enter_unitprice1(String price) throws Throwable
	{
		Thread.sleep(1000);
		unitprice1.click();
		unitprice1.sendKeys(price);
		
	}
	
	
	public void enter_unitprice2(String price) throws Throwable
	{
		unitprice2.click();
		Thread.sleep(1000);
		unitprice2.sendKeys(price);
		
	}
	
	public void click_addrow()
	{
		addrow.click();
		
		
	}
	
	
	public void enter_note(String note)
	
	{
		notes.sendKeys(note);
		
	}
	
	public void click_save()
	
	{
		save.click();
		
	}
	

}
