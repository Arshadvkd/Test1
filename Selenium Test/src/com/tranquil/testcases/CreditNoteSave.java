package com.tranquil.testcases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.tranquil.pages.CreditNote;
import com.tranquil.pages.CreditNoteList;
import com.tranquil.pages.Expense;
import com.tranquil.pages.ExpenseList;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;

import Helper.BrowserFactory;
import Helper.ScreenShot;

public class CreditNoteSave

{
	WebDriver driver;

	@Test(enabled=false)
	public void savecreditnote() {
		try {
			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			CreditNoteList creditnotelist = PageFactory.initElements(driver, CreditNoteList.class);
			CreditNote creditnote = PageFactory.initElements(driver, CreditNote.class);

			login.Login("hari@mail.com", "123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			Thread.sleep(2000);
			menu.click_creditnote();
			Thread.sleep(2000);

			creditnotelist.click_add();
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			creditnote.enter_customername("customer");
			Thread.sleep(2000);
			creditnote.enter_itemname1("001");
			Thread.sleep(2000);
			creditnote.enter_unitprice1("1000");
			Thread.sleep(2000);
			creditnote.click_addrow();
			Thread.sleep(2000);
			creditnote.enter_itemname2("003");
			Thread.sleep(2000);
			creditnote.enter_unitprice2("100");
			creditnote.enter_note("Selenium testing to be done through");
			Thread.sleep(2000);
			creditnote.click_save();
			Thread.sleep(4000);

		} catch (Throwable e) {

		}

	}
	
	@Test(priority=3)
	public void creditnoteview() throws Throwable
	{
		driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8088");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		CreditNoteList creditnotelist = PageFactory.initElements(driver, CreditNoteList.class);
		CreditNote creditnote = PageFactory.initElements(driver, CreditNote.class);
		
		

		login.Login("hari@mail.com", "123456789");
		driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
		overview.clickMenu();
		Thread.sleep(2000);
		menu.click_creditnote();
		Thread.sleep(2000);
		creditnotelist.click_action(2);
		
	}
}
