package com.vtiger.testdata;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
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
		Reporter.log("click on vendors link",true);
		h.getVendorsLink().click();
		Thread.sleep(3000);
		Reporter.log("click on vendors settings",true);
		VendorsPage vp=new VendorsPage(driver);
		vp.getVendorsSettings().click();
		Thread.sleep(3000);
		Reporter.log("click on layout editor",true);
		VendorsSettingPage vs=new VendorsSettingPage(driver);
		vs.getLayoutEditor().click();
		Thread.sleep(3000);
		Reporter.log("click on arranged list button",true);
		vs.getArrangeRelatedListBtn().click();
		Thread.sleep(3000);
		Reporter.log("click up and down arrow",true);
		vs.getDownArrow().click();
		Thread.sleep(3000);
		vs.getUpArrow().click();
		Thread.sleep(3000);
		Reporter.log("close the pop up",true);
		vs.getCloseBtn().click();
		Reporter.log("click on add block",true);
		vs.getAddBlockBtn().click();
		Thread.sleep(3000);
		Reporter.log("enter block name",true);
		String name = f.getExcelData("Sheet1", 3, 4);
		vs.getBlockNameTextField().sendKeys(name);
		Thread.sleep(3000);
		Reporter.log("click on save button",true);
		vs.getSmallSaveBtn().click();
		Thread.sleep(3000);
		
	}

}
