package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.CreateNewCampaignPage;
import com.vtiger.pom.HomePage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class CreateNewCampaign extends BaseClass {
	@Test
	public void testCreateNewCampaign() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on campaign link
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		//click on create campaign
		CampaignPage cp=new CampaignPage(driver);
		cp.getCreateCampaign().click();
		Thread.sleep(3000);
		//enter campaign name into text field
		CreateNewCampaignPage cn=new CreateNewCampaignPage(driver);
		String campaignName = f.getExcelData("CreateCampaign", 1, 0);
		cn.getCampaignNameTextField().sendKeys(campaignName);
		Thread.sleep(3000);
		//click on save button
		cn.getSaveButton().click();
		Thread.sleep(3000);
		//navigate back to campaigns link
		cn.getCampaignLink().click();
		Thread.sleep(3000);
		
	}

}
