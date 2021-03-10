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

public class SalesReports 
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
	Thread.sleep(1000);
	menu.click_inventory();	
	Thread.sleep(2000);
	
	}
	
	@BeforeMethod()
	public void click_menuback()
	{
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		
		overview.clickMenu();
		menu.click_inventory();
		reportsinventory.click_salestab();	
	}
	
	@Test(priority=0)
	public void click_quotations() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_quotations();
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
	public void click_salesorder() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_salesorder();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	@Test(priority=2)
	public void click_goodsdeliverynote() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_goodsdeliverynote();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	@Test(priority=3)
	public void click_salesinvoice() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_salesinvoice();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	
	@Test(priority=4)
	public void click_salesreturn() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_salesreturn();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	@Test(priority=5)
	public void click_Salesanalysisreportbysalesman() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_Salesanalysisreportbysalesman();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	
	@Test(priority=6)
	public void click_invoicedetailreportbysalesman() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_invoicedetailreportbysalesman();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	@Test(priority=7)
	public void click_salesbyitem() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_salesbyitem();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	@Test(priority=8)
	public void click_creditnotereport() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_creditnotereport();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	@Test(priority=9)
	public void click_pendingdelivery() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_pendingdelivery();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	@Test(priority=10)
	public void click_reserveditem() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_reserveditem();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	@Test(priority=11)
	public void click_salesbypricelist() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_salesbypricelist();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	@Test(priority=12)
	public void click_salesprofitreport() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	reportsinventory.click_salesprofitreport();
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
