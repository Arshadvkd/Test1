package com.hrms.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.hrms.pages.hrmsmenu;
import com.hrms.pages.hrmsoverview;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;

import Helper.BrowserFactory;
import Helper.ScreenShot;

public class VerifyLogin
{
	WebDriver driver;

	@Test
	public void checkVaidUser() throws Throwable
	{
		
			WebDriver driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8082");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			hrmsoverview overview=PageFactory.initElements(driver, hrmsoverview.class);
			
			login.Login("hrms1@abcd.com","123456789");
			Thread.sleep(1000);
			overview.clickMenu();

			

	}

	
	
	

}
