package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.readExcel;

public class Quotation

{

	
	
	@FindBy(id = "cmbsalesman_chosen")
	WebElement salesman;
	
	@FindBy(id = "txtQuotationDate")
	WebElement quotationdate;
	

	@FindBy(id = "addRow")
	WebElement addrow;

	@FindBy(id = "closeQtn")
	WebElement close;

	@FindBy(id = "txtReferenceNo")
	WebElement reference;

	@FindBy(xpath = "//div[@id='cmbsalesman_chosen']//ul/li")
	List<WebElement> salesmanlist;

	@FindBy(id = "txtCustomerName")
	WebElement customer;

	@FindBy(id = "txtProduct_1")
	WebElement itemname1;

	@FindBy(id = "txtProduct_2")
	WebElement itemname2;

	@FindBy(id = "txtProduct_3")
	WebElement itemname3;
	
	@FindBy(id = "txtProduct_4")
	WebElement itemname4;

	@FindBy(id = "txtQty_1")
	WebElement qty1;

	@FindBy(id = "txtQty_2")
	WebElement qty2;

	@FindBy(id = "txtQty_3")
	WebElement qty3;
	
	@FindBy(id = "txtQty_4")
	WebElement qty4;

	@FindBy(id = "txtRate_1")
	WebElement unitprice1;

	@FindBy(id = "txtRate_2")
	WebElement unitprice2;

	@FindBy(id = "txtRate_3")
	WebElement unitprice3;
	
	@FindBy(id = "txtRate_4")
	WebElement unitprice4;

	@FindBy(id = "txtDiscount_1")
	WebElement discount_1;

	@FindBy(id = "txtDiscountType_1_chosen")
	WebElement discount_1_type;

	@FindBy(id = "txtDiscount_2")
	WebElement discount_2;

	@FindBy(id = "txtDiscountType_2_chosen")
	WebElement discount_2_type;

	@FindBy(id = "txtDiscount_3")
	WebElement discount_3;

	@FindBy(id = "txtDiscountType_3_chosen")
	WebElement discount_3_type;

	@FindBy(xpath = "//div[@class='note-editable']")
	WebElement notes;

	@FindBy(id = "save-qtn")
	WebElement save;

	@FindBy(id = "txtCCenter")
	WebElement costcenter;

	@FindBy(id = "txtDeliveryPeriod")
	WebElement deliveryperd;

	@FindBy(id = "txtDeliveryDate_1")
	WebElement deliveryperd_pro1;

	@FindBy(id = "txtRoundOff")
	WebElement roundoff;
	
	@FindBy(id = "cmbDivMethod_chosen")
	WebElement deliverymethod;
	
	
	@FindBy(id = "cmbPaymentTerms_chosen")
	WebElement paymentterms;
	
	
	@FindBy(id = "cmbTermsConditions_chosen")
	WebElement termsandconditions;
	
	
	@FindBy(id="//span[@id='txtTotalAmt']")
	WebElement totalamount;
	
	@FindBy(id="charges_11")
	WebElement charges;
	
	@FindBy(id="txtTotalTaxBase")
	WebElement totalvat;
	
	
	@FindBy(id="txtNetAmount")
	WebElement netamount;
	
	@FindBy(id="txtTax_1")
	WebElement vat1;
	
	@FindBy(id="txtTax_1")
	WebElement vat2;
	
	@FindBy(id="txtTax_1")
	WebElement vat3;
	
	@FindBy(id="txtRowTotalWithTax_1")
	WebElement product1_total_withvat;
	
	@FindBy(id="txtRowTotalWithTax_2")
	WebElement product2_total_withvat;
	
	@FindBy(id="txtRowTotalWithTax_3")
	WebElement product3_total_withvat;
	
	@FindBy(xpath="//a[@onclick='ObjQuotation.RemoveProductRow(3)']")
	WebElement delete;
	

	@FindBy(xpath="//a[@onclick='ObjQuotation.RemoveProductRow(4)']")
	WebElement delete4;
	
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

	public void enter_reference(String ref) {

		reference.sendKeys(ref);

	}

	public void enter_deliveryperd(String perd)

	{
		deliveryperd.sendKeys(perd);

	}

	public void select_saleman(String salemanname) {
		salesman.click();

		int size = salesmanlist.size();
		for (int i = 0; i <= size; i++) {
			WebElement ele = salesmanlist.get(i);

			String ds = ele.getAttribute("innerHTML");
			if (ds.contentEquals(salemanname)) {

				ele.click();
				break;

			}

		}

	}

