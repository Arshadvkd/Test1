package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;

public class PurchaseRequest 

{
	
	
	
	@FindBy(id="cmbRequisitionType_chosen")
	WebElement RequestType;
	
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> RequestType_options;
	
	
	@FindBy(id="txtProduct_1")
	WebElement item1;
	

	@FindBy(id="txtProduct_2")
	WebElement item2;
	
	

	@FindBy(id="txtProduct_3")
	WebElement item3;
	

	@FindBy(id="txtProduct_4")
	WebElement item4;
	
	@FindBy(id="txtRequestedQty_1")
	WebElement item1_qty;
	
	@FindBy(id="txtRequestedQty_2")
	WebElement item2_qty;
	
	@FindBy(id="txtRequestedQty_3")
	WebElement item3_qty;
	
	@FindBy(id="txtRequestedQty_4")
	WebElement item4_qty;
	
	
	
	@FindBy(id="addRow")
	WebElement addRow;
	
	@FindBy(id="txtCSO_1")
	WebElement jobNo;
	
	@FindBy(id="txtMiscRequestedQty_1")
	WebElement requested_qty;
	
	@FindBy(id="txtMiscAuthorisedQty_1")
	WebElement authorized_qty;
	
	@FindBy(id="addMiscRow")
	WebElement add_miscrow;
	
	@FindBy(id="txtAuthorisedQty_1")
	WebElement autorized_qty1;
	
	@FindBy(id="txtAuthorisedQty_2")
	WebElement autorized_qty2;
	
	@FindBy(id="txtAuthorisedQty_3")
	WebElement autorized_qty3;
	
	
	@FindBy(id="txtAuthorisedQty_4")
	WebElement autorized_qty4;
	
	
	
	@FindBy(className="note-editable")
	WebElement notes;
	
	
	@FindBy(id="save-po")
    WebElement save; 	
	
	public void clickRequestType()
	{
		
		RequestType.click();
		
	}
	
	
	public void SelectRequestType_Trading()
	{
		
		for(WebElement ele:RequestType_options)
		{
			
				if(ele.getAttribute("innerHTML").contains("Trading"))
			{
				ele.click();
				break; 
			}
			
			
		}
		
	}
	
	public void SelectRequestType_Service()
	{
		
		for(WebElement ele:RequestType_options)
		{
			
				if(ele.getAttribute("innerHTML").contains("Service"))
			{
				ele.click();
				break;
			}
			
			
		}
		
	}
	
	public void additem1(String itemname1) throws Exception
	{
		item1.sendKeys(itemname1);
		Thread.sleep(1000);
		item1.sendKeys(Keys.ARROW_DOWN);
		item1.sendKeys(Keys.ENTER);
		
	}
	
	public void additem2(String itemname2) throws Exception
	{
		item2.sendKeys(itemname2);
		Thread.sleep(1000);
		item2.sendKeys(Keys.ARROW_DOWN);
		item2.sendKeys(Keys.ENTER);
		
	}
	
	public void additem3(String itemname3) throws Exception
	{
		item3.sendKeys(itemname3);
		Thread.sleep(1000);
		item3.sendKeys(Keys.ARROW_DOWN);
		item3.sendKeys(Keys.ENTER);
		
	}
	
	public void additem4(String itemname4) throws Exception
	{
		item4.sendKeys(itemname4);
		Thread.sleep(1000);
		item4.sendKeys(Keys.ARROW_DOWN);
		item4.sendKeys(Keys.ENTER);
		
	}
	
	public void item1_qty(String quantity)
	{
		
		item1_qty.sendKeys(quantity);
		
	}
	
	public void item2_qty(String quantity)
	{
		
		item2_qty.sendKeys(quantity);
		
	}
	
	public void item3_qty(String quantity)
	{
		
		item3_qty.sendKeys(quantity);
		
	}
	
	public void item4_qty(String quantity)
	{
		
		item4_qty.sendKeys(quantity);
		
	}
	
	
	
	
	
	public void clickaddrow()
	{
		addRow.click();
		
		
	}
	
	
	public void clickSave()
	{
		
		save.click();
		
	}
	
	
	public void addNotes(String Notes)
	{
		notes.sendKeys(Notes);
		
	}
	
	public void enterJobNo(String jobnumber) throws Throwable 
	{
		jobNo.sendKeys("CSO"+ jobnumber);	
		Thread.sleep(1000);
		jobNo.sendKeys(Keys.ARROW_DOWN);
		jobNo.sendKeys(Keys.ENTER);
		jobNo.sendKeys(Keys.TAB);
		jobNo.sendKeys(Keys.TAB);
		jobNo.sendKeys(Keys.TAB);
		jobNo.sendKeys(Keys.TAB);
	}
	
	
	public void enterRequestedQty(String quantity) 
	{
		
	 requested_qty.sendKeys(quantity);
	 jobNo.sendKeys(Keys.TAB);
	}
	
	
	public void enterAuthorizedQty(String quantity)
	{
		
		
		authorized_qty.sendKeys(quantity);
	}
	
	
	
	public void enter_autorized_qt1(String qty1)
	{
		
		autorized_qty1.click();
		autorized_qty1.sendKeys(qty1);
		
		
	}
	
	public void enter_autorized_qt2(String qty2)
	{
		autorized_qty2.click();
		autorized_qty2.sendKeys(qty2);
		
		
	}
	
	public void enter_autorized_qt3(String qty3)
	{
		autorized_qty3.click();
		autorized_qty3.sendKeys(qty3);
		
		
	}
	
	public void enter_autorized_qt4(String qty4)
	{   
		autorized_qty4.click();
		autorized_qty4.sendKeys(qty4);
		
		
	}
	
	

}
