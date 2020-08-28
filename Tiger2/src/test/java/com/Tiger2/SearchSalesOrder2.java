package com.Tiger2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.CreatePurchaseOrderPage;
import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.SalesOrderPage;
import com.Tiger2.pom.VtigerHomePage;

public class SearchSalesOrder2 extends Baseclass {
@Test
public void toSerach2() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
{

	VtigerHomePage v = new VtigerHomePage(d);
    WebElement More = v.getMoredropdn();
    Actions a = new Actions(d);
    a.click(More).perform();//click on More dropdown 
    v.getSalesOrderlink().click();//click on sales Order link
    SalesOrderPage so = new SalesOrderPage(d);
    String sub = f.getExcelData("Createdetails", 2, 0);
    so.getSearchfortb().sendKeys(sub);//Enter the Subject
    WebElement Indrop = so.getIndropdn();
    Select sc = new Select(Indrop);
    sc.selectByIndex(3);//select a specific option related to the subject from In dropdown
    so.getSearchNowbn().click();//click on SearchNow button
    String searchres = so.getSubject1().getText();  
    if(searchres.equals(sub))
    {
    	Reporter.log("Search result for "+searchres+" Purchase Order is displayed.");
    }
}
}
