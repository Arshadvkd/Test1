package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeFilesList1 {
	WebDriver driver;

	@FindBy(id = "btnAddStatus")
	WebElement add;

	@FindBy(xpath = "//tr/td")
	List<WebElement> employee;
	
	
	public EmployeeFilesList1() 
	{ 
		this.driver = driver;

	}
	
	public void click_add()
	{
		add.click();
		
		
	}
	public void employee(String code) {

		int count = employee.size();

		for (int i = 0; i <= count; i++) {

			WebElement ele = employee.get(i);
			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals(code)) {

				ele.click();
				break;

			}

		}

	}
	 

	

	
	
}
