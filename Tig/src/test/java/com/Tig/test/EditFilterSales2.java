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
import com.Tig.pom.SalesOrderPage;
import com.Tig.pom.VtigerHomePage;


public class EditFilterSales2 extends Baseclass {
	@Test
	public void toEditFilter2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		VtigerHomePage v = new VtigerHomePage(d);
	    WebElement More = v.getMoredropdn();
	    Actions a = new Actions(d);
	    a.click(More).perform();
	    Reporter.log("click on more dropdown",true);  
	    v.getSalesOrderlink().click();
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
	    s.getEditfilterLink().click();
	    Reporter.log("click on edit filter link",true);
	    WebElement col3 = cf.getColumn3Dropdn();
	    Select s2 = new Select(col3);	
	    s2.selectByIndex(18);
	    Reporter.log("select a specific column name",true);
	    WebElement duration = cf.getSelectDurationDropdn();
	    Select s11 = new Select(duration);
	    s11.selectByIndex(9);
	    Reporter.log("select a specific duration",true);
	    cf.getCancelbn().click();
	    Reporter.log("click on cancel button",true);
	    Reporter.log("SalesOrder filter was not edited",true);
	} 
}
