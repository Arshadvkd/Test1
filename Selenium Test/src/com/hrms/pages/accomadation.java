package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accomadation {

	
	@FindBy(id = "ddlAccomodation_chosen")
	WebElement accomadation;
	
	@FindBy(xpath="//button[@class='btn btn-add']")
	WebElement add;

	@FindBy(id = "cmbReportTo")
	WebElement employee;

	@FindBy(xpath = "//ul[@class='chosen-results']/li")
	List<WebElement> accomodationlist;

	public void click_add()
	{
		add.click();
		add.click();
		
	}
	
	
	public void select_accomodatn(String accomdation) {
		accomadation.click();
		for (WebElement num : accomodationlist) {

			String DS = num.getAttribute("innerHTML");

			if (DS.contentEquals(accomdation)) {
				num.click();
				break;

			}

		}

	}
	
	public void select_employee(String employe) throws Throwable
	{
		
		employee.sendKeys(employe);
		Thread.sleep(1000);
		employee.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		employee.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
	}
	

}
