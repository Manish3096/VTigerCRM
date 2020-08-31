package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
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
		Reporter.log("click on vendors link",true);
		h.getVendorsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on create vendor",true);
		VendorsPage vp=new VendorsPage(driver);
		Reporter.log("click on edit link",true);
		vp.getEditLink().click();
		Reporter.log("edit name",true);
		EditVendorsPage ed=new EditVendorsPage(driver);
		ed.getVendorName().clear();
		Thread.sleep(3000);
		Reporter.log("enter name",true);
		String vendorName = f.getExcelData("Sheet1", 1, 0);
		ed.getVendorName().sendKeys(vendorName);
		Thread.sleep(3000);
		Reporter.log("enter email",true);
		String email = f.getExcelData("Sheet1",1, 1);
		ed.getEmailTextField().clear();
		ed.getEmailTextField().sendKeys(email);
		Thread.sleep(3000);
		Reporter.log("enter phone",true);
		String Phone = f.getExcelData("Sheet1",1, 2);
		ed.getPhoneTextField().clear();
		ed.getPhoneTextField().sendKeys(Phone);
		Thread.sleep(3000);
		Reporter.log("click on save button",true);
		ed.getSaveBtn().click();
		Thread.sleep(3000);
		

	}

}
