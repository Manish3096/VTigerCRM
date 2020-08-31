package com.vtiger.testdata;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.CampaignPage;
import com.vtiger.pom.HomePage;

public class DeleteCampaign extends BaseClass{
	@Test
	public void testDeleteCampaign() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		Reporter.log("click on campaign link",true);
		h.getCampaignsLink().click();
		Thread.sleep(3000);
		CampaignPage cp=new CampaignPage(driver);
		Reporter.log("select check box",true);
		cp.getCheckbox().get(2).click();
		Thread.sleep(3000);
		Reporter.log("click on delete button",true);
		cp.getDeleteBtn().click();
		Thread.sleep(3000);
		Reporter.log("handle the confirmation pop up",true);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);
	}

}
