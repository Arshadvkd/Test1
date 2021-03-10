package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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
import com.tranquil.pages.purchaseinvoicelist;

import Helper.BrowserFactory;
import Helper.CalendarPick;
import Helper.ScreenShot;

public class PurchaseOrderSave {

	WebDriver driver;

	@Test(priority = 15)
	public void savePurchaseOrder() throws Throwable {
		try {
			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			PurchaseOrderList purchaseorderlist = PageFactory.initElements(driver, PurchaseOrderList.class);
			PurchaseOrder purchaseorder = PageFactory.initElements(driver, PurchaseOrder.class);
			GoodsReceive goodsreceive = PageFactory.initElements(driver, GoodsReceive.class);
			GoodsReceiveList goodsreceivelist = PageFactory.initElements(driver, GoodsReceiveList.class);
			PurchaseInvoice purchaseinvoice = PageFactory.initElements(driver, PurchaseInvoice.class);
			purchaseinvoicelist purchaseinvoicelist = PageFactory.initElements(driver, purchaseinvoicelist.class);
			Payment payment = PageFactory.initElements(driver, Payment.class);
			CalendarPick calendar = new CalendarPick(driver);

			login.Login("hari@mail.com", "123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.click_purchaseorder();
			purchaseorderlist.clickAdd();
			Thread.sleep(5000);
			purchaseorder.enter_suppliername("sup new");
			Thread.sleep(5000);
			purchaseorder.click_podate();
			Thread.sleep(2000);
			calendar.select_date("July 2020","18");
			purchaseorder.add_item1("002");
			purchaseorder.add_item1_qty("3");
			purchaseorder.click_addrow(); 
			purchaseorder.add_item2("009");
			purchaseorder.add_item2_qty("4");
			purchaseorder.enter_jobno("CSO14");
			purchaseorder.enter_miscquantity1("10");
			purchaseorder.enter_miscpurchaseprice("2000");
			purchaseorder.select_item1_miscvattype(1);
			purchaseorder.click_save();
			Thread.sleep(6000);
			purchaseorderlist.clickAction(0);
			purchaseorderlist.select_verify();
			Thread.sleep(6000);
			purchaseorder.click_save();
			Thread.sleep(6000);
			purchaseorderlist.clickAction(0);
			Thread.sleep(3000);

			purchaseorderlist.approve();
			((JavascriptExecutor) driver).executeScript("scroll(0,300)");
			Thread.sleep(3000);
			purchaseorder.click_save();
			Thread.sleep(3000);
			purchaseorderlist.clickAction(0);
			Thread.sleep(3000);
			purchaseorderlist.select_receive();
			Thread.sleep(3000);
			goodsreceive.chkitems();
			Thread.sleep(3000);
			goodsreceive.select_locator1(0);
			Thread.sleep(1000);
			goodsreceive.select_locator2(0);
			Thread.sleep(1000);
			goodsreceive.enter_supno("786");
			goodsreceive.select_locator1(1);
			Thread.sleep(3000);
			goodsreceive.select_locator2(1);
			goodsreceive.misc_chkitems();
			Thread.sleep(1000);
			goodsreceive.enter_received_qty("10");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("scroll(0,100)");
			goodsreceive.click_submit();
			Thread.sleep(1000);
			goodsreceivelist.clickAction(0);
			Thread.sleep(1000);
			goodsreceivelist.invoice();
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("scroll(0,400)");
			Thread.sleep(1000);
			purchaseinvoice.save_purchaseinvoice();
			Thread.sleep(1000);
			purchaseinvoicelist.clickAction(0);
			Thread.sleep(1000);
			purchaseinvoicelist.select_pay();
			Thread.sleep(1000);
			payment.click_checkbox();
			Thread.sleep(1000);
			payment.enter_payamount(payment.balance());
			Thread.sleep(1000);
			payment.select_cashaccount("Cash Account-100100001");
			payment.click_save();
			Thread.sleep(3000);
		}

		catch (Throwable e) {

			//ScreenShot.takescreenshot(driver, "savePurchaseOrder");

		}

	}

	@AfterMethod
	public void teardown(ITestResult result) {

		if (ITestResult.FAILURE == result.getStatus()) {
			ScreenShot.takescreenshot(driver, result.getName());

		}

		driver.close();

	}

}
