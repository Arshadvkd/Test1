package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tranquil.pages.AccountsReports;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;
import com.tranquil.pages.ProfitandLossreport;

import Helper.BrowserFactory;

public class OverviewComparison 

{
	
	WebDriver driver;
	
	@Test
	public void overview_grossprofitcheck() throws Throwable
	{
		
		driver = BrowserFactory.StartBrowser("chomedriver", "http://111.92.110.196:8084");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		AccountsReports accountsreports=PageFactory.initElements(driver, AccountsReports.class);
		ProfitandLossreport pfreport=PageFactory.initElements(driver,ProfitandLossreport.class);
		
		
		login.Login("hari@mail.com","123456789");
		driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
		overview.clickMenu();
		Thread.sleep(2000);
		menu.click_Accounts();
		Thread.sleep(2000);
		accountsreports.click_profitnloss();
		Thread.sleep(2000);
		pfreport.click_show();
		Thread.sleep(2000);
		pfreport.get_grossprofit();
		
		
	}

}
