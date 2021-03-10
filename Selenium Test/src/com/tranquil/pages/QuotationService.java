package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotationService 
{

	@FindBy(xpath="//i[@class='ion-information-circled']")
	WebElement misc_description;
	
	@FindBy(id="cmbService_chosen")
	WebElement service;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> choosen_results;
	
	

	@FindBy(xpath="//div[@class='note-editable']")
	List<WebElement> service_description;
	
	
	@FindBy(id="save-ServiceDescription")
	WebElement save_descrptn;
	
	
	@FindBy(id="txtUnit_1")
	WebElement uom1;
	
	@FindBy(id="txtServiceQty_1")
	WebElement qty1;
	
	@FindBy(id="txtserviceRate_1")
	WebElement unitprice;
	
	@FindBy(id="save-qtn")
	WebElement save;
	
	
	
	
	public void select_Service()
	{
		
		service.click();
	}
	
	
	
	public void select_serviceitem(String servicename) throws Throwable
	{
	
		
		int size=choosen_results.size();
		
		for(int i=0;i<=size;i++) 
		{
		
			WebElement ele=choosen_results.get(i);
			String DS=ele.getAttribute("innerHTML");
			
			if(DS.contentEquals(servicename))
			{
			
			ele.click();
			break;
		
			}
		}
			
		}
	
	
	 public void enter_servicedescription(int index,String description)
		
		{
			
			int count=service_description.size();
			System.out.println("total ohhhh"+count);
					
			
			for(int i=0;i<=count;i++) 
			{
			
				WebElement ele=service_description.get(index);
				
				ele.sendKeys(description);
				break;
				
			}
			
			
		}
		
	 
	 public void save_decription()
		{
			
			save_descrptn.click();
			
		}
		
	 
	 public void enter_uom1(String uom)
	 {
		 
		 uom1.sendKeys(uom);
		 
	 }
	 
	 public void enter_qty1(String qty)

	 
	 {
		 
		 qty1.sendKeys( qty);
	 }
	
	 
	 public void enter_unitprice(String price)
	 
	 {
		 unitprice.sendKeys(price);
		 
		 
	 }
	 
	 public void click_save()
	 {
		 save.click();
		 
	 }
	 
	 public void click_misc_description()
	 {
		 misc_description.click();
		 
	 }
	 
	 public void  quotation_vat(WebDriver ldriver,String index)
	 {
		 
		WebElement ele= ldriver.findElement(By.id("txtVATId_"+index+""));
		ele.click();
		 
		 
	 }
	
	 public void vatoptions(WebDriver ldriver)
	 {
	 WebElement ele= ldriver.findElement(By.xpath("//select[@id='txtVATId_1']/option[@value=21]"));
	 ele.click();
	 
	
	 }
}
