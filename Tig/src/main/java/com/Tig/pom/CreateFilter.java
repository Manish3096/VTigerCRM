package com.Tig.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateFilter {
  @FindBy(xpath="//input[@class='detailedViewTextBox']")
  private WebElement ViewNametb;
  
  @FindBy(xpath="//input[@name='setDefault']")
  private WebElement SetDefaultcb;
  
  @FindBy(xpath="//input[@name='setStatus']")
  private WebElement SetasPubliccb;
  
  @FindBy(xpath="//select[@id='stdDateFilter']")
  private WebElement SelectDurationDropdn;
  
  @FindBy(xpath="//select[@name='stdDateFilterField']")
  private WebElement SelectaColumnDropdn;
  
  @FindBy(xpath="//input[@class='crmbutton small save']")
  private WebElement Savebn;
  
  @FindBy(xpath="//input[@class='crmbutton small cancel']")
  private WebElement Cancelbn;
  
  @FindBy(xpath="//select[@id='column1']")
  private WebElement Column1Dropdn;
  
  @FindBy(xpath="//select[@id='column2']")
  private WebElement Column2Dropdn;
  
  @FindBy(xpath="//select[@id='column3']")
  private WebElement Column3Dropdn;
  
  @FindBy(xpath="//select[@id='column4']")
  private WebElement Column4Dropdn;

  public CreateFilter(WebDriver d)
  {
	  PageFactory.initElements(d, this);
  }
public WebElement getViewNametb() {
	return ViewNametb;
}

public WebElement getSetDefaultcb() {
	return SetDefaultcb;
}

public WebElement getSetasPubliccb() {
	return SetasPubliccb;
}

public WebElement getSelectDurationDropdn() {
	return SelectDurationDropdn;
}

public WebElement getSelectaColumnDropdn() {
	return SelectaColumnDropdn;
}

public WebElement getSavebn() {
	return Savebn;
}

public WebElement getCancelbn() {
	return Cancelbn;
}

public WebElement getColumn1Dropdn() {
	return Column1Dropdn;
}

public WebElement getColumn2Dropdn() {
	return Column2Dropdn;
}

public WebElement getColumn3Dropdn() {
	return Column3Dropdn;
}

public WebElement getColumn4Dropdn() {
	return Column4Dropdn;
}
}
