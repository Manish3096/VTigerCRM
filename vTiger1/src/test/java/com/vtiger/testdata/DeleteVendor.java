package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class DeleteVendor extends BaseClass{
	@Test
	public void testDeleteVendor() throws InterruptedException
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
		//click on delete button
		vp.getDeleteBtn().click();
		Thread.sleep(3000);
		//handle the confirmation pop up
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
	}
	

}
