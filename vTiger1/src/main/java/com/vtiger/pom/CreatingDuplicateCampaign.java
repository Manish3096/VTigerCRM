package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingDuplicateCampaign {
	@FindBy(xpath="(//input[@name='Duplicate'])[1]")
	private WebElement duplicateBtn;
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement campaignNameTextField;
	@FindBy(xpath="//select[@name='campaigntype']")
	private WebElement campaignType;
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement saveButton;
	@FindBy(xpath="(//input[@class='crmbutton small cancel'])[1]")
	private WebElement cancelButton;
	@FindBy(xpath="(//a[.='Campaigns'])[3]")
	private WebElement navigatingToCampaign;
	
	public CreatingDuplicateCampaign(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCampaignNameTextField() {
		return campaignNameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public WebElement getDuplicateBtn() {
		return duplicateBtn;
	}

	public WebElement getCampaignType() {
		return campaignType;
	}

	public WebElement getNavigatingToCampaign() {
		return navigatingToCampaign;
	}


}
