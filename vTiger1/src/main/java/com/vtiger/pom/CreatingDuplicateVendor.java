package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingDuplicateVendor {
	@FindBy(xpath="(//input[@name='Duplicate'])[1]")
	private WebElement duplicateBtn;
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTextField;
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phoneTextField;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement saveBtn;
	@FindBy(xpath="(//a[.='Vendors'])[3]")
	private WebElement navigatingToVendor;
	
	public CreatingDuplicateVendor(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getDuplicateBtn() {
		return duplicateBtn;
	}

	public WebElement getemailTextField() {
		return emailTextField;
	}

	public WebElement getphoneTextField() {
		return phoneTextField;
	}

	public WebElement getsaveBtn() {
		return saveBtn;
	}

	public WebElement getNavigatingToVendor() {
		return navigatingToVendor;
	}

}
