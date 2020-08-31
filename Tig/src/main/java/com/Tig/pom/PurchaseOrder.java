 package com.Tig.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrder {
@FindBy(xpath="//img[@src ='themes/softed/images/btnL3Add.gif']")
private WebElement CreatePurchasebn;

@FindBy(xpath="//img[@src ='themes/softed/images/btnL3Search.gif']")
private WebElement Searchbn;

@FindBy(xpath="//input[@class='txtBox']")
private WebElement SearchFortb;

@FindBy(xpath="//select[@id='bas_searchfield']")
private WebElement Indropdn;

@FindBy(xpath="//input[@name='submit']")
private WebElement SearchNowbn;

@FindBy(xpath="//select[@id='viewname']")
private WebElement Filtersdropdn;

@FindBy(xpath="//a[.='Create Filter']")
private WebElement CreateFilterlink;

@FindBy(xpath="//a[.='Edit']")
private WebElement EditFilterlink;

@FindBy(xpath="//a[.='Delete']")
private WebElement DeleteFilterlink;

@FindBy(xpath="//input[@class='crmbutton small delete']")
private WebElement Deletebn;

@FindBy(xpath="(//input[@type='button'])[9]")
private WebElement MassEditbn;

@FindBy(xpath="(//a[@title='Purchase Order'])[1]")
private WebElement Subject1;

@FindBy(xpath="(//a[@title='Purchase Order'])[2]")
private WebElement Subject2;
		
public WebElement getSubject1() {
	return Subject1;
}

public WebElement getSubject2() {
	return Subject2;
}

@FindBy(xpath="//a[.='edit']")
private WebElement editLink;

@FindBy(xpath="//a[.='del']")
private WebElement deleteLink;

@FindBy(xpath="//td[.='₨13,488.00 ']")
private WebElement Total;

@FindBy(xpath="//input[@id='selectCurrentPageRec']")
private WebElement Selectallorder;



@FindBy(xpath="//span[@class='genHeaderSmall']")
private WebElement NoPurchaseOrderDialog;

public WebElement getNoPurchaseOrderDialog() {
	return NoPurchaseOrderDialog;
}

public WebElement getSelectallorder() {
	return Selectallorder;
}

public WebElement getDeleteFilterlink() {
	return DeleteFilterlink;
}

public WebElement getTotal() {
	return Total;
}

public PurchaseOrder(WebDriver d)
{
  PageFactory.initElements(d, this);	
}

public WebElement getCreatePurchasebn() {
	return CreatePurchasebn;
}

public WebElement getSearchbn() {
	return Searchbn;
}

public WebElement getSearchFortb() {
	return SearchFortb;
}

public WebElement getIndropdn() {
	return Indropdn;
}

public WebElement getSearchNowbn() {
	return SearchNowbn;
}

public WebElement getFiltersdropdn() {
	return Filtersdropdn;
}

public WebElement getCreateFilterlink() {
	return CreateFilterlink;
}

public WebElement getEditFilterlink() {
	return EditFilterlink;
}

public WebElement getDeletelink() {
	return deleteLink;
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
