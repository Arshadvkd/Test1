package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
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
import com.tranquil.pages.Quotation;
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
import Helper.ScreenShot;

public class ServiceEnquirySave

{
	WebDriver driver;

	@Test 
	public void saveserviceenquiry() throws Throwable {
		 {

			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			ServiceEnquiryList serviceenquirylist = PageFactory.initElements(driver, ServiceEnquiryList.class);
			ServiceEnquiry serviceenquiry = PageFactory.initElements(driver, ServiceEnquiry.class);
			JobOrder joborder = PageFactory.initElements(driver, JobOrder.class);
			JobOrderList joborderlist = PageFactory.initElements(driver, JobOrderList.class);
			Estimation estimation = PageFactory.initElements(driver, Estimation.class);
			EstimationList estimationlist = PageFactory.initElements(driver, EstimationList.class);
			QuotationService quotationservice = PageFactory.initElements(driver, QuotationService.class);
			QuotationList quotationlist = PageFactory.initElements(driver, QuotationList.class);
			SalesOrder salesorder = PageFactory.initElements(driver, SalesOrder.class);
			SalesOrderlist salesorderlist = PageFactory.initElements(driver, SalesOrderlist.class);
			CSOCustomerApproval customerapproval = PageFactory.initElements(driver, CSOCustomerApproval.class);
			ActivityList activitylist = PageFactory.initElements(driver, ActivityList.class);
			MaterialRequest materialrequest = PageFactory.initElements(driver, MaterialRequest.class);
			MaterialRequestList materialrequestlist = PageFactory.initElements(driver, MaterialRequestList.class);
			StoreIssue storeissue = PageFactory.initElements(driver, StoreIssue.class);
			StoreIssueList storeissuelist = PageFactory.initElements(driver, StoreIssueList.class);
			Activity activity = PageFactory.initElements(driver, Activity.class);
			GoodsDeliveryService goodsdeliveryservice = PageFactory.initElements(driver, GoodsDeliveryService.class);
			SalesInvoiceService salesinvoiceservice = PageFactory.initElements(driver, SalesInvoiceService.class);

			login.Login("hari@mail.com", "123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			
	    	menu.click_serviceenquiry();
			serviceenquirylist.click_addbutton();
			serviceenquiry.enter_customer("Cus new");
			serviceenquiry.select_jobtype("Job001");
			serviceenquiry.select_service("Service01");
			serviceenquiry.select_enquirytype("Phone");
			serviceenquiry.addservicedescription(0, "test1");
			Thread.sleep(1000);
			serviceenquiry.addservicedescription(1, "test2");
			Thread.sleep(1000);
			serviceenquiry.addservicedescription(2, "test3");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("scroll(0,110)");
			Thread.sleep(2000);
			serviceenquiry.click_save();
			Thread.sleep(2000);

			serviceenquirylist.clickAction(0);
			Thread.sleep(2000);
			serviceenquirylist.select_order();
			Thread.sleep(2000);

			joborder.select_saleman("Beena");
			Thread.sleep(2000);
			joborder.enter_fault("Fault001");
			Thread.sleep(2000);
			joborder.enter_cusrefernce("REF012345889");
			joborder.click_save();
			Thread.sleep(2000);
			joborderlist.clickAction(0);
			Thread.sleep(2000);
			joborderlist.select_estimate();
			Thread.sleep(4000);

			//estimation.enter_miscdescription(0,
					//"SRV-9050-COMPRESSOR ROTOR,  Scope-Visual inspection, Cleaning of rotors,Dimensional check, NDT DPT , Mechanical and electrical run out check and correction, Magnetism check and Demagnetize, polishing, Diamond Burnishing, Initial unbalance check, unbalance correction  balancing of rotors at ISO-1940");
			Thread.sleep(2000);
			estimation.enter_miscdescription(1,
					"SRV-9050-COMPRESSOR ROTOR,Scope-Visual inspection, Cleaning of rotors,Dimensional check, NDT DPT , Mechanical and electrical run out check and correction, Magnetism check and Demagnetize, polishing, Diamond Burnishing, Initial unbalance check, unbalance correction  balancing of rotors at ISO-1940");
			Thread.sleep(2000);
			estimation.enter_item1("001");
			Thread.sleep(2000);
			estimation.enter_qty1("3");
			Thread.sleep(2000);
			estimation.misc_descriptionclick();
			Thread.sleep(2000);
			estimation.save_decription();
			Thread.sleep(2000);
			estimation.misc1_partnumber("%23");
			Thread.sleep(2000);
			estimation.misc1_qty("10");
			Thread.sleep(2000);
			estimation.misc1_unitprice("2000");
			Thread.sleep(2000);
			estimation.task1_name("task001");
			Thread.sleep(2000);
			estimation.task1_description("Task to be conducted");
			Thread.sleep(2000);
			estimation.nooflabors1("10");
			Thread.sleep(2000);
            estimation.noofdays1("5");
            Thread.sleep(2000);
            estimation.hoursperday1("3");
            Thread.sleep(2000);
			estimation.chargerperhour1("9");
			Thread.sleep(2000);
			estimation.save();
			Thread.sleep(3000);
			estimationlist.clickAction(0);
			Thread.sleep(2000);
			estimationlist.select_verify();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,60)");
			Thread.sleep(2000);
			estimation.save();
			Thread.sleep(2000);
			estimationlist.clickAction(0);
			Thread.sleep(2000);
			estimationlist.select_approve();
			Thread.sleep(2000);
			estimation.save();
			Thread.sleep(2000);

			overview.clickMenu();
			Thread.sleep(2000);
			menu.click_joborder();
			Thread.sleep(2000);

			joborderlist.clickAction(0);
			Thread.sleep(2000);
			joborderlist.select_quotation();
			Thread.sleep(2000);

			quotationservice.click_misc_description();
			Thread.sleep(2000);
			quotationservice.select_Service();
			Thread.sleep(2000);
			quotationservice.select_serviceitem("Service01");
			Thread.sleep(2000);
			quotationservice.enter_servicedescription(5,
					"SRV-9050-COMPRESSOR ROTOR, Scope-Visual inspection, Cleaning of rotors,Dimensional check, NDT DPT , Mechanical and electrical run  & out check and correction, Magnetism check and Demagnetize, polishing, Diamond Burnishing, Initial unbalance check, unbalance correction balancing2\"1/3 of rotors at ISO-1940 G1., repo()");
			Thread.sleep(2000);
			quotationservice.save_decription();
			Thread.sleep(2000);
			quotationservice.enter_uom1("Each");
			Thread.sleep(2000);
			quotationservice.enter_qty1("10");
			Thread.sleep(2000);
			quotationservice.enter_unitprice("100");
			Thread.sleep(1000);
			
			quotationservice.quotation_vat(driver,"1");
			quotationservice.vatoptions(driver);
	
			((JavascriptExecutor) driver).executeScript("scroll(0,50)");
			Thread.sleep(1000);
			quotationservice.enter_servicedescription(0,
					"SRV-9050-COMPRESSOR ROTOR, Scope-Visual inspection, Cleaning of rotors,Dimensional check, NDT DPT , Mechanical and electrical run  & out check and correction, Magnetism check and Demagnetize, polishing, Diamond Burnishing, Initial unbalance check, unbalance correction balancing2\"1/3 of rotors at ISO-1940 G1., repo()");
			Thread.sleep(2000);
			quotationservice.click_save();
			Thread.sleep(2000);
			quotationlist.click_action(0);
			Thread.sleep(2000);
			quotationlist.click_verify();
			Thread.sleep(2000);
			quotationservice.click_save();
			Thread.sleep(2000);
			quotationlist.click_action(0);
			Thread.sleep(2000);
			quotationlist.click_approve();
			Thread.sleep(2000);
			quotationservice.click_save();
			Thread.sleep(2000);
			quotationlist.click_action(0);
			Thread.sleep(2000);
			quotationlist.click_order();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,300)");
			Thread.sleep(1000);

			salesorder.click_save();
			Thread.sleep(1000);
			salesorderlist.clickAction(0);
			Thread.sleep(1000);
			salesorderlist.select_verify();
			Thread.sleep(1000);
			salesorder.click_save();
			Thread.sleep(1000);
			salesorderlist.clickAction(0);
			Thread.sleep(1000);
			salesorderlist.approve();
			Thread.sleep(1000);
			salesorder.click_save();
			Thread.sleep(1000);
			overview.clickMenu();

			Thread.sleep(1000);
			menu.click_joborder();
			Thread.sleep(1000);
			joborderlist.clickAction(0);
			Thread.sleep(1000);
			joborderlist.select_cusapproval();
			Thread.sleep(2000);
			joborderlist.select_apporve(1);
			Thread.sleep(1000);
			overview.clickMenu();
			Thread.sleep(1000);
			menu.click_activity();
			Thread.sleep(1000);

			activitylist.clickAction(0);
			Thread.sleep(1000);
			activitylist.select_materialrequest();
			Thread.sleep(1000);

			materialrequest.select_requestedby();
			Thread.sleep(1000);
			materialrequest.Select_RequestTypeoptions("res");
			Thread.sleep(2000);
			materialrequest.select_approvedby();
			Thread.sleep(2000);
			materialrequest.Select_approvedbyoptions("res");
			Thread.sleep(1000);
			materialrequest.select_warehouse();
			Thread.sleep(2000);
			materialrequest.Select_warehouseoptions("Warehouse1");
			Thread.sleep(2000);
			materialrequest.select_locator();
			Thread.sleep(1000);
			materialrequest.Select_locatoroptions("Locator1");
			Thread.sleep(2000);
			materialrequest.select_requestedqty1("12");
			Thread.sleep(2000);
			materialrequest.click_save();
			Thread.sleep(2000);
			materialrequestlist.clickAction(0);
			Thread.sleep(2000);
			materialrequestlist.select_verify();
			Thread.sleep(2000);
			materialrequest.click_save();
			Thread.sleep(2000);
			materialrequestlist.clickAction(0);
			Thread.sleep(2000);
			materialrequestlist.select_approve();
			Thread.sleep(2000);
			materialrequest.click_save();
			Thread.sleep(2000);
			materialrequestlist.clickAction(0);
			Thread.sleep(2000);
			materialrequestlist.select_storeissue();
			Thread.sleep(2000);
			storeissue.check_checkbox1();
			Thread.sleep(2000);
			storeissue.click_issuedby();
			Thread.sleep(2000);
			storeissue.Select_issuedbyoptions("Beena");
			Thread.sleep(2000);
			storeissue.select_locator(driver,1);
			Thread.sleep(2000);
			storeissue.locator_options(driver);
			Thread.sleep(2000);
			storeissue.click_approvedby();
			Thread.sleep(1000);
			storeissue.Select_approvedbyoptions("Beena");
			Thread.sleep(1000);
			storeissue.click_save();
	 		Thread.sleep(3000);

			overview.clickMenu();
			Thread.sleep(2000);
			menu.click_activity();
			Thread.sleep(1000);
			activitylist.clickAction(0);
			Thread.sleep(1000);
			activitylist.select_edit();
			Thread.sleep(1000);
			activity.click_finish();
			Thread.sleep(2000);
			activity.select_yes(4);
			Thread.sleep(1000);
			overview.clickMenu();
			Thread.sleep(2000);
			menu.click_joborder();
			Thread.sleep(1000);

			joborderlist.clickAction(0);
			Thread.sleep(1000);
			joborderlist.select_qualitycheck();
			Thread.sleep(1000);
			joborderlist.click_qc_salesman();
			Thread.sleep(1000);
			joborderlist.Select_salesmanoptions("res");
			Thread.sleep(1000);
			joborderlist.select_closeapprove(3);
			Thread.sleep(1000);
			overview.clickMenu();
			Thread.sleep(2000);
			menu.click_salesorder();
			Thread.sleep(2000);

			salesorderlist.clickAction(0);
			Thread.sleep(2000);
			salesorderlist.select_deliver();
			Thread.sleep(2000);
			goodsdeliveryservice.click_checkbox1();
			Thread.sleep(2000);
			goodsdeliveryservice.click_qty1("10");
			Thread.sleep(2000);
			goodsdeliveryservice.click_save();
			Thread.sleep(6000);

			overview.clickMenu();
			Thread.sleep(3000);
			menu.click_joborder();
			Thread.sleep(2000);
			joborderlist.clickAction(0);
			Thread.sleep(2000);
			joborderlist.select_jobclose();
			Thread.sleep(2000);

			joborderlist.click_jc_saleman();
			Thread.sleep(2000);

			joborderlist.Select_salesmanoptions("res");
			Thread.sleep(2000);
			joborderlist.select_closeapprove(4);
			Thread.sleep(3000);
		
			joborderlist.clickAction(0);
			Thread.sleep(1000);
			joborderlist.select_invoice();
			Thread.sleep(1000);
			salesinvoiceservice.click_paymentterms();
			Thread.sleep(1000);
			salesinvoiceservice.Select_paymentterms("Cash On Delivery");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("scroll(0,10)");
			Thread.sleep(1000);
			salesinvoiceservice.select_saleman("res");
			Thread.sleep(1000);
			salesinvoiceservice.click_save(1);
			
			
		}

		
	}

	

}
