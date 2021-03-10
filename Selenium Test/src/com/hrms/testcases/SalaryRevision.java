package com.hrms.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.hrms.pages.EmployeeFilesList1;
import com.hrms.pages.EmployeeFilesView;
import com.hrms.pages.Employeeview;
import com.hrms.pages.SalaryRevisionPage;
import com.hrms.pages.Menu;
import com.hrms.pages.SalaryRevisionList;
import com.hrms.pages.branch;
import com.hrms.pages.employeelist;
import com.hrms.pages.hrmsmenu;
import com.hrms.pages.hrmsoverview;
import com.tranquil.pages.LoginPage;


import Helper.BrowserFactory;
import Helper.DatePicker;

public class SalaryRevision 
{
	WebDriver driver;
	@Test(priority=1,enabled=false)
	public void salary_revisionview() throws Throwable
	{
	driver = BrowserFactory.StartBrowser("Chomedriver","http://111.92.110.196:8084/");
      Employeeview employeeview=PageFactory.initElements(driver, Employeeview.class);
		employeelist emp=PageFactory.initElements(driver, employeelist.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		branch branch=PageFactory.initElements(driver, branch.class);
		hrmsoverview overview=PageFactory.initElements(driver, hrmsoverview.class);
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		hrmsmenu hrmsmenu=PageFactory.initElements(driver, hrmsmenu.class);
		SalaryRevisionList salaryrevsnlist=PageFactory.initElements(driver, SalaryRevisionList.class);
		SalaryRevisionPage salry=PageFactory.initElements(driver,SalaryRevisionPage.class);
		
		
		login.Login("newhrms01@mail.com","123456789");
	   Thread.sleep(2000);
		overview.clickMenu();
		Thread.sleep(1000);
		menu.click_hrms();
		Thread.sleep(1000); 
		overview.clickMenu();
		hrmsmenu.click_Salaryevision();
		Thread.sleep(1000);
		salaryrevsnlist.action_click(0);
		Thread.sleep(1000);
		salaryrevsnlist.click_view();
		Thread.sleep(3000);
		salry.click_close();
	
	} 
	
	@Test(priority=2,enabled=false)
	public void Change_salary() throws Throwable
	{
		SalaryRevisionList salaryrevsnlist=PageFactory.initElements(driver, SalaryRevisionList.class);
		SalaryRevisionPage salry=PageFactory.initElements(driver,SalaryRevisionPage.class);
		
		
		salaryrevsnlist.click_add();
		salry.search_employee("SMH-O-566");
		salry.click_date("22");
		
		((JavascriptExecutor) driver).executeScript("scroll(0,30)");
		System.out.println("Strat");
		salry.earnings(1,"9000");
		salry.earnings(2,"1000");
		salry.earnings(3,"500");
		salry.earnings(4,"100");
		salry.deduction(1,"100");
		salry.deduction(2,"50");
		
		salry.click_save();
		
		
	}
	
	@Test(priority=1)
	public void testcalendar() throws Throwable
	{
		
		driver = BrowserFactory.StartBrowser("Chomedriver","http://111.92.110.196:8084/");
	      Employeeview employeeview=PageFactory.initElements(driver, Employeeview.class);
			employeelist emp=PageFactory.initElements(driver, employeelist.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			branch branch=PageFactory.initElements(driver, branch.class);
			hrmsoverview overview=PageFactory.initElements(driver, hrmsoverview.class);
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			hrmsmenu hrmsmenu=PageFactory.initElements(driver, hrmsmenu.class);
			SalaryRevisionList salaryrevsnlist=PageFactory.initElements(driver, SalaryRevisionList.class);
			SalaryRevisionPage salry=PageFactory.initElements(driver,SalaryRevisionPage.class);
			DatePicker datepicker=PageFactory.initElements(driver, DatePicker.class);
			
			login.Login("newhrms01@mail.com","123456789");
		   Thread.sleep(2000);
			overview.clickMenu();
			Thread.sleep(1000);
			menu.click_hrms();
			Thread.sleep(1000); 
			overview.clickMenu();
			hrmsmenu.click_Salaryevision();
			Thread.sleep(1000);
			salaryrevsnlist.click_add();
			Thread.sleep(1000);
			salry.search_employee("SMH-O-566");
			
			Thread.sleep(1000);
			salry.effectivedate_click();
			datepicker.select_year("2019");
			Thread.sleep(1000);
			datepicker.select_month("Feb");
			Thread.sleep(1000);
			datepicker.select_day("10");
			
		
		
		
	}
	
	

}
