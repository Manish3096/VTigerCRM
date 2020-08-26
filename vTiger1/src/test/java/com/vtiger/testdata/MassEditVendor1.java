package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.MassEditVendorsPage;
import com.vtiger.pom.VendorsPage;

public class MassEditVendor1 extends BaseClass{
	@Test
	public void testMassEditVendor1() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//select checkbox
		VendorsPage vp=new VendorsPage(driver);
		vp.getCheckBox().get(1).click();
		Thread.sleep(3000);
		//click on mass edit button
		vp.getMassEditBtn().click();
		Thread.sleep(3000);
		//click on save button
		MassEditVendorsPage mp=new MassEditVendorsPage(driver);
		mp.getMassEditSaveBtn().click();
		Thread.sleep(3000);
	}

}
