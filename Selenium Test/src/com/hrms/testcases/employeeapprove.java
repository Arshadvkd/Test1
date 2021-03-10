package com.hrms.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.pages.Employeeview;
import com.hrms.pages.Menu;
import com.hrms.pages.Overview;
import com.hrms.pages.branch;
import com.hrms.pages.employeelist;
import com.hrms.pages.hrmsmenu;
import com.hrms.pages.hrmsoverview;
import com.tranquil.pages.LoginPage;

import Helper.BrowserFactory;
import Helper.readExcel;

public class employeeapprove 
{
	WebDriver driver;
	
	
	@Test(dataProvider="dataset",priority=10)
	public void approvemployeelevel1(String empcode) throws Throwable
	{
		 driver = BrowserFactory.StartBrowser("Chomedriver","http://111.92.110.196:8084/");
			
		
		Employeeview employeeview=PageFactory.initElements(driver, Employeeview.class);
		employeelist emp=PageFactory.initElements(driver, employeelist.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		branch branch=PageFactory.initElements(driver, branch.class);
		hrmsoverview overview=PageFactory.initElements(driver, hrmsoverview.class);
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		hrmsmenu hrmsmenu=PageFactory.initElements(driver, hrmsmenu.class);
		
		login.Login("algie@smharabia.com","algie@2018");
		Thread.sleep(2000);
		branch.selectbranch();
		Thread.sleep(2000);
		overview.clickMenu();
		Thread.sleep(1000);
		menu.click_hrms();
		Thread.sleep(1000);
		overview.clickMenu();
		Thread.sleep(1000);
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
		hrmsmenu.click_employee();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
		Thread.sleep(9000);
		emp.clickemployee(empcode);
		Thread.sleep(2000);	
		employeeview.click_approve();
		Thread.sleep(3000);	
		driver.close();
		Thread.sleep(2000);	
	
	}
    
	@Test(dataProvider ="dataset",priority=20)
	public void approvemployeelevel2(String empcode) throws Throwable
	{
		
		 driver = BrowserFactory.StartBrowser("Chomedriver","http://111.92.110.196:8084/");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			
			hrmsoverview overview=PageFactory.initElements(driver, hrmsoverview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			hrmsmenu hrmsmenu=PageFactory.initElements(driver, hrmsmenu.class);
			employeelist emp=PageFactory.initElements(driver, employeelist.class);
			Employeeview employeeview=PageFactory.initElements(driver, Employeeview.class);
			branch branch=PageFactory.initElements(driver, branch.class);
			
			login.Login("algie@smharabia.com","algie@2018");
			Thread.sleep(1000);
			branch.selectbranch();
			overview.clickMenu();
			Thread.sleep(1000);
			menu.click_hrms();
			Thread.sleep(1000);
			overview.clickMenu();
			Thread.sleep(1000);
			driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
			hrmsmenu.click_employee();
			driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
			Thread.sleep(9000);
			Thread.sleep(9000);
		    emp.clickemployee(empcode);
		    Thread.sleep(2000);	
		    employeeview.click_approve();
		    Thread.sleep(3000);	
			driver.close();
			Thread.sleep(2000);	
		
		
	}

	@Test(dataProvider ="dataset",priority=30)
	public void approvemployeelevel3(String empcode) throws Throwable
	{
		
		 driver = BrowserFactory.StartBrowser("Chomedriver","http://111.92.110.196:8084/");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			
			hrmsoverview overview=PageFactory.initElements(driver, hrmsoverview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);
			hrmsmenu hrmsmenu=PageFactory.initElements(driver, hrmsmenu.class);
			employeelist emp=PageFactory.initElements(driver, employeelist.class);
			Employeeview employeeview=PageFactory.initElements(driver, Employeeview.class);
			branch branch=PageFactory.initElements(driver, branch.class);
			
			login.Login("algie@smharabia.com","algie@2018");
			Thread.sleep(1000);
			branch.selectbranch();
			Thread.sleep(1000);
			overview.clickMenu();
			Thread.sleep(1000);
			menu.click_hrms();
			Thread.sleep(1000);
			overview.clickMenu();
			Thread.sleep(1000);
			driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
			hrmsmenu.click_employee();
			driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.MINUTES);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
			Thread.sleep(9000);
			Thread.sleep(9000);
		    emp.clickemployee(empcode);
		   Thread.sleep(2000);	
		   employeeview.click_approve();	
		   Thread.sleep(3000);	
			driver.close();
			Thread.sleep(3000);	
			
	}
	@AfterClass
	public void close()
	{
		
		driver.close();
		
	}
	
	
	@DataProvider(name = "dataset")
	public Object[][] readexcel() throws Throwable {

		readExcel read = new readExcel("D:\\employee.xls");

		int count = read.getlastrow(0) + 1;
		System.out.println("data mind " + count);
		Object[][] data = new Object[count][1];
		for (int i = 0; i < count; i++) 
		{
			data[i][0] = read.readdata(0, i, 0);
			
		}

		return data;

	}

}
