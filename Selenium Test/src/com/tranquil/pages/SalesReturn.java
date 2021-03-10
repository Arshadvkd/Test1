package com.tranquil.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class SalesReturn 

{

@FindBy(id="txtSalesInvoiceNumber")
WebElement salesinvoiceno;

@FindBy(id="txtSalesReturnDate")
WebElement salesreturndate;


@FindBy(id="txtReferenceNo")
WebElement referenceno;

@FindBy(id="txtCustomerName")
WebElement customername;

@FindBy(id="cmbDivMethod_chosen")
WebElement deliverymethod;

@FindBy(xpath="//div[@class='note-editable']")
List<WebElement> notes;

public void checkbo(WebDriver ldriver,String num)
{

	ldriver.findElement(By.id("srCheckBox_"+num+""));
	
}

public void enter_salesinvoiceno(String saleseno)
{
	
	salesinvoiceno.sendKeys(saleseno);
	
	
}


}
