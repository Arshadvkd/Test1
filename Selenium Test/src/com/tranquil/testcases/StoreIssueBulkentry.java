package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.tranquil.pages.Activity;
import com.tranquil.pages.ActivityList;
import com.tranquil.pages.CSOCustomerApproval;
import com.tranquil.pages.Estimation;
import com.tranquil.pages.EstimationList;
import com.tranquil.pages.GoodsDeliveryService;
import com.tranquil.pages.JobOrder;
import com.tranquil.pages.JobOrderList;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.MaterialRequest;
import com.tranquil.pages.MaterialRequestList;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.QuotationList;
import com.tranquil.pages.QuotationService;
import com.tranquil.pages.SalesInvoiceService;
import com.tranquil.pages.SalesOrder;
import com.tranquil.pages.SalesOrderlist;
import com.tranquil.pages.ServiceEnquiry;
import com.tranquil.pages.ServiceEnquiryList;
import com.tranquil.pages.StoreIssue;
import com.tranquil.pages.StoreIssueList;

import Helper.BrowserFactory;
import Helper.readExcel;

public class StoreIssueBulkentry 
{
	 WebDriver driver;
	@BeforeClass
public void storeissue() throws Throwable
{	
    driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	Overview overview = PageFactory.initElements(driver, Overview.class);
	Menu menu = PageFactory.initElements(driver, Menu.class);
	MaterialRequest materialrequest = PageFactory.initElements(driver, MaterialRequest.class);
	MaterialRequestList materialrequestlist = PageFactory.initElements(driver, MaterialRequestList.class);
	StoreIssue storeissue = PageFactory.initElements(driver, StoreIssue.class);
	StoreIssueList storeissuelist = PageFactory.initElements(driver, StoreIssueList.class);
	Activity activity = PageFactory.initElements(driver, Activity.class);
	GoodsDeliveryService goodsdeliveryservice = PageFactory.initElements(driver, GoodsDeliveryService.class);
	ActivityList activitylist = PageFactory.initElements(driver, ActivityList.class);
	

	login.Login("hari@mail.com", "123456789");
	driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
	overview.clickMenu();
	menu.click_activity();
	activitylist.clickAction(0);
	Thread.sleep(1000);
	activitylist.select_materialrequest();
	Thread.sleep(1000);
	materialrequest.select_warehouse();
	Thread.sleep(1000);
	materialrequest.select_requestedby();
	Thread.sleep(1000);
	materialrequest.Select_RequestTypeoptions("salesman");
	Thread.sleep(2000);
	materialrequest.select_approvedby();
	Thread.sleep(2000);
	materialrequest.Select_approvedbyoptions("res");
	Thread.sleep(1000);
	materialrequest.select_warehouse();
	Thread.sleep(1000);
	materialrequest.Select_warehouseoptions("Warehouse1");
	Thread.sleep(1000);
	materialrequest.select_locator();
	Thread.sleep(1000);
	materialrequest.Select_locatoroptions("Locator1");
	Thread.sleep(1000);
	
		
}
	@Test(dataProvider = "dataset")
	public void uploaditems(String index,String itemname,String qty,String price) throws Throwable
	{
		Thread.sleep(1000);
		MaterialRequest materialreqst=PageFactory.initElements(driver, MaterialRequest.class);
		Thread.sleep(1000);
		
		materialreqst.product(driver,index,itemname,qty,price);
		Thread.sleep(1000);
		//materialreqst.click_addrow();
		
	

	}
	

	
	@DataProvider(name = "dataset")
	public Object[][] readexcel() throws Throwable 
	{

		readExcel read = new readExcel("D:\\Book2.xls");

		int count = read.getlastrow(0) + 1;
		System.out.println("data mind " + count);
		Object[][] data = new Object[count][4];
		for (int i =0; i < count; i++) 
		{
		 
			data[i][0] = read.readdata(0,i,0);	
			System.out.println("index"+data[i][0].toString());
			
			data[i][1] = read.readdata(0,i,1);
			System.out.println("item"+data[i][1].toString());
			
			data[i][2] = read.readdata(0, i, 2);
			System.out.println("requested "+data[i][2].toString());
			
			data[i][3] = read.readdata(0, i, 3);
			System.out.println("approved"+data[i][3].toString());
			
			
		}

		return data;

	}
	


}
