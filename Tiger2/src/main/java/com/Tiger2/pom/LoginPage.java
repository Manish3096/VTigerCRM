package com.Tiger2.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(xpath="//input[@name='user_name']")
private WebElement untb;

@FindBy(xpath="//input[@name='user_password']")
private WebElement pwtb;

@FindBy(xpath="//input[@id='submitButton']")
private WebElement loginbn;

public LoginPage(WebDriver d)
   {
	PageFactory.initElements(d, this);
	}



public void setLogin(String u, String p) {
	untb.sendKeys(u);
	pwtb.sendKeys(p);
	loginbn.click();
	
}

}
