package com.Tiger2;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.CreateInvoicePage;
import com.Tiger2.pom.InvoicePage;
import com.Tiger2.pom.VtigerHomePage;

public class CreateInvoice1 extends Baseclass{
	@Test
	public void toCreateInvoice1() throws EncryptedDocumentException, IOException, InvalidFormatException
	{
		VtigerHomePage v = new VtigerHomePage(d);
		WebElement more = v.getMoredropdn();
		Actions a = new Actions(d);
		a.moveToElement(more).perform();
		Reporter.log("select more dropdown",true);
		v.getInvoicelink().click();
		Reporter.log("click on Invoice link",true);
		InvoicePage ip = new InvoicePage(d);
		ip.getCreateInvoicebn().click();
		Reporter.log("click on create invoice link",true);
		CreateInvoicePage cio = new CreateInvoicePage(d);
		String sub = f.getExcelData("Createdetails", 4, 0);
	    cio.getSubjecttb().sendKeys(sub);
	    Reporter.log("enter the subject",true);
		cio.getOrganizationbn().click();
		Reporter.log("click on organization button",true);
		Set<String> win = d.getWindowHandles();
		Reporter.log("Get multiple windows address",true);
		Iterator<String> i = win.iterator();
		String pid = i.next();
		Reporter.log("Parent window address",true);
		String cid = i.next();
		Reporter.log("data window address",true);
		String cid1 = i.next();
		Reporter.log("child window address(Organization)",true);
		d.switchTo().window(cid1);
		Reporter.log("switch the control to child window address(Organization)",true);
		cio.getOrganizationName().click();
		Reporter.log("select the organization name",true);
		d.switchTo().alert().accept();
		Reporter.log("Click on ok button in the alert popup",true);
		d.switchTo().window(pid);
		Reporter.log("switch the control to Parent window address",true);
		cio.getGroupradiobn().click();
		String Billingaddress = f.getExcelData("Createdetails", 4, 2);
		cio.getBillingaddressta().sendKeys(Billingaddress);
		Reporter.log("enter the billing address",true);
		cio.getCopyBillingaddressradiobn().click();
		Reporter.log("Copy the billing address to shipping address",true);
		cio.getProductsbn().click();
		Reporter.log("Click on products button",true);
		Set<String> win1 = d.getWindowHandles();
		Reporter.log("Get multiple windows address",true);
		Iterator<String> i1 = win1.iterator();
		String pid1 = i1.next();
		Reporter.log("Parent window address",true);
		String cid2 = i1.next();
		Reporter.log(" data window address",true);
		String cid3 = i1.next();
		Reporter.log("child window address(Products)",true);
		d.switchTo().window(cid3);
		Reporter.log("switch the control to child window address(Products)",true);
		cio.getProductname().click(); 
		Reporter.log("select the Product",true);
		d.switchTo().window(pid1);
		Reporter.log("switch the control to Parent window address",true);
		String qty = f.getExcelData("Createdetails", 4, 3);
		cio.getQtytb().sendKeys(qty); 
		Reporter.log("Enter the qty ",true);
		cio.getSavebn().click();
		Reporter.log("click on save button",true);
		cio.getInvoicetab().click();
		Reporter.log("click on invoice tab",true);
		String actualsub = "T-Shirt";
		if(actualsub.equals(sub))
		{
			Reporter.log("Invoice for "+sub+" is generated.",true);
		}
		else{
			Reporter.log("Invoice for "+sub+" is not generated.",true);
		}
	}

}
