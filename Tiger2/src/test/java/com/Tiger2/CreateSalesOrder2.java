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

public class CreateSalesOrder2 extends Baseclass {
@Test
public void toCreateSalesOrder2() throws EncryptedDocumentException, IOException, InvalidFormatException
{
	VtigerHomePage v = new VtigerHomePage(d);
	WebElement more = v.getMoredropdn();
	Actions a = new Actions(d);
	a.moveToElement(more).perform();//click on More dropdown
	v.getSalesOrderlink().click();
	SalesOrderPage s = new SalesOrderPage(d);
	s.getCreateSalesbn().click();//click on createsalesorder button
	CreateSalesOrderPage cso = new CreateSalesOrderPage(d);
	String Sub = f.getExcelData("CreateDetails", 2, 0);
	cso.getSubjecttb().sendKeys(Sub);//Enter the Subject
	WebElement status = cso.getStatusdropdn();
	Select s1 = new Select(status);
	s1.selectByIndex(0);
	cso.getUserradiobn().click();
	
	cso.getOrganizationNamebn().click();
	Set<String> win = d.getWindowHandles();//Get multiple window address
	Iterator<String> i = win.iterator();
	String pid = i.next();//Parent popup
	String cid = i.next();//child data popup
	String cid1 = i.next();//child popup(Organization)
	d.switchTo().window(cid1);
	cso.getOrganizationname().click();
	d.switchTo().alert().accept();//handling the alert popup
	d.switchTo().window(pid);
	
	
	WebElement invoicestatus = cso.getInvoiceStatusDropdn();
	Select s2 = new Select(invoicestatus);
	s2.selectByIndex(1);//Select Invoice status
	
	String Billingaddress = f.getExcelData("Createdetails", 2, 2);
	cso.getBillingaddressta().sendKeys(Billingaddress);//Enter the billing address
	cso.getCopyBillingaddressradiobn().click();//Copy billing address to shipping address
	
	JavascriptExecutor j =(JavascriptExecutor) d;
	j.executeScript("window.scrollTo(0,5000)");//scroll down till Item details
	cso.getProductsbn().click();
	
	Set<String> win1 = d.getWindowHandles();//get multiple window address
	Iterator<String> i1 = win1.iterator();
	String pid1 = i1.next();//parent window
	String cid2 = i1.next();//child data window
	String cid3 = i1.next();//child product window
	d.switchTo().window(cid3);
	cso.getProductname().click();
	d.switchTo().window(pid1);
	String qty = f.getExcelData("Createdetails", 2, 3);
    cso.getQtytb().sendKeys(qty);
    cso.getCancelbn().click();//Click on cancel button
    s.getSalesOrderTab().click();//Click on sales order tab
    WebElement sub = s.getSubject1();
    String actualsub = sub.getText();
    if(actualsub.equals(Sub))
    {
    	Reporter.log("Sales order "+actualsub+" is created.");
    }
    else{
    	Reporter.log("Sales Order "+actualsub+ "is not created" );
    }
}
}
