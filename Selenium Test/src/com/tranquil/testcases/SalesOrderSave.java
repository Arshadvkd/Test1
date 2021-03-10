package com.tranquil.testcases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.tranquil.pages.GoodsDelivery;
import com.tranquil.pages.GoodsDeliveryList;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.SalesInvoice;
import com.tranquil.pages.SalesOrder;
import com.tranquil.pages.SalesOrderlist;

import Helper.BrowserFactory;
import Helper.ScreenShot;
import Helper.currentDate;

public class SalesOrderSave {
	WebDriver driver;
 
	@Test(priority = 0,enabled=true)
	public void save_salesorder() throws Throwable {
		try {

			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
			SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
			GoodsDelivery goodsdelivery = PageFactory.initElements(driver, GoodsDelivery.class);
			GoodsDeliveryList goodsdeliverylist = PageFactory.initElements(driver, GoodsDeliveryList.class);
			SalesInvoice salesinvoice = PageFactory.initElements(driver, SalesInvoice.class);

			login.Login("hari@mail.com","123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.click_salesorder();
			salesorderlist.click_add();
			Thread.sleep(5000);
			salesorder.enter_customername("cus new");
			Thread.sleep(2000);
			salesorder.enter_deliveryperd("10");
			Thread.sleep(2000);
			salesorder.enter_referenceno("reference for salesorder selenium");
			Thread.sleep(2000);
			salesorder.enter_txtContactPerson("Arjun");
			salesorder.enter_item1("001");
			salesorder.enter_qty1("2");
			Thread.sleep(1000);
			salesorder.enter_unitprice1("1000");
			Thread.sleep(1000);
			salesorder.enter_discount1("3");
			salesorder.click_addrow();
			salesorder.enter_item2("002");
			Thread.sleep(2000);
			salesorder.enter_qty2("3");
			Thread.sleep(2000);
			salesorder.enter_unitprice2("300");
			salesorder.enter_discount2("1");
			Thread.sleep(1000);
			salesorder.click_addrow();
			salesorder.enter_item3("003");
			Thread.sleep(2000);
			salesorder.enter_qty3("2");
			Thread.sleep(2000);
			salesorder.enter_unitprice3("500");
			Thread.sleep(2000);
			salesorder.enter_discount3("3");
			((JavascriptExecutor) driver).executeScript("scroll(0,60)");
			Thread.sleep(1000);
			salesorder.click_save();

			Thread.sleep(1000);
			salesorder.click_salesman();
			Thread.sleep(1000);
			salesorder.select_saleman("Beena");
			Thread.sleep(2000);
			salesorder.select_deliverymethod("Door delivery");
			Thread.sleep(1000);
			salesorder.select_paymentterms("Credit card");
			Thread.sleep(1000);
			salesorder.select_termsandconditions("Legal");
			Thread.sleep(1000);
			salesorder.click_save();
			Thread.sleep(2000);
			
		
		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "save_salesorder");

		}

	}
	
