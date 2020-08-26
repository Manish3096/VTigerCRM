package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.CreatingDuplicateCampaign;

import com.vtiger.pom.HomePage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class CreateDuplicateCampaign extends BaseClass{
	@Test
	public void testCreateDuplicateCampaign() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
		//enter campaign name
		String name = f.getExcelData("CreateCampaign", 1, 0);
		cd.getCampaignNameTextField().clear();
		cd.getCampaignNameTextField().sendKeys(name);
		Thread.sleep(3000);
		//click on save button
		cd.getSaveButton().click();
		Thread.sleep(3000);
		//navigate back campaigns page
		cd.getNavigatingToCampaign().click();
		Thread.sleep(3000);
		
	}

}
