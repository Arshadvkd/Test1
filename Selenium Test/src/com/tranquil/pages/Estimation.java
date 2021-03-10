package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Estimation 

{
	
	@FindBy(id="txtProduct_1")
    WebElement prodcut1_name;
	
	@FindBy(id="txtQty_1")
	WebElement product1_qty;
	
	@FindBy(id="txtProduct_2")
    WebElement prodcut2_name;
	
	@FindBy(id="txtQty_2")
	WebElement product2_qty;
	
	@FindBy(id="UOMId_1")
	WebElement uom1;
	
	@FindBy(id="UOMId_2")
	WebElement uom2;
	
	
	@FindBy(id="txtSellingPrice_1")
	WebElement unitprice1;
	
	@FindBy(id="txtSellingPrice_2")
	WebElement unitprice2;
	
	@FindBy(xpath="//i[@class='ion-information-circled']")
	WebElement misc_description;
	
	@FindBy(id="addRow")
	WebElement add_row;
	
	
	
	@FindBy(id="txtRepairNoLabours_1")
	WebElement nooflabors1;
	
	@FindBy(id="txtRepairNoDays_1")
	WebElement noofdays1;
	
	@FindBy(id="txtRepairHoursPerDay_1")
	WebElement hoursperday1;
	
	@FindBy(id="txtRepairLabourHours_1")
	WebElement totallaborhours1;
	
	@FindBy(id="txtChargesPerHours_1")
	WebElement chargerperhour1;
	
	@FindBy(id="txtEstmnTotalAmount_1")
	WebElement totalamount1;
	
	@FindBy(xpath="//div[@class='note-editable']")
	List<WebElement> misc_descriptiondetails;
	
	@FindBy(id="save-ServiceDescription")
	WebElement save_descrptn;
	
	@FindBy(id="txtPartNo_1")
	WebElement misc1_partno;
	
	
	@FindBy(id="txtMiscRequestedQty_1")
	WebElement misc1_requested_qty;
	
	@FindBy(id="txtMiscAuthorisedQty_1")
	WebElement misc1_unitprice;
	
	@FindBy(id="txtRepair_1")
	WebElement task1_name;
	
	@FindBy(id="txtRepairDescription_1")
	WebElement task1_descrptn;
	
	@FindBy(id="txtRepairLabourHours_1")
	WebElement task1_labourhours;
	
	@FindBy(id="txtChargesPerHours_1")
	WebElement task1_chrgesperhour;
	
	@FindBy(id="save-qtn")
    WebElement save;	
	public void misc_descriptionclick()
	{
		
		misc_description.click();
		
	}
	
	
	public void enter_item1(String item) throws Throwable
	
	{
		prodcut1_name.sendKeys(item);
		Thread.sleep(1000);
		prodcut1_name.sendKeys(Keys.ARROW_DOWN);
		prodcut1_name.sendKeys(Keys.ENTER);
	}
	 
	
	public void enter_qty1(String qty)
	{
		
		product1_qty.sendKeys(qty);
		
	}
	
	public void enter_uom1(String uom )
	{
		
		
		uom1.sendKeys(uom);
	}
	
	
public void enter_item2(String item)
	
	{
		prodcut2_name.sendKeys(item);
		
		
	}
	
	
	public void enter_qty2(String qty)
	{
		
		product2_qty.sendKeys(qty);
		
	}
	
	public void enter_uom2(String uom )
	{
		
		
		uom2.sendKeys(uom);
	}
	
	public void click_addrow()
	{
		
		add_row.click();
		
	}
	
	public void click_miscdescription()
	{
		misc_description.click();
		
	}
	
	
	
  public void enter_miscdescription(int index,String description)
	
	{
		
		int count=misc_descriptiondetails.size();
		System.out.println("total"+count);
				
		
		for(int i=0;i<=count;i++) 
		{
		
			WebElement ele=misc_descriptiondetails.get(index);
			
			
			{
			
			ele.sendKeys(description);
			
			break;
		
			}
			
		}
		
		
	}
	
	
	
	
	
	
 
	
	public void save_decription()
	{
		
		save_descrptn.click();
		
	}
	
	public void misc1_partnumber(String parrtno)
	
	{
		
		misc1_partno.sendKeys(parrtno);		
	}
	
	public void misc1_qty(String qty)
	{
		
		misc1_requested_qty.sendKeys(qty);
	}
	
	
	public void misc1_unitprice(String qty)
	{
		
		misc1_unitprice.sendKeys(qty);
	}
	
	
	
	
	
	public void misc1_labourhours(String hours)
	
	{
		task1_labourhours.sendKeys(hours);
		
		
	} 
	
	public void task1_name(String taskname) throws Throwable
	
	{
		task1_name.sendKeys(taskname);
		Thread.sleep(1000);
		task1_name.sendKeys(Keys.ARROW_DOWN);
		task1_name.sendKeys(Keys.ENTER);
		
	}
	
	
  public void task1_description(String description)
	
	{
	task1_descrptn.sendKeys(description);
		
		
	}
  
  
  public void nooflabors1(String noflabors)
  {
  nooflabors1.sendKeys(noflabors);
  
  }
  
  
  public void noofdays1(String days)
  {
	  noofdays1.sendKeys(days);
  
  }
  
  public void hoursperday1(String hours)
  {
  hoursperday1.sendKeys(hours);
  }
  
  public void chargerperhour1(String hours)
  {
	  chargerperhour1.sendKeys(hours);
	  
  }
  
  
	
  public void save()
  {
	  
	  save.click(); 
	  
  }
  
	
}
