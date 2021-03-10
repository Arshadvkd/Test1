package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SalesEnqury 
{
@FindBy(id="cmbsalesman_chosen")
WebElement salesman;

@FindBy(xpath="//div[@id='cmbPaymentTerms_chosen']//ul/li")
List<WebElement> paymenttermslist;

@FindBy(id="txtReferenceNo")
WebElement reference;

@FindBy(id="cmbPaymentTerms_chosen")
WebElement paymentterms;

@FindBy(id="cmbEnquiryType_chosen") 
WebElement enquiry;
	

@FindBy(id="closeQtn")
WebElement close;

	
@FindBy(xpath="//div[@id='cmbsalesman_chosen']//ul/li")
List<WebElement> salesmanlist;


@FindBy(xpath="//div[@id='cmbEnquiryType_chosen']//ul/li")
List<WebElement> enquirylist;

@FindBy(id="txtCustomerName")
WebElement customer;

@FindBy(id="txtProduct_1")
WebElement itemname1;

@FindBy(id="txtProduct_2")
WebElement itemname2;

@FindBy(id="txtProduct_3")
WebElement itemname3;

@FindBy(id="txtProduct_4")
WebElement itemname4;


@FindBy(id="txtQty_1")
WebElement qty1;

@FindBy(id="txtQty_2")
WebElement qty2;

@FindBy(id="txtQty_3")
WebElement qty3;

@FindBy(id="txtQty_4")
WebElement qty4;


@FindBy(id="txtRate_1")
WebElement unitprice1;

@FindBy(id="txtRate_2")
WebElement unitprice2;

@FindBy(id="txtRate_3")
WebElement unitprice3;

@FindBy(id="txtRate_4")
WebElement unitprice4;

@FindBy(id="txtDiscount_1")
WebElement discount_1;

@FindBy(id="txtDiscountType_1_chosen")
WebElement discount_1_type;

@FindBy(id="txtDiscount_2")
WebElement discount_2;

@FindBy(id="txtBiddingExpDate")
WebElement biddingexpirydate;

@FindBy(id="txtDiscountType_2_chosen")
WebElement discount_2_type;

@FindBy(id="txtDiscount_3")
WebElement discount_3;

@FindBy(id="txtDiscountType_3_chosen")
WebElement discount_3_type;


@FindBy(xpath="//div[@class='note-editable']")
WebElement notes;

@FindBy(id="save-qtn")
WebElement save;

@FindBy(id="addRow")
WebElement addrow;


@FindBy(id="txtSalesEnquiryDate")
WebElement enquirydate;

@FindBy(xpath="//a[@onclick='ObjSalesEnquiry.RemoveProductRow(2)']")
WebElement deletebutton;


public void click_addrow()
{
	addrow.click();
	
	
}

public void click_deleterow2()
{
	deletebutton.click();
	
	
}
public void select_saleman(String salemanname)
{
	salesman.click();
	
	int size=salesmanlist.size();
	for(int i=0;i<=size;i++)
	{
		WebElement ele=salesmanlist.get(i);
		
		String ds=ele.getAttribute("innerHTML");
		if(ds.contentEquals(salemanname))
		{
			
			ele.click();
			break;
			
		}
		
		
	} 
	
}
	
public void select_enquirytype(String enquirytype)
{
	enquiry.click();
	int size=enquirylist.size();
	
	for(int i=0;i<=size;i++)
	{
		WebElement ele=enquirylist.get(i);
		String ds=ele.getAttribute("innerHTML");
		if(ds.contentEquals(enquirytype))
		{
			ele.click();
			break;
			
			
		}
		
		
		
	}
	
	
	
	
}

public void select_paymentterms(String terms)

{
	paymentterms.click();
	
	int size=paymenttermslist.size();

	for(int i=0;i<=size;i++)
		
	{
		
	WebElement ele	=paymenttermslist.get(i);
	String ds=ele.getAttribute("innerHTML");
	
	if(ds.contentEquals(terms))
		
	{
		ele.click();
		break;
		
		
	}
		
	}
	
	
}

public void enter_customername(String customername) throws Throwable
{
	customer.sendKeys(customername);
	Thread.sleep(1000);
	customer.sendKeys(Keys.ARROW_DOWN);
	customer.sendKeys(Keys.ENTER);
	
}

public void enter_item1(String itemname) throws Throwable
{
	itemname1.sendKeys(itemname);
	Thread.sleep(1000);
	itemname1.sendKeys(Keys.ARROW_DOWN);
	itemname1.sendKeys(Keys.ENTER);
	
	
}

public void enter_item2(String itemname) throws Throwable
{
	itemname2.sendKeys(itemname);
	Thread.sleep(1000);
	itemname2.sendKeys(Keys.ARROW_DOWN);
	itemname2.sendKeys(Keys.ENTER);
	
	
}
public void enter_item3(String itemname) throws Throwable
{
	itemname3.sendKeys(itemname);
	Thread.sleep(1000);
	itemname3.sendKeys(Keys.ARROW_DOWN);
	itemname3.sendKeys(Keys.ENTER);
	
	
	
}

public void enter_item4(String itemname) throws Throwable
{
	itemname4.sendKeys(itemname);
	Thread.sleep(1000);
	itemname4.sendKeys(Keys.ARROW_DOWN);
	itemname4.sendKeys(Keys.ENTER);
	
	
	
}

public void enter_qty1(String qty) throws Throwable
{    
	qty1.click();
	qty1.sendKeys(qty);
	Thread.sleep(1000);
	qty1.sendKeys(Keys.TAB);
	qty1.sendKeys(Keys.TAB);
}

public void enter_qty2(String qty) throws Throwable
{
	qty2.sendKeys(qty);
	Thread.sleep(1000);
	
	qty2.sendKeys(Keys.TAB);
	qty2.sendKeys(Keys.TAB);
}

public void enter_qty3(String qty) throws Throwable
{
	qty3.sendKeys(qty);
	Thread.sleep(1000);
	
	qty3.sendKeys(Keys.TAB);
	qty3.sendKeys(Keys.TAB);
	
}

public void enter_qty4(String qty) throws Throwable
{   qty4.click();
	qty4.sendKeys(qty);
	
	Thread.sleep(1000);
	
	qty4.sendKeys(Keys.TAB);
	qty4.sendKeys(Keys.TAB);
	
}


public void enter_unitprice1(String unitprice) throws Throwable

{
	unitprice1.click();
	
	unitprice1.sendKeys(unitprice);
	
		
}

public void enter_unitprice2(String unitprice)

{   unitprice2.click();
	unitprice2.sendKeys(unitprice);
	
	
}

public void enter_unitprice3(String unitprice)

{   unitprice3.click();
	unitprice3.sendKeys(unitprice);
	
	
}
public void enter_unitprice4(String unitprice) throws Throwable

{   unitprice4.click();
    Thread.sleep(1000);
	unitprice4.sendKeys(unitprice);
	
	
}

public void enter_discount1(String dis) throws Throwable
{
	 discount_1.click();
	 discount_1.sendKeys(dis);
	 Thread.sleep(3000);
	

	
	
}

public void enter_discount2(String dis)
{
	 discount_2.click();
	 discount_2.sendKeys(dis);
	
	
	
}

public void enter_discount3(String dis)
{
	
	
	 discount_3.click();	
	 discount_3.sendKeys(dis);
	
	
	
}



public void enternotes(String note)
{
	
	notes.sendKeys(note);
	
}


public void clicksave()
{
	
	
	save.click();
}

public String get_unitprice()
{
	String unitprice=unitprice1.getAttribute("value");
	return unitprice;
	
}


public String get_salesman()
{
	String saleman=salesman.getText();
	return saleman;
	
}

public String get_enquiry()
{
	String enquiry1=enquiry.getText();
	return enquiry1;
	
}

public String get_itemname1()
{
	String itm1=itemname1.getAttribute("value");
	return itm1;
	
}



public String get_itemname2()
{
	String itm2=itemname2.getAttribute("value");
	return itm2;
	
}


public String get_itemname3()
{
	String itm3=itemname3.getAttribute("value");
	return itm3;
	
}


public String get_qty1()
{
	String qty=qty1.getAttribute("value");
	return qty;
	
}


public String get_qty2()
{
	String qty=qty2.getAttribute("value");
	return qty;
	
}

public String get_qty3()
{
	String qty=qty3.getAttribute("value");
	return qty;
	
}

public String get_unitprice1()
{
	String unit1=unitprice1.getAttribute("value");
	return unit1;
	
}
public String get_unitprice2()
{
	String unit2=unitprice2.getAttribute("value");
	return unit2;
	
}
public String get_unitprice3()
{
	String unit3=unitprice3.getAttribute("value");
	return unit3;
	
}
public String get_notes()
{
	String note=notes.getText();
	return note;
	
}
public String get_orderdate()
{
	String date=enquirydate.getAttribute("value");
	return date;
	
}
public String get_customer()
{
	String customr=customer.getAttribute("value");
	return customr;
	
}



public String get_discount1()
{
	String disc1=discount_1.getAttribute("value");
	return disc1;
	
}
public String get_discount2()
{
	String disc2=discount_2.getAttribute("value");
	return disc2;
	
}

public String get_discount3()
{
	String disc3=discount_3.getAttribute("value");
	return disc3;
	
} 


public float Item1_get_total()
{
	
 Float sum1= Float.parseFloat(get_unitprice1())*Float.parseFloat(get_qty1())-Float.parseFloat(get_discount1());
 return sum1;
	
}


public float Item2_get_total()
{
	
 Float sum1= Float.parseFloat(get_unitprice2())*Float.parseFloat(get_qty2())-Float.parseFloat(get_discount2());
return sum1;
	
}

public float Item3_get_total()
{
	
Float sum1= Float.parseFloat(get_unitprice3())*Float.parseFloat(get_qty3())-Float.parseFloat(get_discount3());
return sum1;
	
}

public float amount_withoutvat()
{
	
	Float total=Item1_get_total()+Item2_get_total()+Item3_get_total();
	return total;
	
}






public float vatamount_item1()

{
	
	float vat1=(Item1_get_total()*5)/100;
	return vat1;
	
}

public float vatamount_item2()

{
	
	float vat1=(Item2_get_total()*5)/100;
	return vat1;
	
}

public float vatamount_item3()

{
	
	float vat1=(Item3_get_total()*5)/100;
	return vat1;
	
}


public float vattotal()
{
	
	Float total=vatamount_item1()+vatamount_item2()+vatamount_item3();
	return total;
	
}

public float nettotal()
{
	
	Float net=amount_withoutvat()+vattotal();
	return net;
	
}

public String getbiddingexpirydate() 
{
	
	String date=biddingexpirydate.getAttribute("value");
	return date;
}


public String getpaymentterms()
{
	
	String paymntterms=paymentterms.getText();
	return paymntterms;
	
}

public void enter_reference(String ref)
{
	
	reference.sendKeys(ref);
	
}

public void click_close()

{
close.click();

}

public String get_reference()
{
	String ref=reference.getAttribute("value");
	return ref;
	
	
}
	
}