	@Test(priority = 2,enabled=true)
	public void edit_salesorder() throws Throwable {
		try {

			
			SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
			SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
			GoodsDelivery goodsdelivery = PageFactory.initElements(driver, GoodsDelivery.class);
			GoodsDeliveryList goodsdeliverylist = PageFactory.initElements(driver, GoodsDeliveryList.class);
			SalesInvoice salesinvoice = PageFactory.initElements(driver, SalesInvoice.class);

			salesorderlist.clickAction(0);
			Thread.sleep(1000);
			salesorderlist.select_edit();
			Thread.sleep(1000); 
			salesorder.delete_2ndrow();
			Thread.sleep(1000); 
			salesorder.click_addrow();
			salesorder.enter_item4("Toogle");
			salesorder.enter_qty4("10");
			Thread.sleep(1000);
			salesorder.enter_unitprice4("6000");
			Thread.sleep(1000);
			salesorder.click_save();
			Thread.sleep(5000);
		
		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "save_salesorder");

		}

	}
	
	
	
	
	@Test(priority = 1,enabled=true)
	public void check_savedview() throws Throwable
	{
		SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
		SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
		
		salesorderlist.clickAction(0);
		Thread.sleep(1000);
		salesorderlist.select_view();
		Thread.sleep(1000); 
		
		Assert.assertEquals(currentDate.getcurrentdate(),salesorder.get_sodate());
		System.out.println("Saved-salesorder date is correct");
		
		Assert.assertEquals("10",salesorder.get_deliveryperd());
		System.out.println("Saved deliveryperd date is correct");
		
		Assert.assertEquals("reference for salesorder selenium",salesorder.get_reference());
		System.out.println("Saved reference is correct");
		
		Assert.assertEquals("cus new",salesorder.get_cusname());
		System.out.println("Saved reference is correct");
		
		Assert.assertEquals("Arjun",salesorder.get_contactperson());
		System.out.println("Saved contact person is correct");
		
		Assert.assertEquals("IT001 - Item001",salesorder.get_item1name());
		System.out.println("Saved item1 name is correct");
		
		Assert.assertEquals("IT002 - Item002",salesorder.get_item2name());
		System.out.println("Saved item2 name is correct");
		
		Assert.assertEquals("003 - ITM003",salesorder.get_item3name());
		System.out.println("Saved item3 name is correct");
		
		Assert.assertEquals("2.00",salesorder.get_qty1());
		System.out.println("Saved qty1 is correct");
		
		Assert.assertEquals("3.00",salesorder.get_qty2());
		System.out.println("Saved qty2 name is correct");
		
		Assert.assertEquals("2.00",salesorder.get_qty3());
		System.out.println("Saved qty3 name is correct");
		
		Assert.assertEquals("1000.00",salesorder.get_unitprice1());
		System.out.println("Saved unitprice1 is correct");
		
		Assert.assertEquals("300.00",salesorder.get_unitprice2());
		System.out.println("Saved unitprice2 is correct");
		
		Assert.assertEquals("500.00",salesorder.get_unitprice3());
		System.out.println("Saved unitprice3 is correct");
		
		Assert.assertEquals("3.00",salesorder.get_discount1());
		System.out.println("Saved discount1 is correct");
		
		Assert.assertEquals("1.00",salesorder.get_discount2());
		System.out.println("Saved discount2 is correct");
		
		Assert.assertEquals("3.00",salesorder.get_discount3());
		System.out.println("Saved discount3 is correct");
		
		//Assert.assertEquals(99.850f,salesorder.get_vat1_calculated());
		//System.out.println("Saved Vat1 is correct");
		
		//Assert.assertEquals(44.950f,salesorder.get_vat2_calculated());
		//System.out.println("Saved Vat2 is correct");
		
		//Assert.assertEquals(49.850f,salesorder.get_vat3_calculated());
		//System.out.println("Saved Vat3 is correct");
		
		
		//Assert.assertEquals(2096.850f,salesorder.get_product1_total_withvat());
		//System.out.println("Saved Totalwithvat1 is correct");
		
		//Assert.assertEquals(943.950f,salesorder.get_product2_total_withvat());
		//System.out.println("Saved Totalwithvat2 is correct");
		
		//Assert.assertEquals(1046.850f,salesorder.get_product3_total_withvat());
		//System.out.println("Saved Totalwithvat3 is correct");
		
		
		//Assert.assertEquals(3893.000f,salesorder.getTotalamount());
		//System.out.println("Saved Total is correct");
		
		//Assert.assertEquals(194.650f,salesorder.get_totalvat());
		//System.out.println("Saved Total  vat is correct");
		
		//Assert.assertEquals(4087.650f,salesorder.get_netamount());
		//System.out.println("Saved net amount is correct");
		
		
		salesorder.close();
		Thread.sleep(3000);
	}

	
	@Test(priority = 3,enabled=true)
	public void check_editview() throws Throwable
	{
		SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
		SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
		
		salesorderlist.clickAction(0);
		Thread.sleep(1000);
		salesorderlist.select_view();
		Thread.sleep(1000); 
		
		Assert.assertEquals(currentDate.getcurrentdate(),salesorder.get_sodate());
		System.out.println("Edit salesorder date is correct");
		
		Assert.assertEquals("10",salesorder.get_deliveryperd());
		System.out.println("Edit deliveryperd date is correct");
		
		Assert.assertEquals("reference for salesorder selenium",salesorder.get_reference());
		System.out.println("Edit reference is correct");
		
		Assert.assertEquals("cus new",salesorder.get_cusname());
		System.out.println("Edit reference is correct");
		
		Assert.assertEquals("Arjun",salesorder.get_contactperson());
		System.out.println("Edit contact person is correct");
		
		Assert.assertEquals("IT001 - Item001",salesorder.get_item1name());
		System.out.println("Edit item1 name is correct");
		
		Assert.assertEquals("003 - ITM003",salesorder.get_item2name());
		System.out.println("Edit item2 name is correct");
		
		Assert.assertEquals("PRD201951 - Toogle",salesorder.get_item3name());
		System.out.println("Edit item3 name is correct");
		
		Assert.assertEquals("2.00",salesorder.get_qty1());
		System.out.println("Edit qty1 is correct");
		
		Assert.assertEquals("2.00",salesorder.get_qty2());
		System.out.println("Edit qty2 name is correct");
		
		Assert.assertEquals("10.00",salesorder.get_qty3());
		System.out.println("Edit qty3 name is correct");
		
		Assert.assertEquals("1000.00",salesorder.get_unitprice1());
		System.out.println("unitprice1 is correct");
		
		Assert.assertEquals("500.00",salesorder.get_unitprice2());
		System.out.println("unitprice2 is correct");
		
		Assert.assertEquals("6000.00",salesorder.get_unitprice3());
		System.out.println("unitprice3 is correct");
		
		Assert.assertEquals("3.00",salesorder.get_discount1());
		System.out.println("discount1 is correct");
		
		Assert.assertEquals("3.00",salesorder.get_discount2());
		System.out.println("discount2 is correct");
		
		Assert.assertEquals("0.00",salesorder.get_discount3());
		System.out.println("discount3 is correct");
		
		//Assert.assertEquals(99.850f,salesorder.get_vat1_calculated());
		//System.out.println("Vat1 is correct");
		
		//Assert.assertEquals(49.850f,salesorder.get_vat2_calculated());
		//System.out.println("Vat2 is correct");
		
		//Assert.assertEquals(3000.000f,salesorder.get_vat3_calculated());
		//System.out.println("Vat3 is correct");
		
		
		//Assert.assertEquals(2096.850f,salesorder.get_product1_total_withvat());
		//System.out.println("Totalwithvat1 is correct");
		
		//Assert.assertEquals(1046.850f,salesorder.get_product2_total_withvat());
		//System.out.println("Totalwithvat2 is correct");
		
		//Assert.assertEquals(63000.000f,salesorder.get_product3_total_withvat());
		//System.out.println("Totalwithvat3 is correct");
		
		
		//Assert.assertEquals(62994.000f,salesorder.getTotalamount());
		//System.out.println("Total is correct");
		
		//Assert.assertEquals(3149.700f,salesorder.get_totalvat());
		//System.out.println("Total  vat is correct");
		
		//Assert.assertEquals(66143.700f,salesorder.get_netamount());
		//System.out.println("net amount is correct");
		
		
		salesorder.close();
		Thread.sleep(3000);
	}

	
	
	@Test(priority = 4,enabled=true)
	public void check_verify() throws Throwable
	{
		SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
		SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
		
		salesorderlist.clickAction(0);
		Thread.sleep(1000);
		salesorderlist.select_verify();
		Thread.sleep(1000); 
		
		Assert.assertEquals(currentDate.getcurrentdate(),salesorder.get_sodate());
		System.out.println("salesorder date is correct");
		
		Assert.assertEquals("10",salesorder.get_deliveryperd());
		System.out.println("deliveryperd date is correct");
		
		Assert.assertEquals("reference for salesorder selenium",salesorder.get_reference());
		System.out.println("reference is correct");
		
		Assert.assertEquals("cus new",salesorder.get_cusname());
		System.out.println("reference is correct");
		
		Assert.assertEquals("Arjun",salesorder.get_contactperson());
		System.out.println("contact person is correct");
		
		Assert.assertEquals("IT001 - Item001",salesorder.get_item1name());
		System.out.println("item1 name is correct");
		
		Assert.assertEquals("003 - ITM003",salesorder.get_item2name());
		System.out.println("item2 name is correct");
		
		Assert.assertEquals("PRD201951 - Toogle",salesorder.get_item3name());
		System.out.println("item3 name is correct");
		
		Assert.assertEquals("2.00",salesorder.get_qty1());
		System.out.println("qty1 is correct");
		
		Assert.assertEquals("2.00",salesorder.get_qty2());
		System.out.println("qty2 name is correct");
		
		Assert.assertEquals("10.00",salesorder.get_qty3());
		System.out.println("qty3 name is correct");
		
		Assert.assertEquals("1000.00",salesorder.get_unitprice1());
		System.out.println("unitprice1 is correct");
		
		Assert.assertEquals("500.00",salesorder.get_unitprice2());
		System.out.println("unitprice2 is correct");
		
		Assert.assertEquals("6000.00",salesorder.get_unitprice3());
		System.out.println("unitprice3 is correct");
		
		Assert.assertEquals("3.00",salesorder.get_discount1());
		System.out.println("discount1 is correct");
		
		Assert.assertEquals("3.00",salesorder.get_discount2());
		System.out.println("discount2 is correct");
		
		Assert.assertEquals("0.00",salesorder.get_discount3());
		System.out.println("discount3 is correct");
		
		//Assert.assertEquals(99.850f,salesorder.get_vat1_calculated());
		//System.out.println("Vat1 is correct");
		
		//Assert.assertEquals(49.850f,salesorder.get_vat2_calculated());
		//System.out.println("Vat2 is correct");
		
		//Assert.assertEquals(3000.000f,salesorder.get_vat3_calculated());
		//System.out.println("Vat3 is correct");
		
		
		//Assert.assertEquals(2096.850f,salesorder.get_product1_total_withvat());
		//System.out.println("Totalwithvat1 is correct");
		
		//Assert.assertEquals(1046.850f,salesorder.get_product2_total_withvat());
		//System.out.println("Totalwithvat2 is correct");
		
		//Assert.assertEquals(63000.000f,salesorder.get_product3_total_withvat());
		//System.out.println("Totalwithvat3 is correct");
		
		
		//Assert.assertEquals(62994.000f,salesorder.getTotalamount());
		//System.out.println("Total is correct");
		
		//Assert.assertEquals(3149.700f,salesorder.get_totalvat());
		//System.out.println("Total  vat is correct");
		
		//Assert.assertEquals(66143.700f,salesorder.get_netamount());
		//System.out.println("net amount is correct");
		
		
		salesorder.click_save();
		Thread.sleep(3000);
	}

	

	@Test(priority = 5,enabled=true)
	public void check_approve() throws Throwable
	{
		SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
		SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
		
		salesorderlist.clickAction(0);
		Thread.sleep(1000);
		salesorderlist.select_approve();
		Thread.sleep(1000); 
		
		
		Assert.assertEquals(currentDate.getcurrentdate(),salesorder.get_sodate());
		System.out.println("salesorder date is correct");
		
		Assert.assertEquals("10",salesorder.get_deliveryperd());
		System.out.println("deliveryperd date is correct");
		
		Assert.assertEquals("reference for salesorder selenium",salesorder.get_reference());
		System.out.println("reference is correct");
		
		Assert.assertEquals("cus new",salesorder.get_cusname());
		System.out.println("reference is correct");
		
		Assert.assertEquals("Arjun",salesorder.get_contactperson());
		System.out.println("contact person is correct");
		
		Assert.assertEquals("IT001 - Item001",salesorder.get_item1name());
		System.out.println("item1 name is correct");
		
		Assert.assertEquals("003 - ITM003",salesorder.get_item2name());
		System.out.println("item2 name is correct");
		
		Assert.assertEquals("PRD201951 - Toogle",salesorder.get_item3name());
		System.out.println("item3 name is correct");
		
		Assert.assertEquals("2.00",salesorder.get_qty1());
		System.out.println("qty1 is correct");
		
		Assert.assertEquals("2.00",salesorder.get_qty2());
		System.out.println("qty2 name is correct");
		
		Assert.assertEquals("10.00",salesorder.get_qty3());
		System.out.println("qty3 name is correct");
		
		Assert.assertEquals("1000.00",salesorder.get_unitprice1());
		System.out.println("unitprice1 is correct");
		
		Assert.assertEquals("500.00",salesorder.get_unitprice2());
		System.out.println("unitprice2 is correct");
		
		Assert.assertEquals("6000.00",salesorder.get_unitprice3());
		System.out.println("unitprice3 is correct");
		
		Assert.assertEquals("3.00",salesorder.get_discount1());
		System.out.println("discount1 is correct");
		
		Assert.assertEquals("3.00",salesorder.get_discount2());
		System.out.println("discount2 is correct");
		
		Assert.assertEquals("0.00",salesorder.get_discount3());
		System.out.println("discount3 is correct");
		
		//Assert.assertEquals(99.850f,salesorder.get_vat1_calculated());
		//System.out.println("Vat1 is correct");
		
		//Assert.assertEquals(49.850f,salesorder.get_vat2_calculated());
		//System.out.println("Vat2 is correct");
		
		//Assert.assertEquals(3000.000f,salesorder.get_vat3_calculated());
		//System.out.println("Vat3 is correct");
		
		
		//Assert.assertEquals(2096.850f,salesorder.get_product1_total_withvat());
		//System.out.println("Totalwithvat1 is correct");
		
		//Assert.assertEquals(1046.850f,salesorder.get_product2_total_withvat());
		//System.out.println("Totalwithvat2 is correct");
		
		//Assert.assertEquals(63000.000f,salesorder.get_product3_total_withvat());
		//System.out.println("Totalwithvat3 is correct");
		
		
		//Assert.assertEquals(62994.000f,salesorder.getTotalamount());
		//System.out.println("Total is correct");
		
		//Assert.assertEquals(3149.700f,salesorder.get_totalvat());
		//System.out.println("Total  vat is correct");
		
		//Assert.assertEquals(66143.700f,salesorder.get_netamount());
		//System.out.println("net amount is correct");
		
		
		salesorder.click_save();
		Thread.sleep(3000);
	}
	
	@Test(priority=10,enabled=true)
	public void check_gdnview() throws Throwable
	{
		
		

		driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
		SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
		GoodsDelivery goodsdelivery = PageFactory.initElements(driver, GoodsDelivery.class);
		GoodsDeliveryList goodsdeliverylist = PageFactory.initElements(driver, GoodsDeliveryList.class);
		SalesInvoice salesinvoice = PageFactory.initElements(driver, SalesInvoice.class);

		login.Login("hari@mail.com","123456789");
		driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
		overview.clickMenu();
		menu.click_salesorder();
		salesorderlist.click_add();
		Thread.sleep(5000);
		salesorder.enter_customername("cus new");
		Thread.sleep(2000);
		salesorder.enter_deliveryperd("10");
		Thread.sleep(2000);
		salesorder.enter_referenceno("reference for salesorder selenium");
		Thread.sleep(2000);
		salesorder.enter_txtContactPerson("Arjun");
		salesorder.enter_item1("001");
		salesorder.enter_qty1("2");
		Thread.sleep(1000);
		salesorder.enter_unitprice1("1000");
		Thread.sleep(1000);
		salesorder.enter_discount1("3");
		salesorder.click_addrow();
		salesorder.enter_item2("002");
		Thread.sleep(2000);
		salesorder.enter_qty2("3");
		Thread.sleep(2000);
		salesorder.enter_unitprice2("300");
		salesorder.enter_discount2("1");
		Thread.sleep(1000);
		salesorder.click_addrow();
		salesorder.enter_item3("003");
		Thread.sleep(2000);
		salesorder.enter_qty3("2");
		Thread.sleep(2000);
		salesorder.enter_unitprice3("500");
		Thread.sleep(2000);
		salesorder.enter_discount3("3");
		((JavascriptExecutor) driver).executeScript("scroll(0,60)");
		Thread.sleep(1000);
		salesorder.click_save();

		Thread.sleep(1000);
		salesorder.click_salesman();
		Thread.sleep(1000);
		salesorder.select_saleman("Beena");
		Thread.sleep(2000);
		salesorder.select_deliverymethod("Door delivery");
		Thread.sleep(1000);
		salesorder.select_paymentterms("Credit card");
		Thread.sleep(1000);
		salesorder.select_termsandconditions("Legal");
		Thread.sleep(1000);
		salesorder.click_save();
		Thread.sleep(2000);
		salesorderlist.clickAction(0);
		Thread.sleep(2000);
		salesorderlist.select_verify();
		Thread.sleep(2000);
		salesorder.click_save();
		Thread.sleep(1000);
		salesorderlist.clickAction(0);
		Thread.sleep(2000);
		salesorderlist.approve();
		Thread.sleep(2000);
		salesorder.click_save();
		Thread.sleep(2000);
		salesorderlist.clickAction(0);
		Thread.sleep(2000);
		salesorderlist.select_deliver();
		
		Assert.assertEquals(currentDate.getcurrentdate(),goodsdelivery.get_gdndate());
		System.out.println("Current date is correct");
		
		
		Assert.assertEquals("cus new",goodsdelivery.get_cusname());
		System.out.println("customer name is correct");
		
		Assert.assertEquals("reference for salesorder selenium",goodsdelivery.get_referencenumber());
		System.out.println("Reference is correct");
		
		Assert.assertEquals("10",goodsdelivery.get_deliverperd());
		System.out.println("delivery period  is correct");
				
		Assert.assertEquals("1",goodsdelivery.get_slno1());
		System.out.println("delivery period  is correct");
		
		Assert.assertEquals("2",goodsdelivery.get_slno2());
		System.out.println("delivery period  is correct");
		
		Assert.assertEquals("3",goodsdelivery.get_slno3());
		System.out.println("delivery period  is correct");
		
				
	}
	
	//Select all
	@Test(priority = 7,enabled =true)
	public void check_gdn() throws Throwable
	{
		
		driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
		SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
		GoodsDelivery goodsdelivery = PageFactory.initElements(driver, GoodsDelivery.class);
		GoodsDeliveryList goodsdeliverylist = PageFactory.initElements(driver, GoodsDeliveryList.class);
		SalesInvoice salesinvoice = PageFactory.initElements(driver, SalesInvoice.class);

		login.Login("hari@mail.com","123456789");
		driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
		overview.clickMenu();
		menu.click_salesorder();
		salesorderlist.click_add();
		Thread.sleep(5000);
		salesorder.enter_customername("cus new");
		Thread.sleep(2000);
		salesorder.enter_deliveryperd("10");
		Thread.sleep(2000);
		salesorder.enter_referenceno("reference for salesorder selenium");
		Thread.sleep(2000);
		salesorder.enter_txtContactPerson("Arjun");
		salesorder.enter_item1("001");
		salesorder.enter_qty1("2");
		Thread.sleep(1000);
		salesorder.enter_unitprice1("1000");
		Thread.sleep(1000);
		salesorder.enter_discount1("3");
		salesorder.click_addrow();
		salesorder.enter_item2("002");
		Thread.sleep(2000);
		salesorder.enter_qty2("3");
		Thread.sleep(2000);
		salesorder.enter_unitprice2("300");
		salesorder.enter_discount2("1");
		Thread.sleep(1000);
		salesorder.click_addrow();
		salesorder.enter_item3("003");
		Thread.sleep(2000);
		salesorder.enter_qty3("2");
		Thread.sleep(2000);
		salesorder.enter_unitprice3("500");
		Thread.sleep(2000);
		salesorder.enter_discount3("3");
		((JavascriptExecutor) driver).executeScript("scroll(0,60)");
		Thread.sleep(1000);
		salesorder.click_save();

		Thread.sleep(1000);
		salesorder.click_salesman();
		Thread.sleep(1000);
		salesorder.select_saleman("Beena");
		Thread.sleep(2000);
		salesorder.select_deliverymethod("Door delivery");
		Thread.sleep(1000);
		salesorder.select_paymentterms("Credit card");
		Thread.sleep(1000);
		salesorder.select_termsandconditions("Legal");
		Thread.sleep(1000);
		salesorder.click_save();
		Thread.sleep(2000);
		salesorderlist.clickAction(0);
		Thread.sleep(2000);
		salesorderlist.select_verify();
		Thread.sleep(2000);
		salesorder.click_save();
		Thread.sleep(1000);
		salesorderlist.clickAction(0);
		Thread.sleep(2000);
		salesorderlist.approve();
		Thread.sleep(2000);
		salesorder.click_save();
		Thread.sleep(2000);
		salesorderlist.clickAction(0);
		Thread.sleep(2000);
		salesorderlist.select_deliver();
		Thread.sleep(2000);
		goodsdelivery.select_all();
		Thread.sleep(1000);
		goodsdelivery.click_save();
		Thread.sleep(1000);
}
	//Selecting indvidually 
	@Test(priority = 6,enabled=true)
	public void check_gdn1() throws Throwable
	{
		
		SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
		SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
		GoodsDelivery goodsdelivery = PageFactory.initElements(driver, GoodsDelivery.class);
		GoodsDeliveryList goodsdeliverylist = PageFactory.initElements(driver, GoodsDeliveryList.class);
		
		 
		salesorderlist.clickAction(0);
		Thread.sleep(2000);
		salesorderlist.select_deliver();
		Thread.sleep(2000);
		goodsdelivery.select_checkbox(driver,"1");
		Thread.sleep(2000);
		goodsdelivery.select_checkbox(driver,"2");
		goodsdelivery.click_save();
		
}
	
}