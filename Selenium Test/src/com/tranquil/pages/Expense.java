package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Expense 
{
	@FindBy(id="txtCashAccount_chosen")
	WebElement cashaccount;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> cashaccount_list;
	
	@FindBy(id="accounttype_1")
	WebElement account1;
	
	@FindBy(id="accounttype_2")
	WebElement account2;
	
	
	@FindBy(id="txtCCenter_1")
	WebElement costcenter1;
	
	
	@FindBy(id="txtCCenter_2")
	WebElement costcenter2;
	
	@FindBy(id="txtPaymentNotes_1")
	WebElement description1;
	
	@FindBy(id="txtPaymentNotes_2")
	WebElement description2;
	
	@FindBy(id="txtPaymentAmount_1")
	WebElement amount1;
	
	@FindBy(id="txtPaymentAmount_2")
	WebElement amount2;
	
	@FindBy(xpath="//a[@class='btn btn-addRW margin-btm-c']")
	WebElement add_row;
	
	
	
	@FindBy(id="txtExpenseNotes")
	WebElement notes;
	
	@FindBy(id="saveButtonPost")
	WebElement save;
	
	
	
	public void enter_cashaccount(String cash)
	{
		cashaccount.click();
		
		int size=cashaccount_list.size();
		for(int i=0;i<=size;i++)
		{
			WebElement ele=cashaccount_list.get(i);
			
			String ds=ele.getAttribute("innerHTML");
			if(ds.contentEquals(cash))
			{
				
				ele.click();
				break;
				
			}
			
			
		} 
		
		
		
		
		
	}
	
	
	public void enter_account1(String account) throws Throwable
	{
		
		account1.sendKeys(account);
		Thread.sleep(1000);
		account1.sendKeys(Keys.ARROW_DOWN);
		account1.sendKeys(Keys.ENTER);
		
	}
	
	public void enter_account2(String account) throws Throwable
	{
		
		account2.sendKeys(account);
		Thread.sleep(1000);
		account2.sendKeys(Keys.ARROW_DOWN);
		account2.sendKeys(Keys.ENTER);
		
	}
	
	public void enter_costcenter1(String costcenter) throws Throwable
	
	{
		
		costcenter1.sendKeys(costcenter);
		Thread.sleep(1000);
		costcenter1.sendKeys(Keys.ARROW_DOWN);
		costcenter1.sendKeys(Keys.ENTER);
		
	}
	
  public void enter_costcenter2(String costcenter) throws Throwable
	
	{
		
		costcenter2.sendKeys(costcenter);
		Thread.sleep(1000);
		costcenter2.sendKeys(Keys.ARROW_DOWN);
		costcenter2.sendKeys(Keys.ENTER);
		
	 
	
	}
  
  public void enter_description1(String descrptn )
  {
	  
	  
	  description1.sendKeys(descrptn);
	  
  }
	
	
  public void enter_description2(String descrptn )
  {
	  
	  
	  description2.sendKeys(descrptn);
	  
  }
	
	public void enter_amount1(String amount)
	
	{
		
		amount1.sendKeys(amount);
		
	}
	

	public void enter_amount2(String amount)
	
	{
		
		amount2.sendKeys(amount);
		
	}
	
	public void enter_notes(String note)
	
	{
		
		notes.sendKeys(note);
		
	}
	
	
	public void click_save()
	{
		
		save.click();
		
	}
	
public void enter_addrow()
	
	{
		
		add_row.click();
		
	}
	
	
	
}
