package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.MassEditCampaignPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class MassEditCampaign1 extends BaseClass {
	@Test
	public void testMassEditCampaign1() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on campaign link",true);
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		Reporter.log("select check box",true);
		CampaignPage cp=new CampaignPage(driver);
		cp.getCheckbox().get(1).click();
		Thread.sleep(3000);
		cp.getCheckbox().get(4).click();
		Thread.sleep(3000);
		Reporter.log("click on mass edit button",true);
		cp.getMassEditBtn().click();
		Thread.sleep(3000);
		MassEditCampaignPage me=new MassEditCampaignPage(driver);
		Reporter.log("click on save button",true);
		me.getMassEditSaveBtn().click();
		Thread.sleep(3000);
	}

}
