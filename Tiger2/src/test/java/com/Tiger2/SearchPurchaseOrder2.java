package com.Tiger2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.VtigerHomePage;

public class SearchPurchaseOrder2 extends Baseclass {
	@Test
	public void toSearch2() throws EncryptedDocumentException, IOException, InvalidFormatException{
	VtigerHomePage v = new VtigerHomePage(d);
    WebElement More = v.getMoredropdn();
    Actions a = new Actions(d);
    a.click(More).perform();//click on More dropdown 
    v.getPurchaseOrderlink().click();//click on PurchaseOrder link
    PurchaseOrder po = new PurchaseOrder(d);
    String sub = f.getExcelData("Createdetails", 3, 0);
    po.getSearchFortb().sendKeys(sub);//Enter the Subject Name
    WebElement Indrop = po.getIndropdn();
    Select sc = new Select(Indrop);
    sc.selectByIndex(3);//select a specific option from In dropdown
    po.getSearchNowbn().click();
    String searchres = po.getNoPurchaseOrderDialog().getText();  
    if(searchres.equals(sub))
    {
    	Reporter.log("Search result for "+sub+" Purchase Order is  displayed.");
    }
    else{
    	Reporter.log("Search result for "+sub+" Purchase Order is not displayed.");
    }
	}
}
