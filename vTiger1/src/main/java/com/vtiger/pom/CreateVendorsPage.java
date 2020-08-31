package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVendorsPage {
	@FindBy(xpath="//input[@name='vendorname']")
	private WebElement VendorName; 
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTextField;
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phoneTextField;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement saveBtn;
	@FindBy(xpath="//input[@value='Cancel  ']")
	private WebElement cancelBtn;
	@FindBy(xpath="(//a[.='Vendors'])[3]")
	private WebElement navigatingToVendor;
	
	public CreateVendorsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getNavigatingToVendor() {
		return navigatingToVendor;
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

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}


}
