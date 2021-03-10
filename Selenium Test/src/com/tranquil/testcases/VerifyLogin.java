package com.tranquil.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.tranquil.pages.LoginPage;
import com.tranquil.pages.Menu;
import com.tranquil.pages.Overview;

import Helper.BrowserFactory;
import Helper.ScreenShot;
import junit.framework.Assert;

public class VerifyLogin {
	WebDriver driver;
 

	@Test
	public void checkVaidUser() {
		try {
			WebDriver driver = BrowserFactory.StartBrowser("Chomedriver", "http://111.92.110.196:8084");
			LoginPage login = PageFactory.initElements(driver, LoginPage.class);
			Overview overview = PageFactory.initElements(driver,Overview.class);
			Menu menu = PageFactory.initElements(driver, Menu.class);

			login.Login("hari@mail.com", "123456789");
            driver.findElement(By.xpath("//a[@onclick='objLogin.SelectBranch(11)']")).click();
			//overview.clickMenu();
	
          
          Assert.assertTrue(driver.getCurrentUrl().contains("Dashboard"));
   
     System.out.println("Login Sucessfull");       
     
		} catch (Throwable e) {

		e.printStackTrace();

		}

	}

	
}
