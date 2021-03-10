package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.Quotation;
import com.tranquil.pages.QuotationList;
import com.tranquil.pages.SalesEnquiryList;
import com.tranquil.pages.SalesEnqury;

import Helper.BrowserFactory;
import Helper.ScreenShot;
import Helper.currentDate;
import Helper.writeExcel;

public class QuotationSave {
	WebDriver driver; 
 
	@Test(priority = 10,enabled=false)
	public void save_quotition() {
		try {
			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			QuotationList qtlist = PageFactory.initElements(driver, QuotationList.class);
			Quotation quotation = PageFactory.initElements(driver, Quotation.class);

			login.Login("hari@mail.com", "123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.click_quotation();
			qtlist.click_add();
			Thread.sleep(5000);
			quotation.select_saleman("Beena");
			Thread.sleep(2000);
			quotation.enter_deliveryperd("5");
			Thread.sleep(2000);
			quotation.enter_reference("Ref Selenium testing");
			Thread.sleep(1000);
			quotation.enter_customername("cus new");
			Thread.sleep(2000);
			quotation.enter_item1("001");
			quotation.enter_qty1("2");
			Thread.sleep(1000);
			quotation.enter_unitprice1("1000");
			Thread.sleep(1000);
			quotation.enter_discount1("3");
			Thread.sleep(1000);
			quotation.enter_deliveryperdPro1("10");
			quotation.enter_item2("002");
			Thread.sleep(2000);
			quotation.enter_qty2("3");
			Thread.sleep(2000);
			quotation.enter_unitprice2("300");
			quotation.enter_discount2("1");
			Thread.sleep(1000);
			quotation.enter_item3("003");
			Thread.sleep(2000);
			quotation.enter_qty3("2");
			Thread.sleep(2000);
			quotation.enter_unitprice3("500");
			Thread.sleep(1000);
			quotation.enter_discount3("3");
			quotation.enternotes(
					"Impeller, Pump; Type Suction, Material SS Jis G5121 GR SCS14A, FFT; FOR EQPT: EP-0523A/S MDL WY-9ST PH-32781-82, MNFR: Shin nippon machinery co. ltd, Mnfr part No: 3S7069 , Drawing 3ps-61412 PO 719 Rev 0");
			Thread.sleep(1000);
			quotation.enter_roundoff("10");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("scroll(0,30)");
			Thread.sleep(2000);
			quotation.clicksave();
			Thread.sleep(2000);

		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "save_quotition");

		}
	}

	@Test(priority = 1,enabled=false)
	public void view_quotation() throws Throwable

