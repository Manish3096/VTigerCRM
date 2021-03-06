package com.Tig.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tig.generics.Baseclass;
import com.Tig.pom.CreateFilter;
import com.Tig.pom.PurchaseOrder;
import com.Tig.pom.VtigerHomePage;

public class EditFilter1 extends Baseclass {
	@Test
	public void toEditFilter1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		VtigerHomePage v = new VtigerHomePage(d);
	    WebElement More = v.getMoredropdn();
	    Actions a = new Actions(d);
	    a.click(More).perform();
	    Reporter.log("Click on More Dropdown",true);
	    v.getPurchaseOrderlink().click();
	    Reporter.log("click on Purchase Order link",true);
	    PurchaseOrder po = new PurchaseOrder(d);
	    po.getCreateFilterlink().click();
	    Reporter.log("Click on Create Filter link",true);
	    CreateFilter cf = new CreateFilter(d);
	    String viewname = f.getExcelData("Createdetails", 1, 4);
	    cf.getViewNametb().sendKeys("viewname");
	    Reporter.log("Enter the Viewname",true);
	    cf.getSetDefaultcb().click();
	    Reporter.log("set as default checkbox",true);
	    WebElement col1 = cf.getColumn1Dropdn();
	    Select s = new Select(col1);
	    s.selectByIndex(6);
	    Reporter.log("Select the Vendor Name",true);
	    cf.getSavebn().click();
	    Reporter.log("Click on Save button",true);
	    po.getEditFilterlink().click();
	    Reporter.log("click on editfilter link",true);
	    WebElement col3 = cf.getColumn3Dropdn();
	    Select s1 = new Select(col3);	
	    s1.selectByIndex(18);
	    Reporter.log("Select a specific Column name",true);
	    WebElement duration = cf.getSelectDurationDropdn();
	    Select s11 = new Select(duration);
	    s11.selectByIndex(9);
	    Reporter.log("select the duration",true);
	    cf.getSavebn().click();
	    Reporter.log("click on save button",true);
	    Reporter.log("PurchaseOrder Filter is Successfully edited",true);
	} 
}
