package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.ExportVendorsPage;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class ExportVendors extends BaseClass{
	@Test
	public void testExportVendors() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//click on export vendors
		VendorsPage vp=new VendorsPage(driver);
		vp.getExportVendors().click();
		Thread.sleep(3000);
		//click on export button
		ExportVendorsPage ep=new ExportVendorsPage(driver);
		ep.getExportVendorsBtn().click();
		Thread.sleep(3000);
	}

}
