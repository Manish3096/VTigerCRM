package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.generics.BaseClass;
import com.vtiger.pom.HomePage;
import com.vtiger.pom.VendorsPage;
import com.vtiger.pom.VendorsSettingPage;
@Listeners(com.vtiger.generics.ListenerImplementationClass.class)
public class VendorsSettings extends BaseClass{
	@Test
	public void testVendorsSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
		//click on arranged list button
		vs.getArrangeRelatedListBtn().click();
		Thread.sleep(3000);
		//click up and down arrow
		vs.getDownArrow().click();
		Thread.sleep(3000);
		vs.getUpArrow().click();
		Thread.sleep(3000);
		//close the pop up
		vs.getCloseBtn().click();
		//click on add block
		vs.getAddBlockBtn().click();
		Thread.sleep(3000);
		//enter block name
		String name = f.getExcelData("Sheet1", 3, 4);
		vs.getBlockNameTextField().sendKeys(name);
		Thread.sleep(3000);
		//click on save button
		vs.getSmallSaveBtn().click();
		Thread.sleep(3000);
		
	}

}