	{
		QuotationList qtlist = PageFactory.initElements(driver, QuotationList.class);
		Quotation quotation = PageFactory.initElements(driver, Quotation.class);

		qtlist.click_action(0);
		Thread.sleep(2000);
		qtlist.click_view();
		Thread.sleep(2000);

		Assert.assertEquals(currentDate.getcurrentdate(), quotation.get_quotatiodate());
		System.out.println("quotation date is correct");

		Assert.assertEquals("5", quotation.get_deliveryperd());
		System.out.println("quotation deliveryperiod is correct");

		Assert.assertEquals("Ref Selenium testing", quotation.get_reference());
		System.out.println("reference is correct");

		Assert.assertEquals("Beena", quotation.get_salesman());
		System.out.println("salesman is correct");

		Assert.assertEquals("cost center01", quotation.get_costcenter());
		System.out.println("cost center date is correct");

		Assert.assertEquals("cus new", quotation.get_customer());
		System.out.println("customer is correct");

		Assert.assertEquals("IT001 - Item001", quotation.get_product1());
		System.out.println("productname1 is correct");

		Assert.assertEquals("IT002 - Item002", quotation.get_product2());
		System.out.println("productname2 is correct");

		Assert.assertEquals("003 - ITM003", quotation.get_product3());
		System.out.println("productname3 is correct");

		Assert.assertEquals("2.000", quotation.get_qty1());
		System.out.println("qty1 is correct");

		Assert.assertEquals("3.000", quotation.get_qty2());
		System.out.println("qty2 is correct");

		Assert.assertEquals("2.000", quotation.get_qty3());
		System.out.println("qty3 is correct");

		Assert.assertEquals("1000.000", quotation.get_uniprice1());
		System.out.println("unitprice1 is correct");

		Assert.assertEquals("300.000", quotation.get_uniprice2());
		System.out.println("unitprice2 is correct");

		Assert.assertEquals("500.000", quotation.get_uniprice3());
		System.out.println("unitprice3 is correct");

		Assert.assertEquals("10", quotation.get_deliveryperd_pro1());
		System.out.println("deliveryperiod of product1 is correct");

		Assert.assertEquals("3.000", quotation.get_discount_1());
		System.out.println("discount of product1 is correct");

		Assert.assertEquals("1.000", quotation.get_discount_2());
		System.out.println("discount of product2 is correct");

		//Assert.assertEquals(99.85f, quotation.get_vat1());
		//System.out.println("vat of product1 is correct");

	//	Assert.assertEquals(44.95f, quotation.get_vat2());
		//System.out.println("vat of product2 is correct");

		//Assert.assertEquals(49.85f, quotation.get_vat3());
		//System.out.println("vat of product3 is correct");

		//Assert.assertEquals(2096.850f, quotation.get_product1_total_withvat());
		//System.out.println("Totalwithvat of product1 is correct");

		//Assert.assertEquals(943.950f, quotation.get_product2_total_withvat());
		//System.out.println("Totalwithvat of product2 is correct");

		//Assert.assertEquals(1046.850f, quotation.get_product3_total_withvat());
		//System.out.println("Totalwithvat of product3 is correct");

		Assert.assertEquals(3, 893.000f, quotation.get_Totalamount());
		System.out.println("Total amount is correct");

		//Assert.assertEquals(194.650f, quotation.get_totalvat());
		//System.out.println("Total vat is correct");

		Assert.assertEquals("10.000", quotation.get_roundoff());
		System.out.println("rounf off amount is correct");

		Assert.assertEquals(4, 097.650f, quotation.get_netamount());
		System.out.println("net amount is correct");

		Thread.sleep(1000);
		quotation.click_close();

		Thread.sleep(5000);

	}

	@Test(priority = 2,enabled=false)
	public void edit_quotation() throws Throwable {
		QuotationList qtlist = PageFactory.initElements(driver, QuotationList.class);
		Quotation quotation = PageFactory.initElements(driver, Quotation.class);

		qtlist.click_action(0);
		Thread.sleep(2000);
		qtlist.click_edt();
		Thread.sleep(2000);

		quotation.select_saleman("res");
		Thread.sleep(2000);
		quotation.enter_deliveryperd("6");
		Thread.sleep(2000);
		quotation.delterow();
		quotation.click_addrow();
		quotation.enter_item4("COCK");
		quotation.enter_qty4("10");
		Thread.sleep(1000);
		quotation.enter_unitprice4("500");
		Thread.sleep(1000);
		quotation.clicksave();
		Thread.sleep(3000);

		qtlist.click_action(0);
		Thread.sleep(2000);
		qtlist.click_view();
		Thread.sleep(2000);

		Assert.assertEquals("PRD201952 - COCK", quotation.get_product3());
		System.out.println("productname3-Edit is correct");

		Assert.assertEquals("10.000", quotation.get_qty3());
		System.out.println("qty3-edit is correct");

		Assert.assertEquals("500.000", quotation.get_uniprice3());
		System.out.println("unitprice3-edit is correct");

		Thread.sleep(2000);
		quotation.click_close();
		Thread.sleep(2000);
	}

