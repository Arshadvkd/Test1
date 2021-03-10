package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Receipt 
{
	
	@FindBy(id="txtReceiptReference")
	WebElement reference;
	
	@FindBy(id="txtCashAccount_chosen")
	WebElement cashaccount;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> cashaccount_list;
	
	@FindBy(id="accounttype_1")
	WebElement account1;
	
	@FindBy(id="txtCCenter_1")
	WebElement costcenter1;
	
	
	@FindBy(id="txtCCenter_2")
	WebElement costcenter2;
	
	@FindBy(id="txtReceiptNotes_1")
	WebElement descripton1;
	
	@FindBy(id="txtReceiptAmount_1")
	WebElement amount1;
	
	@FindBy(id="accounttype_2")
	WebElement account2;
	
	@FindBy(id="txtReceiptNotes_2")
	WebElement descripton2;
	
	@FindBy(id="txtReceiptAmount_2")
	WebElement amount2;
	
	@FindBy(xpath="//a[@class='btn btn-addRW margin-btm-c']")
	WebElement add_row;
	
	@FindBy(id="txtReceiptNotes")
	WebElement notes;
	
	@FindBy(id="saveButtonPost")
	WebElement Post;
	
	@FindBy(id="btnDraft")
	WebElement draft;
	
	
	public void enter_reference() 
	{
		
		reference.sendKeys();	
		
	}
	
	public void enter_cashaccount(String salesman)
	{
		cashaccount.click();
		
		int size=cashaccount_list.size();
		for(int i=0;i<=size;i++)
		{
			WebElement ele=cashaccount_list.get(i);
			
			String ds=ele.getAttribute("innerHTML");
			if(ds.contentEquals(salesman))
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
	
	
	public void enter_description1(String description)
	{
		
		descripton1.sendKeys(description);
	}
	
	public void enter_description2(String description)
	{
		
		descripton2.sendKeys(description);
	}
	
	public void enter_amount1(String amount)
	{
		
		amount1.sendKeys(amount);
	}
	
	
	public void enter_amount2(String amount)
	{
		
		amount2.sendKeys(amount);
	}
	
	public void enter_addrow()
	
	{
		
		add_row.click();
		
	}
	
	
	public void enter_notes(String notes1)
	{
		
		notes.sendKeys(notes1);
		
		
	}
	
	public void click_save()
	{
		
		Post.click();
		
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
	
	
	

}
