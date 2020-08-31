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
import com.Tig.pom.SalesOrderPage;
import com.Tig.pom.VtigerHomePage;

public class DeleteFilterSales1 extends Baseclass {
	@Test
	public void toDeleteFilter1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	    Reporter.log("click on Sales Order link",true);
	    SalesOrderPage s = new SalesOrderPage(d);
	    s.getCreatefilterLink().click();
	    Reporter.log("click on create filter link",true);
	    CreateFilter cf = new CreateFilter(d);
	    String viewname = f.getExcelData("Createdetails", 2, 4);
	    cf.getViewNametb().sendKeys("viewname");
	    Reporter.log("Enter the Viewname",true);
	    cf.getSetDefaultcb().click();
	    Reporter.log("set as default checkbox enabled",true);
	    WebElement col1 = cf.getColumn1Dropdn();
	    Select s1 = new Select(col1);
	    s1.selectByIndex(6);
	    Reporter.log("Selects the Vendor Name",true);
	    cf.getSavebn().click();
	    Reporter.log("click on save button",true);
	    WebElement filter = s.getFiltersDropdn();
	    Select s11 = new Select(filter);
	    s11.selectByIndex(0);
	    Reporter.log("select a specific filter created",true);
	    s.getDeletefilterLink().click();
	    Reporter.log("click on delete filter link",true);
	    d.switchTo().alert().accept();
	    Reporter.log("click on ok in the popup",true);
	    Reporter.log("Filter is successfully deleted",true);
	}
}
