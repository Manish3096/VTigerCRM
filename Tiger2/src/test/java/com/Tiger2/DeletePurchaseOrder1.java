package com.Tiger2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.VtigerHomePage;

public class DeletePurchaseOrder1 extends Baseclass{
@Test
public void toDeletePurchase1() throws EncryptedDocumentException, IOException, InvalidFormatException
{
	VtigerHomePage v = new VtigerHomePage(d);
    WebElement More = v.getMoredropdn();
    Actions a = new Actions(d);
    a.click(More).perform();// click on more dropdown
    v.getPurchaseOrderlink().click();// click on PurchaseOrder link
    PurchaseOrder po = new PurchaseOrder(d);
    po.getDeleteLink().click();//click on delete link
    d.switchTo().alert().accept();//Click on ok button in the popup
    String Actualsub = f.getExcelData("Createdetails", 1, 0);
     WebElement sub = po.getSubject1();//enter the subject name
    String sub1 = sub.getText();
    if(sub.equals(Actualsub))
    {
        Reporter.log("Subject is not deleted ",true);
    }
    else{
    	Reporter.log("Subject is deleted ");
    }
}
}