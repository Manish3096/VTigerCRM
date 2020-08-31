package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class AdvanceSearch extends BaseClass{
	@Test
	public void testAdvanceSearch() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on vendors link",true);
		h.getVendorsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on advance search link",true);
		VendorsPage vp=new VendorsPage(driver);
		vp.getAdvanceSearch().click();
		Thread.sleep(3000);
		Reporter.log("click on second listbox",true);
		Select s=new Select(vp.getSecondlistBox());
		s.selectByIndex(5);
		Thread.sleep(3000);
		Reporter.log("enter vendor name in search text field",true);
		String vendorName = f.getExcelData("Sheet1", 1, 0);
		vp.getSearchtextField().sendKeys(vendorName);
		Thread.sleep(3000);
		Reporter.log("click on search now button",true);
		vp.getSmallSearchNowBtn().click();
		Thread.sleep(3000);

		
		
	}

}
