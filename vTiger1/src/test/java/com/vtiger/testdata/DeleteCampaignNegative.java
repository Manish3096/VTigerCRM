package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.HomePage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class DeleteCampaignNegative extends BaseClass{
	@Test
	public void testDeleteCampaignNegative() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on campaign link",true);
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		CampaignPage cp=new CampaignPage(driver);
		Reporter.log("click on delete button",true);
		cp.getDeleteBtn().click();
		Thread.sleep(3000);
		Reporter.log("handle the alert pop up",true);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
	}

}
