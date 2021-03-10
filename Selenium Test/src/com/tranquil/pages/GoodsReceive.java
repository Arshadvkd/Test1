package com.tranquil.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GoodsReceive 

{
	
	@FindBy(id="chkMainAll")
	WebElement checkbox;
	
	
	@FindBy(id="chkMiscAll")
	WebElement checkbox_misc;
	
	@FindBy(id="txtMiscReceivedQty_1")
	WebElement received_qty;
	
	@FindBy(id="btn-submit")
	WebElement submit;
	
	@FindBy(id="ddlLocator_1")
	WebElement locator1;
	
	
	@FindBy(id="ddlLocator_2")
	WebElement locator2;
	
	@FindBy(id="txtSupplierInvoiceNo")
	WebElement supinvoiceno;
	
	public void chkitems()
	
	{
		checkbox.click();
		
		
	}
	
   public void misc_chkitems()
	
	{
	   checkbox_misc.click();
		
		
	}
   
   public void enter_received_qty(String qty)
   
   {
	   
	   received_qty.sendKeys(qty);
	   
   }
	
   public void click_submit()
   
   {
	   
	   
	   submit.click();
	   
   }
   
   public void select_locator1(int index)
   
   {

		Select locatr1=new Select(locator1);
		

		locatr1.selectByIndex(index);
		
	   
	   
   }
   
   public void select_locator2(int index)
   
   {

		Select locatr2=new Select(locator2);
		

		locatr2.selectByIndex(index);
		
	   
	   
   }
   
   public void enter_supno(String invoice)
   
   {
	   
	   supinvoiceno.sendKeys(invoice);
	   
   }
   

}
