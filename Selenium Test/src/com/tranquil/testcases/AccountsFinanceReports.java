package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tranquil.pages.AccountsReports;
import com.tranquil.pages.InventoryReports;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.ReportsInventorySelect;

import Helper.BrowserFactory;

public class AccountsFinanceReports 
{

	WebDriver driver;
	@BeforeClass
	public void inventory() throws Throwable
	{
	driver = BrowserFactory.StartBrowser("chomedriver", "http://111.92.110.196:8084");
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	Overview overview = PageFactory.initElements(driver, Overview.class);
	Menu menu = PageFactory.initElements(driver, Menu.class);
	
	
	login.Login("hari@mail.com","123456789");
	driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
	overview.clickMenu();
	Thread.sleep(2000);
	menu.click_Accounts();
	
	
	}
	
	@Test(priority=0)
	public void click_daybook() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_daybook();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	
	@Test(priority=1)
	public void click_cashbook() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_cashbook();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	
	@Test(priority=2)
	public void click_receipt() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_receipt();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	
	@Test(priority=3)
	public void click_manualjournal() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_manualjournal();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	
   
	
	@Test(priority=5)
	public void click_bankstatement() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_bankaccountstatement();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	
	@Test(priority=4)
	public void click_ledger() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_ledger();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	
	@Test(priority=5)
	public void click_ledgersummary() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_ledgersummary();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	
	@Test(priority=6)
	public void click_trialbalance() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_trialbalance();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	
	@Test(priority=7)
	public void click_balancesheet() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_balancesheet();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	
	@Test(priority=8)
	public void click_profitnloss() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_profitnloss();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	
	@Test(priority=9)
	public void click_tradingpf() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_tradinpl();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	@Test(priority=10)
	public void click_journal() throws Throwable
	
	{
	AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
	InventoryReports inventoryreportsoptions=PageFactory.initElements(driver, InventoryReports.class);
	accountsreports.click_Journal();
	Thread.sleep(3000);
	inventoryreportsoptions.show("Show");
	Thread.sleep(1000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(2000);
	inventoryreportsoptions.click_pdf();
	Thread.sleep(3000);
	inventoryreportsoptions.click_dropdown();
	Thread.sleep(3000);
	inventoryreportsoptions.financereport_excel();
	Thread.sleep(3000);
	
	}
	
	@BeforeMethod()
	public void click_menu()
	{
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
		
		overview.clickMenu();
		menu.click_Accounts();
		
	}
	
	
	
	
}
