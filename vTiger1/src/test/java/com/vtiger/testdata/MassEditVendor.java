package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
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
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//selection of check box
		VendorsPage vp=new VendorsPage(driver);
		int count = vp.getCheckBox().size();
//		vp.getCheckBox().get(0).click();
		Thread.sleep(3000);
		vp.getCheckBox().get(count-1).click();
		Thread.sleep(3000);
		vp.getCheckBox().get(count-3).click();
		Thread.sleep(3000);
		//click on mass edit
		vp.getMassEditBtn().click();
		Thread.sleep(3000);
		MassEditVendorsPage me=new MassEditVendorsPage(driver);
		String vendorName = f.getExcelData("Sheet1", 1, 0);
		me.getVendorName().sendKeys(vendorName);
		Thread.sleep(3000);
		String email = f.getExcelData("Sheet1", 1, 1);
		me.getEmailTextField().sendKeys(email);
		Thread.sleep(3000);
		me.getMassEditSaveBtn().click();
		Thread.sleep(3000);

	}

}
