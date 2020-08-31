package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CreatingDuplicateVendor;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class DuplicateVendor extends BaseClass {
	@Test
	public void testDuplicateVendor() throws InterruptedException
	{
		HomePage h= new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on vendors link",true);
		h.getVendorsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on vendors name",true);
		VendorsPage vp=new VendorsPage(driver);
		vp.getSelectionOfVendor().click();
		Thread.sleep(3000);
		Reporter.log("click on duplicate button",true);
		CreatingDuplicateVendor cd=new CreatingDuplicateVendor(driver);
		cd.getDuplicateBtn().click();
		Thread.sleep(3000);
		Reporter.log("click on save button",true);
		cd.getsaveBtn().click();
		Thread.sleep(3000);
		Reporter.log("navigate back to vendors page",true);
		cd.getNavigatingToVendor().click();
		Thread.sleep(3000);
	}

}
