package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesEnquiryList

{

	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle table-drop action-btn']")
	List<WebElement> action;

	@FindBy(xpath = "//ul[@class='dropdown-menu action-drop-list']/li/a")
	List<WebElement> action_items;

	@FindBy(xpath = "//button[@class='btn btn-add']")
	WebElement add_button;
	
	@FindBy(id="voucherDate_0")
	WebElement date;
	
	
	@FindBy(xpath="//input[@id='voucherNumber_0']")
	WebElement senumbertop0;
	
	@FindBy(xpath="//input[@id='voucherNumber_1']")
	WebElement senumbertop1;
	
	

	@FindBy(xpath="//td[@class='amnt']")
	List<WebElement> customername;
	
	
	@FindBy(xpath="//td/span")
	List<WebElement> status;
	
	@FindBy(xpath="//td")
	List<WebElement> list;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	List<WebElement> yes;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	List<WebElement> no;
	
	@FindBy(id="closeQtn")
	WebElement close;
	

	
	public void click_close()
	{
		
		
		close.click();
	}
	
	public void click_yes(int index)
	{
		
		
			WebElement ele=yes.get(index);
			ele.click();
		
	}

	public void click_no(int index)
	{
		
		
			WebElement ele=no.get(index);
			ele.click();
		
	}
	

	public void click_add() {

		add_button.click();

	}
	
	
	public String getsenumber0()
	{
		String se=senumbertop0.getAttribute("value");
		return se;
		
		
	}
	  
	
public String SEdate()
{
	
	String date1=date.getAttribute("value");
	return date1;
	
}
	
	public String getsenumber1()
	{
		String se=senumbertop1.getAttribute("value");
		return se;
		
		
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
	
	public void select_pdf() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("PDF")) {
				ele.click();
				break;
			}

		}

	}
	
	public void select_rfq() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("RFQ")) {
				ele.click();
				break;
			}

		}

	}
	
	public void select_cancel() throws Exception {

		int size = action_items.size();
		System.out.println("count" + action_items.size());
		for (int i = 0; i <= size; i++) {

			WebElement ele = action_items.get(i);

			String DS = ele.getAttribute("innerHTML");

			if (DS.contentEquals("Cancel")) {
				ele.click();
				break;
			}

		}

	}
	
	
	
	public String get_customername()
	{

		WebElement ele = customername.get(0);

		String DS = ele.getAttribute("innerHTML");

		return DS;

	}
	
	public String get_biddingdate()
	{

		WebElement ele = list.get(12);

		String DS = ele.getAttribute("innerHTML");

		return DS;

	}
	
	public String get_salemanname()
	{

		WebElement ele = list.get(13);

		String DS = ele.getAttribute("innerHTML");

		return DS;

	}
	
	public String get_reference()
	{

		WebElement ele = list.get(14);

		String DS = ele.getAttribute("innerHTML");

		return DS;

	}
	
	public String get_status()
	{

		WebElement ele = status.get(4);

		String DS = ele.getAttribute("innerHTML");

		return DS;

	}
	
	public String get_netamount()
	{

		WebElement ele = list.get(16);

		String DS = ele.getAttribute("innerHTML");

		return DS;

	}
}
