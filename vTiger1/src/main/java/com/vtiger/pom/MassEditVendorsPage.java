package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MassEditVendorsPage {
	@FindBy(xpath="//input[@name='vendorname']")
	private WebElement VendorName; 
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTextField;
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phoneTextField;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement massEditSaveBtn;
	
	public MassEditVendorsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getVendorName() {
		return VendorName;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}
	public WebElement getMassEditSaveBtn() {
		return massEditSaveBtn;
	}
}
