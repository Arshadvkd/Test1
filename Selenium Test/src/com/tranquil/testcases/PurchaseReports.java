package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tranquil.pages.InventoryReports;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.ReportsInventorySelect;

import Helper.BrowserFactory;
import Helper.ScreenShot;

public class PurchaseReports 
{
	WebDriver driver;
	@BeforeClass
	public void inventory() throws Throwable
	{
	driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	Overview overview = PageFactory.initElements(driver, Overview.class);
	Menu menu = PageFactory.initElements(driver, Menu.class);
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	
	login.Login("hari@mail.com","123456789");
	driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
	overview.clickMenu();
	menu.click_inventory();
	reportsinventory.click_purchasetab();
	
	}
	
	@Test(priority=0)
	public void click_purchaseorder() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_purchaseorder();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	@BeforeMethod()
	public void click_menu()
	{
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		
		overview.clickMenu();
		menu.click_inventory();
		reportsinventory.click_purchasetab();
		
		
		
	}
	
	@Test(priority=1)
	public void click_goodsreceipt() throws Throwable
	{
		
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_goodsreceipt();
		Thread.sleep(3000);
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		inventoryreportsoptions.click_pdf();
		Thread.sleep(3000);
		inventoryreportsoptions.click_excel(0);
		Thread.sleep(3000);
		
		
	}
	
	@Test(priority=2)
	public void click_purchaseinvoice() throws Throwable
	{
		
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_purchaseinvoice();
		Thread.sleep(3000);
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		inventoryreportsoptions.click_pdf();
		Thread.sleep(3000);
		inventoryreportsoptions.click_excel(0);
		Thread.sleep(3000);
			
	}
	
	@Test(priority=3)
	public void click_purchasereturn() throws Throwable
	{
		
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_purchasereturn();
		Thread.sleep(3000);
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		inventoryreportsoptions.click_pdf();
		Thread.sleep(3000);
		inventoryreportsoptions.click_excel(0);
		Thread.sleep(3000);
			
	}
	
	@Test(priority=4)
	public void click_purchasebyitem() throws Throwable
	{
		
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_purchasebyitem();
		Thread.sleep(3000);
		inventoryreportsoptions.select_product("001");
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		inventoryreportsoptions.click_pdf();
		Thread.sleep(3000);
		inventoryreportsoptions.click_excel(0);
		Thread.sleep(3000);
			
	}
	
	@Test(priority=5)
	public void click_Debitnotereport() throws Throwable
	{
		
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_Debitnotereport();
		Thread.sleep(3000);
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		inventoryreportsoptions.click_pdf();
		Thread.sleep(3000);
		inventoryreportsoptions.click_excel(0);
		Thread.sleep(3000);
			
	}
	
	
	@AfterMethod()
	public void takescreenshot(ITestResult result)
	{
		ScreenShot.takescreenshot(driver, result.getName());

		
	}
	
	

	

}
