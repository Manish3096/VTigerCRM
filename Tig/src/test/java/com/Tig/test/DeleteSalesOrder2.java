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

public class DeleteSalesOrder2 extends Baseclass {
@Test
public void toDeleteSales2() throws EncryptedDocumentException, InvalidFormatException, IOException
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
	String Sub = f.getExcelData("CreateDetails", 2, 0);
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
	s2.selectByIndex(1);
	Reporter.log("select the invoice status",true);

	String Billingaddress = f.getExcelData("Createdetails", 2, 2);
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
	String qty = f.getExcelData("Createdetails", 2, 3);
    cso.getQtytb().sendKeys(qty);
    Reporter.log("Enter the qty",true);
    cso.getCancelbn().click();
    Reporter.log("Click on cancel button",true);
    s.getSalesOrderTab().click();
    Reporter.log("Click on sales order tab",true);
    SalesOrderPage so = new SalesOrderPage(d);
    so.getDeletefilterLink().click();
    Reporter.log("click on delete link",true);
    d.switchTo().alert().dismiss();
    Reporter.log("Click on Cancel button in the popup",true);
    String Actualsub = f.getExcelData("Createdetails", 2, 0);
     WebElement sub = so.getSubject1();
    String sub1 = sub.getText();
    if(sub1.equals(Actualsub))
    {
        Reporter.log("Subject is deleted ",true);
    }
    else{
    	Reporter.log("Subject is not deleted ",true);
    }
}
}
