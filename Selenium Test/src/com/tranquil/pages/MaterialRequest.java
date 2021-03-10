package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaterialRequest 
{
	
	
	@FindBy(id="cmbRequestedBy_chosen")
	WebElement requestedby;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> options;
	
	@FindBy(xpath="//div[@id='cmbApprovedBy_chosen']//ul[@class='chosen-results']/li")
	List<WebElement> approved_options;
	
	
	
	@FindBy(id="cmbApprovedBy_chosen")
	WebElement approvedby;
	
	@FindBy(id="ddlWareHouse_chosen")
	WebElement warehouse;
	
	@FindBy(id="ddlLocator_chosen")
	WebElement locator;

	@FindBy(id="txtApprovedQty_1")
	WebElement approvedqty_1;
	
	
	@FindBy(id="save-mr")
	WebElement save;
	
	@FindBy(id="addRow")
	WebElement addrow;
	
	public void select_requestedby()
	{
		
		requestedby.click();
		
	}
	
	public void select_approvedby()
	{
		
		approvedby.click();
		
	}
	
	public void select_warehouse()
	{
		
		warehouse.click();
		
	}
	
	public void select_locator()
	{
		
		locator.click();
		
	}
	
	
	public void Select_RequestTypeoptions(String requesttype)
	{
		
		for(WebElement ele:options)
		{
			
				if(ele.getAttribute("innerHTML").contains(requesttype))
			{
				ele.click();
				break;
			}
			
			
		}
		
	}
	
	
	
	public void Select_approvedbyoptions(String approvedby)
	{
		
		for(WebElement ele:approved_options)
		{
			
				if(ele.getAttribute("innerHTML").contains(approvedby))
			{
				ele.click();
				break;
			}
			
			
		}
		
	}
	
	
	public void Select_warehouseoptions(String warehouse)
	{
		
		for(WebElement ele:options)
		{
			
				if(ele.getAttribute("innerHTML").contains(warehouse))
			{
				ele.click();
				break;
			}
			
			
		}
		
	}
	
	public void Select_locatoroptions(String locator)
	{
		
		for(WebElement ele:options)
		{
			
				if(ele.getAttribute("innerHTML").contains(locator))
			{
				ele.click();
				break;
			}
			
			
		}
		
	}
	
	
	
	public void select_requestedqty1(String qty1)
	{
		
		approvedqty_1.sendKeys(qty1);
		
		
	}
	
	public void click_save()
	{
		save.click();
		
	}
	
	public void click_addrow()
	{
		
		
		addrow.click();
	}
	
	
	public void product(WebDriver ldriver,String io, String productnmae, String qty, String approvedqty)
			throws Throwable {
		Thread.sleep(1000);
		System.out.println("i name" + io);
		System.out.println("driver name"+ldriver);
		WebElement ele = ldriver.findElement(By.id("txtProduct_"+io+""));
		System.out.println("element name"+ele);
		ele.click();
		Thread.sleep(1000);
		ele.sendKeys(productnmae);
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000); 
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(3000); 

		

		WebElement ele2 = ldriver.findElement(By.id("txtApprovedQty_"+io+""+""));
		ele2.sendKeys(approvedqty);
		Thread.sleep(2000);
		//ele2.click();
		//Thread.sleep(2000);
		//ele2.sendKeys(approvedqty);
		//Thread.sleep(2000);
	
		
		
		WebElement ele1 = ldriver.findElement(By.id("txtRequestedQty_"+io+ ""+""));
		Thread.sleep(1000);
		ele1.sendKeys(qty);
		Thread.sleep(2000);
		//ele1.sendKeys(Keys.TAB);
		//Thread.sleep(2000);
		//ele1.sendKeys(Keys.TAB);
		//Thread.sleep(2000);
		click_addrow();

	}

}
