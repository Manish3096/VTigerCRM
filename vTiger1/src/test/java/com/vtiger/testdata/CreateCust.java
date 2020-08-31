package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
@Test
public class CreateCust extends BaseClass{
	public void testCreateCust() throws InterruptedException
	{
		Reporter.log("execute");
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		h.getVendorsLink().click();
		Thread.sleep(4000);
		

	}

}
