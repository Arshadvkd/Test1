package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

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

public class SalesInvoiceSave 
{
	
	WebDriver driver;

	@Test(priority = 0)
	public void Approve_Salesorder() {
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

			login.Login("hari@mail.com", "123456789");
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

			// Verify sales order
			salesorderlist.clickAction(0);
			Thread.sleep(1000);
			salesorderlist.select_verify();
			Thread.sleep(1000);
			salesorder.click_save();
			Thread.sleep(2000);

			// Approve sales order
			salesorderlist.clickAction(0);
			Thread.sleep(1000);
			salesorderlist.select_approve();
			Thread.sleep(1000);
			salesorder.click_save();
			Thread.sleep(3000);

		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "save_salesorder");

		}

	}
	
	@Test(priority = 1)
	public void GoodsDelivery_from_Salesorder_selectall() throws Throwable
	{
		SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
		SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
		GoodsDelivery goodsdelivery = PageFactory.initElements(driver, GoodsDelivery.class);
		GoodsDeliveryList goodsdeliverylist = PageFactory.initElements(driver, GoodsDeliveryList.class);
		SalesInvoice salesinvoice = PageFactory.initElements(driver, SalesInvoice.class);
		
		
		salesorderlist.clickAction(0);
		Thread.sleep(2000);
		salesorderlist.select_deliver();
		Thread.sleep(1000);
		goodsdelivery.select_all();
		Thread.sleep(1000);
		goodsdelivery.click_save();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 2)
	public void Salesinvoice_from_Salesorder_selectall() throws Throwable
	{
		SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
		SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
		GoodsDelivery goodsdelivery = PageFactory.initElements(driver, GoodsDelivery.class);
		GoodsDeliveryList goodsdeliverylist = PageFactory.initElements(driver, GoodsDeliveryList.class);
		SalesInvoice salesinvoice = PageFactory.initElements(driver, SalesInvoice.class);
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		
		overview.clickMenu();
		menu.click_salesorder();
		Thread.sleep(2000);
		salesorderlist.clickAction(0);
		Thread.sleep(2000);
		salesorderlist.select_invoice();
		Thread.sleep(1000);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("/Sales/Invoice/"));
		System.out.println("Sales order redirecting to GoodsDelivery note");
		
		Assert.assertEquals(currentDate.getcurrentdate(),salesinvoice.get_salesinvoicedate());
		System.out.println("sales invoice date is correct");
		
		Assert.assertEquals("cus new",salesinvoice.get_customer());
		System.out.println("customer name is correct");
		
		
		Assert.assertEquals("reference for salesorder selenium",salesinvoice.get_referencenum());
		System.out.println("reference is correct");
		 
		
		Assert.assertEquals("Arjun",salesinvoice.get_contactperson());
		System.out.println("contact person is correct");
		
		Assert.assertEquals("Credit card",salesinvoice.get_paymenterms());
		System.out.println("payment terms is correct");
		
		Assert.assertEquals("2019-06-10",salesinvoice.get_dueDate());
		System.out.println("due date is correct");
		
		Assert.assertEquals("Legal",salesinvoice.get_termsandconditions());
		System.out.println("Terms and conditions is correct");
		
		Assert.assertEquals("Door delivery",salesinvoice.get_deliverymethod());
		System.out.println("Delivery method is correct");
		
		Assert.assertEquals("Beena",salesinvoice.get_salesman());
		System.out.println("Salesman method is correct");
		
		Assert.assertEquals("cost center01",salesinvoice.get_costcenter());
		System.out.println("costcenter method is correct");
		
		Assert.assertEquals("IT001 - Item001",salesinvoice.get_productname(driver,"1"));
		System.out.println("product name1 method is correct");
		
		Assert.assertEquals("IT002 - Item002",salesinvoice.get_productname(driver,"2"));
		System.out.println("product name2 method is correct");
		
		Assert.assertEquals("003 - ITM003",salesinvoice.get_productname(driver,"3"));
		System.out.println("product name3 method is correct");
		
		Assert.assertEquals("2.000",salesinvoice.get_qty(driver,"1"));
		System.out.println("qty 1 is correct");
		
		Assert.assertEquals("3.000",salesinvoice.get_qty(driver,"2"));
		System.out.println("qty 2 is correct");
		
		Assert.assertEquals("2.000",salesinvoice.get_qty(driver,"3"));
		System.out.println("qty 3 is correct");
		
		Assert.assertEquals("1000.000",salesinvoice.get_unitprice(driver,"1"));
		System.out.println("unit price 1 is correct");
		
		Assert.assertEquals("300.000",salesinvoice.get_unitprice(driver,"2"));
		System.out.println("unit price 2 is correct");
		
		Assert.assertEquals("500.000",salesinvoice.get_unitprice(driver,"3"));
		System.out.println("unit price 3 is correct");
		
		
	/*	Assert.assertEquals("Each(1 Each)",salesinvoice.get_uom(driver,"2")); 
		System.out.println("uom1 is correct");
		
		Assert.assertEquals("Each(1 Each)",salesinvoice.get_uom(driver,"2"));
		System.out.println("uom2 is correct");
		
		Assert.assertEquals("Each(1 Each)",salesinvoice.get_uom(driver,"3"));
		System.out.println("uom3 is correct");*/
		
		//Float.parseFloat(salesinvoice.get_vat(driver,"1")
		
		//Assert.assertEquals(Float.parseFloat(salesinvoice.get_vat(driver,"1")), salesinvoice.VatCalculated(driver,"1"));
	//	System.out.println("Vat1 method is correct");
	
		//Assert.assertEquals(Float.parseFloat(salesinvoice.get_vat(driver,"2")), salesinvoice.VatCalculated(driver,"2"));
		//System.out.println("Vat2 is correct");
		
		//Assert.assertEquals(Float.parseFloat(salesinvoice.get_vat(driver,"3")), salesinvoice.VatCalculated(driver,"3"));
		//System.out.println("Vat3 is correct");
		
		//Assert.assertEquals(Float.parseFloat(salesinvoice.get_totalwithtax(driver,"1")), salesinvoice.Totalamountlinewise(driver,"1"));
		//System.out.println("totalwithtax1 method is correct");
		
		//Assert.assertEquals(Float.parseFloat(salesinvoice.get_totalwithtax(driver,"2")), salesinvoice.Totalamountlinewise(driver,"2"));
		//System.out.println("totalwithtax2 is correct");
		
		//Assert.assertEquals(Float.parseFloat(salesinvoice.get_totalwithtax(driver,"3")),salesinvoice.Totalamountlinewise(driver,"3"));
		//System.out.println("totalwithtax3 method is correct");
		
		/*Assert.assertEquals("Amat house",salesinvoice.get_shippingaddres());
		System.out.println("shippingaddres method is correct");*/
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0,10)");
		Thread.sleep(1000);
		
		Assert.assertEquals("0.000",salesinvoice.get_charge());
		System.out.println("charge method  correct");
		
		
		
		Assert.assertEquals("0.000",salesinvoice.get_totaldiscount());
		System.out.println("totaldiscount method is correct");
		
		Assert.assertEquals(salesinvoice.totalvat(driver),salesinvoice.get_totaltax());
		System.out.println("totaltax is correct");
		
		Assert.assertEquals("0.000",salesinvoice.get_roundoff());
		System.out.println("roundoff method is correct");
		
		Assert.assertEquals("SAR",salesinvoice.get_discounttype(driver,"1"));
		System.out.println("discounttype1 method is correct");
		
		Assert.assertEquals("SAR",salesinvoice.get_discounttype(driver,"2"));
		System.out.println("discounttype2 method is correct");
		
		Assert.assertEquals("SAR",salesinvoice.get_discounttype(driver,"3"));
		System.out.println("discounttype3 method is correct");
		
	}

}
