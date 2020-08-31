package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExportVendorsPage {
	@FindBy(xpath="//input[@name='Export']")
	private WebElement exportVendorsBtn;
	
	public ExportVendorsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getExportVendorsBtn() {
		return exportVendorsBtn;
	}



}
