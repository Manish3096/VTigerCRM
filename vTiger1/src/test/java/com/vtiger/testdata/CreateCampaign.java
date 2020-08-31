package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.CreateNewCampaignPage;
import com.vtiger.pom.HomePage;

public class CreateCampaign extends BaseClass {
	@Test
	public void testCreateCampaign() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on campaign link",true);
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on create campaign",true);
		CampaignPage cp=new CampaignPage(driver);
		cp.getCreateCampaign().click();
		Thread.sleep(3000);
		Reporter.log("enter campaign name into text field",true);
		CreateNewCampaignPage cn=new CreateNewCampaignPage(driver);
		String campaignName = f.getExcelData("CreateCampaign", 1, 0);
		cn.getCampaignNameTextField().sendKeys(campaignName);
		Thread.sleep(3000);
		Reporter.log("click on cancel button",true);
		cn.getCancelButton().click();
		Thread.sleep(3000);
		
	}

}
