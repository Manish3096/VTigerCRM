package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.HomePage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class AdvanceSearchCampaign extends BaseClass{
	@Test
	public void testAdvanceSearchCampaign() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on campaigns link
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		//search for campaign
		CampaignPage cp=new CampaignPage(driver);
		//click on advance search link
		cp.getAdvanceSearch().click();
		Thread.sleep(3000);
		//click on second list box
		Select s=new Select(cp.getSecondlistBox());
		s.selectByIndex(1);
		Thread.sleep(3000);
		//enter campaign name in search text field
		String campaignName = f.getExcelData("CreateCampaign", 1, 0);
		cp.getSearchtextField().sendKeys(campaignName);
		Thread.sleep(3000);
		//click on new condition button
		cp.getNewConditionBtn().click();
		Thread.sleep(3000);
		//enter the necessity data
		Select s1=new Select(cp.getNewBesideListBox());
		s1.selectByIndex(1);
		Thread.sleep(3000);
		//enter vendor name
		String Name = f.getExcelData("CreateCampaign", 1, 0);
		cp.getNewSearchTextField().sendKeys(Name);
		Thread.sleep(3000);
		//click on search now button
		cp.getSmallSearchNowBtn().click();
		Thread.sleep(3000);


	}

}
