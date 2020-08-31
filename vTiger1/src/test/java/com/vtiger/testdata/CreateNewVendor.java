package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CreateVendorsPage;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;

public class CreateNewVendor extends BaseClass {
	@Test
	public void testCreateNewVendor() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		//more link
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//click on vendor create button
		VendorsPage vp=new VendorsPage(driver);
		vp.getCreateVendorBtn().click();
		Thread.sleep(3000);
		//enter vendor name
		CreateVendorsPage cp=new CreateVendorsPage(driver);
		String vendorName = f.getExcelData("CreateVendor", 1, 0);
		cp.getVendorName().sendKeys(vendorName);
		Thread.sleep(3000);
		//enter email
		String email = f.getExcelData("CreateVendor", 1, 1);
		cp.getEmailTextField().sendKeys(email);
		Thread.sleep(3000);
		//enter phone
		String Phone = f.getExcelData("CreateVendor", 1, 2);
		cp.getPhoneTextField().sendKeys(Phone);
		Thread.sleep(3000);
		//click on save button
		cp.getSaveBtn().click();
		Thread.sleep(3000);
		//navigate back to vendors page
		cp.getNavigatingToVendor().click();
		Thread.sleep(3000);
		
	}

}
