package com.tranquil.pages;



import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class Menu 
{ 
	
	@FindBy(linkText="Purchase Request")
	WebElement Purchase_Request;
	
	
	@FindBy(xpath="//a[@href='/en/Purchase/PurchaseEnquiry']")
	WebElement RFQ;
	
	@FindBy(linkText="Item")
	WebElement Items;
	
	
	@FindBy(linkText="Purchase Order")
	WebElement purchase_order;
	
	@FindBy(linkText="Purchase Invoice")
	WebElement purchase_invoice;
	
	
	@FindBy(linkText="Quotation")
	WebElement quotation;
	


	@FindBy(linkText="Enquiry")
	WebElement sales_enquiry;
	
	@FindBy(linkText="Sales Order")
	WebElement Sales_Order;
	
	@FindBy(linkText="Sales Invoice")
	WebElement Sales_Invoice;
	
	@FindBy(linkText="Manual Journal")
	WebElement Manual_journal;
	
	@FindBy(linkText="Receipt")
	WebElement Receipt;
	
	@FindBy(linkText="Expense")
	WebElement expense;
	
	
	@FindBy(linkText="Credit Note")
	WebElement creditnote;
	
	@FindBy(linkText="Debit Note")
	WebElement debitnote;
	
	@FindBy(linkText="Job Order")
    WebElement joborder;	
	 
	@FindBy(xpath="//a[@href='/en/Service/ServiceEnquiry']")
	WebElement service_enquiry;
	
	@FindBy(linkText="Activity")
    WebElement activity;	
	
	@FindBy(linkText="Inventory")
	WebElement inventory;
	
	
	@FindBy(linkText="Accounts")
	WebElement Accounts;
	
	@FindBy(linkText="Contra")
	WebElement contra;
	
	public void clickpurchaseRequest() 
	{
	
		Purchase_Request.click();
	
	}
	
	public void clickRFQ()
	{
		
		RFQ.click();
	}
		
	public void click_salesinvoice()
	
	{
		
		Sales_Invoice.click();
		
	}
	
	
	public void click_item()
	{
		
		Items.click();
	}
		
	
	public void click_purchaseorder()
	
	{
		
		purchase_order.click();
		
	}
	
	public void purchase_invoice()
	{
		
		
		purchase_invoice.click();
		
	}
	
	
	public void click_salesenquiry()
	{
		
		
		sales_enquiry.click();
	}
	
	
	public void click_quotation()
	{
		
		
		quotation.click();
	}
	
	
	public void click_salesorder() 
	{
		Sales_Order.click();	
		
	}
	
	
	public void click_manualjournal()
	{
		
		
		Manual_journal.click();
	}
	
	public void click_serviceenquiry() 
	{
		
		service_enquiry.click();
		
	}
	
	public void click_receipt()
	{
		
		Receipt.click();
		
	}
	
	
	public void click_expense()
	
	{
		
		expense.click();
	}
	
	public void click_creditnote()
	{
		
		creditnote.click();
	}
	
	public void click_debitnote()
	{
	debitnote.click();
	
	}
	
	public void click_joborder()
	
	{
		joborder.click();
		
	}
	
	
	public void click_activity()
	{
		activity.click();
		
	}
	
	
	public void click_inventory()
	{
		inventory.click();
		
	}
	
	
	
	public void click_Accounts()
	{
		
		Accounts.click();
	}
	
	
	
	
public void click_purchase_invoice
()
	
	{
		
	purchase_invoice.click();
	}


public void click_cobntra()
{
	
	contra.click();
}
	
}


	

	
	
	
	

