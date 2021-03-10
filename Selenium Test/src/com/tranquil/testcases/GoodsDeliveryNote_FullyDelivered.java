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

public class GoodsDeliveryNote_FullyDelivered {
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
			Thread.sleep(1000);

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
	    
		Assert.assertTrue(driver.getCurrentUrl().contains("GoodsDeliveryNote"));
		System.out.println("Sales order redirecting to GoodsDelivery note");
		
		Assert.assertEquals(currentDate.getcurrentdate(),goodsdelivery.get_gdndate());
		System.out.println("Goods deliverydate is correct");
	
		Assert.assertEquals("cus new",goodsdelivery.get_cusname());
		System.out.println("Goodsdelivery-customer name is correct");
		
		
		Assert.assertEquals("reference for salesorder selenium",goodsdelivery.get_referencenumber());
		System.out.println("Goodsdelivery-reference number is correct");
				
		
		Assert.assertEquals("Door delivery",goodsdelivery.get_deliverymethod());
		System.out.println("Goodsdelivery-deliverymethod is correct");
		
		Assert.assertEquals("10",goodsdelivery.get_deliverperd());
		System.out.println("Goodsdelivery-deliveryperd is correct");
		
		Assert.assertEquals("1",goodsdelivery.get_slno1());
		System.out.println("Goodsdelivery-sl no:1 is correct");
		
		Assert.assertEquals("2",goodsdelivery.get_slno2());
		System.out.println("Goodsdelivery-sl no:2 is correct");
		
		Assert.assertEquals("3",goodsdelivery.get_slno3());
		System.out.println("Goodsdelivery-sl no:3 is correct");
		
		
		Assert.assertEquals("IT001 - Item001",goodsdelivery.get_product1());
		System.out.println("Goodsdelivery-productname1 is correct");
		

		Assert.assertEquals("IT002 - Item002",goodsdelivery.get_product2());
		System.out.println("Goodsdelivery-productname2 is correct");
		

		Assert.assertEquals("003 - ITM003",goodsdelivery.get_product3());
		System.out.println("Goodsdelivery-productname3 is correct");
		
		Assert.assertEquals("2.000",goodsdelivery.get_orderqty1());
		System.out.println("Goodsdelivery-orderqty1 is correct");
		
		Assert.assertEquals("3.000",goodsdelivery.get_orderqty2());
		System.out.println("Goodsdelivery-orderqty2 is correct");
		
