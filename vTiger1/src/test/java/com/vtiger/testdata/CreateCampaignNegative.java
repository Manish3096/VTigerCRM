package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
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
		//click on campaign link
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		//click on create campaign
		CampaignPage cp=new CampaignPage(driver);
		cp.getCreateCampaign().click();
		Thread.sleep(3000);	
		CreateNewCampaignPage cn=new CreateNewCampaignPage(driver);
		//click on save button
		cn.getSaveButton().click();
		Thread.sleep(3000);
		//handle alert pop up
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
	}

}
