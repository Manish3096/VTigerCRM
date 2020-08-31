package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCampaignPage {
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement campaignNameTextField;
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement saveButton;
	@FindBy(xpath="(//input[@class='crmbutton small cancel'])[1]")
	private WebElement cancelButton;
	@FindBy(xpath="//a[@class='hdrLink']")
	private WebElement campaignLink;
	
	public CreateNewCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCampaignNameTextField() {
		return campaignNameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCampaignLink() {
		return campaignLink;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}



}
