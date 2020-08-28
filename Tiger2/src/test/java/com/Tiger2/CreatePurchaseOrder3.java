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
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.CreatePurchaseOrderPage;
import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.VtigerHomePage;

public class CreatePurchaseOrder3 extends Baseclass {
@Test
public void toCreatePurchaseOrder3() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
{
	VtigerHomePage v = new VtigerHomePage(d);
    WebElement More = v.getMoredropdn();
    Actions a = new Actions(d);
    a.click(More).perform();
    Reporter.log("click on Purchase Order link",true);
    v.getPurchaseOrderlink().click();
    Reporter.log("click on Purchase Order link",true);
    PurchaseOrder po = new PurchaseOrder(d);
    po.getCreatePurchasebn().click();
    Reporter.log("click on create purchase button",true);
    CreatePurchaseOrderPage cpo = new CreatePurchaseOrderPage(d);
    cpo.getVendorNamebn().click();
    Reporter.log(" Click on Vendor button",true);
    Set<String> allwh = d.getWindowHandles();
    Reporter.log(" get Multiple window address",true);
    Iterator<String> i = allwh.iterator();
    String pid = i.next();
    Reporter.log("Parent window address",true);
    String cid = i.next();
    Reporter.log("Child window address",true);
    String cid2 = i.next();
    Reporter.log(" Child window address",true);
    d.switchTo().window(cid2);
    Reporter.log("switch the control to child Vendor window address",true);
    cpo.getVendorname1().click();
    d.switchTo().window(pid);
    Reporter.log("switch the control to Parent window address",true);
    String subject = f.getExcelData("Createdetails", 1, 0);
    cpo.getSubjecttb().sendKeys(subject);
    Reporter.log(" Enter the Subject",true);
    String date = f.getExcelData("Createdetails", 1, 1);
    cpo.getDueDatetb().sendKeys(date);
    Reporter.log(" Enter the date",true);
    WebElement status = cpo.getStatusdropdn();
    Select sstatus = new Select(status);
    sstatus.selectByIndex(1);
    Reporter.log(" Select the status",true);
    String Billingaddress = f.getExcelData("Createdetails", 1,2);
    cpo.getBillingaddressta().sendKeys(Billingaddress);
    Reporter.log(" Enter the Billing address",true);
    cpo.getCopyBillingaddressradiobn().click();
    Reporter.log(" click on copybillingaddress radiobutton",true);
	JavascriptExecutor j = (JavascriptExecutor) d;
	j.executeScript("window.scrollTo(0,5000)");
	Reporter.log("",true);
	CreatePurchaseOrderPage cpo = new CreatePurchaseOrderPage(d);
	cpo.getAddProductbn().click();
	Reporter.log("Click on add Products button",true);
	cpo.getProductsbn1().click();
	Reporter.log("Click on Products button",true);
	Set<String> allwh1 = d.getWindowHandles();
	Reporter.log("Get all multiple window address",true);
	Iterator<String> i1 = allwh1.iterator();
	String pid1 = i1.next();
	Reporter.log("parent browser",true);
	String cid3 = i1.next();
	Reporter.log("child browser1",true);
	String cid4 = i1.next();
	Reporter.log("child browser2",true);
	d.switchTo().window(cid4);
	Reporter.log("switch control to Child browser2",true);
	cpo.getProductname().click();
	Reporter.log("Click on the Product name",true);
	d.switchTo().window(pid);
	Reporter.log("switch control to parent window",true);
	String qty = f.getExcelData("Createdetails", 1, 3);
	cpo.getQtytb1().sendKeys(qty);
	Reporter.log("Enter the qty",true);
	cpo.getSavebn().click();
	Reporter.log("Click on save button",true);
	String total = po.getTotal().getText();
	String actual="₨13,488.00 ";
	if(actual.equals(total))
	{
		Reporter.log("Total Amount is updated",true);
	}
	
}
}
