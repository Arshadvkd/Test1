package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOrder

{

	@FindBy(id = "txtCustomerName")
	WebElement customer;

	@FindBy(id = "txtSalesOrderDate")
	WebElement salesorderdate;

	@FindBy(id = "txtDeliveryPeriod")
	WebElement deliverperd;

	@FindBy(id = "txtReferenceNo")
	WebElement referenceno;

	@FindBy(id = "txtPONO")
	WebElement POnum;

	@FindBy(id = "checkTaxExcempt")
	WebElement vatexempt;

	@FindBy(id = "txtContactPerson")
	WebElement ContactPerson;

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

	@FindBy(id = "addRow")
	WebElement addrow;

	@FindBy(xpath = "//div[@class='note-editable']")
	WebElement notes;

	@FindBy(id = "save-qtn")
	WebElement save;

	@FindBy(id = "cmbStaff_chosen")
	WebElement saleman;

	@FindBy(xpath = "//ul[@class='chosen-results']/li")
	List<WebElement> chosen_list;

	@FindBy(id = "txtTax_1")
	WebElement vat1;

	@FindBy(id = "txtTax_2")
	WebElement vat2;

	@FindBy(id = "txtTax_3")
	WebElement vat3;

	@FindBy(id = "txtRowTotalWithTax_1")
	WebElement totalamount1;

	@FindBy(id = "txtRowTotalWithTax_1")
	WebElement totalamount2;

	@FindBy(id = "txtRowTotalWithTax_1")
	WebElement totalamount3;

	@FindBy(id = "txtDeliveryDate_1")
	WebElement deliveryperd1;

	@FindBy(id = "txtDeliveryDate_2")
	WebElement deliveryperd2;

	@FindBy(id = "txtDeliveryDate_3")
	WebElement deliveryperd3;

	@FindBy(id = "cmbDivMethod_chosen")
	WebElement deliverymethod;

	@FindBy(id = "cmbPaymentTerms_chosen")
	WebElement paymentterms;

	@FindBy(id = "cmbStaff_chosen")
	WebElement salesman;

	@FindBy(id = "txtShippingAddress")
	WebElement shippingaddres;

	@FindBy(id = "txtTotalAmt")
	WebElement Grandtotalamount;

	@FindBy(id = "txtDiscountTotalService")
	WebElement totaldicount;

	@FindBy(id = "txtTotalTax")
	WebElement totaltax;

	@FindBy(id = "txtRoundOff")
	WebElement roundoff;

	@FindBy(id = "txtNetAmount")
	WebElement netamount;

	@FindBy(xpath = "//a[@onclick='ObjSalesOrder.RemoveProductRow(2)']")
	WebElement delete_2ndrow;

	@FindBy(id = "cmbTermsConditions_chosen")
	WebElement tc;

	@FindBy(id = "txtCCenter")
	WebElement costcenter;
	
	@FindBy(id = "closeQtn")
	WebElement close;
	


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

		discount_3.sendKeys(Keys.ENTER);

	}

	public void enternotes(String note) {

		notes.sendKeys(note);

	}

	public void click_addrow()

	{

		addrow.click();
	}

	public void click_save() {

		save.click();
	}

	public void click_salesman() {

		saleman.click();
	}

	public void select_saleman(String salesman) throws Throwable {

		Thread.sleep(5000);
		int size = chosen_list.size();
		for (int i = 0; i < size; i++) {
			WebElement ele = chosen_list.get(i);
			String DS = ele.getAttribute("innerHTML");
			if (DS.contentEquals(salesman)) {
				ele.click();
				break;

			}
		}

	}

	public void select_deliverymethod(String method) throws Throwable {

		deliverymethod.click();
		Thread.sleep(5000);
		int size = chosen_list.size();
		for (int i = 0; i < size; i++) {
			WebElement ele = chosen_list.get(i);
			String DS = ele.getAttribute("innerHTML");
			if (DS.contentEquals(method)) {
				ele.click();
				break;

			}
		}

	}

	public void select_paymentterms(String terms) throws Throwable {
		paymentterms.click();
		Thread.sleep(5000);
		int size = chosen_list.size();
		for (int i = 0; i < size; i++) {
			WebElement ele = chosen_list.get(i);
			String DS = ele.getAttribute("innerHTML");
			if (DS.contentEquals(terms)) {
				ele.click();
				break;

			}
		}

	}

	public void select_termsandconditions(String tec) throws Throwable {

		tc.click();
		Thread.sleep(5000);
		int size = chosen_list.size();
		for (int i = 0; i < size; i++) {
			WebElement ele = chosen_list.get(i);
			String DS = ele.getAttribute("innerHTML");
			if (DS.contentEquals(tec)) {
				ele.click();
				break;

			}
		}

	}

	public void enter_deliveryperd(String perd) {

		deliverperd.sendKeys(perd);

	}

	public void enter_referenceno(String refno) {

		referenceno.sendKeys(refno);

	}

	public void click_vatexempt() {

		vatexempt.click();

	}

	public void enter_txtContactPerson(String contactperson) {

		ContactPerson.sendKeys(contactperson);

	}

	public void enter_deliveryperd1(String deliveryperd) {

		deliveryperd1.sendKeys(deliveryperd);

	}

	public void enter_deliveryperd2(String deliveryperd1) {

		deliveryperd2.sendKeys(deliveryperd1);

	}

	public void enter_deliveryperd3(String deliveryperd1) {

		deliveryperd3.sendKeys(deliveryperd1);

	}

	// GET Section
	public String get_sodate() {
		String date = salesorderdate.getAttribute("value");
		return date;

	}

	public String get_deliveryperd() {
		String perd = deliverperd.getAttribute("value");
		return perd;

	}

	public String get_reference() {
		String ref = referenceno.getAttribute("value");
		return ref;

	}

	public String get_cusname() {
		String cusname = customer.getAttribute("value");
		return cusname;

	}

	public String get_contactperson() {
		String contactperson = ContactPerson.getAttribute("value");
		return contactperson;

	}

	public String get_deliverymethod() {
		String dlvry = deliverymethod.getText();
		return dlvry;

	}

	public String get_paymentterms() {
		String terms = paymentterms.getText();
		return terms;

	}

	public String get_termsandconditions() {
		String tcd = tc.getText();
		return tcd;
	}

	public String get_salesman() {
		String salemanname = salesman.getText();
		return salemanname;
	}

	public String get_costcenter() {
		String costcentr = costcenter.getText();
		return costcentr;
	}

	public String get_item1name() {
		String itemname = itemname1.getAttribute("value");
		return itemname;

	}

	public String get_item2name() {
		String itemname = itemname2.getAttribute("value");
		return itemname;

	}

	public String get_item3name() {
		String itemname = itemname3.getAttribute("value");
		return itemname;

	}

	public String get_qty1() {
		String qty = qty1.getAttribute("value");
		return qty;

	}

	public String get_qty2() {
		String qty = qty2.getAttribute("value");
		return qty;

	}

	public String get_qty3() {
		String qty = qty3.getAttribute("value");
		return qty;

	}

	public String get_unitprice1() {
		String unitprice = unitprice1.getAttribute("value");
		return unitprice;

	}

	public String get_unitprice2() {
		String unitprice = unitprice2.getAttribute("value");
		return unitprice;

	}

	public String get_unitprice3() {
		String unitprice = unitprice3.getAttribute("value");
		return unitprice;

	}

	public String get_discount1() {
		String discount = discount_1.getAttribute("value");
		return discount;

	}

	public String get_discount2() {
		String discount = discount_2.getAttribute("value");
		return discount;

	}

	public String get_discount3() {
		String discount = discount_3.getAttribute("value");
		return discount;

	}

	public Float get_vat1() {
		Float vat = Float.parseFloat(vat1.getAttribute("value"));
		return vat;

	}

	public Float get_vat2() {
		Float vat = Float.parseFloat(vat2.getAttribute("value"));
		return vat;

	}

	public Float get_vat3() {
		Float vat = Float.parseFloat(vat3.getAttribute("value"));
		return vat;

	}

	public Float get_vat1_calculated() {
		Float vat1 = ((Float.parseFloat(get_unitprice1()) * Float.parseFloat(get_qty1()))
				- Float.parseFloat(get_discount1())) * 5 / 100;

		return vat1;

	}

	public Float get_vat2_calculated() {
		Float vat1 = ((Float.parseFloat(get_unitprice2()) * Float.parseFloat(get_qty2()))
				- Float.parseFloat(get_discount2())) * 5 / 100;

		return vat1;

	}

	public Float get_vat3_calculated() {
		Float vat1 = ((Float.parseFloat(get_unitprice3()) * Float.parseFloat(get_qty3()))
				- Float.parseFloat(get_discount3())) * 5 / 100;

		return vat1;

	}

	public Float get_product1_total_withvat()

	{

		Float totalwithoutdiscount = Float.parseFloat(get_unitprice1()) * Float.parseFloat(get_qty1())
				- Float.parseFloat(get_discount1());
		Float total = totalwithoutdiscount + get_vat1();
		return total;

	}

	public Float get_product2_total_withvat()

	{

		Float totalwithoutdiscount = Float.parseFloat(get_unitprice2()) * Float.parseFloat(get_qty2())
				- Float.parseFloat(get_discount2());
		Float total = totalwithoutdiscount + get_vat2();
		return total;

	}

	public Float get_product3_total_withvat()

	{

		Float totalwithoutdiscount = Float.parseFloat(get_unitprice3()) * Float.parseFloat(get_qty3())
				- Float.parseFloat(get_discount3());
		Float total = totalwithoutdiscount + get_vat3();
		return total;

	}

	public Float getTotalamount() {

		Float totalwithoutdiscount = Float.parseFloat(get_unitprice1()) * Float.parseFloat(get_qty1())
				- Float.parseFloat(get_discount1()) + +Float.parseFloat(get_unitprice2()) * Float.parseFloat(get_qty2())
				- Float.parseFloat(get_discount2()) + Float.parseFloat(get_unitprice3()) * Float.parseFloat(get_qty3())
				- Float.parseFloat(get_discount3());

		return totalwithoutdiscount;

	}

	public Float get_totalvat() {

		Float totalvat = get_vat1() + get_vat2() + get_vat3();

		return totalvat;

	}

	public Float get_netamount() {

		Float totalvat = getTotalamount() + get_totalvat() + Float.parseFloat(get_roundoff());

		return totalvat;

	}

	public String get_roundoff() {

		String roundof = roundoff.getAttribute("value");

		return roundof;

	}

	public void product(WebDriver ldriver, String io, String productnmae, String qty, String unitprice)
			throws Throwable {

		System.out.println("i name" + io);
		WebElement ele = ldriver.findElement(By.id("txtProduct_" + io + ""));
		Thread.sleep(1000);
		ele.sendKeys(productnmae);
		Thread.sleep(2000);
		ele.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		WebElement ele1 = ldriver.findElement(By.id("txtQty_" + io + ""));
		Thread.sleep(1000);
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

	public void delete_2ndrow() {

		delete_2ndrow.click();
	}
	
	public void close()
	{
		close.click();
		
		
	}
}
