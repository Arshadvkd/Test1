package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PurchaseOrder 
{
	
@FindBy(id="txtEnquiryNo")
WebElement rfq_no;

@FindBy(id="txtRequisitionNo")
WebElement request_no;

@FindBy(id="txtPurchaseOrderDate")
WebElement order_date;

@FindBy(id="txtReferenceNo")
WebElement ref_no;

@FindBy(id="checkTaxExcempt")
WebElement vat_exempt;

@FindBy(id="txtSupplierName")
WebElement supplier_name;

@FindBy(id="txtCCenter")
WebElement cost_center;


@FindBy(id="txtProduct_1")
WebElement item1;


@FindBy(id="txtProduct_2")
WebElement item2;



@FindBy(id="txtProduct_3")
WebElement item3;


@FindBy(id="txtProduct_4")
WebElement item4;


@FindBy(id="txtQty_1")
WebElement item1_qty;

@FindBy(id="txtQty_2")
WebElement item2_qty;

@FindBy(id="txtQty_1")
WebElement item3_qty;

@FindBy(id="txtQty_1")
WebElement item4_qty;
	

@FindBy(id="UOMId_1")
WebElement uom1;
	
@FindBy(id="UOMId_2")
WebElement uom2;	

@FindBy(id="UOMId_3")
WebElement uom3;

@FindBy(id="UOMId_4")
WebElement uom4;


@FindBy(id="txtRate_1")
WebElement purchase_price1;

@FindBy(id="txtRate_2")
WebElement purchase_price2;

@FindBy(id="txtRate_3")
WebElement purchase_price3;

@FindBy(id="txtRate_4")
WebElement purchase_price4;


@FindBy(id="txtDiscount_1")
WebElement item1_discount1;

@FindBy(id="txtDiscount_2")
WebElement item1_discount2;

@FindBy(id="txtDiscount_3")
WebElement item1_discount3;

@FindBy(id="txtDiscount_4")
WebElement item1_discount4;


@FindBy(id="txtDiscountType_1_chosen")
WebElement item1_discount_type;



@FindBy(id="txtDiscountType_2_chosen")
WebElement item2_discount_type;


@FindBy(id="txtDiscountType_3_chosen")
WebElement item3_discount_type;


@FindBy(id="txtDiscountType_4_chosen")
WebElement item4_discount_type;


@FindBy(id="txtCSO_1")
WebElement Job1_no;


@FindBy(id="txtUnit_1")
WebElement misc1_uom;

@FindBy(id="txtMiscQty_1")
WebElement misc1_qty;

@FindBy(id="txtMiscRate_1")
WebElement misc1_purchaseprice;

@FindBy(id="txtMiscDiscountAmount_1")
WebElement misc1_discount;

@FindBy(id="addRow")
WebElement addrow;

@FindBy(id="addMiscRow")
WebElement add_miscrow;

@FindBy(id="txtTotalDiscountAmount")
WebElement total_discount;

@FindBy(xpath="//div[@class='note-editable']")
WebElement terms_condtions;

@FindBy(id="txtShipmentAddress")
WebElement shipping_address;

@FindBy(id="save-po")
WebElement save;

@FindBy(id="txtVATId_1")
WebElement misc_vat_type;

@FindBy(id="txtPurchaseOrderDate")
WebElement purchaseorderdate;

@FindBy(xpath="//table[@class=' table-condensed']//td")
List<WebElement> Calendar;

public void click_podate()
{
	
	purchaseorderdate.click();
	
}


public void select_date(String date1)
{
	purchaseorderdate.click();
	int count=Calendar.size();
	for(int i=0;i<=count;i++)
	{
		WebElement ele=Calendar.get(i);
		
		String date=ele.getText();
		if(date.equalsIgnoreCase(date1))
		{
			ele.click();
			break;
			
			
			
		}
		
		
		
	}
	
	
}


public void select_rfqno(String rfqno)
{
	rfq_no.sendKeys(rfqno);
	rfq_no.sendKeys(Keys.ARROW_DOWN);
	rfq_no.sendKeys(Keys.ENTER);
	
}

public void select_requestno(String reqnumber)
{
	request_no.sendKeys(reqnumber);
	request_no.sendKeys(Keys.ARROW_DOWN);
	request_no.sendKeys(Keys.ENTER);
	
}

public void enter_suppliername(String suppliername) throws Throwable
{
	supplier_name.sendKeys(suppliername);
	Thread.sleep(1000);
	supplier_name.sendKeys(Keys.ARROW_DOWN);
	supplier_name.sendKeys(Keys.ENTER);
		
}


public void add_item1(String itemname) throws Throwable
{
	item1.sendKeys(itemname);
	Thread.sleep(1000);
	item1.sendKeys(Keys.ARROW_DOWN);
	item1.sendKeys(Keys.ENTER);
}

public void add_item2(String itemname) throws Throwable
{
	item2.sendKeys(itemname);
	Thread.sleep(1000);
	item2.sendKeys(Keys.ARROW_DOWN);
	item2.sendKeys(Keys.ENTER);
}

public void add_item3(String itemname) throws Exception
{
	item3.sendKeys(itemname);
	Thread.sleep(1000);
	item3.sendKeys(Keys.ARROW_DOWN);
	item3.sendKeys(Keys.ENTER);
}

public void add_item4(String itemname) throws Exception
{
	item4.sendKeys(itemname);
	Thread.sleep(1000);
	item4.sendKeys(Keys.ARROW_DOWN);
	item4.sendKeys(Keys.ENTER);
}

public void add_item1_qty(String quantity1)
{
	item1_qty.sendKeys(quantity1);
	
}


public void add_item2_qty(String quantity2)
{
	item2_qty.sendKeys(quantity2);
	
}

public void add_item3_qty(String quantity3)
{
	item3_qty.sendKeys(quantity3);
	
}

public void add_item4_qty(String quantity4)
{
	item4_qty.sendKeys(quantity4);
	
}

public void click_addrow() 
{
addrow.click();
	
	
}
public void enter_jobno(String jobno) throws Exception

{
	
	Job1_no.sendKeys(jobno);
	Thread.sleep(1000);
	Job1_no.sendKeys(Keys.ARROW_DOWN);
	Job1_no.sendKeys(Keys.ENTER);
}


public void enter_miscquantity1(String quantity) throws Throwable

{
	misc1_qty.sendKeys(quantity);
	Thread.sleep(1000);
	misc1_qty.sendKeys(Keys.ARROW_DOWN);
	misc1_qty.sendKeys(Keys.ENTER);
}

public void enter_miscpurchaseprice(String price)
{
	
	misc1_purchaseprice.sendKeys(price);
	
}


public void click_save()
{
	
	save.click();
}
//Zero rated=1
//Standard rated=2
public void select_item1_miscvattype(int index)
{
	

	Select vattype=new Select(misc_vat_type);
	

	vattype.selectByIndex(index);
	
	
	
}

public void product(WebDriver ldriver, String io, String productnmae, String qty, String unitprice)
		throws Throwable {

	System.out.println("i name" + io);
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

	WebElement ele2 = ldriver.findElement(By.id("txtRate_" + io + ""));
	ele2.sendKeys(unitprice);
	Thread.sleep(2000);
	ele2.click();
	Thread.sleep(2000);
	ele2.sendKeys(unitprice);
	Thread.sleep(2000);
	click_addrow();

}






}
