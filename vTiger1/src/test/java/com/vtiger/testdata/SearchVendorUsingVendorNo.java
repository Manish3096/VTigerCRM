package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;

public class SearchVendorUsingVendorNo extends BaseClass{
	@Test
	public void testSearchVendorUsingVendorNo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//click on search text field
		VendorsPage vp=new VendorsPage(driver);
		vp.getSearchTextField().click();
		Thread.sleep(3000);
		//enter vendor no. in search text field
		String vendorNo = f.getExcelData("Sheet1", 1, 3);
		vp.getSearchTextField().sendKeys(vendorNo);
		Thread.sleep(3000);
		//click on search now button
		vp.getSearchNowBtn().click();
		Thread.sleep(3000);
	}

}
