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
		Reporter.log("enter campaign name",true);
		String name = f.getExcelData("CreateCampaign", 1, 0);
		cd.getCampaignNameTextField().clear();
		cd.getCampaignNameTextField().sendKeys(name);
		Thread.sleep(3000);
		Reporter.log("click on save button",true);
		cd.getSaveButton().click();
		Thread.sleep(3000);
		Reporter.log("navigate back campaigns page",true);
		cd.getNavigatingToCampaign().click();
		Thread.sleep(3000);
		
	}

}
