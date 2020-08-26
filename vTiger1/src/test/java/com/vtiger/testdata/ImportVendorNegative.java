package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.ImportVendorsPage;
import com.vtiger.pom.VendorsPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class ImportVendorNegative extends BaseClass{
	@Test
	public void testImportVendorNegative() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//click on import vendor
		VendorsPage vp=new VendorsPage(driver);
		vp.getImportVendors().click();
		Thread.sleep(3000);
		//click on next button
		ImportVendorsPage ip=new ImportVendorsPage(driver);
		ip.getNextBtn().click();
		Thread.sleep(3000);
		//handle alert popup
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
		
	}

}
