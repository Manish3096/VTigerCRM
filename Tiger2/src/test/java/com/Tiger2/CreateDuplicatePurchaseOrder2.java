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

import com.Tiger2.pom.CreatePurchaseOrderPage;
import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.PurchaseOrderInformationPage;
import com.Tiger2.pom.VtigerHomePage;

public class CreateDuplicatePurchaseOrder2  extends Baseclass{
	@Test
	public void toCreateDuplicate2() throws EncryptedDocumentException, InvalidFormatException, IOException
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
	    Reporter.log(" scroll down to item details present in CreatePurchaseOrder",true);
	    cpo.getProductsbn().click();
	    Reporter.log(" click on Products button",true); 
	    Set<String> all = d.getWindowHandles();
	    Reporter.log(" get Multiple window address",true);
	    Iterator<String> i1 = all.iterator();
	    String pid1 = i1.next();
	    Reporter.log(" Parent window address",true);
	    String pid3 = i1.next();
	    Reporter.log(" child data window address",true);
	    String cid4 = i1.next();
	    Reporter.log(" child Product window address",true);
	    d.switchTo().window(cid4);
	    Reporter.log(" switch the control to child Product window address",true);
	    cpo.getProductname().click();
	    Reporter.log(" click on product name",true);
	    d.switchTo().window(pid);
	    Reporter.log(" switch the control to Parent window address",true);
	   String qty = f.getExcelData("Createdetails", 1,3);
	    cpo.getQtytb().sendKeys(qty);
	    Reporter.log(" Entered the qty",true);
	    cpo.getSavebn().click();
	    Reporter.log(" click on save button",true);
	    a.click(More).perform();
	    Reporter.log(" click on more dropdown",true);
	    v.getPurchaseOrderlink().click();
	    Reporter.log("click on Purchase Order link",true);
	    po.getSubject1().click();
	    Reporter.log("select the subject",true);
	    PurchaseOrderInformationPage poi = new PurchaseOrderInformationPage(d);
	    poi.getDuplicatebn().click();
	    Reporter.log("Click on Duplicate.",true);
	    cpo.getCancelbn().click();
	    Reporter.log("Click on Cancel button.",true);
	    poi.getPurchaseOrderTab().click();
	    Reporter.log(" Click on Purchase Order Tab.",true);
	    Reporter.log("Duplicate Purchase Order is not Created.",true);
	}

}
