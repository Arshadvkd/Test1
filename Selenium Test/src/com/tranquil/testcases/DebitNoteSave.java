package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.tranquil.pages.CreditNote;
import com.tranquil.pages.CreditNoteList;
import com.tranquil.pages.DebitNote;
import com.tranquil.pages.DebitNoteList;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;

import Helper.BrowserFactory;
import Helper.ScreenShot;

public class DebitNoteSave {
	WebDriver driver;
 
	@Test
	public void savedebitnote() {
		try {
			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			DebitNoteList debitnotelist = PageFactory.initElements(driver, DebitNoteList.class);
			DebitNote debitnote = PageFactory.initElements(driver, DebitNote.class);

			login.Login("hari@mail.com", "123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			Thread.sleep(2000);
			menu.click_debitnote();
			Thread.sleep(2000);

			debitnotelist.click_add();
			Thread.sleep(2000);
			debitnote.enter_customername("supplier");
			Thread.sleep(2000);
			debitnote.enter_itemname1("001");
			Thread.sleep(2000);
			debitnote.enter_purchaseprice1("1000");
			Thread.sleep(2000);
			debitnote.click_addrow();
			Thread.sleep(2000);
			debitnote.enter_itemname2("003");
			Thread.sleep(2000);
			debitnote.enter_purchaseprice2("100");
			debitnote.enter_note("Selenium testing to be done through");
			Thread.sleep(2000);
			debitnote.click_save();
			Thread.sleep(2000);

		} catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "savedebitnote");

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
