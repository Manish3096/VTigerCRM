package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CreateVendorsPage;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;

public class CreateVendorNegative extends BaseClass {
	@Test
	public void testCreateVendorNegative() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		//click on create vendor
		VendorsPage vp=new VendorsPage(driver);
		vp.getCreateVendorBtn().click();
		Thread.sleep(3000);
		//directly click on save button
		CreateVendorsPage cp=new CreateVendorsPage(driver);
		cp.getSaveBtn().click();
		Thread.sleep(3000);
		//to handle alert popup
		Alert al = driver.switchTo().alert();
		String errorMsg = al.getText();
		System.out.println("error message: "+errorMsg);
		al.accept();
		Thread.sleep(3000);
		
		
			
			
		
	}

}
