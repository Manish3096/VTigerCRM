package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
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
		Reporter.log("click on vendors link",true);
		h.getVendorsLink().click();
		Thread.sleep(3000);
		Reporter.log("select checkbox",true);
		VendorsPage vp=new VendorsPage(driver);
		vp.getCheckBox().get(1).click();
		Thread.sleep(3000);
		Reporter.log("click on mass edit button",true);
		vp.getMassEditBtn().click();
		Thread.sleep(3000);
		Reporter.log("click on save button",true);
		MassEditVendorsPage mp=new MassEditVendorsPage(driver);
		mp.getMassEditSaveBtn().click();
		Thread.sleep(3000);
	}

}
