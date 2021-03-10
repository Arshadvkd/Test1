package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfitandLossreport 
{
	
	
	@FindBy(xpath="//button[@class='btn btn-success btn-top-spc']")
	WebElement Show;
	
	
	@FindBy(id="filterPeriodFY_chosen")
	WebElement periodchoosen;
	
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> periodlist;
	
	@FindBy(xpath="//tr[@class='grName spTR']/td[@style='text-align:right;']")
	List<WebElement> grossprofit;
	
	
	public void click_show()
	{
		
		Show.click();
		
		
	}
	
	
	
	public String get_grossprofit()
	{
		
		WebElement ele=grossprofit.get(0);
		String DS=ele.getAttribute("innerHTML");
		
		
		return DS;
		
		
	}
	
	public void select_period(String periodoption)
	
	{
		periodchoosen.click();
		int count=periodlist.size();
		
		for(int i=0;i<count;i++)

		{
			WebElement ele=periodlist.get(i);
			String DS=ele.getAttribute("innerHTML");
			if(DS.contentEquals(periodoption))
			{
				
				ele.click();
				break;
			}
			
			
			
		}
		
		
		
	}
	
	

}
