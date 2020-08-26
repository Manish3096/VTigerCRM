package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.ImportVendorsPage;
import com.vtiger.pom.VendorsPage;

public class ImportVendor extends BaseClass{
	@Test
	public void testImportVendor() throws InterruptedException
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
		//choose a file
		ImportVendorsPage ip=new ImportVendorsPage(driver);
		ip.getChooseFile().sendKeys("C:\\Users\\HP\\git\\repository\\Vtiger\\vTiger1\\src\\test\\resources\\data\\abc.CSV");
		Thread.sleep(3000);
		//click on next button
		ip.getNextBtn().click();
		Thread.sleep(3000);
		//select vendor name from list box
		Select s=new Select(ip.getCrmFieldsListbox());
		s.selectByIndex(1);
		Thread.sleep(3000);
		//click on import button
		ip.getImportBtn().click();
		Thread.sleep(3000);
		//click on finish button
		ip.getFinishBtn().click();
		Thread.sleep(3000);
	}

}
