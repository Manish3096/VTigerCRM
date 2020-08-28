package com.Tiger2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.CreatePurchaseOrderPage;
import com.Tiger2.pom.PurchaseOrder;
import com.Tiger2.pom.VtigerHomePage;

public class EditPurchaseOrder2 extends Baseclass {
@Test
public void toCreateEditPurchaseOrder2() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
{
	VtigerHomePage v = new VtigerHomePage(d);
    WebElement More = v.getMoredropdn();
    Actions a = new Actions(d);
    a.click(More).perform();//click on more dropdown
    v.getPurchaseOrderlink().click();//click on PurchaseOrder Link
    PurchaseOrder po = new PurchaseOrder(d);
    po.getSelectallorder().click();//select multiple Purchase order
    po.getMassEditbn().click();//click on massedit button
    CreatePurchaseOrderPage cpo = new CreatePurchaseOrderPage(d);
    cpo.getAddressinfo().click();//click on Address Information Tab
    String Billingaddress = f.getExcelData("Createdetails", 3,2);
    cpo.getBillingaddressta().sendKeys(Billingaddress);//enter the billing address
    cpo.getShippingaddressta().sendKeys(Billingaddress);//copy the billing address to shipping address
    cpo.getCancelbn().click();//click on Cancel button
    Reporter.log("Purchase Order's were not updated");
	}
}
