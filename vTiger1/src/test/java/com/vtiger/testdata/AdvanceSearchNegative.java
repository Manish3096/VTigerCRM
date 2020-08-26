package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;

public class AdvanceSearchNegative extends BaseClass {
	@Test
	public void testAdvanceSearchNegative() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//click on advance search link
		VendorsPage vp=new VendorsPage(driver);
		vp.getAdvanceSearch().click();
		Thread.sleep(3000);
		//click on search now button
		vp.getSmallSearchNowBtn().click();
		Thread.sleep(3000);
		//handle alert pop up
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);

	}

}
