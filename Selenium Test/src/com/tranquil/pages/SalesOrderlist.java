package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOrderlist

{

	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle table-drop action-btn']")
	List<WebElement> action;

	@FindBy(xpath = "//ul[@class='dropdown-menu action-drop-list']/li/a")
	List<WebElement> action_items;

	@FindBy(xpath = "//button[@class='btn btn-add']")
	WebElement add_button;

	public void click_add() {

		add_button.click();

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

	public void select_verify() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Verify")) {
				ele.click();
				break;
			}

		}

	}

	public void approve() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Approve")) {
				ele.click();
				break;
			}

		}

	}

	public void select_deliver() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Deliver")) {
				ele.click();
				break;
			}

		}

	}

	public void select_edit() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Edit")) {
				ele.click();
				break;
			}

		}

	}
	
	public void select_view() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("View")) {
				ele.click();
				break;
			}

		}

	}
	
	public void select_approve() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Approve")) {
				ele.click();
				break;
			}

		}

	}


}
