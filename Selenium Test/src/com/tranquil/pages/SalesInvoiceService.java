package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesInvoiceService 
{
	
	@FindBy(id="cmbPaymentTerms_chosen")
	WebElement paymentterms;
	
	@FindBy(id="txtDueDate")
	WebElement duedate;
	
	@FindBy(id="cmbStaff_chosen")
	WebElement salesman;
	
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> options;
	
	@FindBy(xpath="//button[@id='save-qtn']")
	WebElement save;
	
	@FindBy(id="cmbStaff_chosen")
	WebElement saleman;
	
	public void click_paymentterms()
	{
		
		paymentterms.click();
		
	}
	
	
	public void click_duedate(String date)
	{
		
		duedate.sendKeys(date);
		duedate.sendKeys(Keys.ENTER);
	}
	
	public void click_salesman()
	{
		
		salesman.click();
	}
	
	public void click_save(int index)
	{
		/*int count=save.size();
		System.out.println("total"+count);
				
		
		
			WebElement ele=save.get(index);*/
			
			
			
		save.click();
			
		
	}
	
	public void select_saleman(String salesmanname) throws Throwable
	{
		saleman.click();
		Thread.sleep(2000);
		int size=options.size();
		for(int i=0;i<=size;i++)
		{
		WebElement ele=options.get(i);
		String DS=ele.getAttribute("innerHTML");
		if(DS.contentEquals(salesmanname))
		{
			
			ele.click();
			break;
		}
		
		
			
		}
		
		
	}
	
	public void Select_paymentterms(String paymentterms) throws Throwable
	{
		
		
		for(WebElement ele:options)
		{
			
				if(ele.getAttribute("innerHTML").contains(paymentterms))
			{
				ele.click();
				break;
			}
			
			
		}
		
	}

	

}
