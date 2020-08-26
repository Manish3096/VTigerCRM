package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;
import com.vtiger.pom.VendorsSettingPage;

public class VendorsSettings1 extends BaseClass{
	@Test
	public void testVendorsSettings1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(h.getMoreLink()).perform();
		//click on vendors link
		h.getVendorsLink().click();
		Thread.sleep(3000);
		//click on vendors settings
		VendorsPage vp=new VendorsPage(driver);
		vp.getVendorsSettings().click();
		Thread.sleep(3000);
		//click on layout editor
		VendorsSettingPage vs=new VendorsSettingPage(driver);
		vs.getLayoutEditor().click();
		Thread.sleep(3000);
		//click on add block
		vs.getAddBlockBtn().click();
		Thread.sleep(3000);
		//click on save button
		vs.getSmallSaveBtn().click();
		Thread.sleep(3000);
		//handle the pop up
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		Thread.sleep(3000);

		
	}

}
