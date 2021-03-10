package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContraPage {

	@FindBy(xpath = "//ul[@class='chosen-results']/li")
	List<WebElement> accounts;

	@FindBy(id = "txtContraAccount_chosen")
	WebElement account;

	public void select_Account(String accountro) {

		account.click();

		int count = accounts.size();

		for (int i = 0; i < count; i++) {
			WebElement ele = accounts.get(i);
			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals(accountro)) {
				ele.click();
				break;

			}

		}

	}

}
