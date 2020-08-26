package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;

public class SearchVendor extends BaseClass{
	@Test
	public void testSearchVendor() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//search for vendor
		VendorsPage vp=new VendorsPage(driver);
		vp.getSearchTextField().click();
		Thread.sleep(3000);
		//enter vendor name
		String vendorName = f.getExcelData("Sheet1", 1, 0);
		vp.getSearchTextField().sendKeys(vendorName);
		Thread.sleep(3000);
		//select vendor name from listbox
		Select s=new Select(vp.getSearchFieldInListBox());
		s.selectByIndex(1);
		Thread.sleep(3000);
		//click on search now button
		vp.getSearchNowBtn().click();
		Thread.sleep(3000);
		
		             
	}

}
