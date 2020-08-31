package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.HomePage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class SearchCampaign extends BaseClass{
	@Test
	public void testSearchCampaign() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on campaigns link",true);
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		Reporter.log("search for campaign",true);
		CampaignPage cp=new CampaignPage(driver);
		Reporter.log("enter campaign no",true);
		String campaignNo = f.getExcelData("CreateCampaign", 1, 3);
		cp.getSearchTextField().sendKeys(campaignNo);
		Thread.sleep(3000);
		Reporter.log("click on search now button",true);
		cp.getSearchNowBtn().click();
		Thread.sleep(3000);
	}

}
