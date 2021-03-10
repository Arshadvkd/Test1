package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class employeelist 

{
	
	@FindBy(id="filterEmployee")
	WebElement serach;
	
	@FindBy(xpath="//button[@onclick='objAddEmployee.LoadEmployeesByFilters()']")
	WebElement show;
	
	@FindBy(xpath="//div[@class='EmpCard']")
	WebElement employee;
	
	
	
public void clickemployee(String employeecode) throws Throwable
	
	{
	System.out.println("Start");
	serach.click();	
	Thread.sleep(1000);
	serach.sendKeys(employeecode);
	Thread.sleep(1000);
	serach.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	serach.sendKeys(Keys.ENTER);	
	Thread.sleep(1000);
	show.click();
	Thread.sleep(1000);
	employee.click();
		
	}

	
	
	

}
