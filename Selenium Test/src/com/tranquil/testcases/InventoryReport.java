package com.tranquil.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tranquil.pages.DebitNote;
import com.tranquil.pages.DebitNoteList;
import com.tranquil.pages.InventoryReports;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.ReportsInventorySelect;

import Helper.BrowserFactory;
import Helper.ScreenShot;

public class InventoryReport 
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
	}
	
	@Test(priority=0)
	public void click_stockreport() throws Throwable
	
	{
	ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	Thread.sleep(3000);
	reportsinventory.click_stockreport();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(10000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_excel(0);
	Thread.sleep(3000);
	
	}
	
	@BeforeMethod()
	public void click_menu() throws Throwable
	{
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		
		overview.clickMenu();
		Thread.sleep(3000);
		menu.click_inventory();
		
		
	}
	
	@Test(priority=1)
	public void click_lowstockreport() throws Throwable
	{
		
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_lowstockreport();
		Thread.sleep(3000);
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		inventoryreportsoptions.click_pdf();
		Thread.sleep(3000);
		inventoryreportsoptions.click_excel(0);
		Thread.sleep(3000);
		
		
	}
	
	@Test(priority=2)
	public void click_highstockreport() throws Throwable
	{
		
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_highstockreport();
		Thread.sleep(3000);
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		inventoryreportsoptions.click_pdf();
		Thread.sleep(3000);
		inventoryreportsoptions.click_excel(0);
		Thread.sleep(3000);
			
	}
	
	@Test(priority=3)
	public void click_stockadjustment() throws Throwable
	{
		
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_StockAdjustment();
		Thread.sleep(3000);
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		inventoryreportsoptions.click_pdf();
		Thread.sleep(3000);
		inventoryreportsoptions.click_excel(0);
		Thread.sleep(3000);
			
	}
	
	@Test(priority=4)
	public void click_stockmovement() throws Throwable
	{
		
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_StockMovement();
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
	public void click_stocksummary() throws Throwable
	{
		
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_Stocksummary();
		Thread.sleep(3000);
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		inventoryreportsoptions.click_pdf();
		Thread.sleep(3000);
		inventoryreportsoptions.click_excel(0);
		Thread.sleep(3000);
			
	}
	
	@Test(priority=6)
	public void click_inventoryaging() throws Throwable
	{
		
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_inventoryaging();
		Thread.sleep(3000);
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		
			
	}
	
	
	@Test(priority=7)
	public void click_logreport() throws Throwable
	{
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_logreport();
		Thread.sleep(3000);
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		inventoryreportsoptions.click_pdf();
		Thread.sleep(3000);
		inventoryreportsoptions.click_excel(0);
		Thread.sleep(3000);
			
			
	}
	
	@Test(priority=7)
	public void click_Stockdetailsreport() throws Throwable
	{
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.stockdetailsreport();
		Thread.sleep(3000);
		inventoryreportsoptions.show("Show");
		Thread.sleep(2000);
		inventoryreportsoptions.click_pdf();
		Thread.sleep(3000);
		inventoryreportsoptions.click_excel(0);
		Thread.sleep(3000);
			
			
	}
	
	@Test(priority=8)
	public void click_Stockvaluationreport() throws Throwable
	{
		ReportsInventorySelect reportsinventory=PageFactory.initElements(driver,ReportsInventorySelect.class);
		InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
		reportsinventory.click_stockvaluationreport();
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


