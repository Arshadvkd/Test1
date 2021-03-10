package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.PurchaseRequest;
import com.tranquil.pages.PurchaseRequestList;

import Helper.BrowserFactory;
import Helper.ScreenShot;

public class PuchaseRequestSave

{
	WebDriver driver;

	@Test
	public void savePurchaseRequest()

	{
		try {
			driver = BrowserFactory.StartBrowser("Chomedriver","http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			PurchaseRequestList purchasereqlist = PageFactory.initElements(driver, PurchaseRequestList.class);
			PurchaseRequest purchaserequest = PageFactory.initElements(driver, PurchaseRequest.class);

			login.Login("hari@mail.com", "123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.clickpurchaseRequest();
			purchasereqlist.newPurchaseRequest();
			Thread.sleep(5000);
			purchaserequest.clickRequestType();
			purchaserequest.SelectRequestType_Service();

			purchaserequest.additem1("001");
			purchaserequest.item1_qty("3");
			purchaserequest.clickaddrow();
			Thread.sleep(1000);

			purchaserequest.additem2("002");
			purchaserequest.item2_qty("10");
			purchaserequest.clickaddrow();
			Thread.sleep(1000);

			purchaserequest.additem3("003");
			purchaserequest.item3_qty("6");
			purchaserequest.clickaddrow();
			Thread.sleep(1000);

			purchaserequest.additem4("004");
			purchaserequest.item4_qty("7");
			Thread.sleep(1000);

			purchaserequest.enterJobNo("14");
			purchaserequest.enterRequestedQty("10");
			purchaserequest.enterAuthorizedQty("5");
			purchaserequest.addNotes("Its a test using selenium to execute certain test cases");
			purchaserequest.clickSave();
			Thread.sleep(5000);
			purchasereqlist.clickAction(0);
			Thread.sleep(3000);
			purchasereqlist.select_verify();
			Thread.sleep(1000);
			purchaserequest.clickSave();
			Thread.sleep(1000);
			purchasereqlist.clickAction(0);
			purchasereqlist.select_approve();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,110)");
			Thread.sleep(2000);
			purchaserequest.enter_autorized_qt1("3");
			Thread.sleep(2000);
			purchaserequest.enter_autorized_qt2("10");
			Thread.sleep(2000);
			purchaserequest.enter_autorized_qt3("6");
			Thread.sleep(2000);
			purchaserequest.enter_autorized_qt4("7");
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,110)");
			purchaserequest.clickSave();
		}

		catch (Throwable e) {

			e.getLocalizedMessage();

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
