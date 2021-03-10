package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManualJournal {

	@FindBy(id = "accounttype_1")
	WebElement account1;

	@FindBy(id = "accounttype_2")
	WebElement account2;

	@FindBy(id = "debits_1")
	WebElement debit1_amount1;

	@FindBy(id = "debits_2")
	WebElement debit1_amount2;

	@FindBy(id = "credits_1")
	WebElement credit1_amount1;

	@FindBy(id = "credits_2")
	WebElement credit2_amount2;

	@FindBy(id = "txtCCenter_1")
	WebElement costcenter1;

	@FindBy(id = "txtCCenter_2")
	WebElement costcenter2;

	@FindBy(id = "txtJournalReference")
	WebElement reference;

	@FindBy(id = "description_1")
	WebElement description1;

	@FindBy(id = "description_2")
	WebElement description2;

	@FindBy(id = "txtJournalNotes")
	WebElement notes;

	@FindBy(id = "saveButtonPost")
	WebElement post;

	@FindBy(id = "btnDraft")
	WebElement draft;

	@FindBy(id = "txtJournalDate")
	WebElement journaldate;

	@FindBy(xpath ="//span[@id='subtotalDebits']")
	WebElement debittotal;

	@FindBy(xpath ="//span[@id='subtotalCredits']")
	WebElement credittotal;
	
	@FindBy(xpath ="//button[@onclick='objJournal.clear()']")
	WebElement close;
	
	public void click_close()
	{

		close.click();
	}
	
	public void enter_reference(String notes)
	{
		
		
		reference.sendKeys(notes);
	}
	
	
	public void select_account1(String accountname) throws Throwable {
		account1.sendKeys(accountname);
		Thread.sleep(2000);
		account1.sendKeys(Keys.ARROW_DOWN);
		account1.sendKeys(Keys.ENTER);

	}

	public void select_account2(String accountname) throws Throwable {
		account2.sendKeys(accountname);
		Thread.sleep(2000);
		account2.sendKeys(Keys.ARROW_DOWN);
		account2.sendKeys(Keys.ENTER);

	}

	public void enter_description1(String description) 
	{

		description1.sendKeys(description);

	}

	public void enter_description2(String description) {

		description2.sendKeys(description);

	}

	public void enter_debitamount1(String debitamount) {
		debit1_amount1.sendKeys(debitamount);

	}

	public void enter_debitamount2(String debitamount) {
		debit1_amount2.sendKeys(debitamount);

	}

	public void enter_creditamount1(String creditamount) {
		credit1_amount1.sendKeys(creditamount);

	}

	public void enter_creditamount2(String creditamount) {
		credit2_amount2.sendKeys(creditamount);

	}

	public void enter_notes(String note) {
		notes.sendKeys(note);

	}

	public void click_post() {

		post.click();

	}

	public void click_draft() {

		draft.click();

	}

	public String get_date() {
		String date = journaldate.getAttribute("value");
		return date;

	}

	public String get_reference() {
		String ref = reference.getAttribute("value");
		return ref;

	}

	public String get_slno(WebDriver ldriver, String num)

	{

		String slno = ldriver.findElement(By.id("txtslno_" + num + "")).getAttribute("value");
		return slno;

	}

	public String get_accountname(WebDriver ldriver, String num)

	{

		String slno = ldriver.findElement(By.id("accounttype_" + num + "")).getAttribute("value");
		return slno;

	}

	public String get_costcenter(WebDriver ldriver, String num)

	{

		String slno = ldriver.findElement(By.id("txtCCenter_" + num + "")).getAttribute("value");
		return slno;

	}

	public String get_description(WebDriver ldriver, String num)

	{

		String description = ldriver.findElement(By.id("description_" + num + "")).getAttribute("value");
		return description;

	}
	public String get_debit(WebDriver ldriver, String num)

	{

		String debit = ldriver.findElement(By.id("debits_" + num + "")).getAttribute("value");
		return debit;

	}
	
	public String get_credit(WebDriver ldriver, String num)

	{

		String credit = ldriver.findElement(By.id("credits_" + num + "")).getAttribute("value");
		return credit;

	}


	public String get_notes() {
		String ref = notes.getAttribute("value");
		return ref;

	}
	
	public String getdebittotal()
	{
		String debitotal=debittotal.getText();
		return debitotal;
		
		
	}
	
	
	public String getcredittotal()
	{
		String creditotal=credittotal.getText();
		return creditotal;
		
		
	}
}