	@Test(priority = 3,enabled=false)
	public void verify_quotation() throws Throwable {

		QuotationList qtlist = PageFactory.initElements(driver, QuotationList.class);
		Quotation quotation = PageFactory.initElements(driver, Quotation.class);

		qtlist.click_action(0);
		Thread.sleep(2000);
		qtlist.click_verify();
		Thread.sleep(2000);
		Assert.assertEquals(currentDate.getcurrentdate(), quotation.get_quotatiodate());
		System.out.println("quotation date is correct");

		Assert.assertEquals("56", quotation.get_deliveryperd());
		System.out.println("quotation date is correct");

		Assert.assertEquals("Ref Selenium testing", quotation.get_reference());
		System.out.println("reference is correct");

		Assert.assertEquals("res", quotation.get_salesman());
		System.out.println("salesman is correct");

		Assert.assertEquals("cost center01", quotation.get_costcenter());
		System.out.println("coscenter date is correct");

		Assert.assertEquals("cus new", quotation.get_customer());
		System.out.println("customer is correct");

		Assert.assertEquals("IT001 - Item001", quotation.get_product1());
		System.out.println("productname1 is correct");

		Assert.assertEquals("IT002 - Item002", quotation.get_product2());
		System.out.println("productname2 is correct");

		Assert.assertEquals("PRD201952 - COCK", quotation.get_product3());
		System.out.println("productname3-Edit is correct");

		Assert.assertEquals("10.000", quotation.get_qty3());
		System.out.println("qty3-edit is correct");

		Assert.assertEquals("2.000", quotation.get_qty1());
		System.out.println("qty1 is correct");

		Assert.assertEquals("3.000", quotation.get_qty2());
		System.out.println("qty2 is correct");

		Assert.assertEquals("1000.000", quotation.get_uniprice1());
		System.out.println("unitprice1 is correct");

		Assert.assertEquals("300.000", quotation.get_uniprice2());
		System.out.println("unitprice2 is correct");

		Assert.assertEquals("10", quotation.get_deliveryperd_pro1());
		System.out.println("deliveryperiod of product1 is correct");

		Assert.assertEquals("3.000", quotation.get_discount_1());
		System.out.println("discount of product1 is correct");

		Assert.assertEquals("1.000", quotation.get_discount_2());
		System.out.println("discount of product2 is correct");

		Assert.assertEquals(7, 896.000f, quotation.get_Totalamount());
		System.out.println("Total amount is correct");

		//Assert.assertEquals(394.800f, quotation.get_totalvat());
		//System.out.println("Total vat is correct");

		Assert.assertEquals("10.000", quotation.get_roundoff());
		System.out.println("rounf off amount is correct");

		//Assert.assertEquals(8300.800f, quotation.get_netamount());
		//System.out.println("net amount is correct");

		quotation.clicksave();
		Thread.sleep(2000);

	}

	@Test(priority = 4,enabled=false)
	public void approve_quotation() throws Throwable {

		QuotationList qtlist = PageFactory.initElements(driver, QuotationList.class);
		Quotation quotation = PageFactory.initElements(driver, Quotation.class);

		qtlist.click_action(0);
		Thread.sleep(2000);
		qtlist.click_approve();
		Thread.sleep(2000);
		Assert.assertEquals(currentDate.getcurrentdate(), quotation.get_quotatiodate());
		System.out.println("quotation date is correct");

		Assert.assertEquals("56", quotation.get_deliveryperd());
		System.out.println("quotation date is correct");

		Assert.assertEquals("Ref Selenium testing", quotation.get_reference());
		System.out.println("reference is correct");

		Assert.assertEquals("res", quotation.get_salesman());
		System.out.println("salesman is correct");

		Assert.assertEquals("cost center01", quotation.get_costcenter());
		System.out.println("coscenter date is correct");

		Assert.assertEquals("cus new", quotation.get_customer());
		System.out.println("customer is correct");

		Assert.assertEquals("IT001 - Item001", quotation.get_product1());
		System.out.println("productname1 is correct");

		Assert.assertEquals("IT002 - Item002", quotation.get_product2());
		System.out.println("productname2 is correct");

		Assert.assertEquals("PRD201952 - COCK", quotation.get_product3());
		System.out.println("productname3-Edit is correct");

		Assert.assertEquals("10.000", quotation.get_qty3());
		System.out.println("qty3-edit is correct");

		Assert.assertEquals("2.000", quotation.get_qty1());
		System.out.println("qty1 is correct");

		Assert.assertEquals("3.000", quotation.get_qty2());
		System.out.println("qty2 is correct");

		Assert.assertEquals("1000.000", quotation.get_uniprice1());
		System.out.println("unitprice1 is correct");

		Assert.assertEquals("300.000", quotation.get_uniprice2());
		System.out.println("unitprice2 is correct");

		Assert.assertEquals("10", quotation.get_deliveryperd_pro1());
		System.out.println("deliveryperiod of product1 is correct");

		Assert.assertEquals("3.000", quotation.get_discount_1());
		System.out.println("discount of product1 is correct");

		Assert.assertEquals("1.000", quotation.get_discount_2());
		System.out.println("discount of product2 is correct");

		Assert.assertEquals(7, 896.000f, quotation.get_Totalamount());
		System.out.println("Total amount is correct");

		//Assert.assertEquals(394.800f, quotation.get_totalvat());
		//System.out.println("Total vat is correct");

		//Assert.assertEquals("10.000", quotation.get_roundoff());
		//System.out.println("rounf off amount is correct");

		//Assert.assertEquals(8300.800f, quotation.get_netamount());
		//System.out.println("net amount is correct");

		quotation.clicksave();
		Thread.sleep(2000);

	}

