package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
		//click on campaign link
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		CampaignPage cp=new CampaignPage(driver);
		//click on campaign name
		cp.getSelectionOfCampaign().click();
		Thread.sleep(3000);
		//click on duplicate button
		CreatingDuplicateCampaign cd=new CreatingDuplicateCampaign(driver);
		cd.getDuplicateBtn().click();
		Thread.sleep(3000);
		//select campaign type
		Select s=new Select(cd.getCampaignType());
		s.selectByIndex(7);
		Thread.sleep(3000);
		//click on save button
		cd.getSaveButton().click();
		Thread.sleep(3000);
		//navigate back campaigns page
		cd.getNavigatingToCampaign().click();
		Thread.sleep(3000);
	}

}
