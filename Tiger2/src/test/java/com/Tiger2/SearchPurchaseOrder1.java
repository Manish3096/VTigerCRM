package com.Tiger2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Tiger2.pom.CreatePurchaseOrderPage;
import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.VtigerHomePage;

public class SearchPurchaseOrder1 extends Baseclass {
@Test
public void toSerach1() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
{

	VtigerHomePage v = new VtigerHomePage(d);
    WebElement More = v.getMoredropdn();
    Actions a = new Actions(d);
    a.click(More).perform();//click on more dropdown
    v.getPurchaseOrderlink().click();//click on PurchaseOrder link
    PurchaseOrder po = new PurchaseOrder(d);
    String sub = f.getExcelData("Createdetails", 1, 0);
    po.getSearchFortb().sendKeys(sub);//Enter the subject
    WebElement Indrop = po.getIndropdn();
    Select sc = new Select(Indrop);
    sc.selectByIndex(1);//select a specific option from In dropdown
    po.getSearchNowbn().click();//click on SearchNow button
    String searchres = po.getSubject1().getText();  
    if(searchres.equals(sub))
    {
    	System.out.println("Search result for "+searchres+" Purchase Order is displayed.");
    }
}
}
