package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PositionList 
{
	
	@FindBy(id="filterEmployee")
	WebElement employeefilter;
	
	
	@FindBy(id="btnShow")
	WebElement show;
	
	
	@FindBy(xpath="//button[@onclick='ObjEmployeePosition.ButtonClear()']")
	WebElement clear;
	
	@FindBy(id="btnAddDept")
	List<WebElement> add;
	
	
	public void search_employee(String Employeename) throws Throwable
	{
		employeefilter.sendKeys(Employeename);
		Thread.sleep(1000);
		employeefilter.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		employeefilter.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		show.click();
		
	}
	
	
	public void click_add(int index)
	
	{
		
		WebElement ele=add.get(index);
		ele.click();
		
	}
	
	
	
	
	

}
