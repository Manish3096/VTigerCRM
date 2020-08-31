package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;

public class SearchVendorUsingInvalidData extends BaseClass{
	@Test
	public void testSearchVendorUsingInvalidData() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on vendors link",true);
		h.getVendorsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on search text field",true);
		VendorsPage vp=new VendorsPage(driver);
		vp.getSearchTextField().click();
		Thread.sleep(3000);
		Reporter.log("enter vendor name",true);
		String vendorName = f.getExcelData("Sheet1", 1, 0);
		vp.getSearchTextField().sendKeys(vendorName);
		Thread.sleep(3000);
		Reporter.log("click on search now button",true);
		vp.getSearchNowBtn().click();
		Thread.sleep(3000);
	}

}
