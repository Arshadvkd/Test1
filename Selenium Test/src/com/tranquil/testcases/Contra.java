package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tranquil.pages.ContraList;
import com.tranquil.pages.ContraPage;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;

import Helper.BrowserFactory;

public class Contra 
{
	WebDriver driver;
	@Test
	public void contra() throws Throwable
	{
	driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	Overview overview = PageFactory.initElements(driver, Overview.class);
	Menu menu = PageFactory.initElements(driver, Menu.class);
	ContraList contralist=PageFactory.initElements(driver, ContraList.class);
	ContraPage contra =PageFactory.initElements(driver, ContraPage.class);
	
	login.Login("hari@mail.com", "123456789");
    driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
	overview.clickMenu();
	menu.click_cobntra();
	Thread.sleep(3000);
	contralist.clic_add();
	Thread.sleep(3000);
	contra.select_Account("current[Current Asset]");
	Thread.sleep(3000);
	
	
	}

}
