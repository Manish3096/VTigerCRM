package com.vtiger.testdata;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
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
		Reporter.log("click on campaign link",true);
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on edit link",true);
		CampaignPage cp=new CampaignPage(driver);
		cp.getEditLink().click();
		Thread.sleep(3000);
		EditCampaignInformationPage ec=new EditCampaignInformationPage(driver);
		Reporter.log("click on save button",true);
		ec.getSaveButton().click();
		Thread.sleep(3000);
	}

}
