package com.Tiger2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Tiger2.pom.CreateSalesOrderPage;
import com.Tiger2.pom.SalesOrderPage;
import com.Tiger2.pom.VtigerHomePage;

public class EditSalesOrder1 extends Baseclass {
	@Test
	public void toEditSalesOrder1() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException
	{
		VtigerHomePage v = new VtigerHomePage(d);
		WebElement More = v.getMoredropdn();
		Actions a = new Actions(d);
		a.click(More).perform();//click on more dropdown
		v.getSalesOrderlink().click();//click on SalesOrder link
		SalesOrderPage so = new SalesOrderPage(d);
		so.getSelectallorder().click();//select multiple sales order
		so.getMassEditbn().click();//click on mass Edit button
		CreateSalesOrderPage cso = new CreateSalesOrderPage(d);
		cso.getAddressinfo().click();//click on address Info
		String Billingaddress = f.getExcelData("Createdetails", 3,2);
		cso.getBillingaddressta().sendKeys(Billingaddress);//enter the billing address
		cso.getShippingaddressta().sendKeys(Billingaddress);//copy the billing address to shipping address
		cso.getSavebn().click();//click on Save button
		Reporter.log("Sales Order's were successfully updated");
	}
}