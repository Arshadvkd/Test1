package com.hrms.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.hrms.pages.Employeeview;
import com.hrms.pages.Menu;
import com.hrms.pages.Overview;
import com.hrms.pages.SalaryRevisionList;
import com.hrms.pages.SalaryRevisionPage;
import com.hrms.pages.branch;
import com.hrms.pages.employeelist;
import com.hrms.pages.hrmsmenu;
import com.hrms.pages.hrmsoverview;
import com.tranquil.pages.LoginPage;

import Helper.BrowserFactory;

public class accomdation {
	WebDriver driver;

	@Test
	public void add_accomdatn() throws Throwable {

		driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084/");
		Employeeview employeeview = PageFactory.initElements(driver, Employeeview.class);
		employeelist emp = PageFactory.initElements(driver, employeelist.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		branch branch = PageFactory.initElements(driver, branch.class);
		hrmsoverview overview = PageFactory.initElements(driver, hrmsoverview.class);
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		hrmsmenu hrmsmenu = PageFactory.initElements(driver, hrmsmenu.class);
		accomdation accomdtn = PageFactory.initElements(driver, accomdation.class);
		Overview view = PageFactory.initElements(driver, Overview.class);

		login.Login("newhrms01@mail.com","123456789");
		Thread.sleep(1000);
		view.clickMenu();
		Thread.sleep(3000);
		menu.click_hrms();
		Thread.sleep(3000);
		System.out.println("Start");
		overview.clickMenu();
		System.out.println("End");
		Thread.sleep(3000);
		hrmsmenu.click_employee();
		Thread.sleep(0000);
		hrmsmenu.click_accomodation();
		Thread.sleep(2000);
		accomdtn.add_accomdatn();
		Thread.sleep(1000);
		System.out.println("Done");

	}

}
