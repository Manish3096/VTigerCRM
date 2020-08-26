package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.EditCampaignInformationPage;
import com.vtiger.pom.HomePage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class EditCampaign1 extends BaseClass{
	@Test
	public void testEditCampaign1() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on campaign link
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		//click on edit link
		CampaignPage cp=new CampaignPage(driver);
		cp.getEditLink().click();
		Thread.sleep(3000);
		EditCampaignInformationPage ec=new EditCampaignInformationPage(driver);
		//click on save button
		ec.getSaveButton().click();
		Thread.sleep(3000);
	}

}
