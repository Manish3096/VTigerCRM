package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MassEditCampaignPage {
	@FindBy(xpath="//input[@name='campaignname']")
	private WebElement campaignNameTextField;
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement massEditSaveBtn;
	
	public MassEditCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCampaignNameTextField() {
		return campaignNameTextField;
	}

	public WebElement getMassEditSaveBtn() {
		return massEditSaveBtn;
	}

}
