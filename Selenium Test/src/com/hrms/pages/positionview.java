package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class positionview {

	@FindBy(xpath = "//ul[@class='chosen-results']/li")
	List<WebElement> department;

	@FindBy(id = "txtEfromDate")
	WebElement fromdate;

	@FindBy(id = "txtEfToDate")
	WebElement todate;

	@FindBy(id = "cReportTo_chosen")
	WebElement reportperson;

	@FindBy(xpath = "//textarea[@id='txtDRemarks']")
	WebElement remarks;

	@FindBy(xpath = "//button[@id='txtDRemarks']")
	WebElement save;

	public void select_department(String depatment) {

		reportperson.click();
		int count = department.size();

		for (int i = 0; i <= count; i++) {

			WebElement ele = department.get(i);
			String DS = ele.getAttribute("innerHTML");
			if (DS.contentEquals(depatment)) {

				ele.click();
				break;

			}

		}

	}

	public void enter_remarks()
	
	{
		
		remarks.click();
		
	}
	
	public void slect()
	{
		
		
		
	}
	
}
