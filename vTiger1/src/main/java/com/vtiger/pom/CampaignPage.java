package com.vtiger.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	//create campaign
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement CreateCampaign;
	
	//edit
	@FindBy(xpath="(//a[.='edit'])[1]")
	private WebElement editLink;
	
	//del
	@FindBy(xpath="(//a[.='del'])[1]")
	private WebElement delLink;
	
	//mass edit
	@FindBy(xpath="(//input[@class='crmbutton small edit'])[2]")
	private WebElement massEditBtn;
	
	//checkbox
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> checkbox;
	
	//delete button
	@FindBy(xpath="(//input[@class='crmbutton small delete'])[1]")
	private WebElement deleteBtn;
	
	//duplicate
	@FindBy(xpath="(//a[@title='Campaigns'])[1]")
	private WebElement selectionOfCampaign;
	
	//search for campaign
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchTextField;
	@FindBy(xpath="(//select[@name='search_field'])[1]")
	private WebElement searchFieldInListBox;
	@FindBy(xpath="//input[@name='submit']")
	private WebElement searchNowBtn;
	
	//advance search
	@FindBy(xpath="//a[.='Go to Advanced Search']")
	private WebElement advanceSearch;
	@FindBy(id="fcol0")
	private WebElement FirstListBox;
	@FindBy(xpath="//select[@id='fop0']")
	private WebElement SecondlistBox;
	@FindBy(xpath="//input[@id='fval0']")
	private WebElement searchtextField;
	@FindBy(xpath="(//input[@class='crmbutton small create'])[2]")
	private WebElement smallSearchNowBtn;
	@FindBy(xpath="//input[@class='crmbutton edit small']")
	private WebElement newConditionBtn;
	@FindBy(id="fcol1")
	private WebElement newListBox;
	@FindBy(xpath="//select[@name='fop1']")
	private WebElement newBesideListBox;
	@FindBy(xpath="//input[@name='fval1']")
	private WebElement newSearchTextField;
	
	//campaign settings
	@FindBy(xpath="//img[@title='Campaigns Settings']")
	private WebElement campaignSettings;
	
	
	public CampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateCampaign() {
		return CreateCampaign;
	}

	public WebElement getEditLink() {
		return editLink;
	}

	public WebElement getDelLink() {
		return delLink;
	}

	public WebElement getMassEditBtn() {
		return massEditBtn;
	}

	public List<WebElement> getCheckbox() {
		return checkbox;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getSelectionOfCampaign() {
		return selectionOfCampaign;
	}

	
	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchFieldInListBox() {
		return searchFieldInListBox;
	}

	public WebElement getSearchNowBtn() {
		return searchNowBtn;
	}

	public WebElement getAdvanceSearch() {
		return advanceSearch;
	}

	public WebElement getFirstListBox() {
		return FirstListBox;
	}

	public WebElement getSecondlistBox() {
		return SecondlistBox;
	}

	public WebElement getSearchtextField() {
		return searchtextField;
	}

	public WebElement getSmallSearchNowBtn() {
		return smallSearchNowBtn;
	}

	public WebElement getNewConditionBtn() {
		return newConditionBtn;
	}

	public WebElement getNewListBox() {
		return newListBox;
	}

	public WebElement getNewBesideListBox() {
		return newBesideListBox;
	}

	public WebElement getNewSearchTextField() {
		return newSearchTextField;
	}

	public WebElement getcampaignSettings() {
		return campaignSettings;
	}

}
