package com.Tiger2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerHomePage {
@FindBy(xpath="//a[.='More']")
private WebElement Moredropdn;

@FindBy(xpath="//a [@name='Invoice']")
private WebElement Invoicelink;

@FindBy(xpath="//a[@name='Purchase Order']")
private WebElement PurchaseOrderlink;

@FindBy(xpath="//a[@name='Sales Order']")
private WebElement SalesOrderlink;

@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement administratorfirstbn;

@FindBy(xpath="//a[.='Sign Out']")
private WebElement Signoutlink;

public WebElement getAdministratorfirstbn() {
	return administratorfirstbn;
}

public WebElement getSignoutlink() {
	return Signoutlink;
}

public VtigerHomePage(WebDriver d)
{
	PageFactory.initElements(d, this);
	}

public WebElement getMoredropdn() {
	return Moredropdn;
}

public WebElement getInvoicelink() {
	return Invoicelink;
}

public WebElement getPurchaseOrderlink() {
	return PurchaseOrderlink;
}

public WebElement getSalesOrderlink() {
	return SalesOrderlink;
}

}
