package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.EditVendorsPage;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class EditVendor1 extends BaseClass {
	@Test
	public void testEditVendor1() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//click on edit link
		VendorsPage vp=new VendorsPage(driver);
		vp.getEditLink().click();
		Thread.sleep(3000);
		//click on save button
		EditVendorsPage ed=new EditVendorsPage(driver);
		ed.getSaveBtn().click();
		Thread.sleep(3000);
		
	}

}
