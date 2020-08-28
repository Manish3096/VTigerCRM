package com.Tiger2;

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

import com.Tiger2.pom.CreateSalesOrderPage;
import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.SalesOrderPage;
import com.Tiger2.pom.VtigerHomePage;

public class CreateSalesOrder1 extends Baseclass {
@Test
public void toCreateSalesOrder1() throws EncryptedDocumentException, IOException, InvalidFormatException
{
	VtigerHomePage v = new VtigerHomePage(d);
	WebElement more = v.getMoredropdn();
	Actions a = new Actions(d);
	a.click(more).perform();//click on More Dropdown
	v.getSalesOrderlink().click();//click on Sales Order
	SalesOrderPage s = new SalesOrderPage(d);
	s.getCreateSalesbn().click();//click on sales button
	CreateSalesOrderPage cso = new CreateSalesOrderPage(d);
	String Sub = f.getExcelData("CreateDetails", 2, 0);
	cso.getSubjecttb().sendKeys(Sub);//Enter the subject
	WebElement status = cso.getStatusdropdn();
	Select s1 = new Select(status);
	s1.selectByIndex(0);//Select the status
	cso.getUserradiobn().click();
	
	cso.getOrganizationNamebn().click();
	Set<String> win = d.getWindowHandles();//Get Multiple window address
	Iterator<String> i = win.iterator();
	String pid = i.next();//Parent window
	String cid = i.next();//child window
	String cid1 = i.next();//child window
	d.switchTo().window(cid1);
	cso.getOrganizationname().click();
	d.switchTo().alert().accept();
	d.switchTo().window(pid);
	
	
	WebElement invoicestatus = cso.getInvoiceStatusDropdn();
	Select s2 = new Select(invoicestatus);
	s2.selectByIndex(1);//select the invoice status
	
	String Billingaddress = f.getExcelData("Createdetails", 2, 2);
	cso.getBillingaddressta().sendKeys(Billingaddress);//Enter billing address
	cso.getCopyBillingaddressradiobn().click();//copy Billing address to shipping address
	
	JavascriptExecutor j =(JavascriptExecutor) d;
	j.executeScript("window.scrollTo(0,5000)");
	cso.getProductsbn().click();
	
	Set<String> win1 = d.getWindowHandles();//Get Multiple window address
	Iterator<String> i1 = win1.iterator();
	String pid1 = i1.next();//Parent window
	String cid2 = i1.next();//child window(data)
	String cid3 = i1.next();//child browser(Products)
	d.switchTo().window(cid3);
	cso.getProductname().click();
	d.switchTo().window(pid1);
	String qty = f.getExcelData("Createdetails", 2, 3);
    cso.getQtytb().sendKeys(qty);//Enter the qty
    cso.getSavebn().click();//click on save button
    s.getSalesOrderTab().click();//click on SalesOrder tab
    WebElement sub = s.getSubject1();
    String actualsub = sub.getText();
    if(actualsub.equals(Sub))
    {
    	Reporter.log("Sales order "+actualsub+" is created.");
    }
    
}
}
