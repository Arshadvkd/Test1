package com.hrms.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.hrms.pages.EmployeeFilesList1;
import com.hrms.pages.EmployeeFilesView;
import com.hrms.pages.Employeeview;
import com.hrms.pages.Menu;
import com.hrms.pages.branch;
import com.hrms.pages.employeelist;
import com.hrms.pages.hrmsloginpage;
import com.hrms.pages.hrmsmenu;
import com.hrms.pages.hrmsoverview;
import com.tranquil.pages.LoginPage;

import Helper.BrowserFactory;

public class Employeefiles 
{
	WebDriver driver;
	
	@Test(priority=0)
	public void employee_filesview() throws Throwable
	{
      driver = BrowserFactory.StartBrowser("Chomedriver","http://111.92.110.196:8084/");
			
     
      
      Employeeview employeeview=PageFactory.initElements(driver, Employeeview.class);
		employeelist emp=PageFactory.initElements(driver, employeelist.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		branch branch=PageFactory.initElements(driver, branch.class);
		hrmsoverview overview=PageFactory.initElements(driver, hrmsoverview.class);
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		hrmsmenu hrmsmenu=PageFactory.initElements(driver, hrmsmenu.class);
		EmployeeFilesList1 employeelist=PageFactory.initElements(driver, EmployeeFilesList1.class);
		EmployeeFilesView empview=PageFactory.initElements(driver, EmployeeFilesView.class);
		
		login.Login("newhrms01@mail.com","123456789");
	
		Thread.sleep(2000);
		overview.clickMenu();
		Thread.sleep(1000);
		menu.click_hrms();
		Thread.sleep(1000);
		overview.clickMenu();
		hrmsmenu.click_employeefiles();
		Thread.sleep(2000);
		employeelist.employee("fahad");
		Thread.sleep(2000);
		empview.click_close();
		
		
	}
	
	@Test(priority=1)
	public void employeefilesadd() throws Throwable
	{
		EmployeeFilesList1 employeelist=PageFactory.initElements(driver, EmployeeFilesList1.class);
		EmployeeFilesView empview=PageFactory.initElements(driver, EmployeeFilesView.class);
		
		
		    employeelist.click_add();
			Thread.sleep(1000);
			empview.select_employee("dark");
			Thread.sleep(2000);
			empview.select_documenttype("Iqama");
			Thread.sleep(2000);
			empview.enter_Documentname_English("Certicate");
			Thread.sleep(2000);
			empview.enter_Documentname_arabic("arabic");
			Thread.sleep(2000);
			empview.select_documentdate();
			Thread.sleep(2000);
			//empview.browse_click();
			empview.click_save();
			
		
		
	}
}
