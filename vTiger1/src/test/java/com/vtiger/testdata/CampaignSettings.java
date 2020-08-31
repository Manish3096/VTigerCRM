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
import com.vtiger.pom.CampaignSettingsPage;
import com.vtiger.pom.HomePage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class CampaignSettings extends BaseClass{
	@Test
	public void testCampaignSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on campaign link",true);
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on campaign settings",true);
		CampaignPage cp=new CampaignPage(driver);
		cp.getcampaignSettings().click();
		Thread.sleep(3000);
		Reporter.log("click on layout editor",true);
		CampaignSettingsPage cs=new CampaignSettingsPage(driver);
		cs.getLayoutEditor().click();
		Thread.sleep(3000);
		Reporter.log("click on arranged list button",true);
		cs.getArrangeRelatedListBtn().click();
		Thread.sleep(3000);
		Reporter.log("click on up and down arrow",true);
		cs.getUpArrow().click();
		Thread.sleep(3000);
		cs.getDownArrow().click();
		Thread.sleep(3000);
		Reporter.log("click on close button",true);
		cs.getCloseBtn().click();
		Thread.sleep(3000);
		Reporter.log("click on add block button",true);
		cs.getAddBlockBtn().click();
		Thread.sleep(3000);
		Reporter.log("enter block name",true);
		String name = f.getExcelData("CreateCampaign", 1, 4);
		cs.getBlockNameTextField().sendKeys(name);
		Thread.sleep(3000);
		Reporter.log("click on save button",true);
		cs.getSmallSaveBtn().click();
		Thread.sleep(3000);
		
	}

}
