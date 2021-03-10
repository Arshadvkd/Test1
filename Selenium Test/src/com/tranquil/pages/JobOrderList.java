package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobOrderList {

	@FindBy(xpath = "//div[@class='btn-group tbl-btn-grp']/button[@class='btn btn-default dropdown-toggle table-drop action-btn']")
	List<WebElement> action;

	@FindBy(xpath = "//ul[@class='dropdown-menu action-drop-list']/li/a")
	List<WebElement> action_items;

	@FindBy(xpath = "//button[@id='save-cso']")
	List<WebElement> approve;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	List<WebElement> jobcloseapprove;
	
	@FindBy(xpath = "//button[@id='save-cso']")
	List<WebElement> closejob;
	
	
	@FindBy(id = "cmbQCStaff_chosen")
	WebElement qc_salesman;

	@FindBy(id = "cmbJCStaff_chosen")
	WebElement jc_saleman;

	@FindBy(xpath = "//ul[@class='chosen-results']/li")
	List<WebElement> options;

	public void select_apporve(int index) {
		int count = approve.size();

		for (int i = 0; i <= count; i++) {

			WebElement ele = approve.get(index);

			ele.click();
			break;

		}

	}

	public void clickAction(int index)

	{

		int count = action.size();
		System.out.println("total" + count);

		for (int i = 0; i <= count; i++) {

			WebElement ele = action.get(index);

			{

				ele.click();
				break;

			}

		}

	}

	public void select_estimate() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Estimate")) {
				ele.click();
				break;
			}

		}

	}

	public void select_quotation() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Quotation")) {
				ele.click();
				break;
			}

		}
	}

	public void select_cusapproval() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Customer Approval")) {
				ele.click();
				break;
			}
		}

	}

	public void select_jobclose() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Job Close")) {
				ele.click();
				break;
			}
		}

	}

	public void select_invoice() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Invoice")) {
				ele.click();
				break;
			}
		}

	}

	public void select_qualitycheck() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Quality Check")) {
				ele.click();
				break;
			}

		}

	}

	// jobclose=4
	// qualitycheck=3

	public void select_closeapprove(int index) throws Exception {

		int size = jobcloseapprove.size();
		System.out.println("count" + jobcloseapprove.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = jobcloseapprove.get(index);

			String DS = ele.getAttribute("innerHTML");

			ele.click();
			break;

		}

	}

	public void click_qc_salesman() {

		qc_salesman.click();

	}

	public void Select_salesmanoptions(String salesman1) throws Throwable {

		for (WebElement ele : options) {

			if (ele.getAttribute("innerHTML").contains(salesman1)) {
				ele.click();
				break;
			}

		}

	}

	public void click_jc_saleman()

	{

		jc_saleman.click();

	}

}