	@Test(priority = 5,enabled=false)
	public void afterapprove_quotationview() throws Throwable {

		QuotationList qtlist = PageFactory.initElements(driver, QuotationList.class);
		Quotation quotation = PageFactory.initElements(driver, Quotation.class);

		qtlist.click_action(0);
		Thread.sleep(2000);
		qtlist.click_view();
		Thread.sleep(2000);
		Assert.assertEquals(currentDate.getcurrentdate(), quotation.get_quotatiodate());
		System.out.println("quotation date is correct");

		Assert.assertEquals("56", quotation.get_deliveryperd());
		System.out.println("quotation date is correct");

		Assert.assertEquals("Ref Selenium testing", quotation.get_reference());
		System.out.println("reference is correct");

		Assert.assertEquals("res", quotation.get_salesman());
		System.out.println("salesman is correct");

		Assert.assertEquals("cost center01", quotation.get_costcenter());
		System.out.println("coscenter date is correct");

		Assert.assertEquals("cus new", quotation.get_customer());
		System.out.println("customer is correct");

		Assert.assertEquals("IT001 - Item001", quotation.get_product1());
		System.out.println("productname1 is correct");

		Assert.assertEquals("IT002 - Item002", quotation.get_product2());
		System.out.println("productname2 is correct");

		Assert.assertEquals("PRD201952 - COCK", quotation.get_product3());
		System.out.println("productname3-Edit is correct");

		Assert.assertEquals("10.000", quotation.get_qty3());
		System.out.println("qty3-edit is correct");

		Assert.assertEquals("2.000", quotation.get_qty1());
		System.out.println("qty1 is correct");

		Assert.assertEquals("3.000", quotation.get_qty2());
		System.out.println("qty2 is correct");

		Assert.assertEquals("1000.000", quotation.get_uniprice1());
		System.out.println("unitprice1 is correct");

		Assert.assertEquals("300.000", quotation.get_uniprice2());
		System.out.println("unitprice2 is correct");

		Assert.assertEquals("10", quotation.get_deliveryperd_pro1());
		System.out.println("deliveryperiod of product1 is correct");

		Assert.assertEquals("3.000", quotation.get_discount_1());
		System.out.println("discount of product1 is correct");

		Assert.assertEquals("1.000", quotation.get_discount_2());
		System.out.println("discount of product2 is correct");

		Assert.assertEquals(7, 896.000f, quotation.get_Totalamount());
		System.out.println("Total amount is correct");

		
		//Assert.assertEquals(394.800f, quotation.get_totalvat());
		//System.out.println("Total vat is correct");

		Assert.assertEquals("10.000", quotation.get_roundoff());
		System.out.println("rounf off amount is correct");

		//Assert.assertEquals(8300.800f, quotation.get_netamount());
		//System.out.println("net amount is correct");

	}
	
	
	@Test(priority = 0)
	public void quotationreport_data_writing() throws Throwable 
	{
		
		
		driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		QuotationList qtlist = PageFactory.initElements(driver, QuotationList.class);
		Quotation quotation = PageFactory.initElements(driver, Quotation.class);
	

		login.Login("hari@mail.com", "123456789");
		driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
		overview.clickMenu();
		menu.click_quotation();
		Thread.sleep(2000);
		
		//write.writeexcel(0,0,0,qtlist.get_status());
		//write.writeexcel(0,0,0,quotation.get_customer());
		//write.writeexcel(0,0,0,quotation.get_quotatiodate());
		Thread.sleep(2000);
		qtlist.click_action(0);
		Thread.sleep(2000);
		qtlist.click_view();
		Thread.sleep(2000);	
		writeExcel write = new writeExcel("D:\\My.xls");
		write.write(0,1,0,quotation.get_customer());
		write.write(0,1,1,quotation.get_product1());
	//	write.write(0,1,1,quotation.get_quotatiodate());;
		
		
	
	   
	  // String date =quotation.get_quotatiodate();
		//write.writeexcel(0,1,1,date);
		
		Thread.sleep(2000);
		
		

	}
	

}
