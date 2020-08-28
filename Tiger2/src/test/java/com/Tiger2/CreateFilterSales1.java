package com.Tiger2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.CreateFilter;
import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.SalesOrderPage;
import com.Tiger2.pom.VtigerHomePage;

public class CreateFilterSales1 extends Baseclass {
@Test
public void toCreateFilter1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
    Reporter.log("Filter is successfully Created",true);
	}
}
