package com.Tig.test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
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

public class CreateSalesOrder3 extends Baseclass {
@Test
public void toCreateSalesOrder3() throws EncryptedDocumentException, IOException, InvalidFormatException
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
    Reporter.log("Enter the qty",true);
    cso.getSavebn().click();
    Reporter.log("click on save button",true);
    Alert al = d.switchTo().alert();
    Reporter.log("switching control to alert popup",true);
    String alerttext = al.getText();
    String actualtext = "Qty cannot be empty";
    if(actualtext.equals(alerttext))
    {
    	al.accept();
    	Reporter.log("Qty popup was Handled ",true);
    }
    else{
    	Reporter.log("Qty POpup is not displayed.",true);
    }
    
}
}
