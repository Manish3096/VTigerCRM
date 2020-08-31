package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText="Leads")
	private WebElement LeadsLink;
	@FindBy(xpath="(//a[.='Opportunities'])[1]")
	private WebElement OpportunitiesLink;
	@FindBy(xpath="(//a[.='Contacts'])[1]")
	private WebElement Contacts;
	@FindBy(linkText="More")
	private WebElement MoreLink;
	@FindBy(xpath="//a[.='Services']")
	private WebElement Services;
	@FindBy(xpath="//a[.='Vendors']")
	private WebElement VendorsLink;
	@FindBy(xpath="//a[.='Campaigns']")
	private WebElement CampaignsLink;
	@FindBy(xpath="//a[.='Recycle Bin']")
	private WebElement RecycleBin;
	@FindBy(xpath="(//td[@class='small'])[2]")
	private WebElement account;
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signoutLink;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadslink() {
		return LeadsLink;
	}

	public WebElement getOpportunitiesLink() {
		return OpportunitiesLink;
	}

	public WebElement getContacts() {
		return Contacts;
	}
	
	public WebElement getAccount() {
		return account;
	}

	public void clicksignoutLink()
	{
		 signoutLink.click();
	}

	public WebElement getMoreLink() {
		return MoreLink;
	}

	public WebElement getServices() {
		return Services;
	}

	public WebElement getVendorsLink() {
		return VendorsLink;
	}

	public WebElement getCampaignsLink() {
		return CampaignsLink;
	}

	public WebElement getRecycleBin() {
		return RecycleBin;
	}
	

	
	
	

}