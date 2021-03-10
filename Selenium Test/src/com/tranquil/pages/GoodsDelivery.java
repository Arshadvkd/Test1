package com.tranquil.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoodsDelivery 
{
	WebDriver driver;

	@FindBy(id="chkMainAll")
    WebElement select_all;
	
	@FindBy(id="save-qtn")
	WebElement save;
	
	@FindBy(id="txtSONumber")
	WebElement sonumber;
	
	@FindBy(id="txtGDNDate")
	WebElement gdndate;
	
	
	@FindBy(id="txtCustomerName")
	WebElement cusname;
	
	@FindBy(id="txtReferenceNo")
	WebElement referencenumber;
	
	
	@FindBy(id="txtDeliveryPeriod")
	WebElement deliverperd;
	
	@FindBy(id="gdnCheckBox_1")
	WebElement checkbox1;
	
	@FindBy(id="gdnCheckBox_1")
	WebElement checkbox2;
	
	@FindBy(id="gdnCheckBox_1")
	WebElement checkbox3;
	
	@FindBy(id="txtSlNo_1")
	WebElement slno1;
	
	@FindBy(id="txtSlNo_2")
	WebElement slno2;
	
	@FindBy(id="txtSlNo_3")
	WebElement slno3;
	
	
	@FindBy(id="txtProduct_1")
	WebElement product1;
	
	@FindBy(id="txtProduct_2")
	WebElement product2;
	
	@FindBy(id="txtProduct_3")
	WebElement product3;
	
	@FindBy(id="cmbDivMethod_chosen")
	WebElement deliverymethod;
	
	
	
	
	@FindBy(id="txtOrderQty_1")
	WebElement orderqty1;
	
	@FindBy(id="txtOrderQty_2")
	WebElement orderqty2;
	
	@FindBy(id="txtOrderQty_3")
	WebElement orderqty3;
	
	@FindBy(id="orderUOM_1")
	WebElement ordereduom1;
	
	@FindBy(id="orderUOM_2")
	WebElement ordereduom2;
	
	@FindBy(id="orderUOM_3")
	WebElement ordereduom3;
	
	@FindBy(id="txtDeliveredQty_1")
	WebElement dlverdqty1;
	
	@FindBy(id="txtDeliveredQty_2")
	WebElement dlverdqty2;
	
	@FindBy(id="txtDeliveredQty_3")
	WebElement dlverdqty3;
	
	@FindBy(id="txtBalanceQty_1")
	WebElement balqty1;
	
	@FindBy(id="txtBalanceQty_2")
	WebElement balqty2;
	
	@FindBy(id="txtBalanceQty_3")
	WebElement balqty3;
	
	@FindBy(id="txtQty_1")
	WebElement qty1;
	
	@FindBy(id="txtQty_2")
	WebElement qty2;
	
	@FindBy(id="txtQty_3")
	WebElement qty3;
	

	@FindBy(id="UOM_1")
	WebElement uom1;
	
	@FindBy(id="UOM_2")
	WebElement uom2;
	
	
	@FindBy(id="UOM_3")
	WebElement uom3;
	
	@FindBy(id="WarehouseLocatorName_1")
	WebElement warehouselocator1;
	
	@FindBy(id="WarehouseLocatorName_2")
	WebElement warehouselocator2;
	
	@FindBy(id="WarehouseLocatorName_3")
	WebElement warehouselocator3;
	
	@FindBy(id="txtShippingAddress")
	WebElement shippingaddres;
	
	@FindBy(xpath="//div[@class='note-editable']")
	WebElement notes;
	
	@FindBy(id="closeQtn")
	WebElement close;
	
	
	
	public void select_all() 
	{
		select_all.click();
		
		
		
	}
	
	public void click_save()
	{
		
		save.click();
		
	}
	
	
	public void click_checkbox1()
	{
		
		checkbox1.click();
		
	}
	

	public void click_checkbox2()
	{
		
		checkbox2.click();
		
	}
	

	public void click_checkbox3()
	{
		
		checkbox3.click();
		
	}
	
	public void enter_qty1(String qty)
	{
		
		qty1.sendKeys(qty);
		
	}
	
	public void enter_qty2(String qty)
	{
		
		qty2.sendKeys(qty);
		
	}
	
	public void enter_qty3(String qty)
	{
		
		qty3.sendKeys(qty);
		
	}
	
	public void click_close()
	{
	close.click();
	}
	
	public void select_checkbox(WebDriver ldriver,String num) throws Throwable
	{
		WebElement ele=ldriver.findElement(By.id("gdnCheckBox_"+num+""));
		Thread.sleep(1000);
		ele.click();
		
	}
	
	
	public void enter_orderqty(WebDriver ldriver,String num,String qty)
	{
		WebElement ele=ldriver.findElement(By.id("txtQty_"+num+""));
		ele.sendKeys(qty);
		 
	}
	
	public String get_sonumber()
	{
		
		String data1=sonumber.getAttribute("value");
		return data1;
		
	}
	
	
	public String get_gdndate()
	{
		
		String data1=gdndate.getAttribute("value");
		return data1;
		
	}
	
	public String get_cusname()
	{
		
		String data1=cusname.getAttribute("value");
		return data1;
		
	}
	
	public String get_referencenumber()
	{
		
		String data1=referencenumber.getAttribute("value");
		return data1;
		
	}
	
	public String get_deliverperd()
	{
		
		String data1=deliverperd.getAttribute("value");
		return data1;
		
	}
	
	public String get_slno1()
	{
		
		String data1=slno1.getAttribute("value");
		return data1;
		
	}
	
	public String get_slno2()
	{
		
		String data1=slno2.getAttribute("value");
		return data1;
		
	}
	
	
	public String get_slno3()
	{
		
		String data1=slno3.getAttribute("value");
		return data1;
		
	}
	
	public String get_product1()
	{
		
		String data1=product1.getAttribute("value");
		return data1;
		
	}
	
	public String get_product2()
	{
		
		String data1=product2.getAttribute("value");
		return data1;
		
	}
	
	public String get_product3()
	{
		
		String data1=product3.getAttribute("value");
		return data1;
		
	}
	
	public String get_orderqty1()
	{
		
		String data1=orderqty1.getAttribute("value");
		return data1;
		
	}
	
	public String get_orderqty2()
	{
		
		String data1=orderqty2.getAttribute("value");
		return data1;
		
	}
	
	public String get_orderqty3()
	{
		
		String data1=orderqty3.getAttribute("value");
		return data1;
		
	}
	
	public String get_ordereduom1()
	{
		
		String data1=ordereduom1.getAttribute("value");
		return data1;
		
	}
	
	public String get_ordereduom2()
	{
		
		String data1=ordereduom2.getAttribute("value");
		return data1;
		
	}
	
	public String get_ordereduom3()
	{
		
		String data1=ordereduom3.getAttribute("value");
		return data1;
		
	}
	
	public String get_dlverdqty1()
	{
		
		String data1=dlverdqty1.getAttribute("value");
		return data1;
		
	}
	
	public String get_dlverdqty2()
	{
		
		String data1=dlverdqty2.getAttribute("value");
		return data1;
		
	}
	
	public String get_dlverdqty3()
	{
		
		String data1=dlverdqty3.getAttribute("value");
		return data1;
		
	}
	
	public String get_balqty1()
	{
		
		String data1=balqty1.getAttribute("value");
		return data1;
		
	}
	
	public String get_balqty2()
	{
		
		String data1=balqty2.getAttribute("value");
		return data1;
		
	}
	
	public String get_balqty3()
	{
		
		String data1=balqty3.getAttribute("value");
		return data1;
		
	}
	
	public String get_qty1()
	{
		
		String data1=qty1.getAttribute("value");
		return data1;
		
	}
	public String get_qty2()
	{
		
		String data1=qty2.getAttribute("value");
		return data1;
		
	}
	
	public String get_qty3()
	{
		
		String data1=qty3.getAttribute("value");
		return data1;
		
	}
	
	public String get_uom1()
	{
		
		String data1=uom1.getAttribute("value");
		return data1;
	}
	
	public String get_uom2()
	{
		
		String data1=uom2.getAttribute("value");
		return data1;
	}
	
	public String get_uom3()
	{
		
		String data1=uom3.getAttribute("value");
		return data1;
	}
	
	public String get_warehouselocator1()
	{
		
		String data1=warehouselocator1.getAttribute("value");
		return data1;
	}
	public String get_warehouselocator2()
	{
		
		String data1=warehouselocator2.getAttribute("value");
		return data1;
	}
	public String get_warehouselocator3()
	{
		
		String data1=warehouselocator3.getAttribute("value");
		return data1;
	}
	
	public String get_shippingaddres()
	{
		
		String data1=shippingaddres.getAttribute("value");
		return data1;
	}
	
	public String get_notes()
	{
		
		String data1=notes.getAttribute("value");
		return data1;
	}
	
	public String get_deliverymethod()
	{
		
		String data1=deliverymethod.getText();
		return data1;
		
		
	}
	
	
	public Float get_balqty1calculated()
	
	{
		Float qty=Float.parseFloat(get_orderqty1())-Float.parseFloat(get_dlverdqty1());
		return qty;
		
		
	}
	
public Float get_balqty2calculated()
	
	{
		Float qty=Float.parseFloat(get_orderqty2())-Float.parseFloat(get_dlverdqty2());
		return qty;
		
		
	}

public Float get_balqty3calculated()

{
	Float qty=Float.parseFloat(get_orderqty3())-Float.parseFloat(get_dlverdqty3());
	return qty;
	
	
}
}
