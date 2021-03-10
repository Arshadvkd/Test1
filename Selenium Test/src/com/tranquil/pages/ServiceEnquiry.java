package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServiceEnquiry {

	@FindBy(id = "txtCustomerName")
	WebElement customer;

	@FindBy(id = "cmbJobType_chosen")
	WebElement jobtype;

	@FindBy(id = "cmbService_chosen")
	WebElement service;

	@FindBy(id = "cmbEnquiryType_chosen")
	WebElement enquiry;

	@FindBy(xpath = "//ul[@class='chosen-results']/li")
	List<WebElement> choosen_results;

	@FindBy(xpath = "//div[@class='note-editable']")
	List<WebElement> notes;

	@FindBy(id = "saveButton")
	WebElement save;

	public void enter_customer(String customername) throws Throwable {
		customer.sendKeys(customername);
		Thread.sleep(1000);
		customer.sendKeys(Keys.ARROW_DOWN);
		customer.sendKeys(Keys.ENTER);

	}

	public void select_jobtype(String jobname) throws Throwable {

		jobtype.click();
		Thread.sleep(1000);

		int size = choosen_results.size();

		for (int i = 0; i <= size; i++) {

			WebElement ele = choosen_results.get(i);
			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals(jobname)) {

				ele.click();
				break;

			}
		}

	}

	public void select_enquirytype(String enquiryname) throws Throwable {

		enquiry.click();
		Thread.sleep(1000);
		int size = choosen_results.size();

		for (int i = 0; i <= size; i++) {

			WebElement ele = choosen_results.get(i);
			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals(enquiryname)) {

				ele.click();
				break;

			}

		}

	}

	public void select_service(String servicename) throws Throwable {

		service.click();
		Thread.sleep(1000);
		int size = choosen_results.size();

		for (int i = 0; i <= size; i++) {

			WebElement ele = choosen_results.get(i);
			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals(servicename)) {

				ele.click();
				break;

			}

		}

	}
	// index =0[Service description]
	// index =1[Remarks]
	// index =2[Notes]

	public void addservicedescription(int index, String servicedescription)

	{

		int count = notes.size();
		System.out.println("total" + count);

		for (int i = 0; i <= count; i++) {

			WebElement ele = notes.get(index);

			{

				ele.sendKeys(servicedescription);
				break;

			}

		}

	}

	public void click_save() {

		save.click();
	}

}
