package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.FindBy;

public class SalaryRevisionPage 
{
	WebDriver driver;
	
	public SalaryRevisionPage(WebDriver ldriver)
	
	{
		
		this.driver=ldriver;
	}
	
	@FindBy(xpath = "//tr/th[@class='datepicker-switch']")
	WebElement datepicker;
	
	
	@FindBy(xpath="//button[@id='btnClose']")
	WebElement close;
	 
	
	@FindBy(id="filterEmployee")
	WebElement Employee;
	
	
	@FindBy(id="ddlSalaryCalculationPeriod_chosen")
	WebElement salaryCalculationPeriod;
	
	@FindBy(id="lblButton_R")
	WebElement Monthly_Salary;
	
	@FindBy(id="lblButton_D")
	WebElement Days_worked;
	
	@FindBy(id="lblButton_H")
	WebElement Hours_worked;
	
	@FindBy(id="lblButton_P")
	WebElement Percentage;
	
	
	@FindBy(id="salaryStructure")
	WebElement salarystructure;
	
	
	@FindBy(id="txtEffectiveDateRglrDt")
	WebElement effectivedate;
	
	@FindBy(id="ddlSearchMonth_chosen")
	WebElement dedutioncalculationbasisperiod;
	
	@FindBy(id="ddlOTDeduction_chosen")
	WebElement OTdeductionsytemsettings;
	

	
	@FindBy(id="btnSave")
	WebElement save;
	
	public void  effectivedate_click()
	{
		
		effectivedate.click();
		
		
	}

	
	public void search_employee(String Employeename) throws Throwable
	{
		
		Employee.sendKeys(Employeename);
		Thread.sleep(2000);
		Employee.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Employee.sendKeys(Keys.ENTER); 
		
	}
	public void earnings(int index,String amount) throws Throwable
	{
		WebElement earnings=driver.findElement(By.id("txtNewEarningAmount_"+index+""));
		
		earnings.click();
		Thread.sleep(100);
		earnings.clear();
		Thread.sleep(100);
		earnings.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(100);
		earnings.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(100);
		earnings.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(100);
		earnings.sendKeys(amount);
		
		
		
	}
	
	public void deduction(int index,String amount) throws Throwable
	{WebElement deduction=driver.findElement(By.id("txtNewDeductionAmount_"+index+""));
	
	deduction.click();
	Thread.sleep(100);
	deduction.clear();
	Thread.sleep(100);
	deduction.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(100);
	deduction.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(100);
	deduction.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(100);
	deduction.sendKeys(amount);
		
		
	}
	
	public void click_save()
	
	{
		
		save.click();
		
	}
	
	public void click_close()
	{
		
		close.click();
	}
	
	public void click_date(String date)

	{
		effectivedate.clear();
		effectivedate.sendKeys(date);
		effectivedate.sendKeys(Keys.ENTER);
		
		
		
	}
}
