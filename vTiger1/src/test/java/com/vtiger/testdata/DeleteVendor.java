package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
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
		Reporter.log("click on vendors link",true);
		h.getVendorsLink().click();
		Thread.sleep(3000);
		Reporter.log("select checkbox",true);
		VendorsPage vp=new VendorsPage(driver);
		vp.getCheckBox().get(1).click();
		Thread.sleep(3000);
		Reporter.log("click on delete button",true);
		vp.getDeleteBtn().click();
		Thread.sleep(3000);
		Reporter.log("handle the confirmation pop up",true);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
	}
	

}
