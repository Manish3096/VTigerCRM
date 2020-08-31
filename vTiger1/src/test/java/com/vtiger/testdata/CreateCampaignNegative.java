package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.CreateNewCampaignPage;
import com.vtiger.pom.HomePage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class CreateCampaignNegative extends BaseClass{
	@Test
	public void testCreateCampaignNegative() throws InterruptedException
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
		CreateNewCampaignPage cn=new CreateNewCampaignPage(driver);
		Reporter.log("click on save button",true);
		cn.getSaveButton().click();
		Thread.sleep(3000);
		Reporter.log("handle alert pop up",true);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
	}

}
