package com.vtiger.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorsPage {
	//Create Vendor
	@FindBy(xpath="//img[@title='Create Vendor...']")
	private WebElement createVendorBtn;
	
	//edit Vendor
	@FindBy(xpath="(//a[.='edit'])[1]")
	private WebElement editLink;
	
	//delete vendor
	@FindBy(xpath="(//a[.='del'])[1]")
	private WebElement delLink;
	
	//Mass edit
	@FindBy(xpath="(//input[@class='crmbutton small edit'])[2]")
	private WebElement massEditBtn;
	
	//delete button
	@FindBy(xpath="(//input[@class='crmbutton small delete'])[1]")
	private WebElement deleteBtn;
	
	//selection of checkbox
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> checkBox;
	
	//search for vendor
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchTextField;
	@FindBy(xpath="(//select[@name='search_field'])[1]")
	private WebElement searchFieldInListBox;
	@FindBy(xpath="//input[@name='submit']")
	private WebElement searchNowBtn;
	
	//import Vendors
	@FindBy(xpath="//img[@title='Import Vendors']")
	private WebElement importVendors;
	
	
	//Export vendors
	@FindBy(xpath="//img[@title='Export Vendors']")
	private WebElement exportVendors;
	
	//Vendors settings
	@FindBy(xpath="//img[@title='C']")
	private WebElement vendorsSettings;
	
	//Advance Search
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
	
	//duplicate Vendors
	@FindBy(xpath="(//a[@title='Vendors'])[1]")
	private WebElement selectionOfVendor;
	
	public VendorsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateVendorBtn() {
		return createVendorBtn;
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

	

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public List<WebElement> getCheckBox() {
		return checkBox;
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

	public WebElement getImportVendors() {
		return importVendors;
	}

	public WebElement getExportVendors() {
		return exportVendors;
	}

	public WebElement getVendorsSettings() {
		return vendorsSettings;
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

	public WebElement getSelectionOfVendor() {
		return selectionOfVendor;
	}

	
}
