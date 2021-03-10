package com.tranquil.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tranquil.pages.GoodsDelivery;
import com.tranquil.pages.GoodsDeliveryList;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.SalesInvoice;
import com.tranquil.pages.SalesInvoiceAdj;
import com.tranquil.pages.SalesOrder;
import com.tranquil.pages.SalesOrderlist;

import Helper.BrowserFactory;

public class SalesInvoiceAdjustment 
{
	WebDriver driver;
    @Test
	public void save_adjustment() throws Throwable
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
		SalesInvoiceAdj sal=PageFactory.initElements(driver, SalesInvoiceAdj.class);
	
		login.Login("hari@mail.com", "123456789");
		driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
		overview.clickMenu();
		Thread.sleep(2000);
		menu.click_salesinvoice();
		Thread.sleep(2000);
		salesorderlist.click_add();
		Thread.sleep(2000);
		sal.click_adjustment();
		Thread.sleep(2000);
		sal.select_customer("Dive hotel");
		Thread.sleep(2000);
		sal.enter_unitprice("2000");
	sal.addaccount1();
		Thread.sleep(2000);
	sal.select_account("Unbilled Sales Account[Current Asset]");
		Thread.sleep(2000);
		sal.click_addrow();
		Thread.sleep(2000);
		sal.addaccount2();
		Thread.sleep(2000);	
		sal.select_account1("Cash Account[Cash]");
		Thread.sleep(2000);
				
	}
	
	
}
