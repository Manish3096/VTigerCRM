package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.EditVendorsPage;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class EditVendor extends BaseClass{
	@Test
	
	public void testEditVendor() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//click on create vendor
		VendorsPage vp=new VendorsPage(driver);
		//click on edit link
		vp.getEditLink().click();
		//edit name
		EditVendorsPage ed=new EditVendorsPage(driver);
		ed.getVendorName().clear();
		Thread.sleep(3000);
		String vendorName = f.getExcelData("Sheet1", 1, 0);
		ed.getVendorName().sendKeys(vendorName);
		Thread.sleep(3000);
		//enter email
		String email = f.getExcelData("Sheet1",1, 1);
		ed.getEmailTextField().clear();
		ed.getEmailTextField().sendKeys(email);
		Thread.sleep(3000);
		//enter phone
		String Phone = f.getExcelData("Sheet1",1, 2);
		ed.getPhoneTextField().clear();
		ed.getPhoneTextField().sendKeys(Phone);
		Thread.sleep(3000);
		//click on save button
		ed.getSaveBtn().click();
		Thread.sleep(3000);
		

	}

}
