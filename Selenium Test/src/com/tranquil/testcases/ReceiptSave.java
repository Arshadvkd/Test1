package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.Receipt;
import com.tranquil.pages.ReceiptList;

import Helper.BrowserFactory;
import Helper.ScreenShot;

public class ReceiptSave

{
	WebDriver driver;

	@Test
	public void saveReceipt() throws Throwable {
		try {

			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			ReceiptList receiptlist = PageFactory.initElements(driver, ReceiptList.class);
			Receipt receipt = PageFactory.initElements(driver, Receipt.class);

			login.Login("hari@mail.com", "123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.click_receipt();
			Thread.sleep(2000);
			receiptlist.click_add();
			Thread.sleep(2000);
			receipt.enter_cashaccount("Cash Account-100100001");
			Thread.sleep(2000);
			receipt.enter_account1("cash account");
			Thread.sleep(2000);

			receipt.enter_costcenter1("Default");
			Thread.sleep(2000);
			receipt.enter_description1("testting receipt1");
			receipt.enter_amount1("100");
			Thread.sleep(2000);
			receipt.enter_addrow();
			Thread.sleep(1000);
			receipt.enter_account2("vv");
			Thread.sleep(2000);
			receipt.enter_costcenter2("Default");
			Thread.sleep(2000);
			receipt.enter_description2("testting receipt1");
			receipt.enter_amount2("100");
			Thread.sleep(2000);
			receipt.enter_notes("Selenium testing");
			Thread.sleep(2000);
			receipt.click_save();
		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "saveReceipt");

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
