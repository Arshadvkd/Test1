package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeFilesView 
{
WebDriver driver;
@FindBy(xpath="//button[@class='btn btn-default']")
List<WebElement> close;
	
@FindBy(xpath="//th[@class='datepicker-switch']")
WebElement date;

@FindBy(id="btnNextTab")
WebElement Save;


	@FindBy(id="filterEmployee")
	WebElement Employee_serach;
	
	@FindBy(id="btnShow")
	WebElement show;
	
	@FindBy(id="btnClear")
	WebElement clear;
	
	@FindBy(id="cmbdocumentType_chosen")
    WebElement documenttype;
	
	@FindBy(xpath="//ul[@class='chosen-results']/li")
	List<WebElement> document_list;
	
	@FindBy(id="txtDocumentName")
	WebElement docnameenglish;
	
	
	@FindBy(id="txtDocumentNameArabic")
	WebElement documentnamearabic;
	
	@FindBy(id="txtDocumentDate")
	WebElement documentdate;
	
	@FindBy(id="txtExpiryDate")
	WebElement expriydate;
	
	@FindBy(xpath="//th[@class='datepicker-switch']")
	List<WebElement> dateticker;
	
	@FindBy(xpath="//span[@class='month']")
	List<WebElement> month;
	
	@FindBy(xpath="//td[@class='day']")
	List<WebElement> day;
	
	
	
	
	@FindBy(id="btnAttachFile")
	WebElement browse;
	
	@FindBy(id="txtDetail")
	WebElement detail;
	
	@FindBy(id="addFiles")
	WebElement documentadd;
	
	@FindBy(linkText="Edit")
	WebElement edit;
	
	@FindBy(linkText="View")
	WebElement view;
	
	@FindBy(id="addFiles")
	WebElement add;
	
	
	@FindBy(xpath="//div[@class='datepicker-months']//th[@class='datepicker-switch'][contains(text(),'2019')] ")
	WebElement hor;
	
	public void click_close()
	{int count =close.size();
	
		
		for(int i=0;i<count;i++)
		{
		WebElement ele=close.get(i);
		String DS=ele.getAttribute("innerHTML");
		if(DS.contentEquals("Close"))
		{
			ele.click();
			break;
			
		}
		}
	}

	
	public void select_documenttype(String doctype) throws Throwable
	{
		documenttype.click();
		Thread.sleep(1000);
		int count =document_list.size();
		for(int i=0;i<count;i++)
		{
			
			WebElement ele=document_list.get(i);
			String DS=ele.getAttribute("innerHTML");
			if(DS.contentEquals(doctype))
			{
				
				ele.click();
				break;
				
			}
			
		}
		
	}
	
	
	public void select_employee(String Employeename) throws Throwable
	{
		
		
		Employee_serach.sendKeys(Employeename);
		Thread.sleep(2000);
		Employee_serach.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Employee_serach.sendKeys(Keys.ENTER);
		show.click();
		
		
		
	}
	
	public void enter_Documentname_English(String docname)
	
	{
		
		docnameenglish.sendKeys(docname);
		
	}
	
	
public void enter_Documentname_arabic(String docname)
	
	{
		
	documentnamearabic.sendKeys(docname);
		
	}
	


public void document_fileupload()
{
	
	browse.click();
	
	
}

public void document_adddetail(String details)

{
detail.sendKeys(details);	
	
	
}

public void Click_add()
{
	add.click();
	
	
}

public void click_view()

{
	view.click();
	
	
}

public void click_edit()

{
	
	edit.click();
	
}

public void click_save()
{
	
Save.click();	
	
}



public void browse_click()
{
	
	browse.click();
	
}

public void select_documentdate()
{
	
	documentdate.click();
	
}

public void select_expirydate()
{
	
	expriydate.click();
	
}



}
