package com.tranquil.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesInvoice 

{
	WebDriver driver;
	
	@FindBy(id="addRow")
	WebElement addrow;

	
	@FindBy(id="save-qtn")
	WebElement save;
	
	@FindBy(id="txtCustomerName")
	WebElement customer;
	
	@FindBy(id="checkTaxExcempt")
	WebElement vatexempt;
	
	@FindBy(id="txtSalesInvoiceDate")
	WebElement salesinvoicedate;
	
	@FindBy(id="txtReferenceNo")
	WebElement referencenum;
	
	@FindBy(id="txtPONO")
	WebElement pono;

	@FindBy(id="txtContactPerson")
	WebElement contactperson;

	
	@FindBy(id="cmbPaymentTerms_chosen")
	WebElement paymenterms;

	@FindBy(id="txtDueDate")
	WebElement dueDate;
	
	@FindBy(id="cmbTermsConditions_chosen")
	WebElement termsandconditions;
	
	@FindBy(id="checkCredit")
	WebElement credit;
	
	@FindBy(id="cmbDivMethod_chosen")
	WebElement deliverymethod;

	@FindBy(id="cmbStaff_chosen")
	WebElement salesman;
	
	@FindBy(id="txtCCenter")
	WebElement costcenter;
	
	@FindBy(id="txtShippingAddress")
	WebElement shippingaddres;
	
	
	@FindBy(xpath="//div[@class='note-editable']")
	WebElement notes;
	
	@FindBy(xpath="	txtGrandTotal")
	WebElement total;

	
	@FindBy(xpath="charges_11")
	WebElement charge;


	@FindBy(xpath="txtDiscountTotalPer")
	WebElement totaldiscount;
	
	@FindBy(xpath="hdnTotalTax")
	WebElement totaltax;
	
	@FindBy(xpath="txtRoundOff")
	WebElement roundoff;
	
	@FindBy(xpath="//span[@id='txtNetAmount']")
	WebElement netamount;


	public void enter_customername(String customername) throws Throwable
	{
		customer.sendKeys(customername);
		Thread.sleep(2000);
		customer.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		customer.sendKeys(Keys.ENTER);
		
	}
	
	
	public void click_save()
	{
		save.click();
		
		
	}
	
	
public void click_addrow()
	
	{
		
		addrow.click();
	}

public void product(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("txtProduct_"+num+"")); 
	
}
	
public void account(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("accounttype_"+num+"chosen"));
	
}
public void warehouse(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("LocatorId_"+num+""));
	
}

public void qty(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("txtQty_"+num+""));
	
}


public void uom(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("UOMId_"+num+""));
	
}

public void unitprice(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("txtRate_"+num+""));
	
}

public void discount(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("txtDiscount_"+num+""));
	
}

public void discountype(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("txtDiscountType_"+num+"chosen"));
	
}

public void vat(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("txtVATIds_"+num+""));
	
}
public void taxamount(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("txtTax_"+num+""));
	
}

public void deliveryperd(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("txtDeliveryDate_"+num+""));
	
}

public void totalwithtax(WebDriver ldriver,String num)
{
	
	driver.findElement(By.id("txtRowTotalWithTax_"+num+""));
	
}




public String get_salesinvoicedate()
{
	String data =salesinvoicedate.getAttribute("value");
	return data;
	
	
}

public String get_customer()
{
	String data =customer.getAttribute("value");
	return data;
	
	
}
public String get_referencenum()
{
	String data =referencenum.getAttribute("value");
	return data;
	
	
}
public String get_pono()
{
	String data =pono.getAttribute("value");
	return data;
	
	
}
public String get_contactperson()
{
	String data =contactperson.getAttribute("value");
	return data;
	
	
}
public String get_roundoff()
{
	String data =roundoff.getAttribute("value");
	return data;
	
	
}

public String get_charge()
{
	String data =charge.getAttribute("value");
	return data;
	
	
}


public String get_paymenterms()
{
	String data =paymenterms.getText();
	return data;
	
	
}

public String get_dueDate()
{
	String data =dueDate.getAttribute("value");
	return data;
	
	
}
public String get_termsandconditions()
{
	String data =termsandconditions.getText();
	return data;
	
	
}
public String get_deliverymethod()
{
	String data =deliverymethod.getText();
	return data;
	
	
}
public String get_salesman()
{
	String data =salesman.getText();
	return data;
	
	
}
public String get_costcenter()
{
	String data =costcenter.getAttribute("value");
	return data;
	
	
}
public String get_shippingaddres()
{
	String data =shippingaddres.getAttribute("value");
	return data;
	
	
}

public String get_notes()
{
	String data =notes.getAttribute("value");
	return data;
	
	
}


public String get_total()
{
	String data =total.getAttribute("value");
	return data;
	
	
}
public String get_totaldiscount()
{
	String data =totaldiscount.getAttribute("value");
	return data;
	
	
}
public String get_totaltax()
{
	String data =totaltax.getAttribute("value");
	return data;
	
	
}
public String get_netamount()
{
	String data =netamount.getAttribute("value");
	return data;
	
	
}

