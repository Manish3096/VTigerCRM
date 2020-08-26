package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.EditCampaignInformationPage;
import com.vtiger.pom.HomePage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class EditCampaign extends BaseClass {
	@Test
	public void testEditCampaign() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on campaign link
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		//click on edit link
		CampaignPage cp=new CampaignPage(driver);
		cp.getEditLink().click();
		Thread.sleep(3000);
		//change the campaign name
		EditCampaignInformationPage ec=new EditCampaignInformationPage(driver);
		ec.getCampaignNameTextField().clear();
		Thread.sleep(3000);
		String name = f.getExcelData("CreateCampaign", 1, 0);
		ec.getCampaignNameTextField().sendKeys(name);;
		Thread.sleep(3000);
		//click on save button
		ec.getSaveButton().click();
		Thread.sleep(3000);
	}

}
