package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.Quotation;
import com.tranquil.pages.QuotationList;

import Helper.BrowserFactory;
import Helper.ScreenShot;
import Helper.readExcel;

public class QuotationItemsOrderCheck 
{
	WebDriver driver;
	
	@BeforeClass
	public void save_quotition()
	
	{
		try {
			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			QuotationList qtlist = PageFactory.initElements(driver, QuotationList.class);
			Quotation quotation = PageFactory.initElements(driver, Quotation.class);

			login.Login("hari@mail.com", "123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.click_quotation();
			qtlist.click_add();
			Thread.sleep(5000);
			quotation.select_saleman("salesmam");

			Thread.sleep(2000);
			quotation.enter_customername("cus new");
			Thread.sleep(2000);
			
			
			
			
		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "save_quotition");

		}

	}
	
	@Test(dataProvider = "dataset")
	public void uploaditems(String index,String itemname,String qty,String price) throws Throwable
	{
	
		Quotation quotation = PageFactory.initElements(driver,Quotation.class);	
		quotation.product(driver,index,itemname,qty,price);
		quotation.click_addrow();
		
	

	}
	

	
	@DataProvider(name = "dataset")
	public Object[][] readexcel() throws Throwable 
	{

		readExcel read = new readExcel("D:\\bulkupload.xls");

		int count = read.getlastrow(0) + 1;
		System.out.println("data mind " + count);
		Object[][] data = new Object[count][4];
		for (int i =0; i < count; i++) 
		{
		
			data[i][0] = read.readdata(0, i, 0);
			
			data[i][1] = read.readdata(0, i, 1);
			System.out.println("qty"+data[i][1].toString());
			data[i][2] = read.readdata(0, i, 2);
			System.out.println("unit "+data[i][2].toString());
			data[i][3] = read.readdata(0, i, 3);
			
		}

		return data;

	}
	

	
	
	
	
	

}