public String get_productname(WebDriver ldriver,String num)
{
	
	WebElement ele=ldriver.findElement(By.id("txtProduct_"+num+""));
	
	String data=ele.getAttribute("value");
	return data;

	
	
}
	
public String get_qty(WebDriver ldriver,String num)
{
	
	WebElement ele=ldriver.findElement(By.id("txtQty_"+num+""));
	
	String data=ele.getAttribute("value");
	return data;

	
	
}
public String get_account(WebDriver ldriver,String num)
{
	
	WebElement ele=ldriver.findElement(By.id("accounttype_"+num+""));
	
	String data=ele.getAttribute("value");
	return data;


	
}
public String get_uom(WebDriver ldriver,String num)
{
	
	WebElement ele=ldriver.findElement(By.xpath("//select[@id='UOMId_"+num+"'"+"]"+""));
	
	String data=ele.getAttribute("value");
	return data;

	
	
}
public String get_unitprice(WebDriver ldriver,String num)
{
	
	WebElement ele=ldriver.findElement(By.id("txtRate_"+num+""));
	
	String data=ele.getAttribute("value");
	return data;

	
	
}
public String get_discount(WebDriver ldriver,String num)
{
	
	WebElement ele=ldriver.findElement(By.id("txtDiscount_"+num+""));
	
	String data=ele.getAttribute("value");
	return data;

	
	
}

public String get_discounttype(WebDriver ldriver,String num)
{
	
	WebElement ele=ldriver.findElement(By.id("txtDiscountType_"+num+""));
	
	String data=ele.getAttribute("value");
	return data;

	
	
}

public String get_vat(WebDriver ldriver,String num)
{
	
	WebElement ele=ldriver.findElement(By.id("txtTax_"+num+""));
	
	String data=ele.getAttribute("value");
	return data;

	
	
}

public String get_delivryperd(WebDriver ldriver,String num)
{
	
	WebElement ele=ldriver.findElement(By.id("txtDeliveryDate_"+num+""));
	
	String data=ele.getAttribute("value");
	return data;

	
	
}



public String get_totalwithtax(WebDriver ldriver,String num)
{
	
	WebElement ele=ldriver.findElement(By.id("txtRowTotalWithTax_"+num+""));
	
	String data=ele.getAttribute("value");
	return data;

	
	 
}

public Float VatCalculated(WebDriver driver,String num)
{
	
	Float vattotal=(((Float.parseFloat(get_qty(driver,num)))
			*(Float.parseFloat(get_unitprice(driver,num))))
			-Float.parseFloat(get_discount(driver,num)))*5/100;
			
	return vattotal;
	
	
}

public Float totalvat(WebDriver driver)
{
	
	Float vattotal=VatCalculated(driver,"1")+VatCalculated(driver,"2")+VatCalculated(driver,"3");
			
	return vattotal;
	
	
}



public Float totalamount(WebDriver driver)
{
	
	Float total=(((Float.parseFloat(get_qty(driver,"1")))
			*(Float.parseFloat(get_unitprice(driver,"1"))))
			-Float.parseFloat(get_discount(driver,"1")))+
			(((Float.parseFloat(get_qty(driver,"2")))
					*(Float.parseFloat(get_unitprice(driver,"2"))))
					-Float.parseFloat(get_discount(driver,"2")))
			+(((Float.parseFloat(get_qty(driver,"3")))
					*(Float.parseFloat(get_unitprice(driver,"3"))))
					-Float.parseFloat(get_discount(driver,"3")));
			
	return total;
	
	
}

public Float Totalamountlinewise(WebDriver driver,String num)
{
	
	Float total=(((Float.parseFloat(get_qty(driver,num)))
			*(Float.parseFloat(get_unitprice(driver,num))))
			-Float.parseFloat(get_discount(driver,num)))+(VatCalculated(driver,num));
			
	return total;
	
	
}
	public void product(WebDriver ldriver, String io, String productnmae, String qty, String unitprice)

			throws Throwable {

		System.out.println("i name" + io);
		WebElement ele = ldriver.findElement(By.id("txtProduct_" + io + ""));
		ele.sendKeys(productnmae);
		Thread.sleep(4000);
		ele.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(4000);

		WebElement ele1 = ldriver.findElement(By.id("txtQty_" + io + ""));
		ele1.sendKeys(qty);
		Thread.sleep(4000);
		ele1.sendKeys(Keys.TAB);
		Thread.sleep(4000);
		ele1.sendKeys(Keys.TAB);
		Thread.sleep(4000);

		WebElement ele2 = ldriver.findElement(By.id("txtRate_" + io + ""));
		ele2.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		ele2.sendKeys(unitprice);
		Thread.sleep(4000);
		ele2.click();
		Thread.sleep(4000);
		ele2.sendKeys(unitprice);
		Thread.sleep(4000);
		click_addrow();

	}

	
	


}
