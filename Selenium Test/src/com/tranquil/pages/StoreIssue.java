package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class StoreIssue 
{
	
	@FindBy(id="chkMainAll")
	WebElement checkbox1;

	@FindBy(id="save-mr")
	WebElement save;
	
	@FindBy(id="cmbIssuedBy_chosen")
	WebElement issuedby;
	
	@FindBy(id="cmbApprovedBy_chosen")
	WebElement approvedby;
	
	@FindBy(xpath="//div[@id='cmbIssuedBy_chosen']//ul[@class='chosen-results']/li")
	List<WebElement> issuedby_options;
	
	@FindBy(xpath="//div[@id='cmbApprovedBy_chosen']//ul[@class='chosen-results']/li")
	List<WebElement> approvedby_options;
	
	
	
	
	public void check_checkbox1()
	{
		checkbox1.click();
		
		
	}
	
	public void click_save()
	{
		
		save.click();
	}
	public void click_approvedby()
	{
		
		approvedby.click();
		
	}
	
	public void click_issuedby()
	{
		issuedby.click();
		
	}
	
	public void Select_issuedbyoptions(String approvedby)
	{
		
		for(WebElement ele:issuedby_options)
		{
			
				if(ele.getAttribute("innerHTML").contains(approvedby))
			{
				ele.click();
				break;
			}
			
			
		}
		
	}
	
	public void Select_approvedbyoptions(String approvedby)
	{
		
		for(WebElement ele:approvedby_options)
		{
			
				if(ele.getAttribute("innerHTML").contains(approvedby))
			{
				ele.click();
				break;
			}
			
			
		}
		
	}
	
	
	public void select_locator(WebDriver ldriver,int i)
	{
		
		WebElement ele=ldriver.findElement(By.id("LocatorId_"+i+""));
		ele.click();
		
	}
	
	public void locator_options(WebDriver ldriver)
	{
		
		WebElement ele=ldriver.findElement(By.xpath("//select[@id=\"LocatorId_1\"]/option[@value='11']")); 
		ele.click();
		
	}

}
