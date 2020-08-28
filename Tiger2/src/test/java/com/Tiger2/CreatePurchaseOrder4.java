package com.Tiger2;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.CreatePurchaseOrderPage;
import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.VtigerHomePage;

public class CreatePurchaseOrder4 extends Baseclass {
@Test
public void toCreatePurchaseOrder4() throws EncryptedDocumentException, IOException, InvalidFormatException
{
	VtigerHomePage v = new VtigerHomePage(d);
    WebElement More = v.getMoredropdn();
    Actions a = new Actions(d);
    a.click(More).perform();
    v.getPurchaseOrderlink().click();
    PurchaseOrder po = new PurchaseOrder(d);
    po.getEditLink().click();
    CreatePurchaseOrderPage cpo = new CreatePurchaseOrderPage(d);
    cpo.getContactNamebn().click();
    Set<String> allwh = d.getWindowHandles();
    Iterator<String> i = allwh.iterator();
    String pid = i.next();
    String cid = i.next();
    String cid1 = i.next();
    d.switchTo().window(cid1);
    cpo.getContactName1().click();
    d.switchTo().alert().accept();
    d.switchTo().window(pid);
    String Billingaddress = f.getExcelData("Createdetails", 1,2);
    cpo.getBillingaddressta().sendKeys(Billingaddress);
    cpo.getCopyBillingaddressradiobn().click();
    cpo.getSavebn().click();
    Reporter.log("Purchase Order is Created");
}
}
