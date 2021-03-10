package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryReports

{

	@FindBy(xpath = "//button[@class='btn btn-success']")
	List<WebElement> show;

	@FindBy(id = "pdf")
	WebElement pdf;
	
	@FindBy(xpath="//button[@class='btn btn-info ']")
	List<WebElement> excel;
	
	@FindBy(id="txtProduct")
	WebElement product;
	
	@FindBy(linkText="Excel")
	WebElement excelfinance;

	
	@FindBy(id="filterCSONumber")
	WebElement csonumber;
	
	@FindBy(xpath="//button[@class='btn btn-default dropdown-toggle']")
	WebElement dropdown;
	
	@FindBy(xpath="//button[@class='ms-choice']")
   List<WebElement> selecttextbox;
	
	@FindBy(xpath="//ul/li")
	  List<WebElement> accountselect;
	
	
	public void show(String option) {
		int size = show.size();
		for (int i= 0; i<size; i++) {
			WebElement ele = show.get(i);
			String DS = ele.getAttribute("innerHTML");
			if (DS.contentEquals(option)) 
			{

				ele.click();
				break;
			}

		}

	}
	public void click_pdf()
	{
		
		pdf.click();
		
	}
	
	public void click_excel(int index)
	{
		
		int soze=excel.size();
		WebElement ele=excel.get(index);
		ele.click();
		
	}
	
	public void select_product(String productname) throws Throwable
	{
		
		product.sendKeys(productname);
		Thread.sleep(3000);
		product.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		
		

	}
	
	public void searchcso(String cso) throws InterruptedException
	{
		
		
		csonumber.sendKeys(cso);
		Thread.sleep(3000);
		csonumber.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		csonumber.click();
		
	}

	
	public void click_dropdown()
	{
		
		
		dropdown.click();
	}
	//for account side excel report generation
	public void financereport_excel()
	{
		
		
		excelfinance.click();
	}
	
	public void select_filteroptions(int index)
	{
		int size=selecttextbox.size();
		for(int i=0;i<size;i++)
		{
			
			WebElement ele=selecttextbox.get(index);
			System.out.println(size);
			
				
				ele.click();
				break;
				
			
			
			
		}
		
		
	}
	
	public void accountselect(String cot)
	{
		
		int size=accountselect.size();
		
		for(int i=0;i<size;i++)
		{
		
	
		WebElement ele=accountselect.get(i);
		String ds=ele.getAttribute("innerHTML");
		if(ds.contentEquals(cot))
		{
		
		ele.click();
		break;
		}
		}
		
		
	}
	
}
