package com.Tiger2;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hslf.record.Sound;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
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

public class CreateSalesOrder3 extends Baseclass {
@Test
public void toCreateSalesOrder3() throws EncryptedDocumentException, IOException, InvalidFormatException
{
	VtigerHomePage v = new VtigerHomePage(d);
	WebElement more = v.getMoredropdn();
	Actions a = new Actions(d);
	a.moveToElement(more).perform();//move to More Dropdown
	v.getSalesOrderlink().click();//Click on salesorder link
	SalesOrderPage s = new SalesOrderPage(d);
	s.getCreateSalesbn().click();// click on createsalesorder button
	CreateSalesOrderPage cso = new CreateSalesOrderPage(d);
	String Sub = f.getExcelData("CreateDetails", 2, 0);
	cso.getSubjecttb().sendKeys(Sub);//Enter the subject
	WebElement status = cso.getStatusdropdn();
	Select s1 = new Select(status);
	s1.selectByIndex(0);//Select a status
	cso.getUserradiobn().click();
	
	cso.getOrganizationNamebn().click();
	Set<String> win = d.getWindowHandles();//get multiple window name
	Iterator<String> i = win.iterator();
	String pid = i.next();//Parent window
	String cid = i.next();//Child window
	String cid1 = i.next();//Child window(Organization)
	d.switchTo().window(cid1);//switch control to Child window(Organization)
	cso.getOrganizationname().click();
	d.switchTo().alert().accept();
	d.switchTo().window(pid);//switch control to Parent window
	
	
	WebElement invoicestatus = cso.getInvoiceStatusDropdn();
	Select s2 = new Select(invoicestatus);
	s2.selectByIndex(1);
	
	String Billingaddress = f.getExcelData("Createdetails", 2, 2);
	cso.getBillingaddressta().sendKeys(Billingaddress);//enter the billing address
	cso.getCopyBillingaddressradiobn().click();
	
	JavascriptExecutor j =(JavascriptExecutor) d;
	j.executeScript("window.scrollTo(0,5000)");//scroll down till item details
	cso.getProductsbn().click();
	
	Set<String> win1 = d.getWindowHandles();
	Iterator<String> i1 = win1.iterator();
	String pid1 = i1.next();//parent window
	String cid2 = i1.next();//child window
	String cid3 = i1.next();//child window
	d.switchTo().window(cid3);//switch control to child window(Product) 
	cso.getProductname().click();
	d.switchTo().window(pid1);//switch control to Parent window
    cso.getSavebn().click();//click on save button
    Alert al = d.switchTo().alert();//switching to alert popup
    String alerttext = al.getText();
    String actualtext = "Qty cannot be empty";
    if(actualtext.equals(alerttext))
    {
    	al.accept();
    	Reporter.log("Qty popup was Handled ");
    }
    else{
    	Reporter.log("Qty POpup is not displayed.");
    }
    
}
}
