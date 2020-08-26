package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.MassEditCampaignPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class MassEditCampaign extends BaseClass{
	@Test
	public void testMassEditCampaign() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on campaign link
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		//select check box
		CampaignPage cp=new CampaignPage(driver);
		cp.getCheckbox().get(1).click();
		Thread.sleep(3000);
		cp.getCheckbox().get(3).click();
		Thread.sleep(3000);
		//click on mass edit button
		cp.getMassEditBtn().click();
		Thread.sleep(3000);
		//enter campaign name
		MassEditCampaignPage me=new MassEditCampaignPage(driver);
		String name = f.getExcelData("CreateCampaign", 3, 0);
		me.getCampaignNameTextField().sendKeys(name);
		Thread.sleep(3000);
		//click on save button
		me.getMassEditSaveBtn().click();
		Thread.sleep(3000);
	
	}

}