		Assert.assertEquals("2.000",goodsdelivery.get_orderqty3());
		System.out.println("Goodsdelivery-orderqty3 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_ordereduom1());
		System.out.println("Goodsdelivery-orderuom1 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_ordereduom2());
		System.out.println("Goodsdelivery-orderuom2 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_ordereduom3());
		System.out.println("Goodsdelivery-orderuom3 is correct");
		
		
		Assert.assertEquals("0.000",goodsdelivery.get_dlverdqty1());
		System.out.println("Goodsdelivery-deliverdqty1 is correct");
		
		Assert.assertEquals("0.000",goodsdelivery.get_dlverdqty2());
		System.out.println("Goodsdelivery-deliverdqty2 is correct");
		
		
		Assert.assertEquals("0.000",goodsdelivery.get_dlverdqty3());
		System.out.println("Goodsdelivery-deliverdqty3 is correct");
		
		
		Assert.assertEquals("2.000",goodsdelivery.get_balqty1());
		System.out.println("Goodsdelivery-balqty1 is correct");
		
		Assert.assertEquals("3.000",goodsdelivery.get_balqty2());
		System.out.println("Goodsdelivery-balqty2 is correct");
		
		Assert.assertEquals("2.000",goodsdelivery.get_balqty3());
		System.out.println("Goodsdelivery-balqty3 is correct");
		
		Assert.assertEquals("2.000",goodsdelivery.get_qty1());
		System.out.println("Goodsdelivery-qty1 is correct");
		
		Assert.assertEquals("3.000",goodsdelivery.get_qty2());
		System.out.println("Goodsdelivery-qty2 is correct");
		
		Assert.assertEquals("2.000",goodsdelivery.get_qty3());
		System.out.println("Goodsdelivery-qty3 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_uom1());
		System.out.println("Goodsdelivery-uom1 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_uom2());
		System.out.println("Goodsdelivery-uom1 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_uom3());
		System.out.println("Goodsdelivery-uom1 is correct");
		Assert.assertEquals("Warehouse1 [Locator1]",goodsdelivery.get_warehouselocator1());;
		System.out.println("Goodsdelivery-Warehouse1 is correct");
		
		Assert.assertEquals("Warehouse1 [Locator1]",goodsdelivery.get_warehouselocator2());
		System.out.println("Goodsdelivery-Warehouse1 is correct");
		
		Assert.assertEquals("Warehouse1 [Locator1]",goodsdelivery.get_warehouselocator3());
		System.out.println("Goodsdelivery-Warehouse1 is correct");
		
		goodsdelivery.select_all();
		Thread.sleep(1000);
		goodsdelivery.click_save();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void GoodsDelivery_from_Salesorder_selectallview() throws Throwable
	{
		SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
		SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
		GoodsDelivery goodsdelivery = PageFactory.initElements(driver, GoodsDelivery.class);
		GoodsDeliveryList goodsdeliverylist = PageFactory.initElements(driver, GoodsDeliveryList.class);
		SalesInvoice salesinvoice = PageFactory.initElements(driver, SalesInvoice.class);
		
		
		goodsdeliverylist.clickAction(1);
		Thread.sleep(2000);
		goodsdeliverylist.select_view();
		Thread.sleep(2000);
		Thread.sleep(2000);
		goodsdeliverylist.clickAction(0);
		Thread.sleep(2000);
		goodsdeliverylist.select_view();
		Thread.sleep(10000);
	    
		Assert.assertTrue(driver.getCurrentUrl().contains("GoodsDeliveryNote"));
		System.out.println("Sales order redirecting to GoodsDelivery note");
		
		Assert.assertEquals(currentDate.getcurrentdate(),goodsdelivery.get_gdndate());
		System.out.println("Goods deliverydate is correct");
		Thread.sleep(10000);
	
	    Assert.assertEquals("cus new",goodsdelivery.get_cusname());
		System.out.println("Goodsdelivery-customer name is correct");
		
		
		Assert.assertEquals("reference for salesorder selenium",goodsdelivery.get_referencenumber());
		System.out.println("Goodsdelivery-reference number is correct");
				
		
		Assert.assertEquals("Door delivery",goodsdelivery.get_deliverymethod());
		System.out.println("Goodsdelivery-deliverymethod is correct");
		
		Assert.assertEquals("10",goodsdelivery.get_deliverperd());
		System.out.println("Goodsdelivery-deliveryperd is correct");
		
		Assert.assertEquals("1",goodsdelivery.get_slno1());
		System.out.println("Goodsdelivery-sl no:1 is correct");
		
		Assert.assertEquals("2",goodsdelivery.get_slno2());
		System.out.println("Goodsdelivery-sl no:2 is correct");
		
		Assert.assertEquals("3",goodsdelivery.get_slno3());
		System.out.println("Goodsdelivery-sl no:3 is correct");
		
		
		Assert.assertEquals("IT001 - Item001",goodsdelivery.get_product1());
		System.out.println("Goodsdelivery-productname1 is correct");
		

		Assert.assertEquals("IT002 - Item002",goodsdelivery.get_product2());
		System.out.println("Goodsdelivery-productname2 is correct");
		

		Assert.assertEquals("003 - ITM003",goodsdelivery.get_product3());
		System.out.println("Goodsdelivery-productname3 is correct");
		
		Assert.assertEquals("2.000",goodsdelivery.get_orderqty1());
		System.out.println("Goodsdelivery-orderqty1 is correct");
		
		Assert.assertEquals("3.000",goodsdelivery.get_orderqty2());
		System.out.println("Goodsdelivery-orderqty2 is correct");
		
		Assert.assertEquals("2.000",goodsdelivery.get_orderqty3());
		System.out.println("Goodsdelivery-orderqty3 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_ordereduom1());
		System.out.println("Goodsdelivery-orderuom1 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_ordereduom2());
		System.out.println("Goodsdelivery-orderuom2 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_ordereduom3());
		System.out.println("Goodsdelivery-orderuom3 is correct");
		
		
		Assert.assertEquals("0.000",goodsdelivery.get_dlverdqty1());
		System.out.println("Goodsdelivery-deliverdqty1 is correct");
		
		Assert.assertEquals("0.000",goodsdelivery.get_dlverdqty2());
		System.out.println("Goodsdelivery-deliverdqty2 is correct");
		
		
		Assert.assertEquals("0.000",goodsdelivery.get_dlverdqty3());
		System.out.println("Goodsdelivery-deliverdqty3 is correct");
		
		
		Assert.assertEquals("2.000",goodsdelivery.get_balqty1());
		System.out.println("Goodsdelivery-balqty1 is correct");
		
		Assert.assertEquals("3.000",goodsdelivery.get_balqty2());
		System.out.println("Goodsdelivery-balqty2 is correct");
		
		Assert.assertEquals("2.000",goodsdelivery.get_balqty3());
		System.out.println("Goodsdelivery-balqty3 is correct");
		
		Assert.assertEquals("2.000",goodsdelivery.get_qty1());
		System.out.println("Goodsdelivery-qty1 is correct");
		
		Assert.assertEquals("3.000",goodsdelivery.get_qty2());
		System.out.println("Goodsdelivery-qty2 is correct");
		
		Assert.assertEquals("2.000",goodsdelivery.get_qty3());
		System.out.println("Goodsdelivery-qty3 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_uom1());
		System.out.println("Goodsdelivery-uom1 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_uom2());
		System.out.println("Goodsdelivery-uom1 is correct");
		
		Assert.assertEquals("Each",goodsdelivery.get_uom3());
		System.out.println("Goodsdelivery-uom1 is correct");
		
		Assert.assertEquals("Warehouse1 [Locator1]",goodsdelivery.get_warehouselocator1());;
		System.out.println("Goodsdelivery-Warehouse1 is correct");
		
		Assert.assertEquals("Warehouse1 [Locator1]",goodsdelivery.get_warehouselocator2());
		System.out.println("Goodsdelivery-Warehouse1 is correct");
		
		Assert.assertEquals("Warehouse1 [Locator1]",goodsdelivery.get_warehouselocator3());
		System.out.println("Goodsdelivery-Warehouse1 is correct");
		//Thread.sleep(4000);
		//goodsdelivery.click_close();
		
		
		
	}
	

}
