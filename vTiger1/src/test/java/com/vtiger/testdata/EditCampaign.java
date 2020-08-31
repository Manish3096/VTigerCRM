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
		Reporter.log("click on campaign link",true);
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on edit link",true);
		CampaignPage cp=new CampaignPage(driver);
		cp.getEditLink().click();
		Thread.sleep(3000);
		Reporter.log("change the campaign name",true);
		EditCampaignInformationPage ec=new EditCampaignInformationPage(driver);
		ec.getCampaignNameTextField().clear();
		Thread.sleep(3000);
		String name = f.getExcelData("CreateCampaign", 1, 0);
		ec.getCampaignNameTextField().sendKeys(name);;
		Thread.sleep(3000);
		Reporter.log("click on save button",true);
		ec.getSaveButton().click();
		Thread.sleep(3000);
	}

}
