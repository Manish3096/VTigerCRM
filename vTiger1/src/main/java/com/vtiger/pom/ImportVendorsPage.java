package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportVendorsPage {
	@FindBy(id="import_file")
	private WebElement chooseFile;
	@FindBy(xpath="//input[@value='Next']")
	private WebElement nextBtn;
	@FindBy(xpath="//input[@value='Cancel']")
	private WebElement cancelButton;
	@FindBy(xpath="(//select[@class='txtBox'])[1]")
	private WebElement crmFieldsListbox;
	@FindBy(xpath="(//input[@value='Import'])[2]")
	private WebElement importBtn;
	@FindBy(xpath="//input[@value='Finish']")
	private WebElement FinishBtn;
	
	public WebElement getFinishBtn() {
		return FinishBtn;
	}


	public ImportVendorsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getChooseFile() {
		return chooseFile;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getCrmFieldsListbox() {
		return crmFieldsListbox;
	}

	public WebElement getImportBtn() {
		return importBtn;
	}

}
