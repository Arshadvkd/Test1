package com.tranquil.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tranquil.pages.CreditNote;
import com.tranquil.pages.CreditNoteList;
import com.tranquil.pages.Item;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;

import Helper.BrowserFactory;
import Helper.ScreenShot;
import Helper.readExcel;

public class ItemSave

{
	WebDriver driver;

	@Test(dataProvider = "dataset")
	public void SaveItem(String productcode, String productname, String Warehouse, String locator, String qty,
			String purchaseprice, String unitprice, String costprice) {

		try {
			Item item = PageFactory.initElements(driver, Item.class);

			Thread.sleep(3000);
			item.click_addnew();
			Thread.sleep(3000);
			item.enter_code(productcode);
			Thread.sleep(1000);
			item.selectcategory("Default");
			Thread.sleep(1000);

			item.select_inventoryassetaccount("Inventory Asset");
			Thread.sleep(1000);
			item.select_incomeaccount("Sales");
			Thread.sleep(1000);
			item.select_expenseaccount("Cost Of Sales");
			item.enter_productname(productname);
			((JavascriptExecutor) driver).executeScript("scroll(0,100)");
			item.click_save();
			item.select_baseuom("Each");
			Thread.sleep(2000);
			item.delete_uom();
			Thread.sleep(2000);
			item.click_save();
			item.click_save();
			item.click_save();
			item.click_save();
			item.select_defwarehouse("Warehouse1");
			Thread.sleep(1000);
			item.select_deflocator("Locator1");
			item.select_op_warehouse(Warehouse);
			item.select_op_locator(locator);
			item.select_op_uom("Each");
			item.op_qty(qty);
			item.enter_purchaseprice(purchaseprice);
			item.enter_unitprice(unitprice);
			item.enter_costprice(costprice);
			item.click_save();
			Thread.sleep(3000);
			((JavascriptExecutor) driver).executeScript("scroll(0,20)");
			item.click_save1();
			Thread.sleep(3000);
		}

		catch (Throwable e) {
			ScreenShot.takescreenshot(driver, "SaveItem");

		}

	}

	@BeforeClass
	public void Invokeitem() {

		driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);

		login.Login("hari@mail.com", "123456789");
		driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
		overview.clickMenu();
		menu.click_item();

	}

	@DataProvider(name = "dataset")
	public Object[][] readexcel() throws Throwable {

		readExcel read = new readExcel("D:\\book1.xls");

		int count = read.getlastrow(0) + 1;
		System.out.println("data mind " + count);
		Object[][] data = new Object[count][8];
		for (int i = 0; i < count; i++) {
 
			data[i][0] = read.readdata(0, i, 0);
			data[i][1] = read.readdata(0, i, 1);
			data[i][2] = read.readdata(0, i, 2);
			data[i][3] = read.readdata(0, i, 3);
			data[i][4] = read.readdata(0, i, 4);
			data[i][5] = read.readdata(0, i, 5);
			data[i][6] = read.readdata(0, i, 6);
			data[i][7] = read.readdata(0, i, 7);
		}

		return data;

	}

	/*@AfterMethod
	public void teardown(ITestResult result) throws Throwable {

		if (ITestResult.FAILURE == result.getStatus()) {
			Thread.sleep(4000);
			ScreenShot.takescreenshot(driver, result.getName());
			Thread.sleep(4000);

		}

		driver.quit();

	}*/

}
