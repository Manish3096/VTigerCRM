package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsSettingPage {
	@FindBy(xpath="//a[contains(text(),'Layout Editor')]")
	private WebElement layoutEditor;
	@FindBy(xpath="//input[@title='Arrange RelatedList']")
	private WebElement arrangeRelatedListBtn;
	@FindBy(xpath="(//img[@title='Down'])[1]")
	private WebElement DownArrow;
	@FindBy(xpath="(//img[@title='Up'])[2]")
	private WebElement upArrow;
	@FindBy(xpath="(//img[@align='absmiddle'])[3]")
	private WebElement closeBtn;
	@FindBy(xpath="//input[@title='Add Block']")
	private WebElement addBlockBtn;
	@FindBy(xpath="//input[@id='blocklabel']")
	private WebElement blockNameTextField;
	@FindBy(xpath="(//input[@class='crmButton small save'])[32]")
	private WebElement smallSaveBtn;
	
	public VendorsSettingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLayoutEditor() {
		return layoutEditor;
	}

	public WebElement getArrangeRelatedListBtn() {
		return arrangeRelatedListBtn;
	}

	public WebElement getDownArrow() {
		return DownArrow;
	}

	public WebElement getUpArrow() {
		return upArrow;
	}

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getAddBlockBtn() {
		return addBlockBtn;
	}

	public WebElement getBlockNameTextField() {
		return blockNameTextField;
	}

	public WebElement getSmallSaveBtn() {
		return smallSaveBtn;
	}

}
