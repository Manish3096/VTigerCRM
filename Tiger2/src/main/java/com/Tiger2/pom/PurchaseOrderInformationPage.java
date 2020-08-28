package com.Tiger2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderInformationPage {
@FindBy(xpath="//input[@class='crmbutton small edit']")
private WebElement Editbn;

@FindBy(xpath="//input[@class='crmbutton small create']")
private WebElement Duplicatebn;

@FindBy(xpath="//input[@class='crmbutton small delete']")
private WebElement Deletebn;

@FindBy(xpath="(//a[.='Purchase Order'])[1]")
private WebElement PurchaseOrderTab;

@FindBy(xpath="//a[.='Export To PDF']")
private WebElement Exporttopdflink;

public PurchaseOrderInformationPage(WebDriver d)
{
	PageFactory.initElements(d, this);
}

public WebElement getEditbn() {
	return Editbn;
}

public WebElement getDuplicatebn() {
	return Duplicatebn;
}

public WebElement getDeletebn() {
	return Deletebn;
}

public WebElement getPurchaseOrderTab() {
	return PurchaseOrderTab;
}

public WebElement getExporttopdflink() {
	return Exporttopdflink;
}
}
