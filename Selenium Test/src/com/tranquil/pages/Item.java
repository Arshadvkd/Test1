package com.tranquil.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Helper.readExcel;



public class Item 
{
	
	
	
	
	@FindBy(xpath="//button[@class='btn btn-add btn-settings']")
	WebElement new_item;
	
	@FindBy(id="txtproductCode")
	WebElement itemcode;
	
	@FindBy(id="ddlCategory_chosen")
	WebElement Category;
	
	@FindBy(id="ddlManufacture_chosen")
	WebElement manufacturer;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> category_options;
	
	@FindBy(xpath="//div[@id='ddlOpeningStockWarehouseId_1_chosen']//ul[@class='chosen-results']/li")
	List<WebElement> op_ware;
	
	@FindBy(xpath="//div[@id='ddlWarehouse_chosen']//ul[@class='chosen-results']/li")
	List<WebElement> def_ware;
	
	
	@FindBy(xpath="//div[@id='ddlOpeningStockUOMId_1_chosen']//ul[@class='chosen-results']/li")
	List<WebElement> op_uom1;
	
	
	
	@FindBy(id="txtproductName")
	WebElement product_name;
	
	
	@FindBy(id="ddlBaseUOM")
    WebElement base_Uom;
	
	@FindBy(id="btnNextTab")
	WebElement Next;
	
	@FindBy(id="ddlInventoryAssetAccount_chosen")
	WebElement inventory_asset_account;
	
	@FindBy(id="ddlIncomeAccount_chosen")
	WebElement income_account;
	
	@FindBy(id="ddlExpenseAccount_chosen")
	WebElement expense_account;
	
	@FindBy(id="ddlBaseUOM_chosen")
	WebElement base_uom;
	
	@FindBy(id="ddlUOM_1_chosen")
	WebElement uom12;
	
	@FindBy(xpath="//i[@class='ion-trash-a']")
	WebElement delete_uom;
	
	@FindBy(id="ddlWarehouse_chosen")
    WebElement def_warehouse;
	
	@FindBy(id="ddlLocator_chosen")
    WebElement def_locator;
	
	
	@FindBy(id="ddlOpeningStockWarehouseId_1_chosen")
    WebElement op_warehouse;
	
	@FindBy(id="ddlOpeningStockLocatorId_1")
    WebElement op_locator;
	
	@FindBy(id="ddlOpeningStockUOMId_1_chosen")
    WebElement op_uom;
	
	@FindBy(id="txtOpeningStockPurchasePrice_1")
	WebElement purchaseprice;
	
	@FindBy(id="txtOpeningSalesPrice_1")
	WebElement unitprice;
	
	@FindBy(id="txtOpeningStockCostPrice_1")
	WebElement costprice;
	
	
	@FindBy(id="txtOpeningStockQty_1")
	WebElement op_qty;
	
	
	@FindBy(id="btnNext")
	WebElement save;
	
	@FindBy(xpath="//span[@class='checkbox-label']")
	List<WebElement> service_item;
	
	@FindBy(id="ddlServiceUOM_chosen")
	WebElement service_uom;
	
	
	
	
	
    @FindBy(xpath="//ul[@class='chosen-results']/li")
    List<WebElement> service_uom_item;
	
	
	public void click_addnew()
	{
		
		new_item.click();
	}
	
	public void enter_code(String code) throws Exception
	{
		
		itemcode.sendKeys(code);
		Thread.sleep(5000);
		
	}
	
	public void selectcategory(String Categoryname) 
	{
		Category.click();
		int size=category_options.size();
		
		for(int i=0;i<=size;i++)
		{
			
			WebElement ele=category_options.get(i);
			
			String DS=ele.getAttribute("innerHTML");
				
				if(DS.contentEquals(Categoryname))
			{
				ele.click();
				break;
			}
			
			
		}
		
		
	}
	
	public void select_manufacturer(String manufacture) 
	{
		manufacturer.click();
		
      int size=category_options.size();
		
		for(int i=0;i<=size;i++)
		{
			
			WebElement ele=category_options.get(i);
			
			String DS=ele.getAttribute("innerHTML");
				
				if(DS.contentEquals(manufacture))
			{
				ele.click();
				break;
			}
			
			
		}
		
		
		
	}
	
	
	
	public void select_inventoryassetaccount(String inventoryassetacc)
	{
		
		inventory_asset_account.click();
		
		 int size=category_options.size();
			
			for(int i=0;i<=size;i++)
			{
				
				WebElement ele=category_options.get(i);
				
				String DS=ele.getAttribute("innerHTML");
					
					if(DS.contentEquals(inventoryassetacc))
				{
					ele.click();
					break;
				}
				
				
			}
		
		
		
	}
	
	
	
