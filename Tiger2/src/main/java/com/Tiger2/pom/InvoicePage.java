package com.Tiger2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {
@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement CreateInvoicebn;

@FindBy(xpath="//img[@src='themes/softed/images/btnL3Search.gif']")
private WebElement Searchbn;

@FindBy(xpath="//input[@class='txtBox']")
private WebElement Searchfortb;

@FindBy(xpath="//select[@id='bas_searchfield']")
private WebElement Indropdn;

@FindBy(xpath="//input[@class='crmbutton small create']")
private WebElement Searchnowbn;

@FindBy(xpath="//select[@id='viewname']")
private WebElement Filtersdropdn;

@FindBy(xpath="//a[.='Create Filter']")
private WebElement Createfilterlink;

@FindBy(xpath="//a[.='Create Filter']")
private WebElement CreateFilterlink;

@FindBy(xpath="//a[.='Edit']")
private WebElement EditFilterlink;

@FindBy(xpath="//a[.='Delete']")
private WebElement DeleteFilterlink;

@FindBy(xpath="//input[@class='crmbutton small delete']")
private WebElement Deletebn;

@FindBy(xpath="/input[@class='crmbutton small edit']")
private WebElement MassEditbn;

@FindBy(xpath="//a[.='edit']")
private WebElement editLink;

@FindBy(xpath="//a[.='del']")
private WebElement deleteLink;

public InvoicePage(WebDriver d)
{
	PageFactory.initElements(d, this);
}

public WebElement getCreateInvoicebn() {
	return CreateInvoicebn;
}

public WebElement getSearchbn() {
	return Searchbn;
}

public WebElement getSearchfortb() {
	return Searchfortb;
}

public WebElement getIndropdn() {
	return Indropdn;
}

public WebElement getSearchnowbn() {
	return Searchnowbn;
}

public WebElement getFiltersdropdn() {
	return Filtersdropdn;
}

public WebElement getCreatefilterlink() {
	return Createfilterlink;
}

public WebElement getCreateFilterlink() {
	return CreateFilterlink;
}

public WebElement getEditFilterlink() {
	return EditFilterlink;
}

public WebElement getDeleteFilterlink() {
	return DeleteFilterlink;
}

public WebElement getDeletebn() {
	return Deletebn;
}

public WebElement getMassEditbn() {
	return MassEditbn;
}

public WebElement getEditLink() {
	return editLink;
}

public WebElement getDeleteLink() {
	return deleteLink;
}


}
