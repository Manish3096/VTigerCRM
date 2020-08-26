package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CreatingDuplicateVendor;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class CreateDuplicateVendor extends BaseClass{
	@Test
	public void testCreateDuplicateVendor() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//click on vendors name
		VendorsPage vp=new VendorsPage(driver);
		vp.getSelectionOfVendor().click();
		Thread.sleep(3000);
		//click on duplicate button
		CreatingDuplicateVendor cd=new CreatingDuplicateVendor(driver);
		cd.getDuplicateBtn().click();
		Thread.sleep(3000);
		//enter details i.e.,vendor phone no
		String phone = f.getExcelData("Sheet1", 1, 2);
		cd.getphoneTextField().sendKeys(phone);
		Thread.sleep(3000);
		//enter email
		String email = f.getExcelData("Sheet1", 1, 1);
		cd.getemailTextField().sendKeys(email);
		Thread.sleep(3000);
		//click on save button
		cd.getsaveBtn().click();
		Thread.sleep(3000);
		//navigate back to vendors page
		cd.getNavigatingToVendor().click();
		Thread.sleep(3000);
	}

}
