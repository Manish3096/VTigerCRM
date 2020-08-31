package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
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
		Reporter.log("click on vendors link",true);
		h.getVendorsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on advance search link",true);
		VendorsPage vp=new VendorsPage(driver);
		vp.getAdvanceSearch().click();
		Thread.sleep(3000);
		Reporter.log("click on search now button",true);
		vp.getSmallSearchNowBtn().click();
		Thread.sleep(3000);
		Reporter.log("handle alert pop up",true);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);

	}

}
