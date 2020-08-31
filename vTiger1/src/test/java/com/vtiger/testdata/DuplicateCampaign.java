package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.CreatingDuplicateCampaign;
import com.vtiger.pom.HomePage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class DuplicateCampaign extends BaseClass{
	@Test
	public void testDuplicateCampaign() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on campaign link",true);
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		CampaignPage cp=new CampaignPage(driver);
		Reporter.log("click on campaign name",true);
		cp.getSelectionOfCampaign().click();
		Thread.sleep(3000);
		Reporter.log("click on duplicate button",true);
		CreatingDuplicateCampaign cd=new CreatingDuplicateCampaign(driver);
		cd.getDuplicateBtn().click();
		Thread.sleep(3000);
		Reporter.log("select campaign type",true);
		Select s=new Select(cd.getCampaignType());
		s.selectByIndex(7);
		Thread.sleep(3000);
		Reporter.log("click on save button",true);
		cd.getSaveButton().click();
		Thread.sleep(3000);
		Reporter.log("navigate back campaigns page",true);
		cd.getNavigatingToCampaign().click();
		Thread.sleep(3000);
	}

}