	public void enter_customername(String customername) throws Throwable {
		customer.sendKeys(customername);
		Thread.sleep(2000);
		customer.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		customer.sendKeys(Keys.ENTER);

	}

	public void enter_item1(String itemname) throws Throwable {
		itemname1.sendKeys(itemname);
		Thread.sleep(1000);
		itemname1.sendKeys(Keys.ARROW_DOWN);
		itemname1.sendKeys(Keys.ENTER);

	}

	public void enter_item2(String itemname) throws Throwable {
		itemname2.sendKeys(itemname);
		Thread.sleep(1000);
		itemname2.sendKeys(Keys.ARROW_DOWN);
		itemname2.sendKeys(Keys.ENTER);

	}

	public void enter_item3(String itemname) throws Throwable {
		itemname3.sendKeys(itemname);
		Thread.sleep(1000);
		itemname3.sendKeys(Keys.ARROW_DOWN);
		itemname3.sendKeys(Keys.ENTER);

	}

	public void enter_item4(String itemname) throws Throwable {
		itemname4.sendKeys(itemname);
		Thread.sleep(1000);
		itemname4.sendKeys(Keys.ARROW_DOWN);
		itemname4.sendKeys(Keys.ENTER);

	}

	
	public void enter_qty1(String qty) throws Throwable {
		qty1.sendKeys(qty);
		Thread.sleep(1000);
		qty1.sendKeys(Keys.TAB);
		qty1.sendKeys(Keys.TAB);
	}

	public void enter_qty2(String qty) throws Throwable {
		qty2.sendKeys(qty);
		Thread.sleep(1000);

		qty2.sendKeys(Keys.TAB);
		qty2.sendKeys(Keys.TAB);
	}

	public void enter_qty3(String qty) throws Throwable {
		qty3.sendKeys(qty);
		Thread.sleep(1000);

		qty3.sendKeys(Keys.TAB);
		qty3.sendKeys(Keys.TAB);

	}
	
