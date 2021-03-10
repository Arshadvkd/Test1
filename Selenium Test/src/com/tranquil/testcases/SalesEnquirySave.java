package com.tranquil.testcases;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.tranquil.pages.GoodsReceive;
import com.tranquil.pages.GoodsReceiveList;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.Payment;
import com.tranquil.pages.PurchaseInvoice;
import com.tranquil.pages.PurchaseOrder;
import com.tranquil.pages.PurchaseOrderList;
import com.tranquil.pages.QuotationList;
import com.tranquil.pages.RFQList;
import com.tranquil.pages.SalesEnquiryList;
import com.tranquil.pages.SalesEnqury;
import com.tranquil.pages.purchaseinvoicelist;

import Helper.BrowserFactory;
import Helper.ScreenShot;
import Helper.currentDate;

public class SalesEnquirySave {
	WebDriver driver;

	@Test(priority=16,enabled=false)
	public void salesenquiry_save() throws Throwable {
		try {

			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
 			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			SalesEnquiryList salesenquirylist = PageFactory.initElements(driver, SalesEnquiryList.class);
			SalesEnqury salesenqry = PageFactory.initElements(driver, SalesEnqury.class);

			login.Login("hari@mail.com","123456789");
			 driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.click_salesenquiry();
			salesenquirylist.click_add();
			Thread.sleep(5000);
			salesenqry.select_saleman("Beena");
			Thread.sleep(2000);
			salesenqry.select_enquirytype("4ho5555ne");
			Thread.sleep(2000);
			
		/*	salesenqry.enter_reference("REFfrom Selenium");
			Thread.sleep(1000);
			salesenqry.select_paymentterms("Credit card");
			Thread.sleep(2000);
			salesenqry.enter_customername("cus new");
			Thread.sleep(2000);
			salesenqry.enter_item1("001");
			salesenqry.enter_qty1("2.000");
			Thread.sleep(1000);
			salesenqry.enter_unitprice1("1000");
			Thread.sleep(1000);
			
			//salesenqry.enter_discount1("3");
			salesenqry.enter_item2("002");
			Thread.sleep(2000);
			salesenqry.enter_qty2("3.000");
			Thread.sleep(2000);
			salesenqry.enter_unitprice2("300");
			salesenqry.enter_discount2("1.5");
			Thread.sleep(1000);
			salesenqry.enter_item3("003");
			Thread.sleep(2000);
			salesenqry.enter_qty3("4.000");
			Thread.sleep(2000);
			salesenqry.enter_unitprice3("500");
			Thread.sleep(1000);
			salesenqry.enter_discount3("3");
			salesenqry.enternotes(
					"Impeller, Pump; Type Suction, Material SS Jis G5121 GR SCS14A, FFT; FOR EQPT: EP-0523A/S MDL WY-9ST PH-32781-82, MNFR: Shin nippon machinery co. ltd, Mnfr part No: 3S7069 , Drawing 3ps-61412 PO 719 Rev 0");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("scroll(0,30)");
			salesenqry.clicksave();
			Thread.sleep(3000);*/
		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "salesenquiry_save");

		}

	}

	
	@Test(priority=1,enabled=false)
	public void salesenquiry_view() throws Throwable
	{
		SalesEnquiryList salesenquirylist = PageFactory.initElements(driver, SalesEnquiryList.class);
		SalesEnqury salesenqry = PageFactory.initElements(driver, SalesEnqury.class);

		Thread.sleep(3000);
		salesenquirylist.clickAction(0);
		Thread.sleep(3000);
		salesenquirylist.select_view();
		Thread.sleep(3000);
		
		Assert.assertEquals(currentDate.getcurrentdate(),salesenqry.get_orderdate());
		System.out.println("Enquiry date is correct");
		
		Assert.assertEquals(currentDate.getcurrentdate(),salesenqry.getbiddingexpirydate());
		System.out.println("bidding expiry date is correct");
		
		
		Assert.assertEquals("Credit card",salesenqry.getpaymentterms());
		System.out.println("payment terms is correct");
		
		
		
		Assert.assertEquals(salesenqry.get_salesman(),"Beena");
		System.out.println("salesman name is correct");
		
		
		
		Assert.assertEquals("Phone",salesenqry.get_enquiry());
		System.out.println("Enquiry type is correct");
		
		
		Assert.assertEquals("REFfrom Selenium",salesenqry.get_reference());
		System.out.println("Enquiry type is correct");
		
		Assert.assertEquals("cus new",salesenqry.get_customer());
		System.out.println("customer name is correct");
		
		Assert.assertEquals("IT001 - Item001",salesenqry.get_itemname1());
		System.out.println("item1 name is correct");
		
		Assert.assertEquals("IT002 - Item002",salesenqry.get_itemname2());
		System.out.println("item2 name is correct");
		
		Assert.assertEquals("003 - ITM003",salesenqry.get_itemname3());
		System.out.println("item3 name is correct");
		
		Assert.assertEquals("2.00",salesenqry.get_qty1());
		System.out.println("qty1 name is correct");
		
		Assert.assertEquals("3.00",salesenqry.get_qty2());
		System.out.println("qty2 name is correct");
		
		Assert.assertEquals("4.00",salesenqry.get_qty3());
		System.out.println("qty3 name is correct");
		
		Assert.assertEquals("1000.00",salesenqry.get_unitprice1());
		System.out.println("unitprice1 name is correct");
		
		Assert.assertEquals("300.00",salesenqry.get_unitprice2());
		System.out.println("unitprice2 name is correct");
		
		Assert.assertEquals("500.00",salesenqry.get_unitprice3());
		System.out.println("unitprice3 name is correct");
		
		
		Assert.assertEquals(1997.0f, salesenqry.Item1_get_total());
		System.out.println("total1 name is correct"); 
		

		Assert.assertEquals(898.5f, salesenqry.Item2_get_total());
		System.out.println("total2 name is correct"); 
		

		Assert.assertEquals(1997.0f, salesenqry.Item3_get_total());
		System.out.println("total3 name is correct"); 

		
		Assert.assertEquals(99.850f,salesenqry.vatamount_item1());
		System.out.println("vat1 amount is correct");
		
		Assert.assertEquals(44.925f,salesenqry.vatamount_item2());
		System.out.println("vat2 amount is correct");
		
		Assert.assertEquals(99.850f,salesenqry.vatamount_item3());
		System.out.println("vat3 amount is correct");
		
		
		Assert.assertEquals(4892.5f,salesenqry.amount_withoutvat());
		System.out.println("Total amount(without VAT) is correct");
		
		
		
		Assert.assertEquals(244.625f,salesenqry.vattotal());
		System.out.println("Total VAT is correct");
		
		
		

		Assert.assertEquals(5137.125f,salesenqry.nettotal());
		System.out.println("net amount is correct");
		
		Assert.assertEquals("Impeller, Pump; Type Suction, Material SS Jis G5121 GR SCS14A, FFT; FOR EQPT: EP-0523A/S MDL WY-9ST PH-32781-82, MNFR: Shin nippon machinery co. ltd, Mnfr part No: 3S7069 , Drawing 3ps-61412 PO 719 Rev 0",salesenqry.get_notes());
		System.out.println("notes is correct");
		salesenqry.click_close();
		
		
		
	}
	
	@Test(priority=2,enabled=false)
	public void verifysalesenquirylistvalue()
	
	{
		SalesEnquiryList salesenquirylist = PageFactory.initElements(driver, SalesEnquiryList.class);
		SalesEnqury salesenqry = PageFactory.initElements(driver, SalesEnqury.class);

		Assert.assertEquals(currentDate.getcurrentdatetime(),salesenquirylist.SEdate());
		System.out.println("date is correct "+salesenquirylist.SEdate());
		
		Assert.assertEquals("cus new",salesenquirylist.get_customername());
		System.out.println("customer name is correct");
		
		Assert.assertEquals(currentDate.getcurrentdate(),salesenquirylist.get_biddingdate());
		System.out.println("bidding date is correct");
		
		Assert.assertEquals("Beena",salesenquirylist.get_salemanname());
		System.out.println("salesman name is correct");
		
		Assert.assertEquals("REFfrom Selenium",salesenquirylist.get_reference());
		System.out.println("reference is correct");
		
		Assert.assertEquals("Approved",salesenquirylist.get_status());
		System.out.println("Status is correct");
		
		Assert.assertEquals("SAR  "+5+","+137.13f,salesenquirylist.get_netamount());
		System.out.println("net amount is correct");
		
	}
	
	
	@Test(priority=3,enabled=false)
	public void salesenquiry_edit() throws Throwable
	{
		SalesEnquiryList salesenquirylist = PageFactory.initElements(driver, SalesEnquiryList.class);
		SalesEnqury salesenqry = PageFactory.initElements(driver, SalesEnqury.class);
		Thread.sleep(3000);
		salesenquirylist.clickAction(0);
		Thread.sleep(2000);
		salesenquirylist.select_edit();
		Thread.sleep(2000);
		salesenqry.click_deleterow2();
		Thread.sleep(2000);
		salesenqry.enter_unitprice1("6500");
		Thread.sleep(2000);
		salesenqry.enter_qty1("10");
		Thread.sleep(2000);
		salesenqry.enter_discount1("3");
		Thread.sleep(2000);
		salesenqry.click_addrow();
		Thread.sleep(3000);
		salesenqry.enter_item4("900");
		Thread.sleep(2000);
		salesenqry.enter_qty4("3");
		Thread.sleep(2000);
		salesenqry.enter_unitprice4("1000");
		Thread.sleep(2000);
		salesenqry.clicksave();
		Thread.sleep(2000);
		salesenquirylist.clickAction(0);
		Thread.sleep(2000);
		salesenquirylist.select_view();
		Thread.sleep(2000);
		
		Assert.assertEquals("6500.00",salesenqry.get_unitprice1());
		System.out.println("Unit price updation working fine");
		
		Assert.assertEquals("10.00",salesenqry.get_qty1());
		System.out.println("qty updation working fine");
		
		Assert.assertEquals("3.00",salesenqry.get_discount1());
		System.out.println("discount updation working fine");
		
		Assert.assertEquals("1000.00",salesenqry.get_unitprice3());
		System.out.println("Unit price adding updation working fine");
		
		Assert.assertEquals("3.00",salesenqry.get_qty3());
		System.out.println("qty adding updation working fine");
		
		Assert.assertEquals("9002 - itemmasc01",salesenqry.get_itemname3());
		System.out.println("itemname adding updation working fine");
		
		
		salesenqry.click_close();
		
		
	}
	
	@Test(priority=4,enabled=false)
	public void salesenquiry_pdf() throws Throwable
	{
	
		SalesEnquiryList salesenquirylist = PageFactory.initElements(driver, SalesEnquiryList.class);
		
		Thread.sleep(3000);
		salesenquirylist.clickAction(0);
		Thread.sleep(2000);
		salesenquirylist.select_pdf();
		
		
	}
	
	
	@Test(priority=5,enabled=false)
	public void salesenquiry_cancelNo() throws Throwable
	{
		
		SalesEnquiryList salesenquirylist = PageFactory.initElements(driver, SalesEnquiryList.class);
	SalesEnqury salesenqry = PageFactory.initElements(driver, SalesEnqury.class);
		salesenquirylist.click_add();
		Thread.sleep(5000);
		salesenqry.select_saleman("Beena");
		Thread.sleep(2000);
		salesenqry.select_enquirytype("Phone");
		Thread.sleep(2000);
		
		salesenqry.enter_reference("REFfrom Selenium");
		Thread.sleep(1000);
		salesenqry.select_paymentterms("Credit card");
		Thread.sleep(2000);
		salesenqry.enter_customername("cus new");
		Thread.sleep(2000);
		salesenqry.enter_item1("001");
		salesenqry.enter_qty1("2.000");
		Thread.sleep(1000);
		salesenqry.enter_unitprice1("1000");
		Thread.sleep(1000);
		salesenqry.enter_discount1("3");
		salesenqry.enter_item2("002");
		Thread.sleep(2000);
		salesenqry.enter_qty2("3.000");
		Thread.sleep(2000);
		salesenqry.enter_unitprice2("300");
		salesenqry.enter_discount2("1.5");
		Thread.sleep(1000);
		salesenqry.enter_item3("003");
		Thread.sleep(2000);
		salesenqry.enter_qty3("4.000");
		Thread.sleep(2000);
		salesenqry.enter_unitprice3("500");
		Thread.sleep(1000);
		salesenqry.enter_discount3("3");
		salesenqry.enternotes(
				"Impeller, Pump; Type Suction, Material SS Jis G5121 GR SCS14A, FFT; FOR EQPT: EP-0523A/S MDL WY-9ST PH-32781-82, MNFR: Shin nippon machinery co. ltd, Mnfr part No: 3S7069 , Drawing 3ps-61412 PO 719 Rev 0");
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("scroll(0,30)");
		salesenqry.clicksave();
		Thread.sleep(3000);
		
		SalesEnquiryList salesenquirylist1 = PageFactory.initElements(driver, SalesEnquiryList.class);
		salesenquirylist1.clickAction(0);
		Thread.sleep(2000);
		salesenquirylist1.select_cancel();
		Thread.sleep(2000);
		salesenquirylist1.click_no(7);
		Thread.sleep(2000);
	}
	
	@Test(priority=7,enabled=false)
	public void salesenquiry_cancelYes() throws Throwable
	{
	SalesEnquiryList salesenquirylist1 = PageFactory.initElements(driver, SalesEnquiryList.class);
	salesenquirylist1.clickAction(0);
	Thread.sleep(2000);
	salesenquirylist1.select_cancel();
	Thread.sleep(2000);
	salesenquirylist1.click_yes(4);
	Thread.sleep(4000);
}
	
	@Test(priority=8,enabled=false)
	public void salesenquiry_quotation() throws Throwable
	{
	
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		SalesEnquiryList salesenquirylist = PageFactory.initElements(driver, SalesEnquiryList.class);
		
		Thread.sleep(3000);
		salesenquirylist.clickAction(0);
		Thread.sleep(2000);
		salesenquirylist.select_quotation();
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("Quotation"));
		System.out.println("Navigated to quotation sucessfully");
		Thread.sleep(2000);
		salesenquirylist.click_close();
		Thread.sleep(2000);
		overview.clickMenu();
		Thread.sleep(2000);
		menu.click_salesenquiry();
		Thread.sleep(2000);
	}
	  
	@Test(priority=9,enabled=false)
	public void salesenquiry_rfq() throws Throwable
	{
	
		SalesEnquiryList salesenquirylist = PageFactory.initElements(driver, SalesEnquiryList.class);
		RFQList rfqlist=PageFactory.initElements(driver,RFQList.class);
		
		Thread.sleep(1000);
		salesenquirylist.clickAction(0);
		Thread.sleep(2000);
		salesenquirylist.select_rfq();
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("PurchaseEnquiry"));
		System.out.println("Navigated to RFQ sucessfully");
		Thread.sleep(2000);
		rfqlist.click_close();
		
	}
}
