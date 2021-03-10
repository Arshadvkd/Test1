package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tranquil.pages.Expense;
import com.tranquil.pages.ExpenseList;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.Receipt;
import com.tranquil.pages.ReceiptList;

import Helper.BrowserFactory;
import Helper.ScreenShot;

public class ExpenseSave

{
	WebDriver driver;

	@BeforeClass
	public void saveexpense() {
		try {

			driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver, Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			ExpenseList expenselist = PageFactory.initElements(driver, ExpenseList.class);
			Expense expense = PageFactory.initElements(driver, Expense.class);

			login.Login("hari@mail.com", "123456789");
			driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			overview.clickMenu();
			menu.click_expense();
			Thread.sleep(2000);
			
			
		}

		catch (Throwable e) {

			//ScreenShot.takescreenshot(driver, "saveexpense");

		}

	}
	
	

	@Test(priority = 0)
	public void save_salesorder() throws Throwable 
	{
		
			ExpenseList expenselist = PageFactory.initElements(driver, ExpenseList.class);
			
		Expense expense = PageFactory.initElements(driver, Expense.class);
	
		expenselist.click_add();
		Thread.sleep(2000);
		
		expense.enter_cashaccount("Cash Account-100100001");
		Thread.sleep(2000);
		expense.enter_account1("cash account");
		Thread.sleep(2000);

		expense.enter_costcenter1("Default");
		Thread.sleep(2000);
		expense.enter_description1("testting receipt1");
		expense.enter_amount1("100");
		Thread.sleep(2000);
		expense.enter_addrow();
		Thread.sleep(1000);
		expense.enter_account2("Selenium-cash");
		Thread.sleep(2000);
		expense.enter_costcenter2("Default");
		Thread.sleep(2000);
		expense.enter_description2("testting receipt1");
		expense.enter_amount2("100");
		Thread.sleep(2000);
		expense.enter_notes("Selenium testing");
		Thread.sleep(2000);
		expense.click_save();
		Thread.sleep(4000);
		
	  
	}

	

}
