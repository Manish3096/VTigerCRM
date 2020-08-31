package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
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
		Reporter.log("click on vendors link",true);
		h.getVendorsLink().click();
		Reporter.log("click on create vendor",true);
		VendorsPage vp=new VendorsPage(driver);
		vp.getCreateVendorBtn().click();
		Thread.sleep(3000);
		Reporter.log("directly click on save button",true);
		CreateVendorsPage cp=new CreateVendorsPage(driver);
		cp.getSaveBtn().click();
		Thread.sleep(3000);
		Reporter.log("to handle alert popup",true);
		Alert al = driver.switchTo().alert();
		String errorMsg = al.getText();
		System.out.println("error message: "+errorMsg);
		al.accept();
		Thread.sleep(3000);
		
		
			
			
		
	}

}
