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

public class AdvanceSearch1 extends BaseClass{
	@Test
	public void testAdvanceSearch() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//click on advance search link
		VendorsPage vp=new VendorsPage(driver);
		vp.getAdvanceSearch().click();
		Thread.sleep(3000);
		//click on second list box
		Select s=new Select(vp.getSecondlistBox());
		s.selectByIndex(1);
		Thread.sleep(3000);
		//enter vendor name in search text field
		String vendorName = f.getExcelData("Sheet1", 1, 0);
		vp.getSearchtextField().sendKeys(vendorName);
		Thread.sleep(3000);
		//click on new condition button
		vp.getNewConditionBtn().click();
		Thread.sleep(3000);
		//enter the necessity data
		Select s1=new Select(vp.getNewBesideListBox());
		s1.selectByIndex(1);
		Thread.sleep(3000);
		//enter vendor name
		String Name = f.getExcelData("Sheet1", 1, 0);
		vp.getNewSearchTextField().sendKeys(Name);
		Thread.sleep(3000);
		//click on search now button
		vp.getSmallSearchNowBtn().click();
		Thread.sleep(3000);
	}

}
