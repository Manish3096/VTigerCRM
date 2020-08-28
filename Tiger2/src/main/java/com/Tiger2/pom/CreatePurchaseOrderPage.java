package com.Tiger2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePurchaseOrderPage {
@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[1]")
private WebElement VendorNamebn;

@FindBy(xpath="//input[@name='subject']")
private WebElement Subjecttb;

@FindBy(xpath="//input[@id='tracking_no']")
private WebElement Trackingnotb;

@FindBy(xpath="//input[@id='jscal_field_duedate']")
private WebElement DueDatetb;

@FindBy(xpath="//input[@id='salescommission']")
private WebElement Salescommisiontb;


@FindBy(xpath="//select[@name='postatus']")
private WebElement Statusdropdn;

@FindBy(xpath="//input[@id='requisition_no']")
private WebElement Requisitionnotb;

@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[2]")
private WebElement ContactNamebn;

@FindBy(xpath="//select[@name='carrier']")
private WebElement Carrierdropdn;

@FindBy(xpath="//input[@id='exciseduty']")
private WebElement Excisedutytb;

@FindBy(xpath="(//input[@name='assigntype'])[1]")
private WebElement Userradiobn;

@FindBy(xpath="(//input[@name='assigntype'])[2]")
private WebElement Groupradiobn;

@FindBy(xpath="//select[@name='assigned_user_id']")
private WebElement Assignedtodropdn;

@FindBy(xpath="(//input[@name='cpy'])[1]")
private WebElement Copyshippingaddressradiobn;

@FindBy(xpath="(//input[@name='cpy'])[2]")
private WebElement CopyBillingaddressradiobn;

@FindBy(xpath="//input[@id='bill_city']")
private WebElement BillingCitytb;

@FindBy(xpath="//textarea[@name='ship_street']")
private WebElement Shippingaddressta;

@FindBy(xpath="//textarea[@name='bill_street']")
private WebElement Billingaddressta;

@FindBy(xpath="//input[@id='bill_pobox']")
private WebElement Billpoboxtb;

@FindBy(xpath="//input[@id='bill_state']")
private WebElement Billstatetb;

@FindBy(xpath="//input[@id='bill_code']")
private WebElement Billcodetb;

@FindBy(xpath="//input[@id='bill_country']")
private WebElement Billcountrytb;

@FindBy(xpath="//input[@id='ship_pobox']")
private WebElement Shippoboxtb;

@FindBy(xpath="//input[@id='ship_city']")
private WebElement Shippingcitytb;

@FindBy(xpath="//input[@id='ship_state']")
private WebElement Shippingstatetb;

@FindBy(xpath="//input[@id='ship_code']")
private WebElement Shippingpostalcodetb;

@FindBy(xpath="//input[@id='ship_country']")
private WebElement Shippingcountrytb;

@FindBy(xpath="//textarea[@name='terms_conditions']")
private WebElement termsandconditionta;

@FindBy(xpath="//textarea[@name='description']")
private WebElement descriptionta;

@FindBy(xpath="//img[@id='searchIcon1']")
private WebElement Productsbn;

@FindBy(xpath="//a[.='Football']")
private WebElement Productname;

@FindBy(xpath="//a[.='Petroleum Tins']")
private WebElement Productname1;

public WebElement getProductname1() {
	return Productname1;
}

@FindBy(xpath="//input[@id='qty2']")
private WebElement qtytb1;

public WebElement getQtytb1() {
	return qtytb1;
}

@FindBy(xpath="//img[@id='searchIcon2']")
private WebElement Productsbn1;

public WebElement getProductsbn1() {
	return Productsbn1;
}

@FindBy(xpath="//a[.='Hummels']")
private WebElement Vendorname1;

@FindBy(xpath="//a[.='Shell']")
private WebElement Vendorname2;

public WebElement getVendorname1() {
	return Vendorname1;
}

public WebElement getVendorname2() {
	return Vendorname2;
}

@FindBy(xpath="//input[@id='qty1']")
private WebElement Qtytb;

@FindBy(xpath="//a[.='Manish Kumar D']")
private WebElement  ContactName1;


@FindBy(xpath="//a[.='Pickford Jordan']")
private WebElement  ContactName2;

@FindBy(xpath="//a[.='Tommie T O']")
private WebElement  ContactName3;

@FindBy(xpath="//td[@id='tab1']")
private WebElement Addressinfo;

public WebElement getAddressinfo() {
	return Addressinfo;
}

public WebElement getContactName1() {
	return ContactName1;
}

public WebElement getContactName2() {
	return ContactName2;
}

public WebElement getContactName3() {
	return ContactName3;
}

@FindBy(xpath="//input[@id='listPrice1']")
private WebElement listpricetb;

@FindBy(xpath="//input[@value='Add Product']")
private WebElement AddProductbn;

@FindBy(xpath="//input[@value='Add Service']")
private WebElement AddServicebn;

@FindBy(xpath="//input[@value='  Save  ']")
private WebElement Savebn;

@FindBy(xpath="//input[@value='  Cancel  ']")
private WebElement Cancelbn;

@FindBy(xpath="(//a[.='Purchase Order'])[1]")
private WebElement PurchaseOrderTab;

@FindBy(xpath="//img[@id='searchIcon2']")
private WebElement Servicesbn;


@FindBy(xpath="//a[@href='javascript:window.close();']")
private WebElement ServiceName;

@FindBy(xpath="//input[@class='crmbutton small edit']")
private WebElement Editbn;

@FindBy(xpath="//input[@class='crmbutton small create']")
private WebElement Duplicatebn;

@FindBy(xpath="//input[@class='crmbutton small delete']")
private WebElement Deletebn;

@FindBy(xpath="(//a[.='petroleum Cans'])[2]")
private WebElement verifytext;



public WebElement getVerifytext() {
	return verifytext;
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

public WebElement getServiceName() {
	return ServiceName;
}

public WebElement getProductname() {
	return Productname;
}

public WebElement getServicesbn() {
	return Servicesbn;
}

public CreatePurchaseOrderPage(WebDriver d)
{
	PageFactory.initElements(d, this);
}

public WebElement getVendorNamebn() {
	return VendorNamebn;
}

public WebElement getSubjecttb() {
	return Subjecttb;
}

public WebElement getTrackingnotb() {
	return Trackingnotb;
}

public WebElement getDueDatetb() {
	return DueDatetb;
}

public WebElement getSalescommisiontb() {
	return Salescommisiontb;
}

public WebElement getStatusdropdn() {
	return Statusdropdn;
}

public WebElement getRequisitionnotb() {
	return Requisitionnotb;
}

public WebElement getContactNamebn() {
	return ContactNamebn;
}

public WebElement getCarrierdropdn() {
	return Carrierdropdn;
}

public WebElement getExcisedutytb() {
	return Excisedutytb;
}

public WebElement getUserradiobn() {
	return Userradiobn;
}

public WebElement getGroupradiobn() {
	return Groupradiobn;
}

public WebElement getAssignedtodropdn() {
	return Assignedtodropdn;
}

public WebElement getCopyshippingaddressradiobn() {
	return Copyshippingaddressradiobn;
}

public WebElement getCopyBillingaddressradiobn() {
	return CopyBillingaddressradiobn;
}

public WebElement getBillingCitytb() {
	return BillingCitytb;
}

public WebElement getShippingaddressta() {
	return Shippingaddressta;
}

public WebElement getBillingaddressta() {
	return Billingaddressta;
}

public WebElement getBillpoboxtb() {
	return Billpoboxtb;
}

public WebElement getBillstatetb() {
	return Billstatetb;
}

public WebElement getBillcodetb() {
	return Billcodetb;
}

public WebElement getBillcountrytb() {
	return Billcountrytb;
}

public WebElement getShippoboxtb() {
	return Shippoboxtb;
}

public WebElement getShippingcitytb() {
	return Shippingcitytb;
}

public WebElement getShippingstatetb() {
	return Shippingstatetb;
}

public WebElement getShippingpostalcodetb() {
	return Shippingpostalcodetb;
}

public WebElement getShippingcountrytb() {
	return Shippingcountrytb;
}

public WebElement getTermsandconditionta() {
	return termsandconditionta;
}

public WebElement getDescriptionta() {
	return descriptionta;
}

public WebElement getProductsbn() {
	return Productsbn;
}

public WebElement getQtytb() {
	return Qtytb;
}

public WebElement getListpricetb() {
	return listpricetb;
}

public WebElement getAddProductbn() {
	return AddProductbn;
}

public WebElement getAddServicebn() {
	return AddServicebn;
}

public WebElement getSavebn() {
	return Savebn;
}

public WebElement getCancelbn() {
	return Cancelbn;
}

public WebElement getPurchaseOrderTab() {
	return PurchaseOrderTab;
}

}
