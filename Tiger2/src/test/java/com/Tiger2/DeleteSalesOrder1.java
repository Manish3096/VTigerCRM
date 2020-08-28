package com.Tiger2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.SalesOrderPage;
import com.Tiger2.pom.VtigerHomePage;

public class DeleteSalesOrder1 extends Baseclass {
@Test
public void toDeleteSales1() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	VtigerHomePage v = new VtigerHomePage(d);
    WebElement More = v.getMoredropdn();
    Actions a = new Actions(d);
    a.click(More).perform();// click on more dropdown
    v.getSalesOrderlink().click();// click on SalesOrder link
    SalesOrderPage so = new SalesOrderPage(d);
    so.getDeletefilterLink().click();//click on delete link
    d.switchTo().alert().accept();//Click on ok button in the popup
    String Actualsub = f.getExcelData("Createdetails", 1, 0);//enter the subject name
     WebElement sub = so.getSubject1();
    String sub1 = sub.getText();
    if(sub.equals(Actualsub))
    {
        Reporter.log("Subject is not deleted ");
    }
    else{
    	Reporter.log("Subject is deleted "+Actualsub);
    }
}
}
