package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.MassEditVendorsPage;
import com.vtiger.pom.VendorsPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class MassEditVendor extends BaseClass{
	@Test
	public void testMassEditVendor() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on vendors link",true);
		h.getVendorsLink().click();
		Thread.sleep(3000);
		Reporter.log("selection of check box",true);
		VendorsPage vp=new VendorsPage(driver);
		int count = vp.getCheckBox().size();
//		vp.getCheckBox().get(0).click();
		Thread.sleep(3000);
		vp.getCheckBox().get(count-1).click();
		Thread.sleep(3000);
		vp.getCheckBox().get(count-3).click();
		Thread.sleep(3000);
		Reporter.log("click on mass edit",true);
		vp.getMassEditBtn().click();
		Thread.sleep(3000);
		Reporter.log("enter name",true);
		MassEditVendorsPage me=new MassEditVendorsPage(driver);
		String vendorName = f.getExcelData("Sheet1", 1, 0);
		me.getVendorName().sendKeys(vendorName);
		Thread.sleep(3000);
		Reporter.log("enter email",true);
		String email = f.getExcelData("Sheet1", 1, 1);
		me.getEmailTextField().sendKeys(email);
		Thread.sleep(3000);
		Reporter.log("click on save button",true);
		me.getMassEditSaveBtn().click();
		Thread.sleep(3000);

	}

}
