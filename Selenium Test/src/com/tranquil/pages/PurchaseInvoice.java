package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchaseInvoice 
{
	@FindBy(id="save-po")
	WebElement save;
	
	@FindBy(id="ddlWareHouse_chosen")
	WebElement warehouse;
	
	@FindBy(id="txtSupplierName")
	WebElement supplier;
	
	@FindBy(xpath="//ul[@class='dropdown-menu action-drop-list']/li/a")
	List<WebElement> action_items;
	

    @FindBy(id="addRow")
    WebElement addrow;
    
   

	
	public void click_addrow() 
	{
	addrow.click();
		
		
	}
	
	public void save_purchaseinvoice()
	{
		save.click();
		
		
	}
	
	
	public void enter_suppliername(String suppliername) throws Throwable
	{
		supplier.sendKeys(suppliername);
		Thread.sleep(1000);
		supplier.sendKeys(Keys.ARROW_DOWN);
		supplier.sendKeys(Keys.ENTER);
			
	}
	
	public void select_warehouse()
	{
		warehouse.click();
	/*	
		int count=action_items.size();
		System.out.println("total"+count);
				
		
		for(int i=0;i<=count;i++) 
		{
		
			WebElement ele=action_items.get(i);
			String ds=ele.getAttribute("innerHTML");
			if(ds.contentEquals("Warehouse1"))
			
			{ 
			
			ele.click();
			break;
		
			}
			
		}
		*/
		
		

		
		
		
		
		
	}
	public void product(WebDriver ldriver, String io, String productnmae, String qty, String unitprice)
			throws Throwable {

		System.out.println("i name" + io);
		System.out.println("driver name"+ldriver);
		WebElement ele = ldriver.findElement(By.id("txtProduct_" + io + ""));
		ele.sendKeys(productnmae);
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		WebElement ele1 = ldriver.findElement(By.id("txtQty_" + io + ""));
		ele1.sendKeys(qty);
		Thread.sleep(2000);
		ele1.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		ele1.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		WebElement ele2 = ldriver.findElement(By.id("txtPurchaseRateInSupCurrency_" + io + ""));
		ele2.sendKeys(unitprice);
		Thread.sleep(2000);
		ele2.click();
		Thread.sleep(2000);
		ele2.sendKeys(unitprice);
		Thread.sleep(2000);
		click_addrow();

	}

	
	

}
