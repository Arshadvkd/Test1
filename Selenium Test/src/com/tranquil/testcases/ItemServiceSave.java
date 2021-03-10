package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tranquil.pages.DebitNote;
import com.tranquil.pages.DebitNoteList;
import com.tranquil.pages.Item;
import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;

import Helper.BrowserFactory;
import Helper.ScreenShot;

public class ItemServiceSave 
{
	WebDriver driver;
	
	@Test
	public void saveServiceItem() 
	{
		try
		{ driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		Overview overview = PageFactory.initElements(driver, Overview.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		Item item = PageFactory.initElements(driver, Item.class);

		login.Login("hari@mail.com", "123456789");
		driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
		Thread.sleep(1000);
		overview.clickMenu();
		Thread.sleep(1000);
		menu.click_item();
		Thread.sleep(1000);
		item.click_addnew();
		Thread.sleep(1000);
		item.select_service(0);
		Thread.sleep(1000);
		item.select_serviceuom("Each");
		Thread.sleep(2000);
		item.selectcategory("Default");
		Thread.sleep(1000);
		item.enter_productname("fffffeeee");
		Thread.sleep(1000);
		item.click_save(); 
		}

  
		
		catch (Throwable e)
		{
			ScreenShot.takescreenshot(driver,"ItemServiceSave");

			
		}
		
		
		
		
	}

}
