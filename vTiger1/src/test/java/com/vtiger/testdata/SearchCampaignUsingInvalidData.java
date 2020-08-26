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
public class SearchCampaignUsingInvalidData extends BaseClass{
	@Test
	public void testSearchCampaignUsingInvalidData() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on campaigns link
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		//search for campaign
		CampaignPage cp=new CampaignPage(driver);
		//enter campaign no
		String campaignNo = f.getExcelData("CreateCampaign", 1, 3);
		cp.getSearchTextField().sendKeys(campaignNo);
		Thread.sleep(3000);
		//select campaign name from list box
		Select s=new Select(cp.getSearchFieldInListBox());
		s.selectByIndex(1);
		Thread.sleep(3000);
		//click on search now button
		cp.getSearchNowBtn().click();
		Thread.sleep(3000);
	}

}
