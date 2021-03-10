package com.tranquil.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsInventorySelect 
{
	
	@FindBy(linkText="Stock Report")
	WebElement stockreport;
	
	@FindBy(linkText="Low Stock")
	WebElement lowstockreport;
	
	@FindBy(linkText="High Stock")
	WebElement highstockreport;
	
	@FindBy(linkText="Stock Adjustment")
	WebElement StockAdjustment;
	
	@FindBy(linkText="Stock Movement")
	WebElement StockMovement;
	
	@FindBy(linkText="Stock Transfer")
	WebElement Stocktransfer;
	
	@FindBy(linkText="Stock Summary")
	WebElement Stocksummary;
	
	@FindBy(linkText="Inventory Aging")
	WebElement inventoryaging;
	
	@FindBy(linkText="Log Report")
	WebElement logreport;
	
	@FindBy(linkText="Stock Details Report")
	WebElement stockdetailsreport;
	
	@FindBy(linkText="Stock Valuation Report")
	WebElement stockvaluationreport;
	
	@FindBy(linkText="Purchase")
    WebElement purchasetab;
	
	@FindBy(linkText="Sales")
	WebElement salestab;
	
	@FindBy(linkText="Purchase Order")
    WebElement purchaseorder;
	
	@FindBy(linkText="Goods Receipt")
    WebElement goodsreceipt;
	
	@FindBy(linkText="Purchase Invoice")
    WebElement purchaseinvoice;
	
	@FindBy(linkText="Purchase Return")
    WebElement purchasereturn;
	
	@FindBy(linkText="Purchase by Item")
    WebElement purchasebyitem;
	
	@FindBy(linkText="Debit Note Report")
    WebElement Debitnotereport;
	
	@FindBy(linkText="Quotations")
	WebElement quotations;
	
	@FindBy(linkText="Sales Order")
	WebElement salesorder;
	
	@FindBy(linkText="Goods Delivery Note")
	WebElement goodsdeliverynote;
	
	@FindBy(linkText="Sales Invoice")
	WebElement salesinvoice;
	
	@FindBy(linkText="Sales Return")
	WebElement salesreturn;
	
	@FindBy(linkText="Sales analysis report by salesman")
	WebElement Salesanalysisreportbysalesman;
	
	@FindBy(linkText="Invoice Detail report by Salesman")
	WebElement invoicedetailreportbysalesman;
	
	@FindBy(linkText="Sales by Item")
	WebElement salesbyitem;
	
	@FindBy(linkText="Credit Note Report")
	WebElement creditnotereport;
	
	@FindBy(linkText="Pending Delivery")
	WebElement pendingdelivery;
	
	@FindBy(linkText="Reserved Item")
	WebElement reserveditem;
	
	@FindBy(linkText="Sales by Price list")
	WebElement salesbypricelist;
	
	@FindBy(linkText="Sales Profit Report")
	WebElement salesprofitreport;
	
	@FindBy(linkText="Job Order")
	WebElement jobordertab;
	
	@FindBy(linkText="Job Report")
	WebElement JobReport;
	
	@FindBy(linkText="Job Status Report")
	WebElement Jobstatusreport;
	
	@FindBy(linkText="Job Cost Report")
	WebElement Jobcostreport;
	
	@FindBy(linkText="Job Financial Summary")
	WebElement jobfinancialsummary;
	
	@FindBy(linkText="Service Enquiry Report")
	WebElement serviceenquiryreport;
	
	@FindBy(linkText="projectdetailsreport")
	WebElement projectdetailsreport;
	
	public void click_stockreport()
	{
		stockreport.click();
		
		
	}
	
	public void click_lowstockreport()
	{
		lowstockreport.click();
		
		
	}

	public void click_highstockreport()
	{
		highstockreport.click();
	
	}
	public void click_StockAdjustment()
	{
		StockAdjustment.click();
	
	}
	public void click_StockMovement()
	{
		StockMovement.click();
	
	}
	public void click_Stocktransfer()
	{
		Stocktransfer.click();
	
	}
	public void click_Stocksummary()
	{
		Stocksummary.click();
	
	}
	public void click_inventoryaging()
	{
		inventoryaging.click();
	
	}
	public void click_logreport()
	{
		logreport.click();
	
	}
	public void stockdetailsreport()
	{
		stockdetailsreport.click();
	
	}
	public void click_stockvaluationreport()
	{
		stockvaluationreport.click();
	
	}
	public void click_purchasetab()
	{
		purchasetab.click();
		
	}
	
	public void click_purchaseorder()
	{
		purchaseorder.click();
		
	}
	
	
	
	public void click_debitnotereport()
	{
		Debitnotereport.click();
		
	}
	
	
	public void click_goodsreceipt()
	{
		goodsreceipt.click();
		
	}
	
	
	public void click_purchaseinvoice()
	{
		purchaseinvoice.click();
		
	}
	
	
	
	public void click_purchasereturn()
	{
		purchasereturn.click();
		
	}
	
	
	public void click_purchasebyitem()
	{
		purchasebyitem.click();
		
	}
	
	public void click_Debitnotereport()
	{
		
		Debitnotereport.click();
	}
	
	public void click_salestab() 
	{
		salestab.click();	
		
	}
	
	

	public void click_quotations() 
	{
		quotations.click();	
		
	}
	
	
	public void click_salesorder() 
	{
		salesorder.click();	
		
	}
	public void click_goodsdeliverynote() 
	{
		goodsdeliverynote.click();	
		
	}
	
	public void click_salesinvoice() 
	{
		salesinvoice.click();	
		
	}
	
	
	public void click_salesreturn() 
	{
		salesreturn.click();	
		
	}
	
	
	public void click_Salesanalysisreportbysalesman() 
	{
		Salesanalysisreportbysalesman.click();	
		
	}
	
	public void click_invoicedetailreportbysalesman() 
	{
		invoicedetailreportbysalesman.click();	
		
	}
	public void click_salesbyitem() 
	{
		salesbyitem.click();	
		
	}
	public void click_creditnotereport() 
	{
		creditnotereport.click();	
		
	}
	public void click_pendingdelivery() 
	{
		pendingdelivery.click();	
		
	}
	public void click_reserveditem() 
	{
		reserveditem.click();	
		
	}
	public void click_salesbypricelist() 
	{
		salesbypricelist.click();	
		
	}
	public void click_salesprofitreport() 
	{
		salesprofitreport.click();	
		
	}
	public void click_jobordertab() 
	{
		jobordertab.click();	
		
	}
	public void click_JobReport() 
	{
		JobReport.click();	
		
	}
	public void click_Jobstatusreport() 
	{
		Jobstatusreport.click();	
		
	}
	public void click_Jobcostreport() 
	{
		Jobcostreport.click();	
		
	}
	public void click_serviceenquiryreport() 
	{
		serviceenquiryreport.click();	
		
	}
	public void click_projectdetailsreport() 
	{
		projectdetailsreport.click();	
		
	}
	
}