	public void select_incomeaccount(String incomeacc)
	{
		
		income_account.click();
		
		 int size=category_options.size();
			
			for(int i=0;i<=size;i++)
			{
				
				WebElement ele=category_options.get(i);
				
				String DS=ele.getAttribute("innerHTML");
					
					if(DS.contentEquals(incomeacc))
				{
					ele.click();
					break;
				}
				
				
			}
		
		
		
	}
	public void select_expenseaccount(String expenseaccount)
	{
		
		expense_account.click();
		
		 int size=category_options.size();
			
			for(int i=0;i<=size;i++)
			{
				
				WebElement ele=category_options.get(i);
				
				String DS=ele.getAttribute("innerHTML");
					
					if(DS.contentEquals(expenseaccount))
				{
					ele.click();
					break;
				}
				
				
			}
		
		
		
	}
	
	
public void click_save()
{
	
	
	Next.click();
	
	
}

public void enter_productname(String product) 
{
	
	product_name.sendKeys(product);
	
}
	

public void select_baseuom(String baseuom) throws Throwable
{
	base_uom.click();
	Thread.sleep(2000);
	
	 int size=category_options.size();
		
		for(int i=0;i<=size;i++)
		{
			
			WebElement ele=category_options.get(i);
			
			String DS=ele.getAttribute("innerHTML");
				
				if(DS.contentEquals(baseuom))
			{
				ele.click();
				break;
			}
			
			
		}
	
	
	
	
}
public void select_uom(String uom) throws Throwable
{
	uom12.click();
	Thread.sleep(2000);
	
	 int size=category_options.size();
		
		for(int i=0;i<=size;i++)
		{
			
			WebElement ele=category_options.get(i);
			
			String DS=ele.getAttribute("innerHTML");
				
				if(DS.contentEquals(uom))
			{
				ele.click();
				break;
			}
			
			
		}
	
	
	
}





public void datasave(String code,String name)
{
	itemcode.sendKeys(code);
	product_name.sendKeys(name);
	
	
	
}



public void delete_uom()
{
	
	delete_uom.click();
}

public void select_defwarehouse(String ware) throws Throwable
{
	def_warehouse.click();
	Thread.sleep(2000);
	
	 int size=category_options.size();
		
		for(int i=0;i<=size;i++)
		{
			
			WebElement ele=category_options.get(i);
			
			String DS=ele.getAttribute("innerHTML");
				
				if(DS.contentEquals(ware))
			{
				ele.click();
				break;
			}
			
			
		}
	
	
	
}


public void select_deflocator(String locator) throws Throwable
{
	def_locator.click();
	Thread.sleep(6000);
	
	 int size=category_options.size();
		
		for(int i=0;i<=size;i++)
		{
			
			WebElement ele=category_options.get(i);
			
			String DS=ele.getAttribute("innerHTML");
				
				if(DS.contentEquals(locator))
			{
				ele.click(); 
				break;
			}
			
			
		}
	
	
	
}

public void select_op_warehouse(String index) throws Throwable
{

	
	
	op_warehouse.click();
	Thread.sleep(6000);
	
	 int size=op_ware.size();
	 System.out.println("show "+size);
		
		for(int i=0;i<=size;i++)
		{
			
			WebElement ele=op_ware.get(i);
			
			String DS=ele.getAttribute("innerHTML");
				
				if(DS.contentEquals(index))
			{
				System.out.println("show "+ele.getSize());	
				ele.click();
				
				
				break;
			}
			
			
		}
	
	
	
	
}
	
public void select_op_locator(String op_locator1) 
{

	Select oplocator=new Select(op_locator);


	oplocator.selectByVisibleText(op_locator1);
	
}

public void select_op_uom(String opuom) throws Throwable

{

	op_uom.click();
	Thread.sleep(6000);
	
	 int size=op_uom1.size();

		
		for(int i=0;i<=size;i++)
		{
			
			WebElement ele=op_uom1.get(i);
			
			String DS=ele.getAttribute("innerHTML");
				
				if(DS.contentEquals(opuom))
			{
				
				ele.click();
				
				
				break;
			}
			
			
		}
	
	
}

public void enter_purchaseprice(String pprice)
{
	purchaseprice.sendKeys(pprice);
	
}

public void enter_unitprice(String uprice)
{
	
	unitprice.sendKeys(uprice);
	
}
public void enter_costprice(String cprice)
{
	
	costprice.sendKeys(cprice);
	
}

public void op_qty(String qty)

{
	op_qty.sendKeys(qty);
	
	
}

public void click_save1()
{
	save.click();
	
	
}

public void select_service(int index)
{
	
	int size=service_item.size();
	
	WebElement ele=service_item.get(index);
	ele.click();
	
}

public void select_serviceuom(String uom) throws Throwable
{
	service_uom.click();
	Thread.sleep(1000);
	int size=service_uom_item.size();
	for(int i=0;i<=size;i++)
	{
		
	WebElement ele=service_uom_item.get(i);
    String DS=ele.getAttribute("innerHTML");
    if(DS.contentEquals(uom))
    {
    	ele.click();
    	break;
    	
    }
    
	}
}

}
