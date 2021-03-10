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
import com.tranquil.pages.RFQ;
import com.tranquil.pages.RFQList;

import Helper.BrowserFactory;
import Helper.ScreenShot;

public class RFQSave {
	WebDriver driver;

	@Test
	public void saveRFQ() throws Exception

	{
		try {
			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			RFQList rfqlist = PageFactory.initElements(driver, RFQList.class);
			RFQ rfq = PageFactory.initElements(driver, RFQ.class);

			login.Login("hari@mail.com","123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			Thread.sleep(3000);
			menu.clickRFQ();
			rfqlist.clickAdd();
			Thread.sleep(1000);
			rfq.clickRequestedBy();
			Thread.sleep(1000);
			rfq.selectRequstedBy("salesman");
			Thread.sleep(1000);
			rfq.clickdepartment();
			Thread.sleep(1000);
			rfq.select_department("CS");
			Thread.sleep(1000);
			rfq.clicksupplier();
			Thread.sleep(1000);
			rfq.select_suppliername(3);
			Thread.sleep(1000);
			rfq.select_suppliername(4);
			Thread.sleep(1000);
			rfq.select_suppliername(6);
			Thread.sleep(2000);
			rfq.clicksupplier();
			Thread.sleep(2000);
			rfq.item1("001");
			Thread.sleep(1000);
			rfq.add_row();
			Thread.sleep(1000);
			rfq.item2("003");
			Thread.sleep(3000);
			rfq.enter_cusref("Selenium testing");
			rfq.clicksave();
			Thread.sleep(3000);
		
			
		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "saveRFQ");

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
