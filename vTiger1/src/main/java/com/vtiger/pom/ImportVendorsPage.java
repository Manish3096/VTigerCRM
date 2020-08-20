package com.vtiger.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportVendorsPage {
	@FindBy(id="import_file")
	private WebElement chooseFile;
	@FindBy(className="crmButton big edit")
	private WebElement nextBtn;
	@FindBy(className="crmButton big cancel")
	private WebElement cancelButton;
	@FindBy(xpath="(//select[@class='txtBox'])[1]")
	private WebElement crmFieldsListbox;
	@FindBy(className="crmButton big edit")
	private WebElement importBtn;
	
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
