package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.HomePage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class AdvanceSearchCampaign2 extends BaseClass {
	@Test
	public void testAdvanceSearchCampaign2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on campaigns link",true);
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on advance search link",true);
		CampaignPage cp=new CampaignPage(driver);
		cp.getAdvanceSearch().click();
		Thread.sleep(3000);
		Reporter.log("click on second list box",true);
		Select s=new Select(cp.getSecondlistBox());
		s.selectByIndex(4);
		Thread.sleep(3000);
		Reporter.log("enter campaign name in search text field",true);
		String campaignNo = f.getExcelData("CreateCampaign", 2, 3);
		cp.getSearchtextField().sendKeys(campaignNo);
		Thread.sleep(3000);
		Reporter.log("click on search now button",true);
		cp.getSmallSearchNowBtn().click();
		Thread.sleep(3000);
	}

}