	public void enter_qty4(String qty) throws Throwable {
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

	{
		unitprice2.click();
		unitprice2.sendKeys(unitprice);

	}

	public void enter_unitprice3(String unitprice)

	{
		unitprice3.click();
		unitprice3.sendKeys(unitprice);

	}
	
	public void enter_unitprice4(String unitprice)

	{
		unitprice4.click();
		unitprice4.sendKeys(unitprice);

	}


	public void enter_discount1(String dis) {

		discount_1.sendKeys(dis);
		discount_1.sendKeys(Keys.ENTER);

	}

	public void enter_discount2(String dis) {

		discount_2.sendKeys(dis);
		discount_2.sendKeys(Keys.ENTER);

	}

	public void enter_discount3(String dis) {

		discount_3.sendKeys(dis);

	}

	public void enter_deliveryperdPro1(String perd) {

		deliveryperd_pro1.sendKeys(perd);
	}

	public void enternotes(String note) {

		notes.sendKeys(note);

	}

	public void clicksave() {

		save.click();
	}

	public void click_addrow()

	{
		addrow.click();

	}

	public void click_close()

	{
		close.click();

	}

	public void enter_roundoff(String round) {
		roundoff.sendKeys(round);

	} 
	
	public String  get_quotatiodate()
	{
		
		String date=quotationdate.getAttribute("value");
		
		return date;
		
	}
	
	public String get_reference()
	{
		
		String referen=reference.getAttribute("value");
		return referen;
		
	}

	
	public String get_salesman()
	{
		
		String salesmn=salesman.getText();
		return salesmn;
		
	}
	
	public String get_costcenter()
	{
		
		String costceter=costcenter.getAttribute("value");
		return costceter;
		
		
	}
	
	public String get_customer()
	{
		
		String customr=customer.getAttribute("value");
		return customr;
		
		
	}
	
	public String get_product1()
	
	{
		
		String product1=itemname1.getAttribute("value");
		return product1;
		
	}
	
	public String get_qty1()
	{
		String qty=qty1.getAttribute("value");
		return qty;
		
		
	}
	
	
	public String get_uniprice1()
	{
		String unitprice=unitprice1.getAttribute("value");
		return unitprice;
		
		
	}
	
public String get_product2()
	
	{
		
		String product2=itemname2.getAttribute("value");
		return product2;
		
	}
	
	public String get_qty2()
	{
		String qty=qty2.getAttribute("value");
		return qty;
		
		
	}
	
	
	public String get_uniprice2()
	{
		String unitprice=unitprice2.getAttribute("value");
		return unitprice;
		
		
	}
	
public String get_product3()
	
	{
		
		String product2=itemname3.getAttribute("value");
		return product2;
		
	}
	
	public String get_qty3()
	{
		String qty=qty3.getAttribute("value");
		return qty;
		
		
	}
	
	
	public String get_uniprice3()
	{
		String unitprice=unitprice3.getAttribute("value");
		return unitprice;
		
		
	}
	
public String get_product4()
	
	{
		
		String product4=itemname4.getAttribute("value");
		return product4;
		
	}
	
	public String get_qty4()
	{
		String qty=qty4.getAttribute("value");
		return qty;
		
		
	}
	
	
	public String get_uniprice4()
	{
		String unitprice=unitprice4.getAttribute("value");
		return unitprice;
		
		
	}
	
	public String get_deliveryperd()
	{
		String dlvryperd=deliveryperd.getAttribute("value");
		return dlvryperd;
		
		
	}
	
	public String get_deliveryperd_pro1()
	{
		String dlvryperd=deliveryperd_pro1.getAttribute("value");
		return dlvryperd;
		
	}
	
	public String get_deliverymethod()
	{
		
		String dlvrymethd=deliverymethod.getText();
		
		return dlvrymethd;
		
	}
	public String get_paymentterms()

	
	{
		String terms =paymentterms.getText();
		return terms;
		
	}
	
	
public String get_termsandconditions()

	
	{
		String terms =termsandconditions.getText();
		return terms;
		
	}
	




public String get_charges()

{
	
	String charg =charges.getText();
	return charg;
	
	
}


 

public Float get_product1_total_withvat()

{
	
	Float totalwithoutdiscount =Float.parseFloat(get_uniprice1())*Float.parseFloat(get_qty1())-Float.parseFloat(get_discount_1());
	Float total=totalwithoutdiscount+get_vat1();
	return total;
	
	
}
public Float get_product2_total_withvat()

{
	
	Float totalwithoutdiscount =Float.parseFloat(get_uniprice2())*Float.parseFloat(get_qty2())-Float.parseFloat(get_discount_2());
	Float total=totalwithoutdiscount+get_vat2();
	return total;
	
	
}
public Float get_product3_total_withvat()

{
	
	Float totalwithoutdiscount =Float.parseFloat(get_uniprice3())*Float.parseFloat(get_qty3())-Float.parseFloat(get_discount_3());
	Float total=totalwithoutdiscount+get_vat3();
	return total;
	
	
}

public Float get_vat1()

{
	Float vat1=((Float.parseFloat(get_uniprice1())*Float.parseFloat(get_qty1()))-Float.parseFloat(get_discount_1()))*5/100;
	
	
	return vat1;
	
	
}
public Float get_vat2()

{
	Float vat1=((Float.parseFloat(get_uniprice2())*Float.parseFloat(get_qty2()))-Float.parseFloat(get_discount_2()))*5/100;
	
	
	return vat1;
	
	
}
public Float get_vat3()

{
	Float vat1=((Float.parseFloat(get_uniprice3())*Float.parseFloat(get_qty3()))-Float.parseFloat(get_discount_3()))*5/100;
	
	
	return vat1;
	
	
}
public String get_discount_1()

{
	
	String total =discount_1.getAttribute("value");
	return total;
	
	
}

public String get_discount_2()

{
	
	String total =discount_2.getAttribute("value");
	return total;
	
	
}

public String get_discount_3()

{
	
	String total =discount_3.getAttribute("value");
	return total;
	
	
}

public Float get_Totalamount()
{
	
	Float totalwithoutdiscount =Float.parseFloat(get_uniprice1())*Float.parseFloat(get_qty1())-Float.parseFloat(get_discount_1())+
			                  +Float.parseFloat(get_uniprice2())*Float.parseFloat(get_qty2())-Float.parseFloat(get_discount_2())
				               +Float.parseFloat(get_uniprice3())*Float.parseFloat(get_qty3())-Float.parseFloat(get_discount_3());
	
	return totalwithoutdiscount;
	
}

public Float get_totalvat()
{
	
	Float totalvat =get_vat1()+get_vat2()+get_vat3();
	
	
	return totalvat;
	
}

public Float get_netamount()
{
	
	Float totalvat =get_Totalamount()+get_totalvat()+Float.parseFloat(get_roundoff());
	
	return totalvat;
	
}
public String get_roundoff()
{
	
	
	String roundof=roundoff.getAttribute("value");
	
	return roundof;
	
}

public void delterow()

{
	
	
	delete.click();
}

public void delterow4()

{
	
	
	delete4.click();
}
	
}
