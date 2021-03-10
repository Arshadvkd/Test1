package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RFQ 

{
	@FindBy(id="cmbRequestedBy_chosen")
	WebElement requested_by;
	
	@FindBy(id="txtPurchaseEnquiryDate")
	WebElement date;
	
	@FindBy(id="txtReferenceNo")
	WebElement customer_ref;
	
	@FindBy(id="txtEnquiryNo")
	WebElement Salesenquirynumber;
	
	@FindBy(id="cmbRequestedBy_chosen")
	WebElement requestedby;
	
	
	@FindBy(id="cmbDepartment_chosen")
	WebElement department;
	
	@FindBy(xpath="//button[@class='ms-choice']")
	WebElement select_supplier;
	
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
	
	@FindBy(className="note-editable")
	WebElement remarks;
	
	@FindBy(id="save-po")
    WebElement save; 	
	
	@FindBy(xpath="//li//input[@type='checkbox']")
	List<WebElement> supplier_options;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> requestedby_options;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> department_options;
	
	public void clickRequestedBy()
	{
		requested_by.click();
		
	}
	
	
	public void clickdepartment() 
	{
		
		department.click();
		
	}
	
	public void clicksupplier() 
	{
		
		select_supplier.click();
		
	}
	
	public void selectRequstedBy(String salesman)
	{
		
		int count=requestedby_options.size();
		for(int i=0;i<=count;i++)
		{
			WebElement ele=requestedby_options.get(i);
			String ds=ele.getAttribute("innerHTML");
			
			if(ds.contentEquals(salesman))
			{
				
				ele.click();
				break;
				
			}
					
			
			
		}
		
		
	}
	
	
	public void select_department(String department)
	{
		
		int count=department_options.size();
		for(int i=0;i<=count;i++)
		{
			WebElement ele=department_options.get(i);
			String ds=ele.getAttribute("innerHTML");
			
			if(ds.contentEquals(department))
			{
				
				ele.click();
				break;
				
			}
					
			
			
		}
		
		
	}
	
	public void select_suppliername(int index)
	{
		
		int size=supplier_options.size();
		for(int i=0;i<=size;i++)
		{
			WebElement ele=supplier_options.get(index);
			ele.click();
			break;
			
		}
		
		
		
	}
	
	public void item1(String item) throws Throwable
	{
		item1.click();
		Thread.sleep(1000);
		item1.sendKeys(item);
		Thread.sleep(1000);
		item1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		item1.sendKeys(Keys.ENTER);
		
	}
	
	public void item1_qty(String qty)
	{
		
		item1_qty.sendKeys(qty);
		
	}
	
	
	public void item2(String item) throws Throwable
	{
		
		item2.sendKeys(item);
		Thread.sleep(1000);
		item2.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		item2.sendKeys(Keys.ENTER);
		
	}
	
	public void item2_qty(String qty)
	{
		
		item1_qty.sendKeys(qty);
		
	}
	
	
	public void add_row()
	{
		
		addRow.click();
		
	}
	
	
	public void clicksave()
	
	{
		
		
		save.click();
	}
	
	
	public void enter_cusref(String ref)
	{
		
		
		customer_ref.sendKeys(ref);
	}
	
	
	public String get_date()
	{
		
		String Date=date.getAttribute("value");
		return Date;
		
		
	}
	
	public String get_salesenquirynumber()
	{
		
		String number=Salesenquirynumber.getAttribute("value");
		return number;
		
		
	}
	
	
	public String get_requestedby()
	{
		
		
		String requedby=requestedby.getText();
		
		return requedby;
	}
	
	public String get_reference()
	{
		
		
		String ref=customer_ref.getText();
		
		return ref;
	}

	public String get_item1()
	{
		
		
		String itemname=item1.getAttribute("value");
		
		return itemname;
	}
	
	public String get_item2()
	{
		
		
		String itemname=item2.getAttribute("value");
		
		return itemname;
	}
	
	public String get_item3()
	{
		
		
		String itemname=item3.getAttribute("value");
		
		return itemname;
	}
	
	public String get_item1_qty()
	{
		
		
		String itemname=item2_qty.getAttribute("value");
		
		return itemname;
	}
	
}
