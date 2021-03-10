package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.tranquil.pages.LoginPage;
import com.tranquil.pages.ManualJournal;
import com.tranquil.pages.ManualJournalList;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.PurchaseRequest;
import com.tranquil.pages.PurchaseRequestList;

import Helper.BrowserFactory;
import Helper.ScreenShot;
import Helper.currentDate;

 
public class ManualJournalSave

{ 
	WebDriver driver; 

	
	@Test
	public void saveManualJournal() throws Throwable {
		try {
			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			ManualJournalList manualjournallist = PageFactory.initElements(driver, ManualJournalList.class);
			ManualJournal manualjournal = PageFactory.initElements(driver, ManualJournal.class);

			login.Login("hari@mail.com", "123456789");
            driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.click_manualjournal();
			manualjournallist.click_add();
			manualjournal.enter_reference("reference testing");
			manualjournal.select_account1("Cash Account");
			Thread.sleep(1000);
			manualjournal.enter_description1("selenium");
			Thread.sleep(1000);
			manualjournal.enter_creditamount1("100");
			Thread.sleep(1000);
			manualjournal.select_account2("Sales");
			Thread.sleep(1000);
			manualjournal.enter_description2("selenium");
			Thread.sleep(1000);
			manualjournal.enter_debitamount2("100");
			Thread.sleep(1000);
			manualjournal.enter_notes("Manual journal using selenium account");
			Thread.sleep(1000);
			manualjournal.click_post();
			Thread.sleep(1000);
			
			manualjournallist.click_action(0);
			Thread.sleep(3000);
			manualjournallist.select_view();
			
			Assert.assertEquals(currentDate.getcurrentdate(),manualjournal.get_date());
			System.out.println("journal date is correct");
			
			Assert.assertEquals("reference testing",manualjournal.get_reference());
			System.out.println("reference is correct");
			
			Assert.assertEquals("1",manualjournal.get_slno(driver,"1"));
			System.out.println("sl no:1 is correct");
			
			Assert.assertEquals("2",manualjournal.get_slno(driver,"2"));
			System.out.println("sl no:2 is correct");
		    
			Assert.assertEquals("Cash Account[100100001]",manualjournal.get_accountname(driver,"1"));
			System.out.println("account name 1 correct");
			
			Assert.assertEquals("Unbilled Sales Account[100000006]",manualjournal.get_accountname(driver,"2"));
			System.out.println("account name 2 correct");
			
			Assert.assertEquals("cost center02",manualjournal.get_costcenter(driver,"1"));
			System.out.println("costcenter name 1 correct");
			
			Assert.assertEquals("cost center02",manualjournal.get_costcenter(driver,"1"));
			System.out.println("costcenter name 2 correct");
			
			Assert.assertEquals("selenium",manualjournal.get_description(driver,"1"));
			System.out.println("description1 name correct");
			
			Assert.assertEquals("selenium",manualjournal.get_description(driver,"2"));
			System.out.println("description2 name correct");
			
			Assert.assertEquals("",manualjournal.get_debit(driver,"1"));
			System.out.println("debit 1 is correct");
			
			Assert.assertEquals("100.000",manualjournal.get_debit(driver,"2"));
			System.out.println("debit 2 is correct");
			
			
			Assert.assertEquals("100.000",manualjournal.get_credit(driver,"1"));
			System.out.println("credit 1 is correct");
			
			Assert.assertEquals("",manualjournal.get_credit(driver,"2"));
			System.out.println("credit 2 is correct");

			Assert.assertEquals("Manual journal using selenium account",manualjournal.get_notes());
			System.out.println("notes are correct");
			
			//System.out.println(manualjournal.getcredittotal());
			
			Assert.assertEquals("SAR 100.000",manualjournal.getcredittotal());
			System.out.println("Credit total is is correct");
			 
			
			Assert.assertEquals("SAR 100.000",manualjournal.getcredittotal());
			System.out.println("debit total is is correct");
			
			manualjournal.click_close();
			
			 	 
		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "saveManualJournal");

		}

	}

	@Test
	public void draft_manualjournal()
	{
		
		try {
			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			ManualJournalList manualjournallist = PageFactory.initElements(driver, ManualJournalList.class);
			ManualJournal manualjournal = PageFactory.initElements(driver, ManualJournal.class);

			login.Login("hari@mail.com", "123456789");
            driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.click_manualjournal();
			manualjournallist.click_add();
			manualjournal.select_account1("Cash Account");
			Thread.sleep(1000);
			manualjournal.enter_description1("selenium");
			Thread.sleep(1000);
			manualjournal.enter_creditamount1("100");
			Thread.sleep(1000);
			manualjournal.select_account2("Sales");
			Thread.sleep(1000);
			manualjournal.enter_description2("selenium");
			Thread.sleep(1000);
			manualjournal.enter_debitamount2("600");
			Thread.sleep(1000);
			manualjournal.enter_notes("Manual journal using selenium account");
			Thread.sleep(1000);
			manualjournal.click_draft();
		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "saveManualJournal");

		}
		
	}
	@Test
	public void draft_manualjournaledit()
	{
		
		try {
			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			ManualJournalList manualjournallist = PageFactory.initElements(driver, ManualJournalList.class);
			ManualJournal manualjournal = PageFactory.initElements(driver, ManualJournal.class);

			login.Login("hari@mail.com", "123456789");
            driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.click_manualjournal();
			Thread.sleep(1000);
			manualjournallist.click_action(0);
			Thread.sleep(3000);
			manualjournallist.select_view();
			
		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "saveManualJournal");

		}
		
	}

}
