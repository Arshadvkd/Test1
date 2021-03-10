package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.RFQ;
import com.tranquil.pages.RFQList;
import com.tranquil.pages.SalesEnquiryList;
import com.tranquil.pages.SalesEnqury;

import Helper.BrowserFactory;
import Helper.ScreenShot;
import Helper.currentDate;

public class SalesEnquiry_Quotation 
{
	
	WebDriver driver;

	@Test(priority=0,enabled=true)
	public void salesenquiry_save() throws Throwable {
		try {

			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
 			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			SalesEnquiryList salesenquirylist = PageFactory.initElements(driver, SalesEnquiryList.class);
			SalesEnqury salesenqry = PageFactory.initElements(driver, SalesEnqury.class);

			login.Login("hari@mail.com","123456789");
			 driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.click_salesenquiry();
			salesenquirylist.click_add();
			Thread.sleep(5000);
			salesenqry.select_saleman("Beena");
			Thread.sleep(2000);
			salesenqry.select_enquirytype("Phone");
			Thread.sleep(2000);
			
			salesenqry.enter_reference("REFfrom Selenium");
			Thread.sleep(1000);
			salesenqry.enter_customername("cus new");
			Thread.sleep(2000);
			salesenqry.select_paymentterms("cash on delivery");
			Thread.sleep(2000);
			salesenqry.enter_item1("001");
			salesenqry.enter_qty1("2.000");
			Thread.sleep(1000);
			salesenqry.enter_unitprice1("1000");
			Thread.sleep(1000);
			salesenqry.enter_discount1("3");
			Thread.sleep(1000);
			salesenqry.click_addrow();
			Thread.sleep(1000);
			salesenqry.enter_item2("002");
			Thread.sleep(2000);
			salesenqry.enter_qty2("3.000"); 
			Thread.sleep(2000);
			salesenqry.enter_unitprice2("300");
			salesenqry.enter_discount2("1.5");
			Thread.sleep(1000);
			salesenqry.enter_item3("003");
			Thread.sleep(2000);
			salesenqry.enter_qty3("4.000");
			Thread.sleep(2000);
			salesenqry.enter_unitprice3("500");
			Thread.sleep(1000);
			salesenqry.enter_discount3("3");
			salesenqry.enternotes(
					"Impeller, Pump; Type Suction, Material SS Jis G5121 GR SCS14A, FFT; FOR EQPT: EP-0523A/S MDL WY-9ST PH-32781-82, MNFR: Shin nippon machinery co. ltd, Mnfr part No: 3S7069 , Drawing 3ps-61412 PO 719 Rev 0");
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("scroll(0,30)");
			salesenqry.clicksave();
			Thread.sleep(3000);
		}

		catch (Throwable e) {

			ScreenShot.takescreenshot(driver, "salesenquiry_save");

		} 

	}
	
	@Test(priority=2,enabled=true)
	public void Salesenquiry_RFQ() throws Throwable
	{
		{
			SalesEnquiryList salesenquirylist = PageFactory.initElements(driver, SalesEnquiryList.class);
			RFQList rfqlist=PageFactory.initElements(driver,RFQList.class);
			RFQ rfq=PageFactory.initElements(driver,RFQ.class);
			
			Thread.sleep(1000);
			salesenquirylist.clickAction(0);
			Thread.sleep(2000);
			salesenquirylist.select_rfq();
			Thread.sleep(2000);
			
			Assert.assertTrue(driver.getCurrentUrl().contains("PurchaseEnquiry"));
			System.out.println("Navigated to RFQ sucessfully");
			Thread.sleep(2000); 
			
			Assert.assertEquals(currentDate.getcurrentdate(),rfq.get_date());
			System.out.println("Saved-salesorder date is correct");
			
		   Assert.assertEquals("Beena",rfq.get_requestedby());
		   System.out.println("Requested by is correct");
			
		   Assert.assertEquals("IT001 - Item001",rfq.get_item1());
		   System.out.println("Item1 name is correct");
			
		   Assert.assertEquals("IT002 - Item002",rfq.get_item2());
		   System.out.println("Item2 name is correct");
		   
		   Assert.assertEquals("003 - ITM003",rfq.get_item3());
		   System.out.println("Item3 name is correct");
		   
		}
		
	}

}
