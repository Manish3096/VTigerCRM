package com.vtiger.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecycleBinPage {
	@FindBy(id="select_module")
	private WebElement selectModuleListBox;
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> checkbox;
	@FindBy(xpath="(//input[@class='crmbutton small delete'])[1]")
	private WebElement emptyRecycleBinBtn;
	@FindBy(xpath="(//input[@class='crmbutton small edit'])[1]")
	private WebElement restoreBtn;
	
	public RecycleBinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectModuleListBox() {
		return selectModuleListBox;
	}

	public List<WebElement> getCheckbox() {
		return checkbox;
	}

	public WebElement getEmptyRecycleBinBtn() {
		return emptyRecycleBinBtn;
	}

	public WebElement getRestoreBtn() {
		return restoreBtn;
	}
	
	
	

}
