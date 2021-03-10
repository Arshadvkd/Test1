package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment 
{
	
	@FindBy(id="hdnBalanceAmount_0")
    WebElement balance_amount;
	
	@FindBy(id="txtAmount_0")
	WebElement pay_amount;
	
	@FindBy(id="btn-save")
    WebElement save;
	
	
	@FindBy(id="chkMainAll")
	WebElement selectall;
	
	@FindBy(id="txtCashAccount_chosen")
	WebElement cashaccount;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> cashaccounts;
	
	public String balance()
	{
		String amount =balance_amount.getAttribute("value");
		
		return amount;
		
	}
	
	
	public void enter_payamount(String amount)
	
	{
		pay_amount.sendKeys(amount);
		
		
	}
	
	public void click_save()
	{
		
		
		save.click();
	}
	
	public void click_checkbox()
	{
		selectall.click();
		
		
	}
	
	
	public void select_cashaccount(String cash) 
	{
		cashaccount.click();
		
      int size=cashaccounts.size();
		
		for(int i=0;i<=size;i++)
		{
			
			WebElement ele=cashaccounts.get(i);
			
			String DS=ele.getAttribute("innerHTML");
				
				if(DS.contentEquals(cash))
			{
				ele.click();
				break;
			}
			
			
		}
	
	
	
	
	}
}
