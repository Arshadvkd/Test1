package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class hrmsmenu 
{
	
//Modules
	
	@FindBy(linkText="Overview")
	WebElement Overview_mainmenu;
	
	@FindBy(xpath="//a[@class='dropdown-toggle'][contains(text(),'Employee')]")
	WebElement Employee_mainmenu;
	
	@FindBy(xpath="//a[contains(text(),'Employee Files')]")
	WebElement employee_files;
	
	@FindBy(xpath="//a[contains(text(),'Salary Revision')]")
	WebElement Salaryevision;
	
	@FindBy(xpath="//a[contains(text(),'Accommodation')]")  
	WebElement accomodation;
	
    @FindBy(xpath="//ul[@id='empSubmenu']//a[contains(text(),'Transportation')]")
    WebElement Tranportation;
      
    @FindBy(xpath="//ul[@id='empSubmenu']//a[contains(text(),'Settlement')]")
    WebElement setillment;
      
      
	public void click_employee()
	{
		
		
		Employee_mainmenu.click();
		
		
	}
	
	public void click_employeefiles()
	{
		
		employee_files.click();
		
	}
	
	
	public void click_Salaryevision()
	{
		
		Salaryevision.click();
		
	}
	
	

	public void click_accomodation()
	{
		
		accomodation.click();
		
	}
	

}
