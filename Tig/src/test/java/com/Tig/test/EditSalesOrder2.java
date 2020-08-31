package com.Tig.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tig.generics.Baseclass;
import com.Tig.pom.CreateSalesOrderPage;
import com.Tig.pom.SalesOrderPage;
import com.Tig.pom.VtigerHomePage;
public class EditSalesOrder2 extends Baseclass {
	@Test
	public void toEditSalesOrder1() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
	{
		VtigerHomePage v = new VtigerHomePage(d);
		WebElement more = v.getMoredropdn();
		Actions a = new Actions(d);
		a.click(more).perform();
		Reporter.log("click on More Dropdown",true);
		v.getSalesOrderlink().click();
		Reporter.log("Click on sales order link",true);
		SalesOrderPage s = new SalesOrderPage(d);
		s.getCreateSalesbn().click();
		Reporter.log("click on sales button",true);
		CreateSalesOrderPage cso = new CreateSalesOrderPage(d);
		String Sub = f.getExcelData("CreateDetails", 1, 0);
		cso.getSubjecttb().sendKeys(Sub);
		Reporter.log("Enter the subject",true);
		WebElement status = cso.getStatusdropdn();
		Select s1 = new Select(status);
		s1.selectByIndex(0);
		Reporter.log("Select the status",true);
		cso.getUserradiobn().click();
		
		cso.getOrganizationNamebn().click();
		Reporter.log("Click on Organization button",true);
		Set<String> win = d.getWindowHandles();
		Reporter.log("Get Multiple window address",true);
		Iterator<String> i = win.iterator();
		String pid = i.next();
		Reporter.log("Parent window",true);
		String cid = i.next();
		Reporter.log("child window",true);
		String cid1 = i.next();
		Reporter.log("child window2",true);
		d.switchTo().window(cid1);
		Reporter.log("switch control to child window2",true);
		cso.getOrganizationname().click();
		Reporter.log("Select the Organization name",true);
		d.switchTo().alert().accept();
		Reporter.log("Click on ok button in the alert popup",true);
		d.switchTo().window(pid);
		Reporter.log("switch control to Parent Window",true);
		
		WebElement invoicestatus = cso.getInvoiceStatusDropdn();
		Select s2 = new Select(invoicestatus);
		s2.selectByIndex(1);//select the invoice status
		Reporter.log("",true);

		String Billingaddress = f.getExcelData("Createdetails", 1, 2);
		cso.getBillingaddressta().sendKeys(Billingaddress);
		Reporter.log("Enter billing address",true);
		cso.getCopyBillingaddressradiobn().click();
		Reporter.log("copy Billing address to shipping address",true);

		JavascriptExecutor j =(JavascriptExecutor) d;
		j.executeScript("window.scrollTo(0,5000)");
		Reporter.log("scroll down till Item details",true);
		cso.getProductsbn().click();
		Reporter.log("Click on Products button",true);
		
		Set<String> win1 = d.getWindowHandles();
		Reporter.log("Get Multiple window address",true);
		Iterator<String> i1 = win1.iterator();
		String pid1 = i1.next();
		Reporter.log("Parent window",true);
		String cid2 = i1.next();
		Reporter.log("child window(data)",true);
		String cid3 = i1.next();
		Reporter.log("child browser(Products)",true);
		d.switchTo().window(cid3);
		Reporter.log("switch control to child browser(Products)",true);
		cso.getProductname().click();
		Reporter.log("Click on the Product Name",true);
		d.switchTo().window(pid1);
		Reporter.log("switch control to Parent window",true);
		String qty = f.getExcelData("Createdetails", 1, 3);
	    cso.getQtytb().sendKeys(qty);
	    Reporter.log("Enter the qty",true);
	    cso.getSavebn().click();
	    Reporter.log("click on save button",true);
	    s.getSalesOrderTab().click();
	    Reporter.log("click on SalesOrder tab",true);
	    
	    s.getCreateSalesbn().click();
		Reporter.log("click on sales button",true);
		String Su = f.getExcelData("CreateDetails", 2, 0);
		cso.getSubjecttb().sendKeys(Su);
		Reporter.log("Enter the subject",true);
		WebElement statu = cso.getStatusdropdn();
		Select s3 = new Select(statu);
		s3.selectByIndex(0);
		Reporter.log("Select the status",true);
		cso.getUserradiobn().click();
		
		cso.getOrganizationNamebn().click();
		Reporter.log("Click on Organization button",true);
		Set<String> win2= d.getWindowHandles();
		Reporter.log("Get Multiple window address",true);
		Iterator<String> i2 = win2.iterator();
		String pid3 = i2.next();
		Reporter.log("Parent window",true);
		String cid7 = i2.next();
		Reporter.log("child window",true);
		String cid8 = i2.next();
		Reporter.log("child window2",true);
		d.switchTo().window(cid8);
		Reporter.log("switch control to child window2",true);
		cso.getOrganizationname().click();
		Reporter.log("Select the Organization name",true);
		d.switchTo().alert().accept();
		Reporter.log("Click on ok button in the alert popup",true);
		d.switchTo().window(pid);
		Reporter.log("switch control to Parent Window",true);
		
		WebElement invoicestatu = cso.getInvoiceStatusDropdn();
		Select s31 = new Select(invoicestatu);
		s31.selectByIndex(1);
		Reporter.log("select the invoice status",true);

		String Billingaddress1 = f.getExcelData("Createdetails", 2, 2);
		cso.getBillingaddressta().sendKeys(Billingaddress1);
		Reporter.log("Enter billing address",true);
		cso.getCopyBillingaddressradiobn().click();
		Reporter.log("copy Billing address to shipping address",true);

		JavascriptExecutor j1 =(JavascriptExecutor) d;
		j1.executeScript("window.scrollTo(0,5000)");
		Reporter.log("scroll down till Item details",true);
		cso.getProductsbn().click();
		Reporter.log("Click on Products button",true);
		
		Set<String> win3 = d.getWindowHandles();
		Reporter.log("Get Multiple window address",true);
		Iterator<String> i3 = win3.iterator();
		String pid2 = i3.next();
		Reporter.log("Parent window",true);
		String cid5 = i3.next();
		Reporter.log("child window(data)",true);
		String cid6 = i3.next();
		Reporter.log("child browser(Products)",true);
		d.switchTo().window(cid6);
		Reporter.log("switch control to child browser(Products)",true);
		cso.getProductname().click();
		Reporter.log("Click on the Product Name",true);
		d.switchTo().window(pid1);
		Reporter.log("switch control to Parent window",true);
		String qty1 = f.getExcelData("Createdetails", 2, 3);
	    cso.getQtytb().sendKeys(qty1);
	    Reporter.log("Enter the qty",true);
	    cso.getSavebn().click();
	    Reporter.log("click on save button",true);
	    s.getSalesOrderTab().click();
	    Reporter.log("click on SalesOrder tab",true);
	    
	    SalesOrderPage so = new SalesOrderPage(d);
		so.getSelectallorder().click();
		Reporter.log("select multiple sales order",true);
		so.getMassEditbn().click();
		Reporter.log("click on mass Edit button",true);
		cso.getAddressinfo().click();
		Reporter.log("click on address Info",true);
		String Billingaddress2 = f.getExcelData("Createdetails", 3,2);
		cso.getBillingaddressta().sendKeys(Billingaddress2);
		Reporter.log("enter the billing address",true);
		cso.getShippingaddressta().sendKeys(Billingaddress2);
		Reporter.log("copy the billing address to shipping address",true);
		cso.getCancelbn().click();
		Reporter.log("click on cancel button",true);
		Reporter.log("Sales Order's were not updated",true);
	}
}