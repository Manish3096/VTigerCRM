package com.Tiger2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateInvoicePage {
	@FindBy(xpath="//input[@name='subject']")
	private WebElement Subjecttb;

	@FindBy(xpath="//input[@name='customerno']")
	private WebElement Customernotb;

	@FindBy(xpath="//input[@name='exciseduty']")
	private WebElement Excisedutytb;

	@FindBy(xpath="//input[@id='vtiger_purchaseorder']")
	private WebElement PurchaseOrdertb;

	@FindBy(xpath="//input[@id='salescommission']")
	private WebElement SalesCommisiontb;

	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement SalesOrderbn;

	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[2]")
	private WebElement ContactNamebn;

	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[3]")
	private WebElement Organizationbn;

	@FindBy(xpath="//a[@href='javascript:window.close();']")
	private WebElement ContactName;

	@FindBy(xpath="//a[@href='javascript:window.close();']")
	private WebElement SalesOrderName;

    @FindBy(xpath="//a[@href='javascript:window.close();']")
    private WebElement OrganizationName;

	@FindBy(xpath="//input[@name='duedate']")
	private WebElement duedatetb;
	
	@FindBy(xpath="(//input[@name='assigntype'])[1]")
	private WebElement Userradiobn;

	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement Groupradiobn;

	@FindBy(xpath="//select[@name='assigned_user_id']")
	private WebElement Assignedtodropdn;
    
	@FindBy(xpath="//input[@name='invoicedate']")
	private WebElement Invoicedatetb;
	
	@FindBy(xpath="//select[@name='invoicestatus']")
	private WebElement Statusdropdn;
	
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

	@FindBy(xpath="//a[@href='javascript:window.close();']")
	private WebElement Productname;

	@FindBy(xpath="//input[@id='qty1']")
	private WebElement Qtytb;

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
	
	@FindBy(xpath="//a[.='Invoice']")
	private WebElement Invoicetab;
	
	public WebElement getInvoicetab() {
		return Invoicetab;
	}

	public CreateInvoicePage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}

	public WebElement getSubjecttb() {
		return Subjecttb;
	}

	public WebElement getCustomernotb() {
		return Customernotb;
	}

	public WebElement getExcisedutytb() {
		return Excisedutytb;
	}

	public WebElement getPurchaseOrdertb() {
		return PurchaseOrdertb;
	}

	public WebElement getSalesCommisiontb() {
		return SalesCommisiontb;
	}

	public WebElement getSalesOrderbn() {
		return SalesOrderbn;
	}

	public WebElement getContactNamebn() {
		return ContactNamebn;
	}

	public WebElement getOrganizationbn() {
		return Organizationbn;
	}

	public WebElement getContactName() {
		return ContactName;
	}

	public WebElement getSalesOrderName() {
		return SalesOrderName;
	}

	public WebElement getOrganizationName() {
		return OrganizationName;
	}

	public WebElement getDuedatetb() {
		return duedatetb;
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

	public WebElement getInvoicedatetb() {
		return Invoicedatetb;
	}

	public WebElement getStatusdropdn() {
		return Statusdropdn;
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

	public WebElement getProductname() {
		return Productname;
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

	public WebElement getServicesbn() {
		return Servicesbn;
	}

	public WebElement getServiceName() {
		return ServiceName;
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
	
}
